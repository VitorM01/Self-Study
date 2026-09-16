package view;
import model.Aluno;
import model.Ra;
import java.util.Scanner;
import java.time.LocalDate;
import control.Control;

public class View{
Scanner sc = new Scanner(System.in);
Control ctrl = new Control();

public void menu(){
    int i = 0;
    while(i == 0){
        System.out.print("\033[H\033[2J");
        System.out.print("Escolha uma opcao:\n1 - Criar/Salvar Aluno\n2 - Consultar por ra\n3 - exluir por ra\n4 - consultar todos\n0 - Sair\n");
        int opcao = sc.nextInt();

        switch(opcao){
            case 1:
                salvarAluno();
                break;
            case 2:
                consultarAluno();
                System.out.println("\npressione enter para continuar\n");
                sc.next();
                break;
            case 3:
                excluirAluno();
                System.out.println("\npressione enter para continuar\n");
                sc.next();
                break;
            case 4:
                consultarTodos();
                System.out.println("\npressione enter para continuar\n");
                sc.next();
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

public void consultarAluno(){
    System.out.println("digite o ra do aluno:\n");
    int ra = sc.nextInt();

    Aluno aluno = ctrl.consultarRA(ra);
    if(aluno == null){

        System.out.println("nao existe tal ra\n");
    }else{
     mostrarAluno(aluno);
    }
}

public void excluirAluno(){
    System.out.println("digite o ra do aluno:");
    int ra = sc.nextInt();
    Aluno aluno = ctrl.consultarRA(ra);
    if(aluno == null){
        System.out.println("tal aluno nao existe\n");
    }else{
        System.out.println("Aluno " + aluno.getNome() + " do RA: " + aluno.getRa().getNumero() + " foi excluido\n");
        ctrl.excluirAluno(ra);
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

public void salvarAluno(){
    System.out.print("Digite o nome do aluno:\n");
    String nome = sc.next();

    System.out.print("\nDigite a idade do Aluno:\n");
    int idade = sc.nextInt();
    
    System.out.print("\nDigite o Ra do Aluno:\n");
    int numero = sc.nextInt();

    LocalDate data = LocalDate.now();

    Ra ra = new Ra(numero, data);
    Aluno aluno = new Aluno(nome, ra, idade);

    ctrl.incluirAluno(aluno);
}
public void consultarTodos(){
    int index = 0;
    while(index < consultarQTD()){
        mostrarAluno(ctrl.consultar(index));
        index++;
    }
}
public int consultarQTD(){
    int tamanho = ctrl.consultarQTD();
    return tamanho;
}
}