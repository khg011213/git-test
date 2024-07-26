import java.util.Arrays;

public class Random {
    public static void main(String[] args) {
        

        // int [] intarr = new int [3];
        // intarr[0]= 0;
        // intarr[1]= 1;
        // intarr[2]= 2;

        // System.out.println(Arrays.toString(intarr));

        // int [] intarr2 = {0,1,2};
        // System.out.println(Arrays.toString(intarr2));

        // String [] season = {"spring","summer","fall", "winter"};

        // System.out.println(Arrays.toString(season));

        // for(int i = 0; i < season.length; i++){
        //     System.out.println(season[i]);
        // }


        final int Lotto = 6;
        int[] arrLotto = new int[Lotto];

        for(int i = 0; i<arrLotto.length; i++){
            arrLotto[i] = (int)((Math.random()*45)+1);

            for(int j = 0; j<i; j++ ){
                if(arrLotto[j] == arrLotto[i]){
                    i--;
                    break;
                }
            }
        }
        for(int i = 0; i<arrLotto.length; i++){
            System.out.println(arrLotto[i]);
        }

        {int num = 5;

        int[] arrnum = new int[num];

        for(int i = 0; i < arrnum.length; i++){
            arrnum[i] = (int)((Math.random()*50)+1);
            System.out.println("랜덤값" + arrnum[i]); //값 배열에 저장
        for(int j = 0; j <i; j++){
            if(arrnum[j] < arrnum[i]){
                continue;
            }System.out.println("랜덤값" + arrnum[j]);
        }
        
        }

       
        }


    }

}
