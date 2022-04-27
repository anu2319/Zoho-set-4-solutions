import java.util.Scanner;

public class Main2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] res = new String[n];
        res[0] = "1";
        res[1] = "11";
        for(int i=2; i<n; i++)
        {
            String x = res[i-1];
            int l = x.length();
            String ans = "";
            for(int j=0; j<l; j++)
            {
                int count = 1;
                while(j<l-1 && x.charAt(j)==x.charAt(j+1))
                {
                    count++;
                    j++;
                }
                ans+= ""+count+""+x.charAt(j);
            }
            res[i] = ans;
        }

        for(int i=0; i<n; i++)
        {
            System.out.println(res[i]);
        }
    }
}