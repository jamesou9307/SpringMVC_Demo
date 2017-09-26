package com.james.springmvc.controller;

import com.james.springmvc.entity.Product;
import com.james.springmvc.form.ProductForm;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SaveProductController implements Controller{

    private static final Log logger= LogFactory.getLog(SaveProductController.class);

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        logger.info("SaveProductController called");
        ProductForm productForm=new ProductForm();
        productForm.setProductName(request.getParameter("name"));
        productForm.setDescription(request.getParameter("description"));
        productForm.setPrice(request.getParameter("price"));

        //创建一个模型
        Product product=new Product();
        product.setProductName(productForm.getProductName());
        product.setDescription(productForm.getDescription());
        product.setPrice(Float.parseFloat(productForm.getPrice()));


        return new ModelAndView("/WEB-INF/jsp/productDetails.jsp","product",product);
    }
}
