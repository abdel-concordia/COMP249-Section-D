package comp249_section_d;

public class MainClass {

    public static void main(String[] args) {

        final int NUMBER_OF_SHAPES = 4;
        Shape[] myShapes = new Shape[NUMBER_OF_SHAPES];

   
        myShapes[0] = new Triangle("Triangle", 1.5, 1.7, 2);        
        myShapes[1] = new Circle("Circle", 5.4);
        myShapes[2] = new Rectangle("Rec", 2.5, 3.7);
        
        Triangle t = new Triangle("Triangle", 3, 4, 5);

        myShapes[3] = t;
        
//        for (Shape s : myShapes) { // Enhanced loop
//            System.out.println(s);
//        }
        
        for (int i = 0; i < NUMBER_OF_SHAPES; i++){
            Shape s = myShapes[i];
            System.out.println(s);
        }
        
        
    }

}
