package com.qa.SpringBoot.pojo;

public class User {
    private Integer userid;

    private String username;

    private String password;

    private String salt;

    private Integer status;

    private Integer utid;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getUtid() {
        return utid;
    }

    public void setUtid(Integer utid) {
        this.utid = utid;
    }

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer userid, String username, String password, String salt, Integer status, Integer utid) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.salt = salt;
		this.status = status;
		this.utid = utid;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", password=" + password + ", salt=" + salt
				+ ", status=" + status + ", utid=" + utid + "]";
	}
    
}