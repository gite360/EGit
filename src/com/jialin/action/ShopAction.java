package com.jialin.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;

import com.jialin.entity.Shop;
import com.jialin.service.IShopManage;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ShopAction extends ActionSupport {
	/**
	 * 
	 */

	private Shop shop;

	@Resource  
	private IShopManage shopManage;
	
	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public Shop getShop() {
		return shop;
	}
	
	public void setShopManage(IShopManage shopManage) {
		this.shopManage = shopManage;
	}

	public IShopManage getShopManage() {
		return shopManage;
	}
	
	public String addShop()
	{
		//System.out.println("-------ShopAction.addshop--------"+shop.getName());
		HttpServletRequest request=ServletActionContext.getRequest();
		System.out.println(request.getCharacterEncoding());
		
		String name = request.getParameter("name");
		String code = request.getParameter("code");
		String type = request.getParameter("type");
		String unit = request.getParameter("unit");
		String upperlimit = request.getParameter("upperlimit");
		String lowerlimit = request.getParameter("lowerlimit");
		String unitprice = request.getParameter("unitprice");
		
		String totality = request.getParameter("totality");
		String totalprice = request.getParameter("totalprice");
		String producer = request.getParameter("producer");
		String storage = request.getParameter("storage");
		Shop shop = new Shop();
		shop.setName(name);
		shop.setCode(code);
		shop.setLowerlimit(lowerlimit);
		shop.setProducer(producer);
		shop.setStorage(storage);
		shop.setTotality(totality);
		shop.setTotalprice(totalprice);
		shop.setType(type);
		shop.setUnit(unit);
		shop.setUnitprice(unitprice);
		shop.setUpperlimit(upperlimit);
		shopManage.addShop(shop);
		
		return "success";
	}
	
	public String modifyShop()
	{
		System.out.println("-------shopAction.modifyshop--------"+shop.getName());
		shopManage.modifyShop(shop);
		return "success";
	}
	
	public String deleteShop()
	{
		HttpServletRequest request=ServletActionContext.getRequest();
		System.out.println(request.getCharacterEncoding());
		String id = request.getParameter("id");
//		System.out.println("-------shopAction.deleteshop--------"+shop.getName());
		shopManage.deleteShopById(Integer.parseInt(id));
		return "success";
	}
	
	
//	public String findAllshopJson() throws IOException{
//		List<Shop> list = shopManage.findAllshop();
//		JSONArray json = new JSONArray();
//		if(list!=null&&list.size()>0){
//			for(Shop shop : list){
//				JSONObject jsonobj = new JSONObject();
//				jsonobj.put("id", shop.getId());
//				jsonobj.put("address", shop.getAddress());
//				jsonobj.put("name", shop.getName());
//				jsonobj.put("phone", shop.getPhone());
//				jsonobj.put("readme", shop.getReadme());
//				jsonobj.put("time", shop.getTime());
//				
//				json.add(jsonobj);
//			}
//		}
//		printStr(json.toString());
//		return null;
//	}
	
	public String findAllShop() throws IOException{
		List<Shop> list = shopManage.findAllshop();
		Map session=ActionContext.getContext().getSession();
		session.put("shoplist", list);
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
