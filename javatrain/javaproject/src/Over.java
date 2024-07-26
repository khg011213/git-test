class Loading{
    public int getint(){
        return 1;

    }

    public int getint(int a){
        return ;

    }
    public int getint (double b){
        return 1;

    }
}

public class Over {
    public static void main(String[] args) {
        Loading load = new Loading();
        System.out.println(load.getint(10));
        System.out.println(load.getint(50.5));
    }
}
