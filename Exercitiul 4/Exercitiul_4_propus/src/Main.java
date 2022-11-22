import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        int count=0,n,m,x;

        Scanner inputDevice=new Scanner(System.in);

        System.out.print("n=");
        n=inputDevice.nextInt();

        System.out.print("m=");
        m=inputDevice.nextInt();

        int [][]v=new int[n][m];

        System.out.print("Introduceti tabloul: ");
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
            {
                v[i][j]=inputDevice.nextInt();
            }

        System.out.print("x=");
        x=inputDevice.nextInt();

        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
            {
                if(v[i][j]==x)
                    count++;
            }

        System.out.print("In tabloul dat x apare de "+count+" ori");
    }

}