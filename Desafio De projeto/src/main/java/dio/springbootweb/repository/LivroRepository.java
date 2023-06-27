package dio.springbootweb.repository;

import dio.springbootweb.model.Livro;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LivroRepository {
    public void save(Livro livro){
        System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        System.out.println(livro);
    }
    public void update(Livro livro){
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(livro);
    }
    public void remove(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<Livro> listAll(){
        System.out.println("LIST - Listando os usários do sistema");
        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro(1L,"Fadas da neve","Felix Pedro", "3011/2005","Felixandia"));
        livros.add(new Livro(2l,"A fantastica felixlandia","Felix Pedro","30/11/2005","FelixLandia"));
        return livros;
    }
    public Livro finById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
        return  new Livro();
    }
}
