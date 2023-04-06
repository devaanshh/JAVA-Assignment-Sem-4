public interface Shape {
    float calculateArea();
    float calculatePerimeter();
}
public class Circle implements Shape{
    float area,perimeter,rad;
    public Circle(float i){
        rad=i;
    }
    @Override
    public float calculateArea(){
        area = (float)(Math.PI*Math.pow(rad,2));
        return area;
    }
    @Override
    public float calculatePerimeter(){
        perimeter = (float)(2*Math.PI*rad);
        return perimeter;
    }
}
public class Rectangle implements Shape{
    float area,perimeter,b,l;
    public Rectangle(float i,float j){
        b=i;
        l=j;
    }
    @Override
    public float calculateArea() {
        area = b*l;
        return area;
    }
    @Override
    public float calculatePerimeter() {
        perimeter =2*(b+l);
        return perimeter;
    }
}
public class Triangle implements Shape{
    float area,perimeter,b,l,h;
    public Triangle(float i,float j, float k){
        b=i;
        l=j;
        h=k;
    }
    @Override
    public float calculateArea() {
        area = (float) (h*b*0.5);
        return area;
    }
    @Override
    public float calculatePerimeter() {
        perimeter = b+l+h;
        return perimeter;
    }
}
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Circle perimeter: " +
                circle.calculatePerimeter());
        Triangle triangle = new Triangle(6, 4, 3);
        System.out.println("Triangle area: " + triangle.calculateArea());
        System.out.println("Triangle perimeter: " +
                triangle.calculatePerimeter());
        Rectangle rectangle = new Rectangle(7, 3);
        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Rectangle perimeter: " +
                rectangle.calculatePerimeter());
    }
}
