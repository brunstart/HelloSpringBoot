package com.example.hello.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/get")
public class GetApiController
{
    @GetMapping(path = "/hello") // http://localhost:9090/api/get/hello
    public String Hello()
    {
        return "get Hello";
    }

    @RequestMapping(path = "/hi", method = RequestMethod.GET)  // get / http://localhost:9090/api/get/hi
    public String hi()
    {
        return "hi";
    }

    //  http://localhost:9090/api/get/path-variable/{name}
    @GetMapping("/path-variable/{id}")
    public String pathVariable(@PathVariable(name = "id") String pathName)
    {
        System.out.println("PathVariable : " + pathName);

        return pathName;
    }

    // http://localhost:9090/api/get/query-param?user=steve&email=steve@gmail.com&age=30

}
