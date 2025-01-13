package Speed;

public class Main {
    public static void main(String[] args) {
        for(Vehicle Transport : Vehicle.values()){
            System.out.print(Transport + " ");
            System.out.println(Transport.getTitle());
        }
    }
}
