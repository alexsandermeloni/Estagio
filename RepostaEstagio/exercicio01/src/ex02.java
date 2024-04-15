import java.util.Scanner;
public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t1 = 0, t2 = 1, t3 = 0;
        int cont = 0;
        int n = 8;

        while( cont < n){
           t3 = t1 + t2;
           t1 = t2;
           t2 = t3;
           cont++;
           if(n == t3){
            System.out.println("Pertence");
            break;
            }
        }
        
        sc.close();
    }
}
