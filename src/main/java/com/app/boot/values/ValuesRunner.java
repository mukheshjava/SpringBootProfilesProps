package com.app.boot.values;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class ValuesRunner implements CommandLineRunner{
	
	@Value("${my.proid}")
	private int proId;
	
	@Value("${my.prodname}")
	private String proName;
	@Value("${my.prodcode}")
	private String proCode;
	
	@Value("${my.db.driver}")
	private String dbDriver;
	@Value("${my.db.url}")
	private String dbUrl;
	
	@Value("${my.email.host}")
	private String emailHost;
	@Value("${my.email.port}")
	private String emailPort;

	public void run(String... args) throws Exception {
		System.out.println("This is ValuesRunner() Method ..... !");
		System.out.println(this);		
	}

	public ValuesRunner() {
		super();
	}


	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public String getProCode() {
		return proCode;
	}
	public void setProCode(String proCode) {
		this.proCode = proCode;
	}
	public String getDbDriver() {
		return dbDriver;
	}
	public void setDbDriver(String dbDriver) {
		this.dbDriver = dbDriver;
	}
	public String getDbUrl() {
		return dbUrl;
	}
	public void setDbUrl(String dbUrl) {
		this.dbUrl = dbUrl;
	}
	public String getEmailHost() {
		return emailHost;
	}
	public void setEmailHost(String emailHost) {
		this.emailHost = emailHost;
	}
	public String getEmailPort() {
		return emailPort;
	}
	public void setEmailPort(String emailPort) {
		this.emailPort = emailPort;
	}

	public String toString() {
		return "ValuesRunner [proId=" + proId + ", proName=" + proName + ", proCode=" + proCode + ", dbDriver="
				+ dbDriver + ", dbUrl=" + dbUrl + ", emailHost=" + emailHost + ", emailPort=" + emailPort + "]";
	}
	
}
