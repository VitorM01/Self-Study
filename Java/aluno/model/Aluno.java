package model;
import model.Ra;
public class Aluno{
    
    String nome;
    Ra ra;
    int idade;

    public Aluno(String nome, Ra ra, int idade){
        this.nome = nome;
        this.ra = ra;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Ra getRa() {
        return ra;
    }
    public void setRa(Ra ra) {
        this.ra = ra;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

}