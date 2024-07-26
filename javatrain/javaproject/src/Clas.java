class Abb{
    private int num1;
    public void setnum1(int num1){
            this.num1 = num1;
        }
    public void printData(){
        System.out.println(num1);
    }

}

class Bdd {
    private double num2;
    public void setnum2(double num2){
        this.num2 = num2;
    }
    public void printData(){
        System.out.println(num2);
    }
}

class Cdd {
    private String str1;
    public void setstr1(String str1){
        this.str1 = str1;
    }
    public void printData(){
        System.out.println(str1);
    }
}

class myClassint{
    
}

public class Clas {
    public static void main(String[] args) {
        Abb a;
        a = new Abb();
        a.setnum1(10);
        a.printData();

        Bdd b;
        b = new Bdd();
        b.setnum2(3.14);
        b.printData();

        Cdd c;
        c = new Cdd();
        c.setstr1("안녕하세요");
        c.printData();


    }
}
