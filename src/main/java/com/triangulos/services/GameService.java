package com.triangulos.services;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.triangulos.dtos.Triangles;

@Service
public class GameService {

    private Triangles triangles = new Triangles();

    public int solutionsCardinal() throws CloneNotSupportedException {
        return triangles.getAllSolutions().size();
    }

    public Triangles getRandomSolution() throws CloneNotSupportedException {
        Triangles triangles = new Triangles();
        Set<Triangles> solutions = triangles.getAllSolutions();
        Iterator<Triangles> iterator = solutions.iterator();
        Triangles item = null;
        int cont = 1;
        Random rndm = new Random();
        int rndmNumber = rndm.nextInt(1);
        while ( cont <= rndmNumber && iterator.hasNext() ) {
            item = iterator.next();
            cont++;
        }
        return item;
    }

}
