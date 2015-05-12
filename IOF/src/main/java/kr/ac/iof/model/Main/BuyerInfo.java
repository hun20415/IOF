/**                                                                                 	           **/
/** Entity in java, 이때 각 테이블의 이름을 이곳에서  선언해주어도 되고 hbm 파일을 따로 만들어서 mapping 시켜도 된다.       	      **/
/**                                File Name   : BuyerInfo.java                	                  **/  		
/**                                Description : buyer_info 구매자	정보            	                          **/ 
/**                                Update      : 2015.05.12(박정훈)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/

package kr.ac.iof.model.Main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "buyer_info")
public class BuyerInfo {
	
	@Id
	@Column(name = "BUYER_ID")//매핑되는 column이름
	private int buyerId;
	@Column(name = "COMPANY_NAME") //20
	private String companyName;
	@Column(name = "BRANCH_NAME") //20
	private String branchName;
	@Column(name = "BRANCH_ADDR") //200
	private String branchAddr;
	@Column(name = "BRANCH_PHONE") //20
	private String branchPhone;
	@Column(name = "INTERFACE_NAME") //20
	private String interfaceName;
	@Column(name = "INTERFACE_PHONE") //20
	private String interfacePhone;
	
	
	public BuyerInfo(int buyerId, String companyName, String branchName,
			String branchAddr, String branchPhone, String interfaceName,
			String interfacePhone) {
		super();
		this.buyerId = buyerId;
		this.companyName = companyName;
		this.branchName = branchName;
		this.branchAddr = branchAddr;
		this.branchPhone = branchPhone;
		this.interfaceName = interfaceName;
		this.interfacePhone = interfacePhone;
	}



	public BuyerInfo () {//생성자는 필수

	    }
	
	

	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}



	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}



	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}



	public void setBranchAddr(String branchAddr) {
		this.branchAddr = branchAddr;
	}



	public void setBranchPhone(String branchPhone) {
		this.branchPhone = branchPhone;
	}



	public void setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName;
	}



	public void setInterfacePhone(String interfacePhone) {
		this.interfacePhone = interfacePhone;
	}



	public int getBuyerId() {
		return buyerId;
	}



	public String getCompanyName() {
		return companyName;
	}



	public String getBranchName() {
		return branchName;
	}



	public String getBranchAddr() {
		return branchAddr;
	}



	public String getBranchPhone() {
		return branchPhone;
	}



	public String getInterfaceName() {
		return interfaceName;
	}



	public String getInterfacePhone() {
		return interfacePhone;
	}

	
}
