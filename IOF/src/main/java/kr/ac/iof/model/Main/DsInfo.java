/**                                                                                 	           **/
/** Entity in java, 이때 각 테이블의 이름을 이곳에서  선언해주어도 되고 hbm 파일을 따로 만들어서 mapping 시켜도 된다.       	      **/
/**                                File Name   : DsInfo.java                	              **/  		
/**                                Description : ds_info 질병정보                                                                         **/ 
/**                                Update      : 2015.05.12(박정훈)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/

package kr.ac.iof.model.Main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ds_info")
public class DsInfo {
	
	@Id
	@Column(name = "DS_ID")//4 primary key, 매핑되는 column이름
	private int dsId;
	@Column(name = "DS_NAME") //200
	private String dsName;
	@Column(name = "CROP_ID")//4 
	private int cropId;
	@Column(name = "DS_CATE_ID")//4 
	private int dsCateId;
	@Column(name = "DS_PART_ROOT") //1
	private String dsPartRoot;
	@Column(name = "DS_PART_LEAF") //1
	private String dsPartLeaf;
	@Column(name = "DS_PART_STEM") //1
	private String dsPartStem;
	@Column(name = "DS_PART_FLOWER") //1
	private String dsPartFlower;
	@Column(name = "DS_PART_FRUIT") //1
	private String dsPartFruit;
	@Column(name = "DS_PART_GROWING_POINT") //1
	private String dsPartGrowingPoint;
	@Column(name = "DS_INFO_HTML") //200
	private String dsInfoHtml;
	
	public DsInfo () {//생성자는 필수

	    }
	
	

	
}
