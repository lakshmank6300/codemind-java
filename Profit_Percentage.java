import java.util.*;
public class profitPercentage{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float ans=((b-a)/a)*100;
        System.out.printf("%.2f",ans);
    }
}