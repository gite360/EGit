package com.jialin.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.client.HttpServerErrorException;

import com.jialin.entity.User;
import com.jialin.service.IUserManage;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
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

	@Override
	public String execute() throws Exception {
		
		HttpServletRequest request=ServletActionContext.getRequest();
		System.out.println(request.getCharacterEncoding());
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		if(name.equalsIgnoreCase("admin") &&password.equalsIgnoreCase("admin")){
			Map session=ActionContext.getContext().getSession();
			session.put("name", name);
			System.out.println("登录成功,用户名="+name);
			return "success";
		}
		if(userManage.valiteLogin(name, password))
		{
			Map session=ActionContext.getContext().getSession();
			session.put("name", name);
			
			System.out.println("登录成功,用户名="+name);
			return "success";
		}
		
		System.out.println("登录失败，用户名="+user.getName());
		return "fail";
	}
	
	
}
