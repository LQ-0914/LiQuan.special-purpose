package com.qa.SpringBoot.pojo;

import java.util.Date;

public class Goodsinfo {
    public Goodsinfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Integer gdid;

    private String gdname;

    private Integer stid;

    private String gtkeywords;

    private Date gtdate;

    public Integer getGdid() {
        return gdid;
    }

    public void setGdid(Integer gdid) {
        this.gdid = gdid;
    }

    public String getGdname() {
        return gdname;
    }

    public void setGdname(String gdname) {
        this.gdname = gdname == null ? null : gdname.trim();
    }

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

    public String getGtkeywords() {
        return gtkeywords;
    }

    public void setGtkeywords(String gtkeywords) {
        this.gtkeywords = gtkeywords == null ? null : gtkeywords.trim();
    }

    public Date getGtdate() {
        return gtdate;
    }

    public void setGtdate(Date gtdate) {
        this.gtdate = gtdate;
    }

	public Goodsinfo(Integer gdid, String gdname, Integer stid, String gtkeywords, Date gtdate) {
		super();
		this.gdid = gdid;
		this.gdname = gdname;
		this.stid = stid;
		this.gtkeywords = gtkeywords;
		this.gtdate = gtdate;
	}

	@Override
	public String toString() {
		return "Goodsinfo [gdid=" + gdid + ", gdname=" + gdname + ", stid=" + stid + ", gtkeywords=" + gtkeywords
				+ ", gtdate=" + gtdate + "]";
	}
}