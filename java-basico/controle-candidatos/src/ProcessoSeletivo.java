
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"Arthur", "Bianca", "Leonardo", "Maria"};
        for(String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do { 
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("Contato realizado com sucesso.");

        } while (tentativasRealizadas < 3 && continuarTentando);

        if(atendeu){
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa.");
        }else{
            System.out.println("Não conseguimos contato com " + candidato + ". Número máximo de tentativas realizada");
        }
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String[] candidatos = {"Arthur", "Bianca", "Leonardo", "Maria"};
        System.out.println("Imprimindo a lista de candidatos...");
        for(String candidato : candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos(){
        String[] candidatos = {"Arthur","Bianca","João","Paulo","Leonardo","Augusto","Maria","Carol","Julia","Matheus"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.00;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O salário pretendido do candidato " + candidato + " é " + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado.");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }


    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato.");
        }else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta.");
        }else {
            System.out.println("Aguardando o resultado de outros candidatos.");
        }
    }
}
