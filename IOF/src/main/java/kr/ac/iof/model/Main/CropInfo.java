package kr.ac.iof.model.Main;

import javax.persistence.CascadeType;
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
	private int cropid;
	@ManyToOne
	// (cascade = CascadeType.ALL)
	@JoinColumn(name = "CROP_CATE_ID")
	private CropCate cropcate;

	public CropInfo(int cropid, CropCate cropcate, String cropname,
			String crop_info_html) {
		super();
		this.cropid = cropid;
		this.cropcate = cropcate;
		this.cropname = cropname;
		this.crop_info_html = crop_info_html;
	}

	private String cropname;
	private String crop_info_html;

	public CropInfo() {

	}

	public int getCropid() {
		return cropid;
	}

	public void setCropid(int cropid) {
		this.cropid = cropid;
	}
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "AUTHOR_ID")
	public CropCate getCropcate() {
		return cropcate;
	}
	
	public void setCropcate(CropCate cropcate) {
		this.cropcate = cropcate;
	}

	public String getCropname() {
		return cropname;
	}

	public void setCropname(String cropname) {
		this.cropname = cropname;
	}

	public String getCrop_info_html() {
		return crop_info_html;
	}
	
	public void setCrop_info_html(String crop_info_html) {
		this.crop_info_html = crop_info_html;
	}

}
