package com.java.mvc.login.controller;

import com.java.mvc.login.dto.CustomerLogin;
import com.java.mvc.login.service.LoginService;
import com.java.mvc.login.service.LoginServiceImpl;

public class CustomerControllerImpl implements CustomerController{



    private LoginService loginService;

    /**
     * @return
     */
    @Override
    public String authenticateUser(CustomerLogin customerLogin) throws Exception {
        loginService=new LoginServiceImpl();
        String out=loginService.isValidUser(customerLogin);
        return out;
    }
}
