package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoiNumeros(){
        System.out.println(10+10);
    }

    public  void muiltiplicaDoiNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2){
        if(num2 != 0){
            return num1/num2;
        }
        System.out.printf("Não existe divisão por zero");
        return 0;

    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2){
        if (num2 == 0){
            System.out.println("Não existe divisão por zero");
            return;
        }else {
            System.out.println(num1 / num2);
        }
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }

        System.out.println(soma);
    }

    public void somaVarArgs(double value, double valor2, int...numeros){
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }




}
