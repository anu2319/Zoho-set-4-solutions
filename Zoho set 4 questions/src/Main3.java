import java.util.Scanner;

public class Main3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] ones = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"","ten", "twenty", "thirty", "forty","fifty", "sixty", "seventy", "eighty", "ninety","hundred"};
        if(n<=99)
        {
            if(n>=1 && n<=19)
            {
                System.out.println(ones[n]);
            }
            else
            {
                int rem = n%10;
                System.out.print(tens[n/10]);
                if(rem!=0)
                {
                    System.out.print(ones[rem]);
                }
            }
        }
        else
        {
            System.out.print(ones[n/100] +" "+ "hundred"+" ");
            int rem = n%100;
            if(rem!=0)
            {
                if(rem>=1 && rem<=19)
                {
                    System.out.print("and" + " " +ones[n%100]);
                }
                else
                {
                    System.out.print("and" +" "+ tens[rem/10] + " ");
                    if(rem%10!=0)
                    {
                        System.out.print(ones[rem%10]);
                    }
                }
            }
        }
    }
}
