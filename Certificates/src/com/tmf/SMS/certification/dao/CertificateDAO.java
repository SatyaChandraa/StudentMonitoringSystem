package com.tmf.SMS.certification.dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.tmf.SMS.certification.config.DBConfig;
import com.tmf.SMS.certification.model.Certificate;



public interface CertificateDAO {

	List<Certificate> certificates = new ArrayList<Certificate>();
	DBConfig config = new DBConfig();
	Connection con = config.getConnection();
	
	 boolean generateCertificate(Certificate certificate);
	 List<Certificate> displayCertificates();
	 List<Certificate> displayCertificates(Batch batch);
	 List<Certificate> displayCertificates(Course course);
	 Certificate displayCertificates(Student student);
	 boolean updateCertificate(Certificate cerificate);
}
