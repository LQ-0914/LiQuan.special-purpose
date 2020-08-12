package com.qa.SpringBoot.pojo;

public class Orderlist {
    private String olid;

    private Integer gdid;

    private Integer gdcount;

    private Integer gsid;

    private Double price;

    private String ofid;

    public String getOlid() {
        return olid;
    }

    public void setOlid(String olid) {
        this.olid = olid == null ? null : olid.trim();
    }

    public Integer getGdid() {
        return gdid;
    }

    public void setGdid(Integer gdid) {
        this.gdid = gdid;
    }

    public Integer getGdcount() {
        return gdcount;
    }

    public void setGdcount(Integer gdcount) {
        this.gdcount = gdcount;
    }

    public Integer getGsid() {
        return gsid;
    }

    public void setGsid(Integer gsid) {
        this.gsid = gsid;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getOfid() {
        return ofid;
    }

    public void setOfid(String ofid) {
        this.ofid = ofid == null ? null : ofid.trim();
    }

	public Orderlist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orderlist(String olid, Integer gdid, Integer gdcount, Integer gsid, Double price, String ofid) {
		super();
		this.olid = olid;
		this.gdid = gdid;
		this.gdcount = gdcount;
		this.gsid = gsid;
		this.price = price;
		this.ofid = ofid;
	}

	@Override
	public String toString() {
		return "Orderlist [olid=" + olid + ", gdid=" + gdid + ", gdcount=" + gdcount + ", gsid=" + gsid + ", price="
				+ price + ", ofid=" + ofid + "]";
	}
	
}