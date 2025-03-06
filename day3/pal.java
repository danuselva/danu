import java.util.Scanner;

public class pal {
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char a[]=str.toCharArray();
        String sum="";
        int count=0;
        for(int i=a.length-1;i>=0;i--){
            sum+=a[i];
        }
        char b[]=sum.toCharArray();
        for(int i=0;i<a.length;i++)
       {
        if(a[i]==b[i]){
            count+=1;
        }
       }if(count==str.length()-1){
            System.out.print("pallindrom");
        }
        else{
            System.out.print("not a pallindrom");
        }
    }
    }
