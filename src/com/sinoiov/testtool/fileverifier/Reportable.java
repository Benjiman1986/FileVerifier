/**
 * 
 */
package com.sinoiov.testtool.fileverifier;


/**
 * @author liwei
 *
 */
public interface Reportable {
	/**
	 * ��ɽ��Ȱٷֱ�
	 * @param percent
	 */
	public void percent(int percent);
	
	public void finished();
}
