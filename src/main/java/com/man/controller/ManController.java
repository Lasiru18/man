package com.man.controller;

import com.man.entities.Man;
import com.man.service.ManService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    @GetMapping("/{manId}")
    public Optional<Man> getMan(@PathVariable("manId") Long manId) {
        //call to service
        var man = manService.getMan(manId);
        return man;
    }


























}


