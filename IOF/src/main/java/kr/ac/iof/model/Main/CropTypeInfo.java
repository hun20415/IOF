/**                                                                                 	           **/
/** Entity in java, 이때 각 테이블의 이름을 이곳에서  선언해주어도 되고 hbm 파일을 따로 만들어서 mapping 시켜도 된다.       	      **/
/**                                File Name   : CropTypeInfo.java                	              **/  		
/**                                Description : crop_type_info 작물 소분류 테이블                                                     **/ 
/**                                Update      : 2015.05.12(박정훈)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/

package kr.ac.iof.model.Main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "crop_type_info")
public class CropTypeInfo {
	
	@Id
	@Column(name = "CROP_TYPE_ID")//2 primary key, 매핑되는 column이름
	private int cropTypeId;
	@Column(name = "CROP_TYPE_NAME") //20
	private String cropTypeName;
	@Column(name = "CROP_ID") //4, FOREIGN KEY
	private int cropId;
	@Column(name = "CROP_TYPE_HTML") //200
	private String cropTypeHtml;
	
	public CropTypeInfo () {//생성자는 필수

	    }
	
	

	public CropTypeInfo(int cropTypeId, String cropTypeName, int cropId,
			String cropTypeHtml) {
		super();
		this.cropTypeId = cropTypeId;
		this.cropTypeName = cropTypeName;
		this.cropId = cropId;
		this.cropTypeHtml = cropTypeHtml;
	}



	public int getCropTypeId() {
		return cropTypeId;
	}

	public String getCropTypeName() {
		return cropTypeName;
	}

	public int getCropId() {
		return cropId;
	}

	public String getCropTypeHtml() {
		return cropTypeHtml;
	}

	public void setCropTypeId(int cropTypeId) {
		this.cropTypeId = cropTypeId;
	}

	public void setCropTypeName(String cropTypeName) {
		this.cropTypeName = cropTypeName;
	}

	public void setCropId(int cropId) {
		this.cropId = cropId;
	}

	public void setCropTypeHtml(String cropTypeHtml) {
		this.cropTypeHtml = cropTypeHtml;
	}
	
	

	
}
