package com.example.dockerapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dockerapp.model.Test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("api/v1/test")
public class TestController {

    @GetMapping
    public ResponseEntity<List<Test>> getAll() {

        var tests = new ArrayList<Test>();
        Test test1 = Test.builder().id(1).name("Test1").build();
        tests.add(test1);
        return new ResponseEntity<>(tests, HttpStatus.OK);
    }
    

}
