import java.util.Scanner;

public class Main6 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int set1 = sc.nextInt();
        int set2 = sc.nextInt();
        int[] s1 = new int[set1];
        int[] s2 = new int[set2];

        for(int i=0; i<set1; i++)
        {
            s1[i] = sc.nextInt();
        }

        for(int i=0; i<set2; i++)
        {
            s2[i] = sc.nextInt();
        }

        int flag = 0;
        int i = set1-1, j=set2-1;

        while(i>=0 && j>=0)
        {
            s1[i] = s1[i]+s2[j];
            if(s1[i]>9 && i!=0)
            {
                s1[i-1] = s1[i-1] + 1;
                s1[i] = s1[i]%10;
            }
            if(s1[0]>9)
            {
                flag = 1;
                System.out.print("1"+"," + s1[0]%10+",");
                for(int k=1; k<set1; k++)
                {
                    System.out.print(s1[k]+",");
                }
            }
            i--;
            j--;

        }
        if(flag==0)
        {
            for(int k=0; k<set1; k++)
            {
                System.out.print(s1[k]+",");
            }
        }
    }
}
