package com.triangulos.services;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.triangulos.dtos.Triangles;

@Service
public class GameService {

    private Triangles triangles;

    public int solutionsCardinal() throws CloneNotSupportedException {

        if ( triangles == null) {
            triangles = new Triangles();
        }

        return triangles.getAllSolutions().size();
    }

    public String getRandomSolution() throws CloneNotSupportedException {
           
        if ( triangles == null) {
            triangles = new Triangles();
        }

        //Set<Triangles> solutions = triangles.getAllSolutions();
        HashSet<Triangles> solutions = new HashSet<>();
        Iterator<Triangles> iterator = solutions.iterator();
        Triangles item = null;
        int cont = 1;
        Random rndm = new Random();
        int rndmNumber = rndm.nextInt(1);

        while ( cont <= rndmNumber && iterator.hasNext() ) {
            item = iterator.next();
            cont++;
        }
        
        return item.toString();
    }

    public Triangles getVoidTriangles() {
        Triangles triangles = new Triangles();
        return triangles;
    }

}
