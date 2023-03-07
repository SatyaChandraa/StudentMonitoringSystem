package com.tmf.SMS.certification.services;

import java.util.List;

import com.tmf.SMS.certification.model.Certificate;

public class CertificateServicesImpl implements CertificateServices {

	@Override
	public boolean generateCertificate(Certificate certificate) {
		// TODO Auto-generated method stub
		return dao.generateCertificate(certificate);
	}

	@Override
	public List<Certificate> displayCertificates() {
		// TODO Auto-generated method stub
		return dao.displayCertificates();
	}

	@Override
	public List<Certificate> displayCertificates(Batch batch) {
		// TODO Auto-generated method stub
		return dao.displayCertificates(batch);
	}

	@Override
	public List<Certificate> displayCertificates(Course course) {
		// TODO Auto-generated method stub
		return dao.displayCertificates(course);
	}

	@Override
	public Certificate displayCertificates(Student student) {
		// TODO Auto-generated method stDisplay Product
		return dao.displayCertificates(student);
	}

	@Override
	public boolean updateCertificate(Certificate cerificate) {
		// TODO Auto-generated method stub
		return dao.updateCertificate(cerificate);
	}

	

	
}
