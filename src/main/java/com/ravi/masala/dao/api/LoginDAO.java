package com.ravi.masala.dao.api;

import com.ravi.masala.domain.LoginModel;

public interface LoginDAO {

	public boolean validateUser(LoginModel user);
}
