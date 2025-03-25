// Write a program that will tell the number of dogs and chicken are there when the
// user will provide the value of total heads and legs.
// For example:
// Input: heads -> 4 legs -> 12
// Output: dogs -> 2 chicken -> 2
import java.util.Scanner;
public class problem_14{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of heads : ");
        int heads = sc.nextInt();
        System.out.print("Enter number of legs : ");
        int legs = sc.nextInt();
        int chicken = (4*heads-legs)/2;
        int dogs = heads-chicken;
        System.out.println("The number of dogs : "+dogs);
        System.out.println("The number of chicken :"+chicken);
    }
}