import model.Aluno;
import model.Ra;
import java.util.Scanner;
import java.time.LocalDate;

public class View{
Scanner sc = new Scanner(System.in);

public void mostrarAluno(Aluno aluno){
    System.out.print("\n-------------------------------------------------------");
    System.out.printf("\nNome: %s", aluno.getNome());
    System.out.printf("\nIdade %d", aluno.getIdade());
    System.out.printf("\nRa: %d", aluno.getRa().getNumero());
    System.out.printf("\nCadastrado em: %s", aluno.getRa().getAnoFeito());
    System.out.print("\n-------------------------------------------------------");
}
public Aluno criarAluno(){
    System.out.print("Digite o nome do aluno:");
    String nome = sc.next();

    System.out.print("\nDigite a idade do Aluno:");
    int idade = sc.nextInt();
    
    System.out.print("\nDigite o Ra do Aluno:");
    int numero = sc.nextInt();

    LocalDate data = LocalDate.now();

    Ra ra = new Ra(numero, data);
    Aluno aluno = new Aluno(nome, ra, idade);

    return aluno;
}
}