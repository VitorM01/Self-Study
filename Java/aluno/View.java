import model.Aluno;
import model.Ra;
import java.util.Scanner;
import java.time.LocalDate;

public class View{
Scanner sc = new Scanner(System.in);

public void menu(){
    View view = new View();

    int i = 0;
    while(i == 0){
        System.out.print("\033[H\033[2J");
        System.out.print("Escolha uma opcao:\n1 - Criar/Salvar Aluno\n0 - Sair\n");
        int opcao = sc.nextInt();

        switch(opcao){
            case 1:
                System.out.print("\033[H\033[2J");
                view.mostrarAluno(view.criarAluno());
                sc.nextLine();
                System.out.println("\naperte Enter para continuar!\n");
                sc.nextLine();
            break;

            case 0:
                System.out.println("Adeus!\n");
                i = 1;
            break;

            default:
                System.out.println("\nescolha uma opcao!");
            break;
        }
    }
}

public void mostrarAluno(Aluno aluno){
    System.out.print("\n-------------------------------------------------------");
    System.out.printf("\nNome: %s", aluno.getNome());
    System.out.printf("\nIdade %d", aluno.getIdade());
    System.out.printf("\nRa: %d", aluno.getRa().getNumero());
    System.out.printf("\nCadastrado em: %s", aluno.getRa().getAnoFeito());
    System.out.print("\n-------------------------------------------------------");
}
public Aluno criarAluno(){
    System.out.print("Digite o nome do aluno:\n");
    String nome = sc.next();

    System.out.print("\nDigite a idade do Aluno:\n");
    int idade = sc.nextInt();
    
    System.out.print("\nDigite o Ra do Aluno:\n");
    int numero = sc.nextInt();

    LocalDate data = LocalDate.now();

    Ra ra = new Ra(numero, data);
    Aluno aluno = new Aluno(nome, ra, idade);

    return aluno;
}
}