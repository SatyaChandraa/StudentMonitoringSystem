package com.tmf.SMS.certification.services;

import java.awt.Menu;
import java.util.List;

import com.tmf.SMS.certification.dao.CertificateDAO;
import com.tmf.SMS.certification.dao.CertificateDAOImpl;
import com.tmf.SMS.certification.model.Certificate;

public interface CertificateServices {
	
	CertificateDAO dao = new CertificateDAOImpl();
	
	 boolean generateCertificate(Certificate certificate);
	 List<Certificate> displayCertificates();
	 List<Certificate> displayCertificates(Batch batch);
	 List<Certificate> displayCertificates(Course course);
	 Certificate displayCertificates(Student student);
	 boolean updateCertificate(Certificate cerificate);
	
}
