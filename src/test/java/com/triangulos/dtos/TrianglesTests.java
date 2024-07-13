package com.triangulos.dtos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TrianglesTests {

    @Test
    void testingPointsTriangle1() {
        Triangles triangles = new Triangles();
        assertEquals( 6 , triangles.getPointsTriangle1().size() );
    }
    
}
