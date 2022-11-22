import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        int n, min=Integer.MAX_VALUE;

        Scanner inputDevice=new Scanner(System.in);
        System.out.print("n=");
        n=inputDevice.nextInt();
        int v[]=new int[n];

        for (int i=0;i<n;i++)
        {
            System.out.print("v["+i+"]=");
            v[i]=inputDevice.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            if(min>v[i])
                min=v[i];
        }

        System.out.print("Valoarea minima din vector este: "+min);

    }

}