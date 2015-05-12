/**                                                                                 	           **/
/** Entity in java, 이때 각 테이블의 이름을 이곳에서  선언해주어도 되고 hbm 파일을 따로 만들어서 mapping 시켜도 된다.       	      **/
/**                                File Name   : DsCategory.java                	              **/  		
/**                                Description : ds_category 질병 분류 테이블                                                     **/ 
/**                                Update      : 2015.05.12(박정훈)	                               **/
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
	
	public DsCategory () {//생성자는 필수

	    }
	
	

	
}
