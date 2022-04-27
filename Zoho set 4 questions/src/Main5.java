import java.util.Scanner;

public class Main5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = "";
        while(n>0)
        {
            n--;
            int rem = n%26;
            n = n/26;
            ans+=(char)('A'+rem);
        }
        String res = "";
        for(int i=ans.length()-1; i>=0; i--)
        {
            res+=ans.charAt(i);
        }
        System.out.println(res);
    }
}
