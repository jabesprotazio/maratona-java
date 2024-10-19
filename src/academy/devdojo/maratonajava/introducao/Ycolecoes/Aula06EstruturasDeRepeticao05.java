package academy.devdojo.maratonajava.introducao.Ycolecoes;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1;  parcela--) {
            double valorParcela = valorTotal / parcela;
            System.out.println("Parcela " + parcela + " R$ " + valorParcela );
        }
    }
}

