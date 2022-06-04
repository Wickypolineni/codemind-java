import java.util.Scanner;
class Area
{
    public static void main(String args[])
    {
        int r;
        double a;
        Scanner sc = new Scanner(System.in);
        r=sc.nextInt();
        a=(r*r)*3.14;
        System.out.format("%.2f",a);
    }
}