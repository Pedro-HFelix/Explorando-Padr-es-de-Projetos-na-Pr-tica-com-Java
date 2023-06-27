package dio.springbootweb.controller;

import dio.springbootweb.model.Livro;
import dio.springbootweb.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LivroRestController {
    @Autowired
    private LivroRepository livroService;
    @PostMapping("/livros")
    public void post(@RequestBody Livro livro){
        livroService.save(livro);
    }
    @PutMapping("/livros")
    public void put(@RequestBody Livro livro){
        livroService.update(livro);
    }
    @GetMapping("/livros")
    public List<Livro> getAll(){
        return livroService.listAll();
    }
    @GetMapping("/livros/{id}")
    public Livro getOne(@PathVariable("id") Integer id){
        return livroService.finById(id);
    }
    @DeleteMapping("/livros/{id}")
    public void delete(@PathVariable("id") Integer id){
        livroService.remove(id);
    }

}
