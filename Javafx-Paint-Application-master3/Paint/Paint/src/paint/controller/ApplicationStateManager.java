/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paint.controller;

/**
 *
 * @author slmma
 */

/**
 * Singleton class for managing application state
 * Using Singleton Design Pattern
 */

import javafx.scene.paint.Color;
import java.util.ArrayList;
import paint.model.Shape;

public class ApplicationStateManager {
    private static ApplicationStateManager instance;
    
   
    private Color currentColor;
    private ArrayList<Shape> shapes;
    
    
    
    private ApplicationStateManager() {
        this.currentColor = Color.BLACK;
        this.shapes = new ArrayList<>();
    }
    
    public static ApplicationStateManager getInstance() {
        if (instance == null) {
            instance = new ApplicationStateManager();
        }
        return instance;
    }
    
   
    public Color getCurrentColor() {
        return currentColor;
    }
    
    public void setCurrentColor(Color color) {
        this.currentColor = color;
    }
    
    public ArrayList<Shape> getShapes() {
        return shapes;
    }
    
    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }
    
    // الدوال المساعدة للشكال:
    public void addShape(Shape shape) {
        this.shapes.add(shape);
    }
    
    public void removeShape(Shape shape) {
        this.shapes.remove(shape);
    }
    
    public void clearShapes() {
        this.shapes.clear();
    }
    
    public int getShapesCount() {
        return this.shapes.size();
    }
    
    
}

