package com.qa.SpringBoot.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Userinfo {
    private Integer userid;

    private String name;

    private Integer sex;
    @JsonFormat(pattern="yyyy-MM-dd" ,timezone="GMT+8")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date birthday;

    private String ufnum;
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date logdate;

    private String address;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getUfnum() {
        return ufnum;
    }

    public void setUfnum(String ufnum) {
        this.ufnum = ufnum == null ? null : ufnum.trim();
    }

    public Date getLogdate() {
        return logdate;
    }

    public void setLogdate(Date logdate) {
        this.logdate = logdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

	public Userinfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Userinfo(Integer userid, String name, Integer sex, Date birthday, String ufnum, Date logdate,
			String address) {
		super();
		this.userid = userid;
		this.name = name;
		this.sex = sex;
		this.birthday = birthday;
		this.ufnum = ufnum;
		this.logdate = logdate;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Userinfo [userid=" + userid + ", name=" + name + ", sex=" + sex + ", birthday=" + birthday + ", ufnum="
				+ ufnum + ", logdate=" + logdate + ", address=" + address + "]";
	}
    
}