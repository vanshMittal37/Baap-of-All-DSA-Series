// Take input of principle, time and rate and find the simple interest
import java.util.Scanner;
public class problem_4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of principle :");
        int principle = sc.nextInt();
        System.out.print("Enter the value of rate :");
        int rate = sc.nextInt();
        System.out.print("Enter the value of time :");
        int time = sc.nextInt();
        double SI = (principle*rate*time)/100;
        System.out.println("The simple interest of the following data : "+ SI);
    }
}