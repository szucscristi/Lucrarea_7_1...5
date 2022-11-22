import java.util.Random;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        int count_pos=0,count_neg=0,n;

        Scanner inputDevice=new Scanner(System.in);
        Random rand = new Random();

        System.out.print("n=");
        n=inputDevice.nextInt();
        int v[]=new int [n];

        for(int i=0;i<n;i++)
        {
            v[i]=rand.nextInt(50)-25;
        }

        for(int i=0;i<n;i++)
        {
            System.out.print("\nv["+i+"]="+v[i]);
            if(v[i]>0)
                count_pos++;
            if(v[i]<0)
                count_neg++;
        }

        System.out.print("\n\n[RANGE v[i]: -25 -> 24] In tablou exista "+count_pos+" elemente pozitive si "+count_neg+" elemente negative.");

    }

}