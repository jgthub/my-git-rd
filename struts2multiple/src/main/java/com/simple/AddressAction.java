package com.simple;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AddressAction extends ActionSupport  implements SessionAware{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String addrLine1;
	String addrLine2;
	String token;
	private SessionMap<String,Object> sessionMap;  

	@Override  
	public void setSession(Map<String, Object> map) {  
	  sessionMap=(SessionMap)map;  
	}	
	
	public String getAddrLine1() {
		return addrLine1;
	}
	public void setAddrLine1(String addrLine1) {
		this.addrLine1 = addrLine1;
	}
	public String getAddrLine2() {
		return addrLine2;
	}
	public void setAddrLine2(String addrLine2) {
		this.addrLine2 = addrLine2;
	}
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String execute(){
		Map<String, Object> mySession = ActionContext.getContext().getSession();
		sessionMap.put("addrLine1", addrLine1);
		sessionMap.put("addrLine2", addrLine2);
		System.out.println("INPUT=> addrLine1:"+addrLine1+"\naddrLine2:"+addrLine2+"\nToken:"+getToken()+"\nsession:"+mySession);
		return "success";
	}
	
	

}
