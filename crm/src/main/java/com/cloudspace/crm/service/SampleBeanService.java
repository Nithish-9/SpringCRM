package com.cloudspace.crm.service;

import com.cloudspace.crm.wrapper.SamplePathVaribleResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class SampleBeanService {

    @Autowired
    SamplePathVaribleResponseWrapper obj;

    public SamplePathVaribleResponseWrapper getUserDetails(String name){
        obj.name = name;
        obj.id = 23;
        obj.rating = 2.5;
        return obj;
    }
}
