package com.yaseraktas.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yaseraktas.dao.UserDAO;
import com.yaseraktas.entity.User;

@Service
@Transactional
public class UserService {

	@Autowired
	private MailService mailService;
	
	@Autowired
	private UserDAO userDAO;
	
	public Long insert(User user){
		String uuid = UUID.randomUUID().toString();
		user.setKeyreg(uuid);
		
		if(userDAO.insert(user)>0){
			mailService.registerMail(user.getEmail(), user.getKeyreg());
		}
		return 1l;
	}
	
	public void update(User user){
		userDAO.update(user);
	}
	
	public User getFindByUsernameAndPass(User user){
		return userDAO.getFindByUsernameAndPass(user.getUsername(),user.getPassword());
	}
	
	public User getFindByUsername(String username){
		return userDAO.getFindByUsername(username);
	}
	
	public boolean getFindByKey(String key){
		User user = userDAO.getFindByKey(key);
		if(user!= null){
			user.setActive(true);
			update(user);
			return true;
		}else
			return false;
	}
	
}
