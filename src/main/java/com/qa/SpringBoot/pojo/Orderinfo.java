package com.qa.SpringBoot.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Orderinfo {
    private String ofid;

    private Integer userid;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date ofdate;

    private Integer ofstate;

    private String address;

    private String recipient;

    private String contactnumber;

    public String getOfid() {
        return ofid;
    }

    public void setOfid(String ofid) {
        this.ofid = ofid == null ? null : ofid.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getOfdate() {
        return ofdate;
    }

    public void setOfdate(Date ofdate) {
        this.ofdate = ofdate;
    }

    public Integer getOfstate() {
        return ofstate;
    }

    public void setOfstate(Integer ofstate) {
        this.ofstate = ofstate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient == null ? null : recipient.trim();
    }

    public String getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(String contactnumber) {
        this.contactnumber = contactnumber == null ? null : contactnumber.trim();
    }

	public Orderinfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orderinfo(String ofid, Integer userid, Date ofdate, Integer ofstate, String address, String recipient,
			String contactnumber) {
		super();
		this.ofid = ofid;
		this.userid = userid;
		this.ofdate = ofdate;
		this.ofstate = ofstate;
		this.address = address;
		this.recipient = recipient;
		this.contactnumber = contactnumber;
	}

	@Override
	public String toString() {
		return "Orderinfo [ofid=" + ofid + ", userid=" + userid + ", ofdate=" + ofdate + ", ofstate=" + ofstate
				+ ", address=" + address + ", recipient=" + recipient + ", contactnumber=" + contactnumber + "]";
	}
    
}