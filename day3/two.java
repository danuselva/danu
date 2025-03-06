import java.util.Scanner;

public class two {
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char a[]=str.toCharArray();
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]);
        }
    }
}
