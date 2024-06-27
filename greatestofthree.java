import java.util.*;
 public class greatestofthree {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number 1:");
        int a=sc.nextInt();
        System.out.print("Enter the number 2:");
        int b=sc.nextInt();
        System.out.print("Enter the number 3:");
        int c=sc.nextInt();
        if(a>b)
        {
            if(a>c)
            {
                System.out.println("a is greater");
            }
            
        }
        else if(b>c){
            System.out.print("b is greater");
        }
        else
        {
            System.out.print("c is greater");
        }

    }

    
}

 /*output

Enter the number 1:12
Enter the number 2:24
Enter the number 3:100
c is greater*/
