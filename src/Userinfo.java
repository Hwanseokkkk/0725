import java.util.*;
 
public class Userinfo {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("귀하의 이름은? : ");
	  String name = sc.nextLine();
	  
	  
	  System.out.println("귀하의 나이는? :");
	  int age = sc.nextInt();
	  
	  sc.nextLine();
	  
	  System.out.println("귀하의 전화번호는? : ");
      String tel = sc.nextLine();
      
      System.out.println("귀하의 신장은? : ");
      double height = sc.nextDouble();
      
      
      System.out.println("이름 :" + name + ",나이 : " + age + ", 전화번호 : " + tel + ", 신장 : " + height);
      	
   }
}

