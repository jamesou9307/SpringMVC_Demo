package com.james.springmvc.controller;


import com.james.springmvc.entity.Customer;
import com.james.springmvc.form.CustomerForm;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sun.util.locale.provider.LocaleServiceProviderPool;

import javax.servlet.http.HttpServletRequest;

@Controller //通过@Controller注解配置为其中一个Controller
public class CustomerController {


    private static final Log logger= LogFactory.getLog(CustomerController.class);

    //通过@RequestMapping的value属性,可以通过url/input_customer访问inputCustomer()方法,通过配置method属性,可以控制处理哪些http方法
    @RequestMapping(value = "/input_customer",
    method = {RequestMethod.GET,RequestMethod.POST}
    )
    public String inputCustomer(){

        logger.info("inputCustomer called");
        return "customerForm";

    }

    @RequestMapping(value = "/save_customer")
    public String saveCustomer(HttpServletRequest request, Model model){

        logger.info("saveCustomer called");

        CustomerForm customerForm=new CustomerForm();
        customerForm.setCustomerId(request.getParameter("customerid"));
        customerForm.setCustomerName(request.getParameter("customername"));

        Customer customer=new Customer();
        customer.setCustomerId(customerForm.getCustomerId());
        customer.setCustomerName(customerForm.getCustomerName());

        model.addAttribute("customer",customer);//用于添加在view中要现实的属性
        return "customerDetails";



    }


}
