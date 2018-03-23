package com.example;

import com.example.exceptions.MyTestCheckedException;
import com.example.service.impl.ExampleServiceImpl;
import com.example.service.interfaces.IExampleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.autoconfigure.RefreshAutoConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Fail.fail;

@RunWith(SpringRunner.class)
@SpringBootTest(
        classes = {
                RefreshAutoConfiguration.class,
                ExampleServiceImpl.class
        }
)
public class ExampleServiceTest {
    @Autowired
    private IExampleService exampleService;

    @Test(expected = MyTestCheckedException.class)
    public void test() throws Exception {
        try {
            exampleService.myTestMethod();
        } catch (MyTestCheckedException e) {
            throw e;
        }
        fail("should have thrown exception");
    }
}
