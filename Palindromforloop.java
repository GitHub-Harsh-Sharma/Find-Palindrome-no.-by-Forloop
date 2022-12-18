import java.io.*;
class Palindromforloop
{
    public static void main(String args[])throws IOException
    {
        int num,i,rev=0,copy;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.print("Enter the no: ");
        num=Integer.parseInt(br.readLine());
        copy=num;
        for(i=1;i<=4;i++)
        {
        rev=(num%10)+(rev*10);
        num=num/10;
        }
            if(rev==copy)
            System.out.print(rev+":is a Palidrom");
            else
            System.out.print(rev+":is not a Palidrom");
    }    
}



