/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import static org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder.controller;
import test.project.service.testService;

/**
 *
 * @author Thanh Hoai
 */
@Controller
public class Test {
    
    @Autowired
    private testService teService;
    
    @RequestMapping(value = "/")
    public String info(ModelMap mm){
        mm.put("list", teService.getAll());
        return "home";
    }
}
