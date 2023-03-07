package com.simple;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.dispatcher.SessionMap;  
import org.apache.struts2.interceptor.SessionAware;  

public class EntryAction extends ActionSupport implements SessionAware{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
public String fname;
public String lname;
public String token;
private SessionMap<String,Object> sessionMap;  

@Override  
public void setSession(Map<String, Object> map) {  
  sessionMap=(SessionMap)map;  
} 


public String getToken() {
	return token;
}


public void setToken(String token) {
	this.token = token;
}


public String getFname() {
	return fname;
}


public void setFname(String fname) {
	this.fname = fname;
}


public String getLname() {
	return lname;
}


public void setLname(String lname) {
	this.lname = lname;
}


public String execute(){
	sessionMap.put("fname", fname);
	sessionMap.put("lname", lname);
	System.out.println("INPUT=> First Name:"+getFname()+"\nLast Name:"+getLname()+"\nToken:"+getToken());
    return "success";
  }
}
