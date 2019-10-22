package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.SpringstartApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestApp {

  //@GetMapping("/greeting")
  @RequestMapping(value = "/greeting", method = RequestMethod.GET)
  @ResponseBody
  public Greeting main() {
    Greeting greeting = new Greeting(1, "Hello World");
    return greeting;
  }

  @GetMapping("/greeting2")
  @ResponseBody
  public Greeting main(@RequestParam(name = "id") long id) {
    Greeting greeting = new Greeting(id, "Omar");
    return greeting;
  }
}

