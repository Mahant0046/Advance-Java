package in.ac.kletech;

import org.apache.struts2.ActionSupport;
//import java.awt.event.ActionEvent;
//import java.beans.PropertyChangeListener;
//import javax.swing.Action;
import org.apache.struts2.interceptor.parameter.StrutsParameter;

public class UserAction extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	private String username;
	private String email;
	private String password;

	public String execute() {
		System.out.println("Inside Execute Method");
		return "success";
	}
	
	public String welcomeUser() {
		
		if(username!= null && email!=null && password!=null) {
			return "success";
		}
		return "input";
	}
//	
	public String getEmail() {
		return email;
	}
	@StrutsParameter
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}
	@StrutsParameter
	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}
	
	@StrutsParameter
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void validate() {
//		if(username==null||username.isBlank()) {
//			addFieldError("username","username cannot be blank");
//			addActionError("username can_not be blank");
//		}
//		if(email==null||email.isBlank()) {
//			addFieldError("email","email cannot be blank");
//			addActionError("Email Can_not be blank");
//		}
		
	}
}