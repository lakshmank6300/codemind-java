import java.util.Scanner;
public class loss{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=(b/a)*100;
        System.out.printf("%.2f",100-c);
    }
}