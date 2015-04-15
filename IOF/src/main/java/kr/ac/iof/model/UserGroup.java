package kr.ac.iof.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class UserGroup {
	//USERGROUP_ID
    //USERGROUP_NAME  
	
	@Id @GeneratedValue	
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
