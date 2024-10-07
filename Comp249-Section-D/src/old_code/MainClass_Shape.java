package old_code;

public class MainClass_Shape {

    public static void main(String[] args) {

        final int NUMBER_OF_SHAPES = 3;
        Shape[] myShapes = new Shape[NUMBER_OF_SHAPES];
        myShapes[0] = new Triangle("Triangle", 1.5, 1.7, 2);  // This is a triangle
        myShapes[1] = new Circle("Circle", 5.4);
        myShapes[2] = new Rectangle("Rec", 2.5, 3.7);

        Triangle t = (Triangle) myShapes[0];

        Triangle o = (Triangle) myShapes[0]; // This is still a triangle

        for (Shape s : myShapes) { // Enhanced loop
            System.out.println(s.getPerimeter());
        }

        /*
        for (int i = 0; i < NUMBER_OF_SHAPES; i++) {
            //Shape s = myShapes[i];
            System.out.println(myShapes[i]);
        }
         */
    }
}
