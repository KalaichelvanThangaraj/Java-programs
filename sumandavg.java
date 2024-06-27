import java.util.*;
public class sumandavg {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values:");
        int a=sc.nextInt();
        int[] arr=new int[a];
        int count=0;
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
            count+=arr[i];

        }
        System.out.println("The sum is "+count);
        System.out.print("The Average is "+(count/a));

    }
    
}

/*output
Enter the values:
3
1
2
3
The sum is 6
The Average is 2*/
