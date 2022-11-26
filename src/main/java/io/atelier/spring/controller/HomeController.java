package io.atelier.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(path="/api/vi") 
public class HomeController {

  @GetMapping(path="/hello")
  public @ResponseBody String helloWorld() {
    // This returns a JSON or XML with the users
    return "hello World 😀";
  }


}