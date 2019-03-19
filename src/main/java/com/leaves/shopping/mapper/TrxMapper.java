package com.leaves.shopping.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.leaves.shopping.model.Trx;

import tk.mybatis.mapper.common.Mapper;

/**
 * @author betterangela
 */
@Repository
public interface TrxMapper extends Mapper<Trx> {

	/**
	 * 获取已购买的商品ID列表
	 * 
	 * @param personId 用户ID
	 * @return 商品ID列表
	 * @throws Exception exception
	 */
	List<Integer> getBuyContentIdList(Integer personId) throws Exception;

	/**
	 * 获取售出的商品ID列表
	 * 
	 * @return 商品ID列表
	 * @throws Exception exception
	 */
	List<Integer> getIsSellContentIdList() throws Exception;
}
