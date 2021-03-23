package com.assesment.problem1.controllers;

import com.assesment.problem1.Services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private MainService mainService;

    @PostMapping("/add/longestpalindromes/{inputStr}")
    public ResponseEntity<String> findLongestPalindrome(@PathVariable("inputStr") String str){
        mainService.findLongest(str);
        return new ResponseEntity<>("Operation Successful", HttpStatus.OK);
    }
    @GetMapping("/get/longestpalindromes/{inputStr}")
    public ResponseEntity<String> getPalindrome(@PathVariable("inputStr") String str){
        String longestPalindrome=mainService.getPalindrome(str);
        return new ResponseEntity<>(longestPalindrome,HttpStatus.OK);
    }
}
