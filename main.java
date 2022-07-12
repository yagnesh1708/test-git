import java.util.Scanner;

public class main{


  public static int fact(int number){
    int sum;
    sum=1;

    for(int i=1;i<=number;i++){

      sum=sum*i;
      }
      return sum;
}



public static void  main(String[] args){


Scanner scanner=new Scanner(System.in);

int number = Integer.parseInt(scanner.nextLine());

System.out.println(fact(number));

} 


  }
