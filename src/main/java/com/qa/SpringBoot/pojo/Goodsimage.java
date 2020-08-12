package com.qa.SpringBoot.pojo;

public class Goodsimage {
    private Integer gimgid;

    private String gimgurl;

    private Integer gdid;

    private Integer gimgtype;

    public Integer getGimgid() {
        return gimgid;
    }

    public void setGimgid(Integer gimgid) {
        this.gimgid = gimgid;
    }

    public String getGimgurl() {
        return gimgurl;
    }

    public void setGimgurl(String gimgurl) {
        this.gimgurl = gimgurl == null ? null : gimgurl.trim();
    }

    public Integer getGdid() {
        return gdid;
    }

    public void setGdid(Integer gdid) {
        this.gdid = gdid;
    }

    public Integer getGimgtype() {
        return gimgtype;
    }

    public void setGimgtype(Integer gimgtype) {
        this.gimgtype = gimgtype;
    }

	public Goodsimage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Goodsimage(Integer gimgid, String gimgurl, Integer gdid, Integer gimgtype) {
		super();
		this.gimgid = gimgid;
		this.gimgurl = gimgurl;
		this.gdid = gdid;
		this.gimgtype = gimgtype;
	}

	@Override
	public String toString() {
		return "Goodsimage [gimgid=" + gimgid + ", gimgurl=" + gimgurl + ", gdid=" + gdid + ", gimgtype=" + gimgtype
				+ "]";
	}
    
}