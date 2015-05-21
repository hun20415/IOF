/////////////////////user에 대한 Entity///////////////////////////////////////////////////////////////////////
/////////////////////2015-05-06 박정훈 ///////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////

package kr.ac.iof.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sys_user_info")
public class User{// implements UserDetails{
	
	@Id
	@Column(name = "USER_ID")
	private String userId;
	
	@Column(name = "USER_NAME")
	private String userName; 
	
	@Column(name = "USER_PASSWD")
	private String userPasswd;	
	
	@ManyToOne
	@JoinColumn(name = "USERGROUP_ID", referencedColumnName = "USERGROUP_ID")
	private UserGroup userGroup;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "MOBILEPHONE")
	private String mobilePhone;
	
	@Column(name = "PHONE")
	private String phone;
	
	@Column(name = "HOME_ZIPCODE")
	private String homeZipcode;
	
	@Column(name = "HOME_ADDR")
	private String homeAddr;
	
	@Column(name = "SYS_DATE")
	private String sysDataTime;
	
	@Column(name = "ACTIVE_YN")	
	private String activeYN;
	
	
	public User() {
		
	}

	public User(String userId, String userName, String userPasswd,
			UserGroup userGroup, String email, String mobilePhone, String phone,
			String homeZipcode, String homeAddr, String sysDataTime,
			String activeYN) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPasswd = userPasswd;
		this.userGroup = userGroup;
		this.email = email;
		this.mobilePhone = mobilePhone;
		this.phone = phone;
		this.homeZipcode = homeZipcode;
		this.homeAddr = homeAddr;
		this.sysDataTime = sysDataTime;
		this.activeYN = activeYN;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserPasswd() {
		return userPasswd;
	}
	
	public void setUserPasswd(String userPasswd) {
		this.userPasswd = userPasswd;
	}
	
	public UserGroup getUserGroup() {
		return userGroup;
	}
	
	public void setUserGroup(UserGroup userGroup) {
		this.userGroup = userGroup;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getMobilePhone() {
		return mobilePhone;
	}
	
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getHomeZipcode() {
		return homeZipcode;
	}
	
	public void setHomeZipcode(String homeZipcode) {
		this.homeZipcode = homeZipcode;
	}
	
	public String getHomeAddr() {
		return homeAddr;
	}
	
	public void setHomeAddr(String homeAddr) {
		this.homeAddr = homeAddr;
	}
	
	public String getSysDataTime() {
		return sysDataTime;
	}
	
	public void setSysDataTime(String sysDataTime) {
		this.sysDataTime = sysDataTime;
	}
	
	public String getActiveYN() {
		return activeYN;
	}
	
	public void setActiveYN(String activeYN) {
		this.activeYN = activeYN;
	}
	
	public String getUserGroupName() {
		return userGroup.getUserGroupName();
	}
	
	public int getUserGroupId() {
		return userGroup.getUserGroup();
	}
	
}