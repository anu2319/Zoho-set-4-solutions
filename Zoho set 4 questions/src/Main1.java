import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][2];
        int count,count1;
        for(int i=0; i<n; i++)
        {
            a[i][0] = sc.nextInt();
        }
        for(int i=0; i<n; i++)
        {
            int x = a[i][0];
            count = 1;
            for(int j=2; j<=x; j++)
            {
                if(a[i][0]%j==0)
                {
                    count++;
                }
            }
            a[i][1] = count;
        }

        sort2darray(a,1);
        Arrays.sort(a, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]==o2[1])
                {
                    return o1[0] < o2[0] ? -1 : 1;
                 }
                return o1[1] > o2[1] ? -1 : 1;
            }
        });

        for(int i=0; i<n; i++) {
            System.out.print(a[i][0] + " ");
        }
    }
    public static void sort2darray(int[][] a, int columnNumber)
    {
        Arrays.sort(a, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
               if(o1[columnNumber]<o2[columnNumber]) return 1;
               else return -1;
            }
        });
    }
}
