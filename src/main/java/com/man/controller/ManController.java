package com.man.controller;

import com.man.entities.Man;
import com.man.service.ManService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/man")
public class ManController {

    private ManService manService;

    public ManController(ManService manService){
        this.manService = manService;
    }

    @PostMapping
    public Man newMan(@RequestBody Man man) {
        //call to service
        return (Man) manService.newTodo(man);
    }
}
