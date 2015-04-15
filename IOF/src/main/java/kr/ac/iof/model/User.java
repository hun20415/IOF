package kr.ac.iof.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
 
 
 
@Entity
@Table(name = "sysUser")
public class User {
	User(){
		
	}
    @Id @GeneratedValue(strategy=GenerationType.AUTO) @Column(name = "USER_IDNUM")
    private Integer useridNum;
    //User_ID    
    @NotNull @Column(updatable=false)
    private String username;
    //USER_NAME
    private String userid;
    private String userpasswd;
    private String usergroupid;
    private String email;
    private String mobilephone;
    private String phone;
    private String home_zipzode;
    private String home_addr;
    private String sys_datatime;
    private int active_yn;
    private UserGroup usergroupID;
	public Integer getUseridNum() {
		return useridNum;
	}
	public void setUseridNum(Integer useridNum) {
		this.useridNum = useridNum;
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
	public String getHome_zipzode() {
		return home_zipzode;
	}
	public void setHome_zipzode(String home_zipzode) {
		this.home_zipzode = home_zipzode;
	}
	public String getHome_addr() {
		return home_addr;
	}
	public void setHome_addr(String home_addr) {
		this.home_addr = home_addr;
	}
	public String getSys_datatime() {
		return sys_datatime;
	}
	public void setSys_datatime(String sys_datatime) {
		this.sys_datatime = sys_datatime;
	}
	public int getActive_yn() {
		return active_yn;
	}
	public void setActive_yn(int active_yn) {
		this.active_yn = active_yn;
	}
	public UserGroup getUsergroupID() {
		return usergroupID;
	}
	public void setUsergroupID(UserGroup usergroupID) {
		this.usergroupID = usergroupID;
	}
	
    
    //USER_IDNUM
    //USER_NAME
    //USER_ID
    //USER_PASSWD
    //USERGROUO_ID
    //EMAIL
    //MOBILEPHONE
    //PHONE
    //HOME_ZIPCODE
    //HOME_ADDR
    //SYS_DATATIME
    //ACTIVE_YN
    
   
    
     
}