import java.util.*;
public class arr1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("THE OUTPUT IS:");
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}