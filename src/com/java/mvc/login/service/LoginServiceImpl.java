package com.java.mvc.login.service;

import com.java.mvc.login.dao.CustomerDao;
import com.java.mvc.login.dao.CustomerDaoImpl;
import com.java.mvc.login.dto.CustomerLogin;

public class LoginServiceImpl implements LoginService{



    private CustomerDao customerDao;
    /**
     * @param customerLogin
     * @return
     * @throws Exception
     */
    @Override
    public String isValidUser(CustomerLogin customerLogin) throws Exception {
      String toRet=null;
      customerDao=new CustomerDaoImpl();
      CustomerLogin customerLoginfromdao=customerDao.getuserbyUserName(customerLogin.getName());
      if(customerLoginfromdao.getPassword().equals(customerLogin.getPassword())){
          toRet="Password verified.Login Successfull!";
          return toRet;
      }else {
          throw new Exception("Invalid Credentials");
      }

    }
}
