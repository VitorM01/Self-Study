package model;
import java.util.ArrayList;

public class BD {
    private static ArrayList<Aluno> bd = new ArrayList<Aluno>();

    public void salvar(Aluno aluno){
        bd.add(aluno);
    }

    public void excluir(int ra){
        bd.remove(ra);
    }

    public Aluno consultarRA(int ra){
        Aluno a = null;
        for(Aluno aluno : bd){
            if(aluno.getRa().getNumero() == ra){
                a = aluno;
                break;
            }
        }

        return a;
    }

    public Aluno consultar(int index){
        return bd.get(index);
    }

    public int consultarQtd(){
        return bd.size();
    }
}
