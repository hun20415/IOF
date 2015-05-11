/*********************************************************************************************************/
/*************************Entity in java, 이때 각 테이블의 이름을 이곳에서  선언해주어도 되고 hbm 파일을 따로 만들어서 mapping 시켜도 된다.******/
/*************************2015-05-06 박정훈 *****************************************************************/
/*********************************************************************************************************/
package kr.ac.iof.model.Main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "crop_category")
public class CropCate {
	
	@Id
	@Column(name = "CROP_CATE_ID")//매핑되는 column이름
	private int cropCateId;
	@Column(name = "CROP_CATE_NAME", length = 200)
	private String cropCateName;
	@Column(name = "CROP_CATE_HTML", length = 200)
	private String cropCateHtml;
	 public CropCate() {//생성자는 필수

	    }
	public CropCate(String cropCateName, String cropCateHtml) {
		super();
		this.cropCateName = cropCateName;
		this.cropCateHtml = cropCateHtml;
	}
	public int getCropCateId() {
		return cropCateId;
	}
	public void setCropCateId(int cropCateId) {
		this.cropCateId = cropCateId;
	}
	public String getCropCateName() {
		return cropCateName;
	}
	public void setCropCateName(String cropCateName) {
		this.cropCateName = cropCateName;
	}
	public String getCropCateHtml() {
		return cropCateHtml;
	}
	public void setCropCateHtml(String cropCateHtml) {
		this.cropCateHtml = cropCateHtml;
	}

	
	
}
