package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {

        byte dia = 6;
        switch (dia){
            case 1:
                System.out.println("Domingo, dia não útil.");
                break;
            case 7:
            case 6:
                System.out.printf("Dia não útil. FDS");
                break;

            default:
                System.out.printf("Dia útil.");
        }
    }
}
