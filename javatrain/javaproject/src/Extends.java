class Pet{
    private String name;
    private int age;
    private String type;
    Pet(String name, int age, String type){
        this.name = name;
        this.age = age;
        this.type = type;
    }

    Pet(){
        this("",0,"");
    }

    public String getName(){
        return this.name;
    }

    public int getage(){
        return this.age;
    }

    public String gettype(){
        return this.type;
    }

    public void setName(String name){
    }

    public void setage(String age){
    }

    public void settype(String type){
    }

    public void eating(){
        System.out.println(name + age+ type+ "가 사료를 먹는 중");
    }


}

class Mydog extends Pet{
    public void eating(){
        System.out.println(getName() + getage()+ gettype()+ "가 간식을 먹는 중");
    }

    Mydog (String name, int age, String type){
        super(name,age,type);
    }
}

public class Extends {
    public static void main(String[] args) {
        Pet pet = new Pet("토리", 5, "진도");
        Mydog dog = new Mydog("고도리", 3, "진도");

        System.out.println(pet.getName());
        System.out.println(dog.getName());
        dog.eating();
        pet.eating();

    }
}
