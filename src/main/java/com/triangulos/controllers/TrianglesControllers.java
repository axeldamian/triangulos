package com.triangulos.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
        return service.solutionsCardinal();
    }


    @GetMapping("/calculate-solution")
    public String getSolution() throws CloneNotSupportedException {
        log.info("/calculate-solution");
        return service.getRandomSolution();
    }

    @GetMapping("/void-triangles")
    public ResponseEntity<Triangles> getVoidTriangles() {
        log.info("call endpoint /void-triangles");
        Triangles triangles = new Triangles();
        return new ResponseEntity<>( triangles , HttpStatus.OK);
    }
    
}
