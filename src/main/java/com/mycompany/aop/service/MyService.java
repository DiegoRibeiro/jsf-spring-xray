/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aop.service;

import com.amazonaws.xray.spring.aop.XRayEnabled;
import org.springframework.stereotype.Service;

/**
 *
 * @author Daniego
 */
@Service
public class MyService {
    
    public void doStuff() {
        System.out.println("stuff");
    }
    
}
