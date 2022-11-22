import java.util.Random;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        int count=0,n;

        Scanner inputDevice=new Scanner(System.in);
        Random rand = new Random();

        System.out.print("n=");
        n=inputDevice.nextInt();
        int v[]=new int [n];

        for(int i=0;i<n;i++)
        {
            v[i]=rand.nextInt(3);
        }

        for(int i=0;i<n;i++)
        {
            System.out.print("\nv["+i+"]="+v[i]);
            if(v[i]==0)
                count++;
        }

        System.out.print("\n\nIn vector exista "+count+" elemente cu valoare nula.");

    }

}