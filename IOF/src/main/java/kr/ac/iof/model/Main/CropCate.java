/*********************************************************************************************************/
/*************************Entity in java, 이때 각 테이블의 이름을 이곳에서  선언해주어도 되고 hbm 파일을 따로 만들어서 mapping 시켜도 된다.******/
/*************************2015-05-06 박정훈 *****************************************************************/
/*********************************************************************************************************/
package kr.ac.iof.model.Main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "crop_category")
public class CropCate {
	
	@Id
	@Column(name = "CROP_CATE_ID")//매핑되는 column이름
	private int cropcateid;
	private String cropcatename;
	private String cropcatehtml;
	 public CropCate() {//생성자는 필수

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
