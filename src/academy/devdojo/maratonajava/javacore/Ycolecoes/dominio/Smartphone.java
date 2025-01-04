package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

public class Smartphone {
    private String serialNumber;
    private String marca;

    //Reflexivo: x.equals(x) tem que ser true para tudo que for diferente de null
    //Simétrico: para x e y diferentes de null, se x.equals(y) == true logo, y.equals(x) == true
    //Transitividade: para x,y,z diferentes de null, se x.equals(y) == true, e x.equals(z) == true logo, y
    //Consistente: x.equals(x) sempre retorna true se x for diferente de null
    // para x diferente de null, x.equals(null) tem que retornar false.
    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return this.serialNumber != null && this.serialNumber.equals(smartphone.serialNumber);
    }

    // se x.equals(y) == true, y.hasCode(x) == x.hasCode();
    // y.hashCode() == x.hasCode() não necessariamente o equals de y.equals(x) tem que ser true
    // x.equals(y) == false o hashCode precisa ser diferente
    // y.hashCode() != x.hashCode(),  x.equals(y) deverá ser false.
    @Override
    public int hashCode() {
        return this.serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
