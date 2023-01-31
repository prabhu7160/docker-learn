import java.util.Scanner;
public class Add{
  public static void main(String... args){
    int a,b,sum=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value of a: ");
    a=sc.nextInt();
    System.out.println("Enter value of b: ");
    b=sc.nextInt();
    sum=a+b;
    System.out.println("The sum is: "+sum);
  }
}
