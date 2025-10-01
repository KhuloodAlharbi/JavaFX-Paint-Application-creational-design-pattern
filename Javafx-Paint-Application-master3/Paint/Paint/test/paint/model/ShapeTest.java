/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paint.model;

import javafx.scene.paint.Color;
import javafx.geometry.Point2D;
import javafx.scene.canvas.Canvas;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ShapeTest {
    
    public ShapeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSetPosition() {
        System.out.println("setPosition");
        Point2D position = null;
        Shape instance = new ShapeImpl();
        instance.setPosition(position);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPosition() {
        System.out.println("getPosition");
        Shape instance = new ShapeImpl();
        Point2D expResult = null;
        Point2D result = instance.getPosition();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetProperties() {
        System.out.println("setProperties");
        Map<String, Double> properties = null;
        Shape instance = new ShapeImpl();
        instance.setProperties(properties);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetProperties() {
        System.out.println("getProperties");
        Shape instance = new ShapeImpl();
        Map<String, Double> expResult = null;
        Map<String, Double> result = instance.getProperties();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetColor() {
        System.out.println("setColor");
        Color color = null;
        Shape instance = new ShapeImpl();
        instance.setColor(color);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetColor() {
        System.out.println("getColor");
        Shape instance = new ShapeImpl();
        Color expResult = null;
        Color result = instance.getColor();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetFillColor() {
        System.out.println("setFillColor");
        Color color = null;
        Shape instance = new ShapeImpl();
        instance.setFillColor(color);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetFillColor() {
        System.out.println("getFillColor");
        Shape instance = new ShapeImpl();
        Color expResult = null;
        Color result = instance.getFillColor();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDraw() {
        System.out.println("draw");
        Canvas canvas = null;
        Shape instance = new ShapeImpl();
        instance.draw(canvas);
        fail("The test case is a prototype.");
    }

    public class ShapeImpl extends Shape {
    }
    
}
