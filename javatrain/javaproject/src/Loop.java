import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        System.out.println("1~100의 합 : " + sum);

        for (int m = 2; m <= 9; m++) {
            System.out.println("*** " + m + "단 ***");
            for (int n = 1; n <= 9; n++) {
                System.out.println(m + " x " + n + " = " + (m * n));
            }
        }

        for (int a = 100; a >= 1; a--) {
            if (a % 3 == 0 && a % 5 == 0) {
                System.out.println("3과 5의 배수입니다." + a);
            }
        }



        Scanner sc = new Scanner(System.in);
            while (true) {
            System.out.print("1이상의 숫자를 입력하세요 : ");
            int num1 = sc.nextInt();

            if (num1 < 1) {
                System.out.print("1이상의 숫자를 입력하세요 : ");
            } else {
                for (int i = num1; i> 0; i--){
                    System.out.println(i);
                }
                break;
            }
        sc.close();

        Scanner sc1 = new Scanner(System.in);
            System.out.println("숫자 : ");
            int dan = sc1.nextInt();

            System.out.println("=======" + dan + "단 =======");
            for (int i = 9; i >= 1; i--) {
                System.out.println(dan + " x " + i + " = " + (dan * i));
            }
    }
}
}
