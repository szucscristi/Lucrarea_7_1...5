import java.util.Scanner;
import java.util.Random;

public class Main
{

    public static void main(String[] args)
    {

        int n,m,countmax=0,count=0;

        Scanner inputDevice=new Scanner(System.in);
        Random rand=new Random();

        System.out.print("n=");
        n=inputDevice.nextInt();

        System.out.print("m=");
        m=inputDevice.nextInt();

        int [][]v=new int [n][m];

        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
            {
                v[i][j]=rand.nextInt(2);
            }

        System.out.println("Tabloul este: \n");
        for(int i=0;i<n;i++)
        {
            for (int j = 0; j < m; j++)
            {
                System.out.print(v[i][j]+" ");
            }
            System.out.print("\n");
        }

        for(int i=0;i<n;i++)
        {
            count=0;
            for (int j = 0; j < m; j++)
            {
                if(v[i][j]==1)
                    count++;
            }
            if(countmax<count)
                countmax=count;
        }
        System.out.println("\nNumarul maxim de elemente egale cu 1 continute pe o linie: "+countmax);

    }

}