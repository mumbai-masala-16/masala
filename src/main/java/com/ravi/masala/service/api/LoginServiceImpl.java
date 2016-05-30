package com.ravi.masala.service.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ravi.masala.dao.api.LoginDAO;
import com.ravi.masala.domain.LoginModel;
import com.ravi.masala.service.LoginService;


@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginDAO loginDAO;

	@Override
	@Transactional
	public boolean validateUser(LoginModel user) {
		return loginDAO.validateUser(user);
	}
}
