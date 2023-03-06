package com.tmf.SMS.certification.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.tmf.SMS.certification.model.Certificate;

public class CertificateDAOImpl implements CertificateDAO {
	
	private PreparedStatement ps;
	private ResultSet rs;
	private String query;

	@Override
	public boolean generateCertificate(Certificate certificate) {
		boolean result = false;
		try {
			query = " insert into certificate values (?,?,?,?,?,?)";
			ps = con.prepareStatement(query);
			ps.setInt(1, certificate.getCertificateid());
			ps.setInt(2, certificate.getCid());
			ps.setInt(3, certificate.getSid());
			ps.setInt(4, certificate.getBid());
			ps.setString(5,certificate.getDispatchedOn());
			ps.setString(6, certificate.getGeneratedOn());
			ps.execute();
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public List<Certificate> displayCertificates() {
		// TODO Auto-generated method stub
		certificates.clear();
		try {
			
			query = "select * from certificate";
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				
				int cftid = rs.getInt("certificateid");
				int cid = rs.getInt("cid");
				int sid = rs.getInt("sid");
				int bid = rs.getInt("bid");
				String gon = rs.getString("genertedOn");
				String don = rs.getString("dispatchedOn");
				
				Certificate certificate = new Certificate(cftid,cid,sid,bid,don,gon);
				certificates.add(certificate);			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return certificates;
	}

	@Override
	public List<Certificate> displayCertificates(Batch batch) {
		// TODO Auto-generated method stub
		certificates.clear();
		try {
			
			query = "select * from certificate where batchId = ? ";
			ps = con.prepareStatement(query);
			ps.setInt(1,batch.getBatchId());
			rs = ps.executeQuery();
			
			if(rs.next()) {
				
				int cftid = rs.getInt("certificateid");
				int cid = rs.getInt("cid");
				int sid = rs.getInt("sid");
				int bid = rs.getInt("bid");
				String gon = rs.getString("genertedOn");
				String don = rs.getString("dispatchedOn");
				
				Certificate certificate = new Certificate(cftid,cid,sid,bid,don,gon);
				certificates.add(certificate);
				
			}	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return certificates;
	}

	@Override
	public List<Certificate> displayCertificates(Course course) {
		certificates.clear();
		try {
		query = "select * from certificate where courseId = ?";
		ps = con.prepareStatement(query);
		ps.setInt(1, course.getInt());
		rs = ps.executeQuery();
		
		while(rs.next()) {
			
			int cftid = rs.getInt("certificateid");
			int cid = rs.getInt("cid");
			int sid = rs.getInt("sid");
			int bid = rs.getInt("bid");
			String gon = rs.getString("genertedOn");
			String don = rs.getString("dispatchedOn");
			Certificate certificate = new Certificate(cftid,cid,sid,bid,don,gon);
			certificates.add(certificate);
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return certificates;
	}

	@Override
	public Certificate displayCertificates(Student student) {
		// TODO Auto-generated method stub
		Certificate certificate = null;
		try {
			
			query = "select * from certificate where studentId = ?";
			ps = con.prepareStatement(query);
			ps.setInt(1, student.getInt());
			rs = ps.executeQuery();
			
			if(rs.next()) {
				
				int cftid = rs.getInt("certificateid");
				int cid = rs.getInt("cid");
				int sid = rs.getInt("sid");
				int bid = rs.getInt("bid");
				String gon = rs.getString("generatedOn");
				String don = rs.getString("dispatchedOn");
				 certificate = new Certificate(cftid,cid,sid,bid,don,gon);	
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return certificate;
	}

	@Override
	public boolean updateCertificate(Certificate cerificate) {

		boolean result = false;
		try {
			
			query = "update certificate set certificateid=?,sid=?,generatedOn=?,dispatchedOn=? where cid= ?" ;
			ps = con.prepareStatement(query);
			ps.setInt(1, cerificate.getCertificateid());
			ps.setInt(6, cerificate.getCid());
			ps.setInt(2, cerificate.getSid());
			ps.setInt(3, cerificate.getBid());
			ps.setString(4, cerificate.getGeneratedOn());
			ps.setString(5, cerificate.getDispatchedOn());
			ps.execute();
			result = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
