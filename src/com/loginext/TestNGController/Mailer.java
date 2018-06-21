package com.loginext.TestNGController;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Address;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mailer {

	private List <String> fileList;
	private static String OUTPUT_ZIP_FILE = ""+Reporter.strR_CurrentReportsUniqueDir+".zip";
	private static String SOURCE_FOLDER = "Reports"+File.separator+""+Reporter.strR_CurrentReportsUniqueDir; // SourceFolder path

	public Mailer() {

		//For zip generation
		fileList = new ArrayList < String > ();
	}


	public static boolean sendMail (
			String strToMailerAlias,
			String strBCCMailerAlias){

		String to= strToMailerAlias;//"chirag.p@loginextsolutions.com";  
		String bcc = strBCCMailerAlias;
		String userName="Chirag Pandit";  
		String userEmailFrom="chirag.p@loginextsolutions.com";  

		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

		Session session = Session.getDefaultInstance(props,
				new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(userEmailFrom,"Ch1rag###x3");
			}
		});

		try {

			MimeMessage message = new MimeMessage(session);  
			message.setFrom(new InternetAddress(userEmailFrom, userName));  
			message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
			message.addRecipient(Message.RecipientType.BCC,new InternetAddress(bcc));  
			
			//Change Subject Line to date
			SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy hh:mm a");    
			sdf.setTimeZone(TimeZone.getTimeZone("IST"));
			
			//Start time for master report
			long lTimeStartedForAllMasterReport = System.currentTimeMillis();
			Date startDate = new Date(lTimeStartedForAllMasterReport);
			String strCurrentTime = sdf.format(startDate);
			message.setSubject("Test Automation Report - "+strCurrentTime+" IST");  

			//3) create MimeBodyPart object and set your message text     
			BodyPart messageBodyPart1 = new MimeBodyPart();  

			//messageBodyPart1.setText("Plain text Message body..");
			messageBodyPart1.setContent(Reporter.strMailBody, "text/html; charset=utf-8");

			//4) create new MimeBodyPart object and set DataHandler object to this object      
			MimeBodyPart messageBodyPart2 = new MimeBodyPart();  
			File filename = new File ("Reports/"+OUTPUT_ZIP_FILE);
			//String filename = "" + OUTPUT_ZIP_FILE;  
			DataSource source = new FileDataSource(filename); 
			messageBodyPart2.setDataHandler(new DataHandler(source));  
			messageBodyPart2.setFileName(OUTPUT_ZIP_FILE);  

			//5) create Multipart object and add MimeBodyPart objects to this object      
			Multipart multipart = new MimeMultipart();  
			multipart.addBodyPart(messageBodyPart1);  
			multipart.addBodyPart(messageBodyPart2);  

			//6) set the multiplart object to the message object  
			message.setContent(multipart);  

			//7) send message  
			Transport.send(message);  

			System.out.println("Done");
			return true;
		} catch (Exception e) {
			System.err.println("Unable to send an email...");
			e.printStackTrace();
			return false;
		}

	}


	public static boolean sendTestMail (){

		String to="chirag.p@loginextsolutions.com";  

		final String userName="Chirag Pandit";  
		final String userEmailFrom="chirag.p@loginextsolutions.com";  

		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

		Session session = Session.getDefaultInstance(props,
				new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(userEmailFrom,"Ch1rag###x3");
			}
		});

		try {

			MimeMessage message = new MimeMessage(session);  
			message.setFrom(new InternetAddress(userEmailFrom, userName));
			message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
			message.setSubject("Test...");  

			//3) create MimeBodyPart object and set your message text     
			BodyPart messageBodyPart1 = new MimeBodyPart();  

			//messageBodyPart1.setText("Plain text Message body..");
			messageBodyPart1.setContent("Test", "text/html; charset=utf-8");



			//5) create Multipart object and add MimeBodyPart objects to this object      
			Multipart multipart = new MimeMultipart();  
			multipart.addBodyPart(messageBodyPart1);  

			//6) set the multiplart object to the message object  
			message.setContent(multipart);  

			//7) send message  
			Transport.send(message);  

			System.out.println("Done");
			return true;
		}
		catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return false;
		} catch (MessagingException e) {
			e.printStackTrace();
			return false;
		}

	}


	public void zipIt(String zipFile) {
		byte[] buffer = new byte[1024];
		String source = new File(SOURCE_FOLDER).getName();
		FileOutputStream fos = null;
		ZipOutputStream zos = null;
		try {
			fos = new FileOutputStream("Reports/"+zipFile);
			zos = new ZipOutputStream(fos);

			System.out.println("Output to Zip : " + zipFile);
			FileInputStream in = null;

			for (String file: this.fileList) {
				System.out.println("File Added : " + file);
				ZipEntry ze = new ZipEntry(source + File.separator + file);
				zos.putNextEntry(ze);
				try {
					in = new FileInputStream(SOURCE_FOLDER + File.separator + file);
					int len;
					while ((len = in .read(buffer)) > 0) {
						zos.write(buffer, 0, len);
					}
				} finally {
					in.close();
				}
			}

			zos.closeEntry();
			System.out.println("Folder successfully compressed and stored in "+"Reports/"+zipFile);

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				zos.close();

				//Will send an email
				sendMail(strMailerAlias, "chirag.p@loginextsolutions.com");

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void generateFileList(File node) {
		// add file only
		if (node.isFile()) {
			fileList.add(generateZipEntry(node.toString()));
		}

		if (node.isDirectory()) {
			String[] subNote = node.list();
			for (String filename: subNote) {
				generateFileList(new File(node, filename));
			}
		}
	}

	private String generateZipEntry(String file) {
		return file.substring(SOURCE_FOLDER.length() + 1, file.length());
	}

	public static void main(String[] args) {
		//Mailer appZip = new Mailer();
		//appZip.generateFileList(new File(SOURCE_FOLDER));
		//appZip.zipIt(OUTPUT_ZIP_FILE);
		//OUTPUT_ZIP_FILE = "TestReport20180220094024.zip";
		sendTestMail ();

	}

	String strMailerAlias = "chirag.p@loginextsolutions.com";
	String strMailerCC = "chirag.p@loginextsolutions.com";

	public static void mail(String strMailerList){
		
		//Zip the contents of current test folder
		Mailer appZip = new Mailer();
		appZip.strMailerAlias = strMailerList;
		appZip.generateFileList(new File(SOURCE_FOLDER));
		appZip.zipIt(OUTPUT_ZIP_FILE);

		//Attach the zip - and Send Email
	}

}
