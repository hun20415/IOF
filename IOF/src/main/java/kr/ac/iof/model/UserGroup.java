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
@Table(name = "SYS_USER_GROUP")
public class UserGroup{
	//USERGROUP_ID
    //USERGROUP_NAME  
	
	@Id
	@Column(name = "USERGROUP_ID")
	private int usergroup;
	@Column(name = "USERGROUP_NAME")
	private String usergroupName;
	/*@OneToMany(mappedBy="usergroup")
	private Set<User> users;
	
	public Set<User> getUser() {
		return users;
	}
	public void setUser(Set<User> users) {
		this.users = users;
	}*/
	
	public int getUsergroup() {
		return usergroup;
	}
	public void setUsergroup(int usergroup) {
		this.usergroup = usergroup;
	}
	
	public String getUsergroupName() {
		return usergroupName;
	}
	public void setUsergroupName(String usergroupName) {
		this.usergroupName = usergroupName;
	}
	
}
