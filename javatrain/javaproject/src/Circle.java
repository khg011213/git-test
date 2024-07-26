class Circle1{
    private double di;

    public void setRadius(double di){
        this.di= di;
        System.out.println("반지름의 길이는 "+di);
    }

    public double getArea(double di){
        return (di*di*Math.PI);
    }

    public void addCircle(Circle1 circle1,Circle1 circle2){
        System.out.println(circle1.getArea(circle1.di) + circle2.getArea(circle2.di));
    }

}


public class Circle {

    public static void main(String[] args) {
        Circle1 circle1 = new Circle1();
        circle1.setRadius(10.0);
        System.out.println (circle1.getArea(10.0));

        Circle1 circle2 = new Circle1();
        circle2.setRadius(13.0);
        circle1.addCircle(circle1,circle2);
    }
}