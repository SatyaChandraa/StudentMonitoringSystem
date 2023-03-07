package com.tmf.SMS.certification.app;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import com.tmf.SMS.certification.model.Certificate;
import com.tmf.SMS.certification.services.Batch;
import com.tmf.SMS.certification.services.CertificateServices;
import com.tmf.SMS.certification.services.CertificateServicesImpl;
import com.tmf.SMS.certification.services.Course;
import com.tmf.SMS.certification.services.Student;

public class Apps {

	static CertificateServices services = new CertificateServicesImpl();
	static Scanner scan=new Scanner(System.in);
	 
	 private static void menu() {
		 
		 System.out.println("========================Certificate Module=====================");
			System.out.println("Press 1 for Generate Certificates");
			System.out.println("Press 2 for Display Certificates");
			System.out.println("Press 3 for Display Certificate by BatchName/Id");
			System.out.println("Press 4 for Display Certificate by CourseName/Id");
			System.out.println("Press 5 for Display Certificate by StudentName/Id");
			System.out.println("Press 6 for Update Certificate by Certificate Id");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				
				System.out.println("Enter Student Id ");
				int studentId=scan.nextInt();
				System.out.println("Enter Course Id ");
				int courseId=scan.nextInt();
				System.out.println("Enter Batch Id ");
				int batchId=scan.nextInt();
				System.out.println("Enter Certificate Id ");
				int certificateId=scan.nextInt();
				System.out.println("Enter generated on ");
				String gon=scan.next();
				Date gdate = Date.valueOf(gon);
				System.out.println("Enter dispatched on ");
				String don=scan.next();
				Date ddate = Date.valueOf(don);
				Certificate certificate = new Certificate(certificateId, courseId, studentId, batchId, ddate, gdate);
				boolean result = services.generateCertificate(certificate);
				if(result) {
					System.out.println("Certificate generated");
				}else {
					System.out.println("Not generated");
				}
				break;
			case 2:
				List<Certificate> certis = services.displayCertificates();
				for (Certificate certificate2 : certis) {
					
					System.out.println(certificate2);
				}
				break;
			case 3:
				Batch batch = new Batch();
				List<Certificate> bcertis =services.displayCertificates(batch);
				for (Certificate cobatchs : bcertis) {
					System.out.println(cobatchs);
				}
				break;
			case 4:
				Student student = new Student();
				Certificate scertis =services.displayCertificates(student);
					System.out.println(scertis);
					break;
			case 5:
				Course course = new Course();
				List<Certificate> ccertis =services.displayCertificates(course);
				for (Certificate cocourses : ccertis) {
					System.out.println(cocourses);
				}
				break;
			case 6:
				System.out.println("Enter the required fields to update");
				scan.nextLine();
				System.out.println("Enter Student Id ");
				int studentId1=scan.nextInt();
				System.out.println("Enter Course Id ");
				int courseId1=scan.nextInt();
				System.out.println("Enter Batch Id ");
				int batchId1=scan.nextInt();
				System.out.println("Enter Certificate Id ");
				int certificateId1=scan.nextInt();
				System.out.println("Enter generated on ");
				String gon1=scan.next();
				Date gdate1 = Date.valueOf(gon1);
				System.out.println("Enter dispatched on ");
				String don1=scan.next();
				Date ddate1 = Date.valueOf(don1);
				Certificate certificates = new Certificate(certificateId1, courseId1, studentId1, batchId1, ddate1, gdate1);
				boolean result1 = services.generateCertificate(certificates);
				if(result1) {
					System.out.println("Certificate generated");
				}else {
					System.out.println("Not generated");
				}
				break;
			default:
				break;
			}

	}
	
	public static void main(String[] args) {
		
		menu();
		
		

	}

}
