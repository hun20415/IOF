package kr.ac.iof.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "SYS_USER_INFO")
public class CustomUserDetails implements UserDetails{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USER_ID")
	private String userid;
	private String username;
	private String userpasswd;
	private String usergroupid;
	private String email;
	private String mobilephone;
	private String phone;
	private String home_zipcode;
	private String home_addr;
	private Date sys_datatime;
	private String active_yn;
	@ManyToOne//(cascade = CascadeType.ALL)
	@JoinColumn(name = "USERGROUP_ID")
	private UserGroup usergroup;
	
	public CustomUserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomUserDetails(String userid, String userpasswd) {
		super();
		this.userid = userid;
		this.userpasswd = userpasswd;
	}
	public CustomUserDetails(String userid, String username, String userpasswd,
			String usergroupid, String email, String mobilephone, String phone,
			String home_zipcode, String home_addr, Date sys_datatime,
			String active_yn, UserGroup usergroup) {
		super();
		this.userid = userid;
		this.username = username;
		this.userpasswd = userpasswd;
		this.usergroupid = usergroupid;
		this.email = email;
		this.mobilephone = mobilephone;
		this.phone = phone;
		this.home_zipcode = home_zipcode;
		this.home_addr = home_addr;
		this.sys_datatime = sys_datatime;
		this.active_yn = active_yn;
		this.usergroup = usergroup;
	}
	
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
	public UserGroup getUsergroup() {
		return usergroup;
	}
	public void setUsergroup(UserGroup usergroup) {
		this.usergroup = usergroup;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}
	

}