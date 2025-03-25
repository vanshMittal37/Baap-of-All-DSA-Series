// Given 2 fractions, find the sum of those 2 fractions.Take the numerator and
// denominator values of the fractions from the user.
import java.util.Scanner;
public class problem_16{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of fraction 1 : ");
        int n1 = sc.nextInt();
        int d1 = sc.nextInt();
        System.out.print("Enter value of fraction 2 : ");
        int n2 = sc.nextInt();
        int d2 = sc.nextInt();
        int n3 = (n1*d2)+(n2*d1);
        int d3 = (d1*d2);
        System.out.println("The sum of fraction ("+n1 +"/" +d1+") and ("+n2 +"/" + d2 +") is :"+n3+"/"+d3);
    }
}