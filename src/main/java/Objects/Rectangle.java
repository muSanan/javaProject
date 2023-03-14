package Objects;

public class Rectangle {

    int width;
    int height;

    public void calculateArea(){
        System.out.println("Area: " + width*height);
    }

    public void calculatePerimeter(){
        System.out.println("Perimetr :" + (2*width + 2*height));
    }

    public static void main (String [] args){
        Rectangle rectangle1 = new Rectangle();
        rectangle1.width = 15;
        rectangle1.height = 15;

        rectangle1.calculateArea();
        rectangle1.calculatePerimeter();


        Rectangle rectangle2 = new Rectangle();
        rectangle2.width = 10;
        rectangle2.height = 10;

        rectangle2.calculateArea();
        rectangle2.calculatePerimeter();






    }






}
