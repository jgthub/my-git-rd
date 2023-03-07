package com.simple;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ContactAction extends ActionSupport  implements SessionAware{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String mobileNum;
	String emailId;
	String token;
	private SessionMap<String,Object> sessionMap;  

	@Override  
	public void setSession(Map<String, Object> map) {  
	  sessionMap=(SessionMap)map;  
	}	
	
	public String getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String execute(){
		Map<String, Object> mySession = ActionContext.getContext().getSession();
		sessionMap.put("mobileNum", mobileNum);
		sessionMap.put("emailId", emailId);
		System.out.println("INPUT=> mobileNum:"+mobileNum+"\nemailId:"+emailId+"\nToken:"+getToken()+"\nsession:"+mySession);
		return "success";
	}
	
	

}
