import java.util.Scanner;

public class TrafficLight {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your color code");
        String Pin = sc.next();

        System.out.println("Next Traffic Light is green" +
                "Enter a color code");
        String ValidPin = sc.next();

        System.out.println("Try Again Please Type Return");
        String Date = sc.next();


        System.out.println("Enter your color code");
        String Plot = sc.next();


        System.out.println("Next traffic Light is Red " +
                "Enter your color code");
        String Conflict = sc.next();



        System.out.println("Next Traffic Light is yellow");
        String Blue = sc.next();
    }
}



