/**
 * practice
 */

class SaveStudentDate {
    int studentNum;
    String studentName;
    double logicScore, clanScore, appScore, javaScore, csScore ;

    public void setStudentDate(int Num, String Name, double score1,double score2,double score3,double score4, double score5){
        this.studentName = Name;
        this.studentNum = Num;
        this.logicScore = score1;
        this.clanScore = score2;
        this.appScore  = score3;
        this.javaScore = score4;
        this.csScore = score5;
    }
    

    double getStudentAverage(){
        double totalScore;
        totalScore = logicScore + clanScore + appScore + javaScore + csScore;
        totalScore = totalScore/5;
        return totalScore;
    }

    double getStudentTotalScore(){
        return logicScore + clanScore + appScore + javaScore + csScore;
    }

    double getStudentScore(String classname){
        if (classname == "논리회로") {
            return logicScore;
        }else if (classname == "c언어") {
            return clanScore;
        }else if (classname == "c++언어") {
            return appScore;
        }else if (classname == "자바") {
            return javaScore;
        }else if (classname == "컴퓨터개론"){
            return csScore;
        }else{
            return 404;
        }

        

    }
}





public class Student {
    public static void main(String[] args) {
        SaveStudentDate studentDate = new SaveStudentDate();
        SaveStudentDate studentDate2 = new SaveStudentDate();
        SaveStudentDate studentDate3 = new SaveStudentDate();

        studentDate.setStudentDate(123456789, "안녕", 50, 70, 80, 80, 90);
        studentDate2.setStudentDate(45671453, "잘가", 40, 70, 60, 100, 80);
        studentDate3.setStudentDate(1234532543, "바이", 100, 100, 100, 100, 100);
    
        System.out.println(studentDate.getStudentScore("논리회로"));
        System.out.println(studentDate2.getStudentScore("논리회로"));
        System.out.println(studentDate3.getStudentScore("논리회로"));

        System.out.println(studentDate.getStudentAverage());
        System.out.println(studentDate2.getStudentAverage());
        System.out.println(studentDate3.getStudentAverage());

        System.out.println(studentDate.getStudentTotalScore());
        System.out.println(studentDate2.getStudentTotalScore());
        System.out.println(studentDate3.getStudentTotalScore());
    }
}