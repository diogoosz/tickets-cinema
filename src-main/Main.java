import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static DecimalFormat df = new DecimalFormat("#0.00");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do filme: ");
        String nomeFilme = scanner.nextLine();
        System.out.print("Você quer assistir dublado ou legendado? ");
        String respostaDublado = scanner.nextLine();
        boolean dublado = respostaDublado.equalsIgnoreCase("sim");
        Ingresso ingressoComum = new Ingresso(nomeFilme, true, 30.00);
        MeiaEntrada ingressoMeia = new MeiaEntrada("Quarteto Fantastico", dublado, 36.00);
        IngressoFamilia ingressoFamilia = new IngressoFamilia("Shrek", dublado, 30.00, 4);

        int option;
        do {
            System.out.print("1 - Ingresso normal");
            System.out.print("2 - Meia Entrada");
            System.out.print("3 - Ingresso Família");
            System.out.print("4 - Sair");

            switch (option) {
                case 1 -> {
                    ingressoComum.mostrarInfo();
                }
                case 2 -> {
                    System.out.print("Você é estudante? ");
                    String isStudent = scanner.nextLine();
                    boolean temDireito = isStudent.equalsIgnoreCase("sim");
                    ingressoMeia.mostrarInfo();
                    mostrarValorMeia(ingressoMeia, temDireito);
                }
                case 3 -> {
                    System.out.print("Quantas pessoas estão na sua familia? ");
                    int membrosFamilia = scanner.nextInt();
                    ingressoFamilia.mostrarInfo();
                    mostrarValorFamilia(ingressoFamilia, membrosFamilia);
                }
                case 4 -> System.exit(0);
            }
        } while (true);
    }
    public static void mostrarValorMeia(MeiaEntrada ingresso, boolean temDireito) {
        double valorFinal = ingresso.calcularValor(temDireito);
        if (temDireito) {
            System.out.println("Você tem direito a meia e seu valor é: " + df.format(valorFinal));
        } else {
            System.out.println("Você não tem direito a meia e seu valor é: " + df.format(valorFinal));
        }
    }

    public static void mostrarValorFamilia(IngressoFamilia ingresso, int totalPessoas) {
        double valorFinal = ingresso.calcularValor(totalPessoas);
        if (totalPessoas > 3) {
            System.out.println("Você tem mais de 3 membros familiares e ganhou 5% de desconto o valor é " + df.format(valorFinal));
        } else {
            System.out.println("O valor total do seu ingresso é " + df.format(valorFinal));
        }
    }
}
