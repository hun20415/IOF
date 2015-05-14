/////////////////////user에 대한 Entity///////////////////////////////////////////////////////////////////////
/////////////////////2015-05-06 박정훈 ///////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////

package kr.ac.iof.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
public class User{// implements UserDetails{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USER_ID")
	private String userId;
	private String userName;
	private String userPasswd;
	private String userGroupId;
	private String email;
	private String mobilePhone;
	private String phone;
	private String homeZipcode;
	private String homeAddr;
	private Date sysDataTime;
	private String activeYN;
	

}