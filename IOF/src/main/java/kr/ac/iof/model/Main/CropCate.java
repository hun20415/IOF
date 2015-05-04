package kr.ac.iof.model.Main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "crop_category")
public class CropCate {
	
	@Id
	@Column(name = "CROP_CATE_ID")
	private int cropcateid;
	private String cropcatename;
	private String cropcatehtml;
	 public CropCate() {

	    }
	public CropCate(String cropcatename, String cropcatehtml) {
		super();
		this.cropcatename = cropcatename;
		this.cropcatehtml = cropcatehtml;
	}

	public int getCropcateid() {
		return cropcateid;
	}

	public void setCropcateid(int cropcateid) {
		this.cropcateid = cropcateid;
	}

	public String getCropcatename() {
		return cropcatename;
	}

	public void setCropcatename(String cropcatename) {
		this.cropcatename = cropcatename;
	}

	public String getCropcatehtml() {
		return cropcatehtml;
	}

	public void setCropcatehtml(String cropcatehtml) {
		this.cropcatehtml = cropcatehtml;
	}
	
	
}
