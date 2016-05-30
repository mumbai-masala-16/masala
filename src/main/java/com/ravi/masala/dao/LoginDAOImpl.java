package com.ravi.masala.dao;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ravi.masala.dao.api.LoginDAO;
import com.ravi.masala.domain.LoginModel;

@Repository
public class LoginDAOImpl implements LoginDAO {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoginDAOImpl.class);
    @Autowired
    private SessionFactory sessionFactory;

   public boolean validateUser(LoginModel user) {
	   LoginModel dbUser = (LoginModel) sessionFactory.getCurrentSession().load(LoginModel.class,user.getUserName());
        if (null != dbUser) {
        	System.out.println("==================================================================================");
        	System.out.println(dbUser.getPassword());
        	System.out.println(dbUser.getUserName());
        	System.out.println("==================================================================================");
        	if(dbUser.getUserName().equals(user.getUserName()) && dbUser.getPassword().equals(user.getPassword())){
            return true;
        	}else{
        		//Wrong username or password.
        		return false;
        	}
        }else{
        	//User doesn't exist.
        	return false;
        }

    }
}
