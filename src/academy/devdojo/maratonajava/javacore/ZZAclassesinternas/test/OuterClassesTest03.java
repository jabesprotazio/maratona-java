package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest03 {
    private String name = "Jabes";

    static class Nested {
        private String lastName = "Protazio";
        void print(){
            System.out.println(new OuterClassesTest03().name + " " + lastName);
        }
    }


    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
        //new OuterClassesTest03.Nested().print();
    }
}
