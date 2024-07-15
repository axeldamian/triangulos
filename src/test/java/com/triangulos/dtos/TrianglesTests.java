package com.triangulos.dtos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TrianglesTests {

    @Test
    void testingSetValue() {
        Triangles triangles = new Triangles();

        Point p1 = new Point( 1 , 1 );
        p1.setValue(9);

        Point p2 = new Point( 1 , 2 );
        p2.setValue(8);

        triangles.setA(p1);
        triangles.setB(p2);

        assertEquals( p1.getValue(), triangles.getA().getValue() );
        assertEquals( p2.getValue(), triangles.getB().getValue());
        assertEquals( 0, triangles.getC().getValue());
        assertEquals( 0, triangles.getD().getValue());
        assertEquals( 0, triangles.getE().getValue());
        assertEquals( 0, triangles.getF().getValue());
        assertEquals( 0, triangles.getG().getValue());
        assertEquals( 0, triangles.getH().getValue());
        assertEquals( 0, triangles.getI().getValue());
        assertEquals( 0, triangles.getJ().getValue());
        assertEquals( 0, triangles.getK().getValue());
        assertEquals( 0, triangles.getL().getValue());
    }

    @Test
    void testingCopyContructorMoreOneDigit() {
        Triangles triangles = new Triangles();

        Point p1 = new Point( 1 , 1 );
        p1.setValue(9);

        Point p2 = new Point( 1 , 2 );
        p2.setValue(8);

        triangles.setA(p1);
        triangles.setB(p2);

        Triangles newTriangles = new Triangles( triangles , 7 );

        assertEquals( p1.getValue(), newTriangles.getA().getValue() );
        assertEquals( p2.getValue(), newTriangles.getB().getValue());
        assertEquals( 7, newTriangles.getC().getValue());
        assertEquals( 0, newTriangles.getD().getValue());
        assertEquals( 0, newTriangles.getE().getValue());
        assertEquals( 0, newTriangles.getF().getValue());
        assertEquals( 0, newTriangles.getG().getValue());
        assertEquals( 0, newTriangles.getH().getValue());
        assertEquals( 0, newTriangles.getI().getValue());
        assertEquals( 0, newTriangles.getJ().getValue());
        assertEquals( 0, newTriangles.getK().getValue());
        assertEquals( 0, newTriangles.getL().getValue());
    }

    @Test
    void testingPointsTriangle1() {
        Triangles triangles = new Triangles();
        assertEquals( 6 , triangles.getPointsTriangle1().size() );
        assertEquals( 6 , triangles.getPointsTriangle2().size() );
        assertEquals( 6 , triangles.getPointsTriangle3().size() );
    }
    
}
