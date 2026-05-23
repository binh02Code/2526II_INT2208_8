import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {
    // nếu muốn ko khai báo biến thì cần làm static cho hàm WhatTriagle, bỏ câu khai báo dưới ta viết lại được: triangle.WhatTriagle(10,20,50)) -> Triangle.WhatTriagle(10,20,50))
    Triangle triangle = new Triangle();
    @Test
    public void Invalid_a1() {
        assertEquals("Invalid Input", triangle.WhatTriangle(0,50,50));
    }

    @Test
    public void Invali_a2() {
        assertEquals("Invalid Input", triangle.WhatTriangle(101,20,50));
    }

    @Test
    public void Invalid_b() {
        assertEquals("Invalid Input", triangle.WhatTriangle(50,0,50));
    }

    @Test
    public void Invalid_c() {
        assertEquals("Invalid Input", triangle.WhatTriangle(50,50,101));
    }

    @Test
    public void Test5() {
        assertEquals("Not a Triangle", triangle.WhatTriangle(10,20,50));
    }

    @Test
    public void Test6() {
        assertEquals("Not a Triangle", triangle.WhatTriangle(1,2,3));
    }

    @Test
    public void Test7() {
        assertEquals("Equilateral", triangle.WhatTriangle(50,50,50));
    }

    @Test
    public void Test8() {
        assertEquals("Equilateral", triangle.WhatTriangle(100,100,100));
    }

    @Test
    public void Test9() {
        assertEquals("Isosceles", triangle.WhatTriangle(50,50,40));
    }

    @Test
    public void Test10() {
        assertEquals("Isosceles", triangle.WhatTriangle(40,50,50));
    }

    @Test
    public void Test11() {
        assertEquals("Isosceles", triangle.WhatTriangle(50,40,50));
    }

    @Test
    public void Test12() {
        assertEquals("Scalene", triangle.WhatTriangle(3,4,5));
    }

    @Test
    public void Test13() {
        assertEquals("Scalene", triangle.WhatTriangle(98,99,100));
    }
}