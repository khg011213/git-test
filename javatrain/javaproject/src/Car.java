

class Mother {
    String ex;

    Mother(String ex){
        this.ex = ex;
    }

    Mother(){
        this("");
    }
    public void setex(String ex){
    }

    public String getex(){
        return this.ex;
    }

    public void start(){
        System.out.println(ex + "밟아요");
    }
}

class Son extends Mother{
    public void start(){
        System.out.println(getex() + "굴러가요");
    }
    Son (String ex){
        super(ex);
    }
    
}

public class Car {
        public static void main(String[] args) {
            Mother mother = new Mother("엄마");
            Son son = new Son("아들");

            mother.start();
            son.start();
        }
    }

