/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package line.model;

import java.awt.Point;

/**
 *
 * @author melanholy
 */
public class ClassForCheck {

    public static int direction(Point pi, Point pj, Point pk) {
        return (pk.x - pi.x) * (pj.y - pi.y) - (pj.x - pi.x) * (pk.y - pi.y);
    }

    public static boolean onSegment(Point pi, Point pj, Point pk) {
        if ((Math.min(pi.x, pj.y) <= pk.x) && (Math.max(pi.x, pj.x) >= pk.x)
                && (Math.min(pi.y, pj.y) <= pk.y) && (Math.max(pi.y, pj.y) >= pk.y)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean Segment_Intersect(Point p1, Point p2, Point p3, Point p4) {
        int d1 = direction(p3, p4, p1);
        int d2 = direction(p3, p4, p2);
        int d3 = direction(p1, p2, p3);
        int d4 = direction(p1, p2, p4);
        if (((d1 > 0 && d2 < 0) || (d1 < 0 && d2 > 0)) && ((d3 > 0 && d4 < 0) || (d3 < 0 && d4 > 0))) {
            return true;
        } else {
            if ((d1 == 0) && (onSegment(p3, p4, p1))) {
                return true;
            } else {
                if ((d2 == 0) && (onSegment(p3, p4, p2))) {
                    return true;
                } else {
                    if ((d3 == 0) && (onSegment(p1, p2, p3))) {
                        return true;
                    } else {
                        if ((d4 == 0) && (onSegment(p1, p2, p4))) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                }
            }

        }

    }
}
