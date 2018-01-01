package com.wrw.test.service;

import java.util.List;

import com.wrw.test.pojo.Users;


/**
 * @author verseboys
 * @date 2018年01月01日
 */
public interface UsersServiceI {
	
	public List findByCardid(Object cardid);
	
	
	public List findAll();

}