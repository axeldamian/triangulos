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

    public Triangles( Triangles triangles , int lastNumber) throws CloneNotSupportedException {

        boolean last = false;

        this.a = triangles.getA().clone();
        this.b = triangles.getB().clone();
        this.c = triangles.getC().clone();
        this.d = triangles.getD().clone();
        this.e = triangles.getE().clone();
        this.f = triangles.getF().clone();
        this.g = triangles.getG().clone();
        this.h = triangles.getH().clone();
        this.i = triangles.getI().clone();
        this.j = triangles.getJ().clone();
        this.k = triangles.getK().clone();
        this.l = triangles.getL().clone();

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

    public void setValueA( int val ) {
        this.a.setValue(val);
    }

    public void setValueB( int val ) {
        this.b.setValue(val);
    }

    public void setValueC( int val ) {
        this.c.setValue(val);
    }

    public void setValueD( int val ) {
        this.d.setValue(val);
    }

    public void setValueE( int val ) {
        this.e.setValue(val);
    }

    public void setValueF( int val ) {
        this.f.setValue(val);
    }

    public void setValueG( int val ) {
        this.g.setValue(val);
    }

    public void setValueH( int val ) {
        this.h.setValue(val);
    }

    public void setValueI( int val ) {
        this.i.setValue(val);
    }

    public void setValueJ( int val ) {
        this.j.setValue(val);
    }

    public void setValueK( int val ) {
        this.k.setValue(val);
    }

    public void setValueL( int val ) {
        this.l.setValue(val);
    }

    public int getValueA() {
        return this.a.getValue();
    }

    public int getValueB() {
        return this.b.getValue();
    }

    public int getValueC() {
        return this.c.getValue();
    }

    public int getValueD() {
        return this.d.getValue();
    }

    public int getValueE() {
        return this.e.getValue();
    }

    public int getValueF() {
        return this.f.getValue();
    }

    public int getValueG() {
        return this.g.getValue();
    }

    public int getValueH() {
        return this.h.getValue();
    }

    public int getValueI() {
        return this.i.getValue();
    }

    public int getValueJ() {
        return this.j.getValue();
    }

    public int getValueK() {
        return this.k.getValue();
    }

    public int getValueL() {
        return this.l.getValue();
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

        Triangles triangles = new Triangles();

        calculateAllSolutions( solutionSet, triangles );

        return solutionSet;
    }

    private void calculateAllSolutions(HashSet<Triangles> solutionSet, Triangles triangles) throws CloneNotSupportedException {

        for ( int x = 1; x <= 12; x++ ) {

            Set<Integer> values = triangles.valuesUsed();
            if ( values.contains(x) ) {
                continue;
            }

            Triangles newTriangles = null;
            
            if( isPath() ) {
                newTriangles = new Triangles( triangles , x );
            } else {
                continue;
            }
            log.info( newTriangles.toString() );
        
                if ( newTriangles.isFull() ) {
                    if ( newTriangles.checkTriangles() ) {
                        solutionSet.add( newTriangles );
                        return;
                    }
                } else {
                    if ( !isPath() ) {
                    continue;
               }
                    if ( isPath() ) {
                        calculateAllSolutions(solutionSet, newTriangles);
                    }
                }
        }
    }

    public boolean isPath() {

        boolean result = true;

        if ( !this.triangle1IsFull() && !this.triangle2IsFull()  && !this.triangle3IsFull() ) {
            result = result && true;
        }
        if ( this.triangle1IsFull() && !this.checkTriangle1() ) {
            result = result && false;
        }
        if ( this.triangle2IsFull()  && !this.checkTriangle2() ) {
            result = result && false;
        } 
        if ( this.triangle3IsFull() && !this.checkTriangle3() ) {
            result = result && false;
        }
        return result;
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

    public boolean triangle1IsFull() {
        
        boolean result = true;

        if ( this.a.getValue() == 0 ) {
            result = result && false;
        }

        if ( this.d.getValue() == 0 ) {
            result = result && false;
        }

        if ( this.e.getValue() == 0 ) {
            result = result && false;
        }

        if ( this.h.getValue() == 0 ) {
            result = result && false;
        }

        if ( this.i.getValue() == 0 ) {
            result = result && false;
        }

        if ( this.j.getValue() == 0 ) {
            result = result && false;
        }

        return result;
    }


    public boolean triangle2IsFull() {
        
        boolean result = true;

        if ( this.b.getValue() == 0 ) {
            result = result && false;
        }

        if ( this.e.getValue() == 0 ) {
            result = result && false;
        }

        if ( this.f.getValue() == 0 ) {
            result = result && false;
        }

        if ( this.i.getValue() == 0 ) {
            result = result && false;
        }

        if ( this.j.getValue() == 0 ) {
            result = result && false;
        }

        if ( this.k.getValue() == 0 ) {
            result = result && false;
        }

        return result;
    }


    public boolean triangle3IsFull() {
        
        boolean result = true;

        if ( this.c.getValue() == 0 ) {
            result = result && false;
        }

        if ( this.f.getValue() == 0 ) {
            result = result && false;
        }

        if ( this.g.getValue() == 0 ) {
            result = result && false;
        }

        if ( this.j.getValue() == 0 ) {
            result = result && false;
        }

        if ( this.k.getValue() == 0 ) {
            result = result && false;
        }

        if ( this.l.getValue() == 0 ) {
            result = result && false;
        }

        return result;
    }

    public boolean checkTriangles() {
        return this.checkTriangle1() && checkTriangle2() && checkTriangle3();
        //return ( this.chechValuesNoRepeated() && this.checkTriangle1() && this.checkTriangle2() && this.checkTriangle3() );
    }

    private boolean checkTriangle1() {
        return this.getSumTriangle1() == 42;
        //return this.getPointsTriangle1().size() == 6 && this.getSumTriangle1() == 42;
    }

    private boolean checkTriangle2() {
        return this.getPointsTriangle2().size() == 6 && this.getSumTriangle2() == 42;
    }

    private boolean checkTriangle3() {
        return this.getPointsTriangle3().size() == 6 && this.getSumTriangle3() == 42;
    }
/*
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
        s.append(" ");
        s.append(this.i);
        s.append(" ");
        s.append(this.j);
        s.append(" ");
        s.append(this.k);
        s.append(" ");
        s.append(this.l);
        s.append("\n");

        return s.toString();
    }
        */
        @Override
        public String toString() {
            StringBuilder s = new StringBuilder("\n");
            s.append("(");

            s.append("[");
            s.append(this.a.getValue());
            s.append(",");
            s.append(this.d.getValue());
            s.append(",");
            s.append(this.e.getValue());
            s.append(",");
            s.append(this.h.getValue());
            s.append(",");
            s.append(this.i.getValue());
            s.append(",");
            
            s.append("]");
            s.append("[");
            s.append("]");
            s.append("[");
            s.append("]");
            s.append(")");
            return s.toString();
        }
/*
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("\n");
        s.append("(");
        s.append( this.a.getValue() );
        s.append(",");
        s.append( this.b.getValue() );
        s.append(",");
        s.append( this.c.getValue() );
        s.append(",");
        s.append( this.d.getValue() );
        s.append(",");
        s.append( this.e.getValue() );
        s.append(",");
        s.append( this.f.getValue() );
        s.append(",");
        s.append( this.g.getValue() );
        s.append(",");
        s.append( this.h.getValue() );
        s.append(",");
        s.append( this.i.getValue() );
        s.append(",");
        s.append( this.j.getValue() );
        s.append(",");
        s.append( this.k.getValue() );
        s.append(",");
        s.append( this.l.getValue() );
        s.append(")");
        return s.toString();
    }*/
    
}