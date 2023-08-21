package com.springaoptest.aoptest.controllers;

import com.springaoptest.aoptest.services.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class TestController {

    private final TestService testService;

    @GetMapping("/before")
    public ResponseEntity beforeEndpoint(){
        return ResponseEntity.
                status(HttpStatus.OK).
                body(testService.logic1());
    }

    @GetMapping("/after")
    public ResponseEntity afterEndpoint(){
        return ResponseEntity.
                status(HttpStatus.OK).
                body(testService.logic2());
    }

    @GetMapping("/around")
    public ResponseEntity aroundEndpoint(){
        return ResponseEntity.
                status(HttpStatus.OK).
                body(testService.logic3());
    }


}
