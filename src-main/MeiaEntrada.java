public class MeiaEntrada extends Ingresso{


    public MeiaEntrada(String nomeFilme, boolean dublado, Double valorIngresso) {
        super(nomeFilme, dublado, valorIngresso);
    }

    public double calcularValor(boolean temDireito) {
        if (temDireito) {
            return getValor() / 2;
        } else {
            System.out.println("Você não tem direito a meia entrada");
            return getValor();
        }
    }
}
