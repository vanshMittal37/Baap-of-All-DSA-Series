// 15. Write a program to find the sum of squares of first n natural numbers where n
// will be provided by the user.
import java.util.Scanner;
public class problem_15{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        int sum = n*(n+1)*(2*n+1)/6;
        System.out.println("The sum of square of "+n+" natural numbers : "+sum);
    }
}