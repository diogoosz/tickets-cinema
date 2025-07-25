import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#0.00");
        Ingresso ingressoComum = new Ingresso("F1: O Filme", true, 30.00);
        MeiaEntrada ingressoMeia = new MeiaEntrada("Quarteto Fantastico", false, 36.00);
        IngressoFamilia ingressoFamilia = new IngressoFamilia("Shrek", true, 30.00, 4);

        ingressoMeia.mostrarInfo();
        mostrarValorMeia(ingressoMeia, true);
    }
    public static void mostrarValorMeia(MeiaEntrada ingresso, boolean temDireito) {
        double valorFinal = ingresso.calcularValor(temDireito);
        if (temDireito) {
            System.out.println("Você tem direito a meia e seu valor é: " + valorFinal);
            return;
        } else {
            System.out.println("Você não tem direito a meia e seu valor é: " + valorFinal);
            return;
        }
    }

    public static void mostrarValorFamilia(IngressoFamilia ingresso, int totalPessoas) {
        double valorFinal = ingresso.calcularValor(totalPessoas);
        if (totalPessoas) {
            System.out.println("Você tem mais de 3 membros familiares e ganhou 5% de desconto o valor é " + valorFinal);
            return;
        } else {
            System.out.println("O valor total do seu ingresso é " + valorFinal);
            return;
        }
}
