/**                                                                                 	           **/
/**                                File Name   : CropInfo.java                	               **/  		
/**                                Description : crop_info 작물별 분류 코드	                      **/ 
/**                                Update      : 2015.05.12(박정훈)	                               **/
/**                                ETC         :                    	                           **/
/**                                                                     	                       **/

package kr.ac.iof.model.Main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "crop_info")
public class CropInfo {

	@Id
	@Column(name = "CROP_ID")
	private int cropId;
	@ManyToOne
	@JoinColumn(name = "CROP_CATE_ID")
	private CropCate cropCate;
	
	private String cropName;
	private String cropInfoHtml;

	public CropInfo() {

	}
	public CropInfo(int cropId, CropCate cropCate, String cropName,
			String cropInfoHtml) {
		super();
		this.cropId = cropId;
		this.cropCate = cropCate;
		this.cropName = cropName;
		this.cropInfoHtml = cropInfoHtml;
	}	


	public int getCropId() {
		return cropId;
	}
	public void setCropId(int cropId) {
		this.cropId = cropId;
	}
	public CropCate getCropCate() {
		return cropCate;
	}
	public void setCropCate(CropCate cropCate) {
		this.cropCate = cropCate;
	}
	public String getCropName() {
		return cropName;
	}
	public void setCropName(String cropName) {
		this.cropName = cropName;
	}
	public String getCropInfoHtml() {
		return cropInfoHtml;
	}
	public void setCropInfoHtml(String cropInfoHtml) {
		this.cropInfoHtml = cropInfoHtml;
	}
	//get crop category name
	public String getCropCateName() {
		return cropCate.getCropCateName();
	}
	

}
