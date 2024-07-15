package com.triangulos.dtos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Triangles {

    static Logger log = LogManager.getLogger(Triangles.class);

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
        this.a = new Point( 1 , 1 );
        this.b = new Point( 1 , 2 );
        this.c = new Point( 1 , 3 );

        this.d = new Point( 2 , 1 );
        this.e = new Point( 2 , 2 ); // shared by 2 triangles
        this.f = new Point( 2 , 3 ); // shared by 2 triangles
        this.g = new Point( 2 , 4 );

        this.h = new Point( 3 , 1 );
        this.i = new Point( 3 , 2 ); // shared by 2 triangles
        this.j = new Point( 3 , 3 ); // shared by all
        this.k = new Point( 3 , 4 ); // shared by 2 triangles
        this.l = new Point( 3 , 5 );
    }

    public Triangles( Triangles triangles ) {
        super();
        this.a = triangles.a;
        this.b = triangles.b;
        this.c = triangles.c;
        this.d = triangles.d;
        this.e = triangles.e;
        this.f = triangles.f;
        this.g = triangles.g;
        this.h = triangles.h;
        this.i = triangles.i;
        this.j = triangles.j;
        this.k = triangles.k;
        this.l = triangles.l;
    }

    public Triangles( Triangles triangles , int lastNumber) {
        super();

        boolean last = false;

        this.a = triangles.getA();
        this.b = triangles.getB();
        this.c = triangles.getC();
        this.d = triangles.getD();
        this.e = triangles.getE();
        this.f = triangles.getF();
        this.g = triangles.getG();
        this.h = triangles.getH();
        this.i = triangles.getI();
        this.j = triangles.getJ();
        this.k = triangles.getK();
        this.l = triangles.getL();

        if ( this.a.getValue() == 0 && !last ) {
            this.a.setValue( lastNumber );
            last = true;
        }
        if ( this.b.getValue() == 0 && !last ) {
            this.b.setValue( lastNumber );
            last = true;
        }
        if ( this.c.getValue() == 0 && !last ) {
            this.c.setValue( lastNumber );
            last = true;
        }
        if ( this.d.getValue() == 0 && !last ) {
            this.d.setValue( lastNumber );
            last = true;
        }
        if ( this.e.getValue() == 0 && !last ) {
            this.e.setValue( lastNumber );
            last = true;
        }
        if ( this.f.getValue() == 0 && !last ) {
            this.f.setValue( lastNumber );
            last = true;
        }
        if ( this.g.getValue() == 0 && !last ) {
            this.g.setValue( lastNumber );
            last = true;
        }
        if ( this.h.getValue() == 0 && !last ) {
            this.h.setValue( lastNumber );
            last = true;
        }
        if ( this.i.getValue() == 0 && !last ) {
            this.i.setValue( lastNumber );
            last = true;
        }
        if ( this.j.getValue() == 0 && !last ) {
            this.j.setValue( lastNumber );
            last = true;
        }
        if ( this.k.getValue() == 0 && !last ) {
            this.k.setValue( lastNumber );
            last = true;
        }
        if ( this.l.getValue() == 0 && !last ) {
            this.l.setValue( lastNumber );
            last = true;
        }
    }

    public Set<Integer> valuesUsed() {
        HashSet<Integer> values = new HashSet<>();
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
        return values;
    }

    public boolean isFull() {

        if ( this.a.getValue() == 0 ) {
            return false;
        }
        if ( this.b.getValue() == 0  ) {
            return false;
        }
        if ( this.c.getValue() == 0 ) {
            return false;
        }
        if ( this.d.getValue() == 0 ) {
            return false;
        }
        if ( this.e.getValue() == 0 ) {
            return false;
        }
        if ( this.f.getValue() == 0 ) {
            return false;
        }
        if ( this.g.getValue() == 0 ) {
            return false;
        }
        if ( this.h.getValue() == 0 ) {
            return false;
        }
        if ( this.i.getValue() == 0 ) {
            return false;
        }
        if ( this.j.getValue() == 0 ) {
            return false;
        }
        if ( this.k.getValue() == 0 ) {
            return false;
        }
        if ( this.l.getValue() == 0 ) {
            return false;
        }
        return true;
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

    private int getSumTriangle1() {
        return ( this.a.getValue() + this.d.getValue() + this.e.getValue() + this.h.getValue() + this.i.getValue() + this.j.getValue());
    }

    private int getSumTriangle2() {
        return ( this.b.getValue() + this.e.getValue() + this.f.getValue() + this.i.getValue() + this.j.getValue() + this.k.getValue());
    }

    private int getSumTriangle3() {
        return ( this.c.getValue() + this.f.getValue() + this.g.getValue() + this.j.getValue() + this.k.getValue() + this.l.getValue());
    }

    public Set<Triangles> getAllSolutions() throws CloneNotSupportedException {
        
        HashSet<Triangles> solutionSet = new HashSet<>();

        log.info( solutionSet.size() );

        this.calculateAllSolutions( solutionSet );

        log.info( solutionSet.size() );

        return solutionSet;
    }

    private void calculateAllSolutions(HashSet<Triangles> solutionSet) throws CloneNotSupportedException {

        for ( int x = 1; x <= 12; x++ ) {

            Triangles newTriangles = new Triangles( this , x );
            log.info( newTriangles.toString() );
        
                if ( newTriangles.isFull() ) {
                    if ( newTriangles.checkTriangles() ) {
                        solutionSet.add( newTriangles );
                        return;
                    }
                    log.info("nube");
                    return;
                } else {
                    newTriangles.calculateAllSolutions(solutionSet);
                }
        }
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
        return this.checkTriangle1();
        //return ( this.chechValuesNoRepeated() && this.checkTriangle1() && this.checkTriangle2() && this.checkTriangle3() );
    }

    private boolean checkTriangle1() {
        return this.getSumTriangle1() == 21;
        //return this.getPointsTriangle1().size() == 6 && this.getSumTriangle1() == 42;
    }

    private boolean checkTriangle2() {
        return this.getPointsTriangle2().size() == 6 && this.getSumTriangle2() == 42;
    }

    private boolean checkTriangle3() {
        return this.getPointsTriangle3().size() == 6 && this.getSumTriangle3() == 42;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("\n");
        s.append(" ");
        s.append(" ");
        s.append(this.a);
        s.append(" ");
        s.append(" ");
        s.append(this.b);
        s.append(" ");
        s.append(" ");
        s.append(this.c);
        s.append(" ");
        s.append(" ");
        s.append("\n");

        s.append(" ");
        s.append(this.d);
        s.append(" ");
        s.append(this.e);
        s.append(" ");
        s.append(this.f);
        s.append(" ");
        s.append(this.g);
        s.append("\n");

        s.append(this.h);
        s.append(this.i);
        s.append(this.j);
        s.append(this.k);
        s.append(this.l);
        s.append("\n");

        return s.toString();
    }
    
}