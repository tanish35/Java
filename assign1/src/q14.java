interface Shape {
    double area();

    void draw();

    void rotate(double angle);

    void move(double dx, double dy);
}

class Circle implements Shape {
    private double radius;
    private double x, y;

    public Circle(double radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public void rotate(double angle) {
        System.out.println("Rotating circle by " + angle + " degrees");
    }

    @Override
    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public String toString() {
        return String.format("Circle(radius=%.2f, x=%.2f, y=%.2f)", radius, x, y);
    }
}

class Rectangle implements Shape {
    private double width, height;
    private double x, y;

    public Rectangle(double width, double height, double x, double y) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    @Override
    public void rotate(double angle) {
        System.out.println("Rotating rectangle by " + angle + " degrees");
    }

    @Override
    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public String toString() {
        return String.format("Rectangle(width=%.2f, height=%.2f, x=%.2f, y=%.2f)", width, height, x, y);
    }
}

public class q14 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(5, 0, 0);
        shapes[1] = new Circle(3, 2, 2);
        shapes[2] = new Rectangle(4, 3, 0, 0);
        shapes[3] = new Rectangle(2, 5, 1, 1);
        shapes[4] = new Rectangle(6, 2, -1, -1);

        System.out.println("Before moving:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        for (Shape shape : shapes) {
            shape.move(1.5, 2.5);
        }

        System.out.println("\nAfter moving:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
