package com.leaves.shopping.service;

import java.util.List;

import com.leaves.shopping.dto.BuyDto;

/**
 * @author betterangela
 */
public interface AccountService {

	/**
	 * 获取用户购买记录
	 * 
	 * @param userId 用户ID
	 * @return 购买记录
	 */
	List<BuyDto> buyList(Integer userId) throws Exception;

	/**
	 * 根据购买记录ID获取购买记录及商品详情
	 * 
	 * @param tid 购买记录ID
	 * @return 商品详情
	 */
	BuyDto getContentInfoByTid(Integer tid) throws Exception;
}
