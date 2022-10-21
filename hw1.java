import java.util.Scanner;
public class hw1{
public static void main(String[] args) {
    
        System.out.println(treugolka(enternum()));
    }
    public static double treugolka(int a) {
        double x = 0.5*a*(a+1);
        return x;

    }
    public static int enternum(){
        Scanner iscanner=new Scanner(System.in);
        System.out.println("Введите число");
        int pop=iscanner.nextInt();
        iscanner.close();
        return pop;

    }
}