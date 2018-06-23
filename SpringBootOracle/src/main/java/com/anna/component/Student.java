package com.anna.component;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private  BigDecimal sid;
	private String sname;
	private String saddress;
	private String scity;
	private String smobile;
	private String sclass;
	private Date startdate;
	private String cname;
	
	public Student()
	{
		
	}

	public Student(String sname, BigDecimal sid, String saddress, String scity, String smobile, String sclass,
			Date startdate, String cname) {
		super();
		this.sname = sname;
		this.sid = sid;
		this.saddress = saddress;
		this.scity = scity;
		this.smobile = smobile;
		this.sclass = sclass;
		this.startdate = startdate;
		this.cname = cname;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public BigDecimal getSid() {
		return sid;
	}

	public void setSid(BigDecimal sid) {
		this.sid = sid;
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	public String getScity() {
		return scity;
	}

	public void setScity(String scity) {
		this.scity = scity;
	}

	public String getSMobile() {
		return smobile;
	}

	public void setSMobile(String mobile) {
		this.smobile = mobile;
	}

	public String getSclass() {
		return sclass;
	}

	public void setSclass(String sclass) {
		this.sclass = sclass;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Student [sname=" + sname + ", sid=" + sid + ", saddress=" + saddress + ", scity=" + scity + ", mobile="
				+ smobile + ", sclass=" + sclass + ", startdate=" + startdate + ", cname=" + cname + "]";
	}
	

}
