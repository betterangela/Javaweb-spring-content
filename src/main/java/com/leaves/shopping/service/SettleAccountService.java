package com.leaves.shopping.service;

/**
 * @author betterangela
 */
public interface SettleAccountService {

	/**
	 * 直接购买
	 * 
	 * @param personId 用户ID
	 * @param cid      商品ID
	 * @param num      购买数量
	 * @throws Exception exception
	 */
	boolean buy(Integer personId, Integer cid, Integer num) throws Exception;

	/**
	 * 从购物车中购买
	 * 
	 * @param personId 用户ID
	 * @param tid      购物车id
	 * @throws Exception exception
	 */
	boolean buyFromTemporary(Integer personId, Integer tid) throws Exception;
}
