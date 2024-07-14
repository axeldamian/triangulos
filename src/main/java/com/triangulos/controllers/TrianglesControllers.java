package com.triangulos.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.triangulos.dtos.Triangles;
import com.triangulos.services.GameService;

@RestController
public class TrianglesControllers {

    Logger log = LogManager.getLogger(this.getClass().getSimpleName());
    
    @Autowired
    GameService service;

    @GetMapping("/cardinal")
    public int getCardinal() throws CloneNotSupportedException {
        log.info("/cardinal");
        log.info( new Triangles() );
        return service.solutionsCardinal();
    }


    @GetMapping("/calculate-solution")
    public Triangles getSolution() throws CloneNotSupportedException {
        log.info("/calculate-solution");
        return service.solutionsCardinal();
    }
    
}
