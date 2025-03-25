// Take a character as input and print its corresponding ASCII value.
import java.util.Scanner;
public class problem_5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch = sc.next().charAt(0);
        System.out.println("The ASCII value of the given character is :"+ (int)ch);
    }
}