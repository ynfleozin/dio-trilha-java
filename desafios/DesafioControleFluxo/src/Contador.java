import java.util.Locale;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		try (Scanner terminal = new Scanner(System.in).useLocale(Locale.US)) {
                    System.out.println("Digite o primeiro parâmetro");
                    int parametroUm = terminal.nextInt();
                    System.out.println("Digite o segundo parâmetro");
                    int parametroDois = terminal.nextInt();
                    try {
                        contar(parametroUm, parametroDois);
                        
                    }catch (ParametrosInvalidosException e) {
                        System.out.println("O segundo parâmetro deve ser maior que o primeiro");
                    }
		
		}	}
        
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
            }
        
        int contagem = parametroDois - parametroUm;
        
        for (int x = 0; x < contagem; x++){
            System.out.println(x+1);
        }
	}
}