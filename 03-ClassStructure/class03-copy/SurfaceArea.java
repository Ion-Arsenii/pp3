public class SurfaceArea{
    public static double circleArea(double radius){
        return radius * radius * 3.14;
    }
    public static double rectangleArea(double length, double width){
        return length* width; 
    }
    public static double triangleArea(double base, double height){
        return base*height/2;
    }
    
    
    public static void main(String[] args){
        System.out.println("Rectangle:" +SurfaceArea.rectangleArea(length:4,width:5));
        System.out.println("Circle:" +SurfaceArea.circleArea(radius: 5));
        System.out.println("Triangle:" +SurfaceArea.triangleArea(base: 4,height: 5));
    }
}