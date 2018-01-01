package com.wrw.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wrw.test.dao.UsersDAO;
import com.wrw.test.pojo.Users;
import com.wrw.test.service.UsersServiceI;

/**
 * @author verseboys
 * @date 2018年01月01日
 */

@Service("UsersServiceI")
@Transactional
public class UsersServiceImpl implements UsersServiceI{
	
	
	@Autowired
	private UsersDAO usersDAO;

	@Override
	public List findByCardid(Object cardid) {
		
		
		
		
		return usersDAO.findByCardid(cardid);
	}

	@Override
	public List findAll() {
		
		return usersDAO.findAll();
	}

}