package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("James");
        funcionario.setIdade(18);
        funcionario.setValoresSalario(new double[]{1658.45D, 1200.45D, 1426.45D});

        funcionario.imprimir();
        System.out.println("###################");
        funcionario.mediaSalario();
    }
}
