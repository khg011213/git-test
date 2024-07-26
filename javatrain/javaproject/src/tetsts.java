import java.util.Random;
import java.util.Scanner;

public class tetsts {
    public static void main(String[] args) {
        while(true) {
			Random random = new Random();
			int a = random.nextInt(2);
			boolean isWin = false;
			int ab = (a == 0) ? 0 : a == 1 ? 1 : 2;
			System.out.println(a);
			System.out.println("가위, 바위, 보 중 하나를 입력하세요.");
			Scanner sc = new Scanner(System.in);
			int user = sc.nextInt();
			
			System.out.println(ab + "테스트");
			System.out.println(user + "테스트1");

			if (ab == 0 && user == 1)
				System.out.println("참");
			
			if (ab == user) {
				System.out.println("무승부");
				continue;
			}
			
			isWin = (ab == 0 && user == 1) ? true : (ab == 1 && user == 2) ? true : (ab == 2 && user == 0) ? true : false; 
			
			if (isWin) {
				System.out.println("이김ㅋ");
			}else{
				System.out.println("짐ㅠ");
			}
			
		}
    }
}
