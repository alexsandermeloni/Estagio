import java.util.Scanner;
public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra = sc.next();
        String novaPalavra = "";

        for(int i = palavra.length() - 1; i >= 0; i--){
            novaPalavra = novaPalavra + Character.toString(palavra.charAt(i));
        }
        System.out.println(novaPalavra);
    }
}
