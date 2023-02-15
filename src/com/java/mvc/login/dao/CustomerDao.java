package com.java.mvc.login.dao;

import com.java.mvc.login.dto.CustomerLogin;

public interface CustomerDao {
    public CustomerLogin getuserbyUserName(String userName);
}
