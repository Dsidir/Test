
package mypackage;

import java.util.ArrayList;
import java.util.List;
import shapes.Circle;
import shapes.Shape;
import shapes.Square;
import shapes.Triangle;


public class SximataMain {

    
    public static void main(String[] args) {
        Shape t1=new Triangle("Blue", Size.LARGE, 20,5,4,2);
        Shape s1=new Square("Red", Size.MEDIUM,40);
        Shape c1=new Circle("Black", Size.SMALL,80);
        
     
//        List<Shape> shapes=new ArrayList();
//        t1=(Triangle)shapes.get(0);
//        s1=(Square)shapes.get(1);
//        c1=(Circle)shapes.get(2);
        t1.printShape();
        s1.printShape();
        c1.printShape();
//        
        double a;
        if (t1.getArea()>c1.getArea() && t1.getArea()>s1.getArea()){
        System.out.println("The largest area is " +t1.getShape());
        }
        else if (t1.getArea()<c1.getArea() && c1.getArea()>s1.getArea()){
             System.out.println("The largest area is " +c1.getShape());
        }
            else {
            System.out.println("The largest area is " +s1.getShape());
                    }
        
         if (t1.getPerimeter()>c1.getPerimeter() && t1.getPerimeter()>s1.getPerimeter()){
        System.out.println("The largest perimeter is "+t1.getShape());
        }
        else if (t1.getPerimeter()<c1.getPerimeter() && c1.getPerimeter()>s1.getPerimeter()){
             System.out.println("The largest perimeter is "+c1.getShape());
        }
            else {
            System.out.println("The largest perimeter is "+s1.getShape());
                    }
         
         Square s2=new Square("Roze", Size.SMALL,10);
         Square s3=new Square("White", Size.LARGE,20);
         
         if (s2.getPerimeter()>s3.getPerimeter())
             System.out.println("The square with the largest perimeter is s2");
         else
         System.out.println("The square with the largest perimeter is s3");
       
        }
    }
    

//Exercise1
//1. Create class Shape, Circle, Square, Triangle.
//2. Shape has color and size.
//3. Size could be enum.
//4. Shape has methods getPerimeter(), getArea(), printShape(), getters/setters.
//5. Shape has only one Constructor with color and size.
//5a. All Shapes should have only one full-argument Constructor.
//6. Circle has radius.
//7. Square has side.
//8. Triangle has base, side2, side3, height.
//9. All Shapes should have getPerimeter(), getArea(), printShape().
//9a. All Classes should have getters/setters and toString().
//10. printShape() should print a message "Printing a $SIZE $COLOR $SHAPE."
//11. Create a t1, s1, c1.
//12. Add them to a list of Shapes.
//13. For every shape in the list, call it's printShape() and enjoy MAGIC.
//14. Find the Shape that has the largest area, perimeter.
//14. Create 2 more squares.
//15. Print the Square with the largest perimeter.