package kr.ac.iof.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Table(name = "SYS_USER_GROUP")
public class UserGroup {
	//USERGROUP_ID
    //USERGROUP_NAME  
	
	@Id
	@Column(name = "USERGROUP_ID")
	private int usergroupID;
	private String usergroupName;
	
	public int getUsergroupID() {
		return usergroupID;
	}
	public void setUsergroupID(int usergroupID) {
		this.usergroupID = usergroupID;
	}
	public String getUsergroupName() {
		return usergroupName;
	}
	public void setUsergroupName(String usergroupName) {
		this.usergroupName = usergroupName;
	}
	
}
