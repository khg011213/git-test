public class StarPattern {
    public static void main(String[] args) {
        int size = 5; // 삼각형의 높이
        
        // 삼각형 윗 부분 출력
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // 삼각형 아래 부분 출력
        for (int i = size - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
		
    }
}