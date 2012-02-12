/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package point.model;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author melanholy
 */
public class Alghorithms {

    public static int p0Search(Point[] parr) {
        int minY = 10000;
        int minX = 10000;
        int o = -1;
        for (int i = 0; i < parr.length; i++) {
            if (parr[i].y < minY) {
                //if (parr[i].x < minX) {
                minY = parr[i].y;
                minX = parr[i].x;
                o = i;
                //}
            }
        }
        return o;
    }

    public static List<Point> jarvis(Point[] parr) {
        int o = Alghorithms.p0Search(parr);
        List<Point> lp = new ArrayList();
        Point p0 = parr[o];
        lp.add(p0);
        int i = 0;
        do {
            lp.add(parr[i]);
            for (int j = 0; j < parr.length; j++) {
                lp.set(i + 1, minAngle(lp.get(i+1), parr[j], lp.get(i)));
            }
            
            i++;
           
        } while (lp.get(0) != lp.get(i));
       if (lp.size()==2){

       }

        return lp;




    }

    private static Point minAngle(Point pi, Point pj, Point pk) {
        int c = (pi.x - pk.x) * (pj.y - pk.y) - (pj.x - pk.x) * (pi.y - pk.y);
        if (c < 0) {
            return pj;
        } else {
            return pi;
        }
    }
}
