import java.util.Scanner;

class Circle1{
    int radius;
    
    Circle1(int radius){
        this.radius = radius;
    }

    void setRadius(int r) {
    radius = r;
    }
    
    int getRadius() {
    return radius;
    }
    
    double getArea() {
    return radius * radius * Math.PI;
    }
}

class Rectangle {
    private int width,height;

    


    Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    public int getarea(){
        return width * height;
    }
}

public class ArrayTest {
    public static void main(String[] args) {

        // {
        //     Rectangle [] arrRec = new Rectangle[3];

        //     Scanner sc = new Scanner(System.in);
        //     for(int i = 0; i < arrRec.length; i++){
        //         System.out.println("가로");
        //         int width = sc.nextInt();

        //         System.out.println("세로");
        //         int height = sc.nextInt();
        //         arrRec[i] = new Rectangle(width,height);
        //     }

        //     double area = 0;


        // }





        Circle1 [] arrC1 = {new Circle1(10)};
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arrC1.length; i++){
            System.out.println(i+"번째 반지름을 입력해주세요");
            int radius= sc.nextInt();

            arrC1[i] = new Circle1(radius);
        }
        
        // arrC1[0] = new Circle1(10);
        // arrC1[1] = new Circle1(15);
        // arrC1[2] = new Circle1(7);

        double area = 0;

        for(int i = 0; i < arrC1.length; i++){
            area = area + arrC1[i].getArea();
        }

        System.out.println("원넓이합" + area);




        // Rectangle [] arrR1 = new Rectangle[3];


        // int recarea = 0;

        // for(int i = 0; i < arrR1.length; i++){
        //     recarea = recarea + arrR1[i].getarea();
        // }

        // System.out.println("넓이" + recarea);



    }
}
