import java.util.*;
public class se {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int search=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]==search)
            {
                System.out.println(i);
                break;
            }
        }
    }
    
}
