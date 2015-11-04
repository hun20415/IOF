/**                                                                                 	           		**/
/**                                File Name   : CropCate.java              		  	               	**/  		
/**                                Description : Entity, CropCate Table과 매핑	                       		**/
/**                                Update      : 2015.05.11(박정훈)	                               		**/
/**                                ETC         :                    	                           		**/
/**                                                                     	                       		**/

package kr.ac.iof.model.Main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "greentom")
public class Greentom {
	
	@Id
	@Column(name = "index")//
	private int index;
	
	@Column(name = "NBRU")//매핑되는 column이름
	private double nbru;

	@Column(name = "NBLV")
	private String nblv;
	
	@Column(name = "DML")
	private String dml;

	@Column(name = "DMS")
	private String dms;
	
	@Column(name = "DMF")
	private String dmf;
	
	@Column(name = "DATE")
	private String date;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Greentom other = (Greentom) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (dmf == null) {
			if (other.dmf != null)
				return false;
		} else if (!dmf.equals(other.dmf))
			return false;
		if (dml == null) {
			if (other.dml != null)
				return false;
		} else if (!dml.equals(other.dml))
			return false;
		if (dms == null) {
			if (other.dms != null)
				return false;
		} else if (!dms.equals(other.dms))
			return false;
		if (index != other.index)
			return false;
		if (nblv == null) {
			if (other.nblv != null)
				return false;
		} else if (!nblv.equals(other.nblv))
			return false;
		if (Double.doubleToLongBits(nbru) != Double
				.doubleToLongBits(other.nbru))
			return false;
		return true;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((dmf == null) ? 0 : dmf.hashCode());
		result = prime * result + ((dml == null) ? 0 : dml.hashCode());
		result = prime * result + ((dms == null) ? 0 : dms.hashCode());
		result = prime * result + index;
		result = prime * result + ((nblv == null) ? 0 : nblv.hashCode());
		long temp;
		temp = Double.doubleToLongBits(nbru);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public double getNbru() {
		return nbru;
	}

	public void setNbru(double nbru) {
		this.nbru = nbru;
	}

	public String getNblv() {
		return nblv;
	}

	public void setNblv(String nblv) {
		this.nblv = nblv;
	}

	public String getDml() {
		return dml;
	}

	public void setDml(String dml) {
		this.dml = dml;
	}

	public String getDms() {
		return dms;
	}

	public void setDms(String dms) {
		this.dms = dms;
	}

	public String getDmf() {
		return dmf;
	}

	public void setDmf(String dmf) {
		this.dmf = dmf;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
}
