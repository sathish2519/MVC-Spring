package com.java.mvc.login.controller;

import com.java.mvc.login.dto.CustomerLogin;

public interface CustomerController {
    public String authenticateUser(CustomerLogin customerLogin) throws Exception;
}
