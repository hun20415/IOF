/**                                                                                 	           **/
/**                                File Name   : DsInfo.java                	              **/  		
/**                                Description : ds_info 질병정보                                                                         **/ 
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
@Table(name = "ds_info")
public class DsInfo {
	
	@Id
	@Column(name = "DS_ID")//4 primary key, 매핑되는 column이름
	private int dsId;
	
	@Column(name = "DS_NAME") //200
	private String dsName; 
	
	@ManyToOne
	@JoinColumn(name = "CROP_ID", referencedColumnName = "CROP_ID")//4 , foreign key
	private CropInfo cropInfo;
	
	@ManyToOne
	@JoinColumn(name = "DS_CATE_ID", referencedColumnName = "DS_CATE_ID")//4 , foreign key
	private DsCategory dsCategory;
	
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
	
	public DsInfo () {

	}
	
	public DsInfo(int dsId, String dsName, CropInfo cropInfo, DsCategory dsCategory,
			String dsPartRoot, String dsPartLeaf, String dsPartStem,
			String dsPartFlower, String dsPartFruit, String dsPartGrowingPoint,
			String dsInfoHtml) {
		super();
		this.dsId = dsId;
		this.dsName = dsName;
		this.cropInfo = cropInfo;
		this.dsCategory = dsCategory;
		this.dsPartRoot = dsPartRoot;
		this.dsPartLeaf = dsPartLeaf;
		this.dsPartStem = dsPartStem;
		this.dsPartFlower = dsPartFlower;
		this.dsPartFruit = dsPartFruit;
		this.dsPartGrowingPoint = dsPartGrowingPoint;
		this.dsInfoHtml = dsInfoHtml;
	}

	public int getDsId() {
		return dsId;
	}

	public String getDsName() {
		return dsName;
	}

	public CropInfo getCropInfo() {
		return cropInfo;
	}

	public DsCategory getDsCategory() {
		return dsCategory;
	}

	public String getDsPartRoot() {
		return dsPartRoot;
	}

	public String getDsPartLeaf() {
		return dsPartLeaf;
	}

	public String getDsPartStem() {
		return dsPartStem;
	}

	public String getDsPartFlower() {
		return dsPartFlower;
	}

	public String getDsPartFruit() {
		return dsPartFruit;
	}

	public String getDsPartGrowingPoint() {
		return dsPartGrowingPoint;
	}

	public String getDsInfoHtml() {
		return dsInfoHtml;
	}

	public void setDsId(int dsId) {
		this.dsId = dsId;
	}

	public void setDsName(String dsName) {
		this.dsName = dsName;
	}

	public void setCropId(CropInfo cropInfo) {
		this.cropInfo = cropInfo;
	}

	public void setDsCateId(DsCategory dsCategory) {
		this.dsCategory = dsCategory;
	}

	public void setDsPartRoot(String dsPartRoot) {
		this.dsPartRoot = dsPartRoot;
	}

	public void setDsPartLeaf(String dsPartLeaf) {
		this.dsPartLeaf = dsPartLeaf;
	}

	public void setDsPartStem(String dsPartStem) {
		this.dsPartStem = dsPartStem;
	}

	public void setDsPartFlower(String dsPartFlower) {
		this.dsPartFlower = dsPartFlower;
	}

	public void setDsPartFruit(String dsPartFruit) {
		this.dsPartFruit = dsPartFruit;
	}

	public void setDsPartGrowingPoint(String dsPartGrowingPoint) {
		this.dsPartGrowingPoint = dsPartGrowingPoint;
	}

	public void setDsInfoHtml(String dsInfoHtml) {
		this.dsInfoHtml = dsInfoHtml;
	}

}
