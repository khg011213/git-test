class Vehicle{
    private String carnum;

    Vehicle(){
        this("");
    }

    Vehicle(String carnum){
        this.carnum = carnum;
    }
    public void putAccel(){
        System.out.println("밟아요");
    }

}

class Tire extends Vehicle{

}


public class Carmain {

    public static void main(String[] args) {
        
    }
}