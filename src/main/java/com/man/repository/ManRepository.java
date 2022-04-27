package com.man.repository;

import com.man.entities.Man;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ManRepository extends JpaRepository<Man, Long> {

    public List<Man> findAll();

    public Man save(Man manObject);

}
