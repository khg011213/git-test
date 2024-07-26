class A{
    int num;
    int kor, eng, math;
}

public class Grade {

    public static double avg(double kor, double eng, double math){
        return (kor + eng + math) /3;
    }

    public static String grade(double avg){
        if (avg>=90){
            return "1등급";
        }else if (avg>=80){
            return "2등급";
        }else if (avg>=70){
            return "3등급";
        }else if (avg>=60){
            return "4등급";
        } else {
            return "탈락입니다.";
        }
    }

    public static void main(String[] args) {
        double avg = avg(80,90,80);
        String grade = grade(avg);

        System.out.println("평균은" + avg + "입니다.");
        System.out.println("성적은" + grade + "입니다.");
        A a;
        a = new A();
        a.kor= 80;
        System.out.println(a.kor);
    }
}
