/**                                                                                 	           **/
/**                                File Name   : DsCategory.java                	              **/  		
/**                                Description : ds_category 질병 분류 테이블                                                     **/ 
/**                                Update      : 2015.05.12(옥정윤)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/

package kr.ac.iof.model.Main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ds_category")
public class DsCategory {
	
	@Id
	@Column(name = "DS_CATE_ID")//4 primary key, 매핑되는 column이름
	private int dsCateId;
	@Column(name = "DS_CATE_NAME") //200
	private String dsCateName;
	@Column(name = "DS_CATE_HTML") //200
	private String dsCateHtml;
	
	public DsCategory () {

	    }
	

	public DsCategory(int dsCateId, String dsCateName, String dsCateHtml) {
		super();
		this.dsCateId = dsCateId;
		this.dsCateName = dsCateName;
		this.dsCateHtml = dsCateHtml;
	}
	
	


	public int getDsCateId() {
		return dsCateId;
	}

	public String getDsCateName() {
		return dsCateName;
	}

	public String getDsCateHtml() {
		return dsCateHtml;
	}

	public void setDsCateId(int dsCateId) {
		this.dsCateId = dsCateId;
	}

	public void setDsCateName(String dsCateName) {
		this.dsCateName = dsCateName;
	}

	public void setDsCateHtml(String dsCateHtml) {
		this.dsCateHtml = dsCateHtml;
	}

	
}
