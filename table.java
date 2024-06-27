import java.util.*;
public class table{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the table:");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(i+" * "+n+" = "+(i*n));
        }
    }
}

 /*output

enter the table:3
1 * 3 = 3
2 * 3 = 6
3 * 3 = 9
4 * 3 = 12
5 * 3 = 15
6 * 3 = 18
7 * 3 = 21
8 * 3 = 24
9 * 3 = 27
10 * 3 = 30*/