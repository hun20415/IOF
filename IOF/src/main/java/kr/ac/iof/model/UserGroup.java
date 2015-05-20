package kr.ac.iof.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Table(name = "sys_user_group")
public class UserGroup{
	
	@Id
	@Column(name = "USERGROUP_ID") 
	private int userGroup;
	
	@Column(name = "USERGROUP_NAME")
	private String userGroupName;
	
	public UserGroup() {
		
	}
	
	public UserGroup(int userGroup, String userGroupName) {
		super();
		this.userGroup = userGroup;
		this.userGroupName = userGroupName;
	}

	public int getUserGroup() {
		return userGroup;
	}
	public void setUserGroup(int userGroup) {
		this.userGroup = userGroup;
	}
	
	public String getUserGroupName() {
		return userGroupName;
	}
	
	public void setUserGroupName(String userGroupName) {
		this.userGroupName = userGroupName;
	}
	
}
