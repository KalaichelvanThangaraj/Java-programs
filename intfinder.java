import java.util.*;
public class intfinder {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int a=sc.nextInt();
        if(a==0){
            System.out.println("the number is zero");
        }
        else if (a>0) {
            System.out.println("the number is positive");
            
        }
        else{
            System.out.println("the number is negative");
        }

    }
    
}

 /*output

Enter the number:-12
the number is negative*/
