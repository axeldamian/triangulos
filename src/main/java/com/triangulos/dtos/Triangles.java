package com.triangulos.dtos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Triangles {

    private Point a;

    private Point b;

    private Point c;

    private Point d;

    private Point e;

    private Point f;

    private Point g;

    private Point h;

    private Point i;

    private Point j;

    private Point k;

    private Point l;

    public Triangles() {
        super();
        this.a = new Point();
        this.b = new Point();
        this.c = new Point();
        this.d = new Point();
        this.e = new Point();
        this.f = new Point();
        this.g = new Point();
        this.h = new Point();
        this.i = new Point();
        this.k = new Point();
        this.l = new Point();
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public Point getD() {
        return d;
    }

    public void setD(Point d) {
        this.d = d;
    }

    public Point getE() {
        return e;
    }

    public void setE(Point e) {
        this.e = e;
    }

    public Point getF() {
        return f;
    }

    public void setF(Point f) {
        this.f = f;
    }

    public Point getG() {
        return g;
    }

    public void setG(Point g) {
        this.g = g;
    }

    public Point getH() {
        return h;
    }

    public void setH(Point h) {
        this.h = h;
    }

    public Point getI() {
        return i;
    }

    public void setI(Point i) {
        this.i = i;
    }

    public Point getJ() {
        return j;
    }

    public void setJ(Point j) {
        this.j = j;
    }

    public Point getK() {
        return k;
    }

    public void setK(Point k) {
        this.k = k;
    }

    public Point getL() {
        return l;
    }

    public void setL(Point l) {
        this.l = l;
    }

    public int getSumTriangle1() {
        return ( this.a.getValue() + this.d.getValue() + this.e.getValue() + this.h.getValue() + this.i.getValue() + this.j.getValue());
    }

    public int getSumTriangle2() {
        return ( this.b.getValue() + this.e.getValue() + this.f.getValue() + this.i.getValue() + this.j.getValue() + this.k.getValue());
    }

    public int getSumTriangle3() {
        return ( this.c.getValue() + this.f.getValue() + this.g.getValue() + this.j.getValue() + this.k.getValue() + this.l.getValue());
    }

    public Set<Point> getPointsTriangle1() {
        Set<Point> points = new HashSet<>();
        points.add( this.a );
        points.add( this.d );
        points.add( this.e );
        points.add( this.h );
        points.add( this.i );
        points.add( this.j );
        return points;
    }

    public Set<Point> getPointsTriangle2() {
        Set<Point> points = new HashSet<>();
        points.add( this.b );
        points.add( this.e );
        points.add( this.f );
        points.add( this.i );
        points.add( this.j );
        points.add( this.k );
        return points;
    }

    public Set<Point> getPointsTriangle3() {
        Set<Point> points = new HashSet<>();
        points.add( this.c );
        points.add( this.f );
        points.add( this.g );
        points.add( this.j );
        points.add( this.k );
        points.add( this.l );
        return points;
    }

    private boolean chechValuesNoRepeated() {
        Set<Integer> values = new TreeSet<>();
        values.add( this.a.getValue() );
        values.add( this.b.getValue() );
        values.add( this.c.getValue() );
        values.add( this.d.getValue() );
        values.add( this.e.getValue() );
        values.add( this.f.getValue() );
        values.add( this.g.getValue() );
        values.add( this.h.getValue() );
        values.add( this.i.getValue() );
        values.add( this.j.getValue() );
        values.add( this.k.getValue() );
        values.add( this.l.getValue() );
        return ( values.size() == 12 );
    }

    public boolean checkTriangles() {
        return ( this.chechValuesNoRepeated() && this.checkTriangle1() && this.checkTriangle2() && this.checkTriangle3() );
    }

    private boolean checkTriangle1() {
        return this.getPointsTriangle1().size() == 6 && this.getSumTriangle1() == 12;
    }

    private boolean checkTriangle2() {
        return this.getPointsTriangle2().size() == 6 && this.getSumTriangle2() == 12;
    }

    private boolean checkTriangle3() {
        return this.getPointsTriangle3().size() == 6 && this.getSumTriangle3() == 12;
    }
    
}
