public class pra {
    public static void main(String[] args) {
        
        for(int i = 2; i <=9; i++){
            for (int j= 1; j<=9; j++){
                if((i*j)%2==1)
                System.out.println(i + " 단 : " + i + "*" + j + "=" + (i*j) );
        }
    }

    for(int i = 2; i <=9; i++){
        if(i%3==0)
        for (int j= 1; j<=9; j++){
            System.out.println(i + " 단 : " + i + "*" + j + "=" + (i*j) );
    }
}
    int size= 5;
    for (int i = 1; i <= size; i++) {
        for(int j =1; j <=i; j++){
            System.out.print("*");
        }System.out.println();
    }

    for (int i = 1; i <= 5; i++) {
        for (int j = 5; j > i; j--) {
            System.out.print(" ");
        }
        for(int j= 1; j<=i; j++)
            System.out.print("*");
        System.out.println();
    }

    for (int i = 1; i <= size; i++) {
        for (int j = size; j>=i; j-- ){
            System.out.print("*");
        }System.out.println();
    }

    

}
}