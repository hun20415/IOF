/**                                                                                 	           **/
/**                                File Name   : CropSpeciesInfo.java                	               **/  		
/**                                Description : crop_species_info 작물별 품종 정보	                      **/ 
/**                                Update      : 2015.05.12(옥정윤)	                               **/
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
@Table(name = "crop_species_info")
public class CropSpeciesInfo {
	
	@Id
	@Column(name = "SPECIES_ID")//4
	private int speciesId;
	
	@ManyToOne
	@JoinColumn(name = "CROP_CATE_ID")//2, foreign key
	private CropCate cropCate;
	
	@ManyToOne
	@JoinColumn(name = "CROP_ID")//4, foreign key
	private CropInfo cropInfo;
	
	@ManyToOne
	@JoinColumn(name = "CROP_TYPE_ID")//2, foreign key
	private CropTypeInfo cropTypeInfo;
	
	@Column(name = "SPECIES_NAME")//200
	private String speciesName;
	@Column(name = "LEVEL0 ")//double 10,2
	private int level0;
	@Column(name = "LEVEL1 ")//double 10,2
	private int level1;
	@Column(name = "LEVEL2 ")//double 10,2
	private int level2;
	@Column(name = "LEVEL3 ")//double 10,2
	private int level3;
	@Column(name = "LEVEL4 ")//double 10,2
	private int level4;
	@Column(name = "LEVEL5 ")//double 10,2
	private int level5;
	
	@Column(name = "SPECIES_PHOTO_FILE ")//200
	private String speciesPhotoFile;
	@Column(name = "CROP_SPECIES_INFO_HTML ")//200
	private String cropSpeciesInfoHtml;
	public CropSpeciesInfo() {
		super();
	}
	public CropSpeciesInfo(int speciesId, CropCate cropCate, CropInfo cropInfo,
			CropTypeInfo cropTypeInfo, String speciesName, int level0,
			int level1, int level2, int level3, int level4, int level5,
			String speciesPhotoFile, String cropSpeciesInfoHtml) {
		super();
		this.speciesId = speciesId;
		this.cropCate = cropCate;
		this.cropInfo = cropInfo;
		this.cropTypeInfo = cropTypeInfo;
		this.speciesName = speciesName;
		this.level0 = level0;
		this.level1 = level1;
		this.level2 = level2;
		this.level3 = level3;
		this.level4 = level4;
		this.level5 = level5;
		this.speciesPhotoFile = speciesPhotoFile;
		this.cropSpeciesInfoHtml = cropSpeciesInfoHtml;
	}
	public int getSpeciesId() {
		return speciesId;
	}
	public void setSpeciesId(int speciesId) {
		this.speciesId = speciesId;
	}
	public CropCate getCropCate() {
		return cropCate;
	}
	public void setCropCate(CropCate cropCate) {
		this.cropCate = cropCate;
	}
	public CropInfo getCropInfo() {
		return cropInfo;
	}
	public void setCropInfo(CropInfo cropInfo) {
		this.cropInfo = cropInfo;
	}
	public CropTypeInfo getCropTypeInfo() {
		return cropTypeInfo;
	}
	public void setCropTypeInfo(CropTypeInfo cropTypeInfo) {
		this.cropTypeInfo = cropTypeInfo;
	}
	public String getSpeciesName() {
		return speciesName;
	}
	public void setSpeciesName(String speciesName) {
		this.speciesName = speciesName;
	}
	public int getLevel0() {
		return level0;
	}
	public void setLevel0(int level0) {
		this.level0 = level0;
	}
	public int getLevel1() {
		return level1;
	}
	public void setLevel1(int level1) {
		this.level1 = level1;
	}
	public int getLevel2() {
		return level2;
	}
	public void setLevel2(int level2) {
		this.level2 = level2;
	}
	public int getLevel3() {
		return level3;
	}
	public void setLevel3(int level3) {
		this.level3 = level3;
	}
	public int getLevel4() {
		return level4;
	}
	public void setLevel4(int level4) {
		this.level4 = level4;
	}
	public int getLevel5() {
		return level5;
	}
	public void setLevel5(int level5) {
		this.level5 = level5;
	}
	public String getSpeciesPhotoFile() {
		return speciesPhotoFile;
	}
	public void setSpeciesPhotoFile(String speciesPhotoFile) {
		this.speciesPhotoFile = speciesPhotoFile;
	}
	public String getCropSpeciesInfoHtml() {
		return cropSpeciesInfoHtml;
	}
	public void setCropSpeciesInfoHtml(String cropSpeciesInfoHtml) {
		this.cropSpeciesInfoHtml = cropSpeciesInfoHtml;
	} 
	

}
