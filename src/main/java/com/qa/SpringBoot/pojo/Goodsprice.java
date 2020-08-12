package com.qa.SpringBoot.pojo;

public class Goodsprice {
    private Integer gpid;

    private Integer gdid;

    private Integer utid;

    private Double price;

    public Integer getGpid() {
        return gpid;
    }

    public void setGpid(Integer gpid) {
        this.gpid = gpid;
    }

    public Integer getGdid() {
        return gdid;
    }

    public void setGdid(Integer gdid) {
        this.gdid = gdid;
    }

    public Integer getUtid() {
        return utid;
    }

    public void setUtid(Integer utid) {
        this.utid = utid;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

	public Goodsprice() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Goodsprice(Integer gpid, Integer gdid, Integer utid, Double price) {
		super();
		this.gpid = gpid;
		this.gdid = gdid;
		this.utid = utid;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Goodsprice [gpid=" + gpid + ", gdid=" + gdid + ", utid=" + utid + ", price=" + price + "]";
	}
    
}