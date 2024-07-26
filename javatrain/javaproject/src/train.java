
public class train {
    public static void main(String[] args) {
        boolean isWin=false;
        String ab = "";
        String user = "";

        int[] arrayint = {10, 20, 20, 40, 50};
        int[] arrayint2 = new int[10];
        arrayint2[1] = 20;
        System.out.println(arrayint[0]);
        System.out.println(arrayint[3]);

        //다차원 배열//
        int [][] arrayint3 = {{10,20,30}, {40,50,60}, {70,80,90}};
        int [][] arrayint4 = 
        { {arrayint3[0][0]},
        {arrayint3[0][1]},
        {arrayint3[0][2]} };
        System.out.println(arrayint3[0][0]);
        System.out.println(arrayint4[0][1]);

        isWin = (ab == "가위" && user == "바위") ? true : (ab == "바위" && user == "보") ? true : (ab == "가위" && user == "바위") ? true : false; 

        //화폐분류기 만들기//

        



}
}

class Solution {
    public StringBuilder solution(String n_str) {
        StringBuilder answer = new StringBuilder();
        answer.append(n_str);
        
        return answer;
    }
}