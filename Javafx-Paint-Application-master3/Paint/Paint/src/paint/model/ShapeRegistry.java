package paint.model;


import java.util.HashMap;
import java.util.Map;

public class ShapeRegistry {
private static Map<String, Shape> prototypes = new HashMap<>();

static {
// نخزن نسخ أولية (Prototypes)
prototypes.put("Circle", new Circle());
prototypes.put("Rectangle", new Rectangle());
prototypes.put("Square", new Square());
prototypes.put("Triangle", new Triangle());
prototypes.put("Line", new Line());
prototypes.put("Ellipse", new Ellipse());
}

// ترجع نسخة جديدة عن طريق clone()
public static Shape getShape(String type) throws CloneNotSupportedException {
return prototypes.get(type).makeCopy();
}}