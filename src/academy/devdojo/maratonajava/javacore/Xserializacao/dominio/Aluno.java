package academy.devdojo.maratonajava.javacore.Xserializacao.dominio;

import java.io.*;

public class Aluno implements Serializable {
    private static   final long serialVersionUID = -3673078851902987796L;

    private Long id;
    private String nome;
    private transient String password;
    private static final String NOME_ESCOLA = "Devdojo Viradão no Jiraya";

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    private transient Turma turma;

    public Aluno(Long id, String nome, String password) {
        System.out.println("Dentro do construtor");
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    private void writeObject(ObjectOutputStream oss) {
        try {
            oss.defaultWriteObject();
            oss.writeUTF(turma.getNome());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void readObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject();
            String nomeTurma = ois.readUTF();
            turma = new Turma(nomeTurma);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String toString() {
        return "aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                ", NOME_ESCOLA ='" + NOME_ESCOLA + '\'' +
                ", Turma ='" + turma + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
