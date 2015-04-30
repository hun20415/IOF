package kr.ac.iof.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "SYS_USER_INFO")
public class User {
	/*private int useridNum;
	// User_ID
*/
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USER_ID")
	@NotNull	
	private String userid;
	private String username;
	// USER_NAME
	
	private String userpasswd;
	private String usergroupid;
	private String email;
	private String mobilephone;
	private String phone;
	private String home_zipcode;
	private String home_addr;
	private Date sys_datatime;
	private String active_yn;
	private int usergroup;
	
	/*public int getUseridNum() {
		return useridNum;
	}
	public void setUseridNum(int useridNum) {
		this.useridNum = useridNum;
	}*/
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpasswd() {
		return userpasswd;
	}
	public void setUserpasswd(String userpasswd) {
		this.userpasswd = userpasswd;
	}
	public String getUsergroupid() {
		return usergroupid;
	}
	public void setUsergroupid(String usergroupid) {
		this.usergroupid = usergroupid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobilephone() {
		return mobilephone;
	}
	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getHome_zipcode() {
		return home_zipcode;
	}
	public void setHome_zipcode(String home_zipzode) {
		this.home_zipcode = home_zipzode;
	}
	public String getHome_addr() {
		return home_addr;
	}
	public void setHome_addr(String home_addr) {
		this.home_addr = home_addr;
	}
	public Date getSys_datatime() {
		return sys_datatime;
	}
	public void setSys_datatime(Date sys_datatime) {
		this.sys_datatime = sys_datatime;
	}
	public String getActive_yn() {
		return active_yn;
	}
	public void setActive_yn(String active_yn) {
		this.active_yn = active_yn;
	}	

	public int getUsergroup() {
		return usergroup;
	}

	public void setUsergroup(int usergroup) {
		this.usergroup = usergroup;
	}
	
	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	//public Set<UserRole> getUserRole() {
	//	return this.userRole;
	//}
 
	//public void setUserRole(Set<UserRole> userRole) {
	//	this.userRole = userRole;
	//}
	

}