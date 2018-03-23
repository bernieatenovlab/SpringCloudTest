package com.example.service.impl;

import com.example.exceptions.MyTestCheckedException;
import com.example.service.interfaces.IExampleService;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@RefreshScope
public class ExampleServiceImpl implements IExampleService {

    public void myTestMethod() throws MyTestCheckedException {
        throw new MyTestCheckedException("This is a test");
    }

}