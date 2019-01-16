/**
 * 
 */
package com.training.bean;

/**
 * @author kavya
 *
 */
////To verify whether registered user details for the course get stored in database
public class TC085 
{
	private String firstname; 
	private String lastname; 
	private String Emailid; 
	private String phone;
	private String login;
	private String Password;
	private String Profile;

	public TC085(String firstname, String lastname, String Emailid,String phone, String login,String Password,String Profile) {
		super();
		this.firstname = firstname ;
		this.lastname = lastname;
		this.Emailid = Emailid;
		this.phone = phone;
		this.login = login;
		this.Password = Password;
		this.Profile = Profile;
	}
	public String getfirstname() {
		return firstname;
	}

	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getlastname() {
		return lastname;
	}

	public void setlastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmailid() {
		return Emailid;
	}

	public void setEmailid(String Emailid) {
		this.Emailid = Emailid;
	}
	public String getphone() {
		return phone;
	}
	public void setphone(String phone) {
		this.phone = phone;
	}
	public String getlogin() {
		return login;
	}
	public void setlogin(String login) {
		this.login = login;
	}
	public String getPassword(){
		return Password;
	}
	public void setPassword(String Password){
		this.Password = Password;
	}
	public String getProfile(){
		return Profile;
	}
	public void setProfile(String Profile){
		this.Profile = Profile;
	}
	@Override
	public String toString() {
		return "TC085 [firstname=" + firstname + ", lastname=" + lastname + ", Emailid=" + Emailid + " phone=" + phone + ", login=" + login + ", Password=" + Password + ",Profile=" + Profile +"]";
	}
	
}
