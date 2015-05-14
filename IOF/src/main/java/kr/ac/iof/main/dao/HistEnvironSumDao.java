/**                                                                             				                **/
/**                                File Name   : HistEnvironSumDao.java       	    		            		   	**/  		
/**                                Description : HistEnvironSum Dao interface			                    			**/ 
/**                                Update      : 2015.05.14(옥정윤)                                				**/
/**                                ETC         :                                                                **/
/**					                                                                                            **/
package kr.ac.iof.main.dao;

import java.util.List;

import kr.ac.iof.model.Main.HistEnvironSum;

public interface HistEnvironSumDao {
	public void add(HistEnvironSum histEnvironSum);

	public void delete(int histEnvironSumId);

	public void update(HistEnvironSum histEnvironSum);

	public List<HistEnvironSum> getAll();

	public HistEnvironSum getById(int histEnvironSumId);
}
