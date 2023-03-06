package com.tmf.SMS.certification.model;

import java.sql.Date;

public class Certificate {

	private int certificateid,cid,sid,bid;
	private String dispatchedOn,generatedOn;
	public int getCertificateid() {
		return certificateid;
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
	public String getDispatchedOn() {
		return dispatchedOn;
	}
	public void setDispatchedOn(String dispatchedOn) {
		this.dispatchedOn = dispatchedOn;
	}
	public String getGeneratedOn() {
		return generatedOn;
	}
	public void setGeneratedOn(String generatedOn) {
		this.generatedOn = generatedOn;
	}
	@Override
	public String toString() {
		return "Certification [certificateid=" + certificateid + ", cid=" + cid + ", sid=" + sid + ", bid=" + bid
				+ ", dispatchedOn=" + dispatchedOn + ", generatedOn=" + generatedOn + "]";
	}
	public Certificate(int certificateid, int cid, int sid, int bid, String dispatchedOn, String generatedOn) {
		
		this.certificateid = certificateid;
		this.cid = cid;
		this.sid = sid;
		this.bid = bid;
		this.dispatchedOn = dispatchedOn;
		this.generatedOn = generatedOn;
	}
	
	
	
}
