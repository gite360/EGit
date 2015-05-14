package com.jialin.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;

import com.jialin.entity.User;
import com.jialin.service.IUserManage;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	
	private User user;

	@Resource  
	private IUserManage userManage;
	

	public void setUserManage(IUserManage userManage) {
		this.userManage = userManage;
	}
	
	public IUserManage getUserManage() {
		return userManage;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String addUser()
	{
		System.out.println("-------userAction.addUser--------"+user.getName());
		
		userManage.addUser(user);
		return "success";
	}
	
	public String modifyUser()
	{
		System.out.println("-------userAction.modifyUser--------"+user.getName());
		userManage.modifyUser(user);
		return "success";
	}
	
	public String deleteUser()
	{
		System.out.println("-------userAction.deleteUser--------"+user.getName());
		userManage.deleteUser(user);
		return "success";
	}
	
	public String valiteLogin(){
		String name = getRequest().getParameter("name");
		String password = getRequest().getParameter("password");
		JSONObject jsobj = new JSONObject();
		if(userManage.valiteLogin(name, password)){
			//android
			//login OK
			jsobj.put("msg", "success");
		}else{
			jsobj.put("msg", "fail");
		}
		
		try {
			printStr(jsobj.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "success";
		
	}
	
	public String findAllUserJson() throws IOException{
		JSONObject jsobj = new JSONObject();
		List<User> list = userManage.findAllUser();
		jsobj.put("userlist", list);
		printStr(jsobj.toString());
		return "success";
		
	}
	
	public String findAllUser() throws IOException{
		Map session=ActionContext.getContext().getSession();
		List<User> list = userManage.findAllUser();
		session.put("userlist", list);
		return "success";
		
	}
	
	
	public void printStr(String jsonStr) throws IOException{
		HttpServletResponse  httpServletResponse  = ServletActionContext.getResponse();
		httpServletResponse.setCharacterEncoding("UTF-8");
		httpServletResponse.setContentType("text/x-json;charset=UTF-8");
		PrintWriter pw = httpServletResponse.getWriter();
		pw.print(jsonStr);
		pw.flush();
		pw.close();
	}
	
	public HttpServletResponse getResponse(){
		return ServletActionContext.getResponse();
	}
	
	public HttpServletRequest getRequest(){
		return ServletActionContext.getRequest();
	}
	

}
