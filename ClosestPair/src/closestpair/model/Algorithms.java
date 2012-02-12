/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package closestpair.model;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author melanholy
 */
public class Algorithms {

    public Point[] SortingX(Point[] X) {
        int[] cx = new int[X.length - 1];
        Point[] nX = new Point[X.length - 1];
        for (int i = 0; i < X.length; i++) {
            cx[i] = X[i].x;
        }
        Arrays.sort(cx);
        for (int i = 0; i < cx.length; i++) {
            for (int j = 0; j < cx.length; j++) {
                if (cx[i] == X[j].x) {
                    nX[i] = X[j];
                }
            }
        }
        return nX;
    }

    public Point[] SortingY(Point[] Y) {
        int[] cx = new int[Y.length - 1];
        Point[] nY = new Point[Y.length - 1];
        for (int i = 0; i < Y.length; i++) {
            cx[i] = Y[i].y;
        }
        Arrays.sort(cx);
        for (int i = 0; i < cx.length; i++) {
            for (int j = 0; j < cx.length; j++) {
                if (cx[i] == Y[j].y) {
                    nY[i] = Y[j];
                }
            }
        }
        return nY;
    }

    public void closest(Point[] X, Point[] Y, Point[] P, int r, int l) {
        int mid = l + (r - l) / 2;
        Point medianaX = X[mid];
        Point medianaY = Y[mid];
        Point medianaP = P[mid];

    }

    public double StupidCheck(List<Point> P) {
        double min = 99999999;
        double val = 0;
        for (int i = 0; i < P.size(); i++) {
            for (int j = 0; j < P.size(); j++) {
                val = rass(P.get(i), P.get(j));
                if (val != 0) {
                    if (val < min) {
                        min = val;
                    }
                }
            }
        }
        return min;
    }
  
    public int StupidCheckX(List<Point> P){
        double val = 0;
        double min = 99999999;
        int X = 0;
        for (int i = 0; i < P.size(); i++) {
            for (int j = 0; j < P.size(); j++) {
                val = rass(P.get(i), P.get(j));
                if (val != 0) {
                    if (val < min) {
                        min = val;
                        X = i;
                    }
                }
            }
        }
        return X;
    }
    
    public int StupidCheckY(List<Point> P){
        double val = 0;
        double min = 99999999;
        int X = 0;
        for (int i = 0; i < P.size(); i++) {
            for (int j = 0; j < P.size(); j++) {
                val = rass(P.get(i), P.get(j));
                if (val != 0) {
                    if (val < min) {
                        min = val;
                        X = j;
                    }
                }
            }
        }
        return X;
    }

    private double rass(Point p1, Point p2) {
        return Math.sqrt((p1.x - p2.x)*(p1.x - p2.x) +
                (p1.y - p2.y) *(p1.y - p2.y));
    }
    public List<Point> forGen(int k, int d1, int d2) {
        List<Point> parr = new ArrayList();
        Random gen = new Random();
        for (int i = 0; i < k; i++) {
            parr.add(new Point(gen.nextInt(d1), gen.nextInt(d2)));
        }
        return parr;
    }
}
