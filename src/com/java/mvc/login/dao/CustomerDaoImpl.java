package com.java.mvc.login.dao;

import com.java.mvc.login.dto.CustomerLogin;

import java.util.HashMap;
import java.util.Map;

public class CustomerDaoImpl implements CustomerDao{
    /**
     * @param userName
     * @return
     */
    @Override
    public CustomerLogin getuserbyUserName(String userName) {
        Map<String,String> userMap=new HashMap<>();
        userMap.put("sathish","5318");
        CustomerLogin customerLogin=new CustomerLogin();
        customerLogin.setName(userName);
        customerLogin.setPassword(userMap.get(userName));
        return customerLogin;
    }
}
