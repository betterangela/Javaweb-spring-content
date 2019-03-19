package com.leaves.shopping.service;

/**
 * @author betterangela
 */
public interface InventoryService {

	/**
	 * 根据商品ID获取商品库存
	 * 
	 * @param cid 商品ID
	 * @return 商品库存
	 * @throws Exception exception
	 */
	int getInventoryByCid(Integer cid) throws Exception;
}
