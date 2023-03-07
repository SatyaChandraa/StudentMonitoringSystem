package com.tmf.SMS.certification.model;

import java.sql.Date;
public class Certificate {

	private int certificateid,cid,sid,bid;
	private Date dispatchedOn,generatedOn;
	public int getCertificateid() {
		return certificateid;
	}
	
//	public Certificate(int certificateid, int cid, int sid, int bid, Date dispatchedOn, Date generatedOn) {
//		super();
//		
//	}

//	public Certificate(int cftid, int cid2, int sid2, int bid2, Date don, Date gon) {
//		
//	}

	public Certificate(int cftid, int cid2, int sid2, int bid2, Date don, Date gon) {
		this.certificateid = cftid;
		this.cid = cid2;
		this.sid = sid2;
		this.bid = bid2;
		this.dispatchedOn = don;
		this.generatedOn = gon;
	}

	public void setCertificateid(int certificateid) {
		this.certificateid = certificateid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public Date getDispatchedOn() {
		return dispatchedOn;
	}
	public void setDispatchedOn(Date dispatchedOn) {
		this.dispatchedOn = dispatchedOn;
	}
	public Date getGeneratedOn() {
		return generatedOn;
	}
	public void setGeneratedOn(Date generatedOn) {
		this.generatedOn = generatedOn;
	}
	@Override
	public String toString() {
		return "Certification [certificateid=" + certificateid + ", cid=" + cid + ", sid=" + sid + ", bid=" + bid
				+ ", dispatchedOn=" + dispatchedOn + ", generatedOn=" + generatedOn + "]";
	}
	
	
	
	
}
