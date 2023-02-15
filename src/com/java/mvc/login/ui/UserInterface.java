package com.java.mvc.login.ui;

import com.java.mvc.login.controller.CustomerController;
import com.java.mvc.login.controller.CustomerControllerImpl;
import com.java.mvc.login.dto.CustomerLogin;

public class UserInterface {



    public static void main(String[] args)throws Exception {
        CustomerController customerController=new CustomerControllerImpl();
        CustomerLogin customerLogin=new CustomerLogin();
        customerLogin.setName("sathish");
        customerLogin.setPassword("531");
        try {
            System.out.println(customerController.authenticateUser(customerLogin));

        }catch (Exception e) {
            System.out.println(e);
        }

    }
}
