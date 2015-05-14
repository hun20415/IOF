/**                                                                             				                **/
/**                                File Name   : HistEnvironRawDao.java       	    		            		   	**/  		
/**                                Description : HistEnvironRaw Dao interface			                    			**/ 
/**                                Update      : 2015.05.14(옥정윤)                               				**/
/**                                ETC         :                                                                **/
/**					                                                                                            **/
package kr.ac.iof.main.dao;

import java.util.List;

import kr.ac.iof.model.Main.HistEnvironRaw;

public interface HistEnvironRawDao {
	public void add(HistEnvironRaw histEnvironRaw);

	public void delete(int histEnvironRawId);

	public void update(HistEnvironRaw histEnvironRaw);

	public List<HistEnvironRaw> getAll();

	public HistEnvironRaw getById(int histEnvironRawId);
}
