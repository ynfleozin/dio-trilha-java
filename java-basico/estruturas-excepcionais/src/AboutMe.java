import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args){
        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();
        
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println(nome);
        System.out.println(sobrenome);
        System.out.println(idade);

        scanner.close();
        }
        catch (InputMismatchException e){
            System.out.println("O campo de idade precisa ser nummérico.");
        }
    }
}
