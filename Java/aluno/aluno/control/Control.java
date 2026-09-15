package control;
import model.BD;
import model.Aluno;


public class Control {
    private BD bd = new BD();

    public Aluno consultarRA(int ra){
        return bd.consultarRA(ra);
    }

    public void incluirAluno(Aluno aluno){
        bd.salvar(aluno);
    }
    
    public void excluirAluno(int ra){
        bd.excluir(ra);
    }
    public int consultarQTD(){
        return bd.consultarQtd();
    }
    public Aluno consultar(int index){
        return bd.consultar(index);
    }
}
