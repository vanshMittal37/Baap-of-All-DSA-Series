// Take an integer between 65 and 90 as input and print its corresponding uppercase
// letter.
import java.util.Scanner;
public class problem_7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter an Integer between (65 and 90) : ");
       int n = sc.nextInt();
       char ch = (char)n;
       System.out.println("The uppercase letter at that integer value : " + ch);
    }
}