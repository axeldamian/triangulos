package com.triangulos.services;

import org.springframework.stereotype.Service;

import com.triangulos.dtos.Triangles;

@Service
public class GameService {

    private Triangles triangles = new Triangles();

    public int solutionsCardinal() throws CloneNotSupportedException {
        return triangles.getAllSolutions().size();
    }

}
