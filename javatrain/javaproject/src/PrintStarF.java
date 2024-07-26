public class PrintStarF {



    public static void main(String[] args){
        add(5);
        add2(5);
        add3(5);
    }

    public static void add(int a) {
		for (int i = 1; i <= a; i++) {
            for (int j = 1; j <=i; j++){
                System.out.print("*");
            }System.out.println();
	}
}

public static void add2(int a) {
    for (int i = 1; i <= a; i++) {
        for (int j = 5; j >=i; j--){
            System.out.print("*");
        }System.out.println();
}
}

public static void add3(int a) {
    for (int i = 1; i <= a; i++) {
        for (int j = a; j >= i; j--)
            System.out.print(" ");
        for (int j = 1; j <= i; j++)
            System.out.print("*");
        }System.out.println();
}
}


