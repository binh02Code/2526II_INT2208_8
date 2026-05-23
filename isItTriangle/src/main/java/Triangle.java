import java.util.Objects;

public class Triangle {
    public String WhatTriangle(Object a, Object b, Object c) {
        if (!(a instanceof Integer)|| !(b instanceof Integer)|| !(c instanceof Integer)) {
            return "Invalid Input";
        }
        int x = (Integer) a;
        int y = (Integer) b;
        int z = (Integer) c;

        if (x < 1 || x > 100 ||
        y < 1 || y > 100 ||
        z < 1 || z > 100) {
            return "Invalid Input";
        }

        if(x + y <= z ||
           x + z <= y ||
           y + z <= x
        ) {
            return "Not a Triangle";
        }

        if (x == y && x == z) {
            return "Equilateral"; // tam giac deu
        }

        if (x == y || x == z || y == z) {
            return "Isosceles"; // tam giac can
        }

        return "Scalene";

    }
}
