package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] valoresSalario;
    private double media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getValoresSalario() {
        return valoresSalario;
    }

    public void setValoresSalario(double[] valoresSalario) {
        this.valoresSalario = valoresSalario;
    }

    public double getMedia() {
        return media;
    }


    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.idade);
       if(valoresSalario != null) {

           for (int i = 0; i < this.valoresSalario.length; i++) {
               System.out.println(this.valoresSalario[i]);
           }
//           for (double salario: valoresSalario){
//               System.out.println(salario);
//           }
       }else {
           System.out.println("Não há salário!");
       }
    }

    public void mediaSalario(){
        for (double salario : valoresSalario){
            media += salario;
        }

        System.out.printf("A média salarial " + media/valoresSalario.length);
        }
}
