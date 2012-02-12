/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package point.model;

import java.awt.Point;
import java.util.Random;
import java.util.Stack;

/**
 *
 * @author melanholy
 */
public class ForPoint {

    private static Stack<Point> sp = new Stack();

    public static Point[] forGen(int k, int d1, int d2) {
        Point[] parr = new Point[k];
        Random gen = new Random();
        for (int i = 0; i < k; i++) {
            parr[i] = new Point(gen.nextInt(d1), gen.nextInt(d2));
            sp.add(parr[i]);
        }
        return parr;
    }

    public static Point Top(Stack<Point> spoint) {
        return spoint.peek();
    }

    public static Point Next_To_Top(Stack<Point> spoint) {
        return spoint.get(spoint.size() - 2);
    }
}
