package com.java.mvc.login.service;

import com.java.mvc.login.dto.CustomerLogin;

public interface LoginService {
    public String isValidUser(CustomerLogin customerLogin)throws Exception;
}
