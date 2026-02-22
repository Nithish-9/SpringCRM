package com.cloudspace.crm.controller;

import com.cloudspace.crm.service.SampleBeanService;
import com.cloudspace.crm.wrapper.SamplePathVaribleResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/")
public class SampleController {

    @GetMapping(path="/getUser")
    public String getUserDetails(){
        return "Nithish";
    }

    @Autowired
    SampleBeanService sampleBeanServiceInstance;

    @GetMapping(path = "/getUser/{name}")
    public SamplePathVaribleResponseWrapper getUserDetails2(@PathVariable (name="name") String name){
        return sampleBeanServiceInstance.getUserDetails(name);
    }

}
