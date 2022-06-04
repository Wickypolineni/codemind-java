import java.util.Scanner;
class Area
{
   public static void main(String[] args) 
   {
      double a,b,c;
      double area,resArea;
      Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
      area = (a+b+c)/2.0d;
      resArea = Math.sqrt(area*(area-a)*(area-b)*(area-c));
      System.out.format("%.2f",resArea);
   }
}