/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aop.bean;

import com.amazonaws.xray.spring.aop.XRayEnabled;
import com.mycompany.aop.service.MyService;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Daniego
 */
@Controller
@XRayEnabled
public class BeanController implements Serializable{
    @Autowired
    private MyService service;
    
    public void teste() {
        System.out.println("teste");
        service.doStuff();
    }

    public MyService getService() {
        return service;
    }

    public void setService(MyService service) {
        this.service = service;
    }
}
