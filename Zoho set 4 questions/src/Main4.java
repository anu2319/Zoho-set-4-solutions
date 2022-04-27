import java.util.Scanner;

public class Main4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Petrol in car : ");
        int X = sc.nextInt();
        System.out.println("Enter the number of petrol bunks : ");
        int N = sc.nextInt();
        System.out.println("Petrol Bunks : ");
        char[] a = new char[N];
        for(int i=0; i<N; i++)
        {
            a[i] = sc.next().charAt(0);

        }
        System.out.println("Distance from petrol each petrol bunks : ");
        int[] c = new int[N];
        int sum = 0;
        for(int i=0; i<N; i++)
        {
            c[i] = sc.nextInt();
            sum+= c[i];
        }
        System.out.println("Capacities of petrol bunk : ");
        int[] b = new int[N];
        int sum1 = 0;
        for(int i=0; i<N; i++)
        {
            b[i] = sc.nextInt();
            sum1+= b[i];
        }
        int res = sum1 - sum;
        if(res < 0)
        {
            System.out.println("Out of petrol");
            return;
        }
        int ans = res+X;
        System.out.println("Remaining petrol in car is " + ans);

    }
}
