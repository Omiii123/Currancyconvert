import java.util.*;
public class javabasic1{
  public static void rupee_to_dollar(double amt){
     System.out.print(amt + "="+ (amt*0.013)+"dollar");
     System.out.println();
     }
     public static void dollar_to_rupee(double amt){
      Scanner sc = new Scanner(System.in);
      amt = sc.nextInt();
      System.out.print(amt + "="+(amt*79.37)+"rupee");
      System.out.println();
     }
  public static void main(String[] args) {
    System.out.println("1 rupee");
    System.out.println("2 dollar");
    System.out.println("enter your choice :");
    Scanner sc = new Scanner (System.in);
    int choise=sc.nextInt();
    System.out.println("enter the amount :");
    double amount=sc.nextInt();
    switch (choise) {
      case 1:rupee_to_dollar(amount);
        break;
      case 2:dollar_to_rupee(amount);
      break;  
    
      default:System.out.print("invalid choice");
        break;
    }

  }
  
}