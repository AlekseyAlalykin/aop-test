package com.springaoptest.aoptest.services;

import com.springaoptest.aoptest.annotations.LoggableAfter;
import com.springaoptest.aoptest.annotations.LoggableAround;
import com.springaoptest.aoptest.annotations.LoggableBefore;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@NoArgsConstructor
@Service
public class TestService {

    @LoggableBefore
    public String logic1(){
        String msg = "Logic 1";
        System.out.println(msg);
        return msg;
    }

    @LoggableAfter
    public String logic2(){
        String msg = "Logic 2";
        System.out.println(msg);
        return msg;
    }

    @LoggableAround
    public String logic3(){
        String msg = "Logic 3";
        System.out.println(msg);
        return msg;
    }
}
