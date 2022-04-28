package com.man.service;

import com.man.entities.Man;
import com.man.repository.ManRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ManService {

    private ManRepository manRepository;

    //Constructor
    public ManService(ManRepository manRepository){
        this.manRepository = manRepository;
    }



    //Call to ManRepository
    public Man newTodo(Man man){
        return (Man) manRepository.save(man);
    }


    public Optional<Man> getMan(Long manId){
        var man = manRepository.findById(manId);
        return man;
    }
}
