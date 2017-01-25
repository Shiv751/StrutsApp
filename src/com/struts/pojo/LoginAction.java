package com.struts.pojo;

import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;
import com.rkgec.website.DAO.LoginDAO;
import com.rkgec.website.DTO.LoginDTO;

public class LoginAction extends ActionSupport{
	static LoginDAO loginDAO = new LoginDAO();
	static	LoginDTO loginDTO = new LoginDTO();
	private static final long serialVersionUID = 1L;
	private String userid;
	private String password;

	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String execute() throws Exception {
	
			return null;
	}
	public String checkLogin() throws ClassNotFoundException, SQLException{
	  String uid=this.getUserid();
	  String pwd=	this.getPassword();
	  loginDTO.setUserid(uid);
	  loginDTO.setPassword(pwd);
		//LoginDAO loginDAO = new LoginDAO();
		//String action = ERROR;
		
		boolean yesExist=loginDAO.isUserExist(loginDTO);
			if(yesExist)
			{
				
				return SUCCESS;
			}
			else
			{
				return ERROR;
			}
	
	}

}
