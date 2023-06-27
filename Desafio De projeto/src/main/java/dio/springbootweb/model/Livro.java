package dio.springbootweb.model;


import javax.annotation.Generated;

public class Livro {
    private Long id;
    private String nome;
    private String autor;
    private String dataLancamento;
    private String editora;
    public Livro(){}
    public Livro(Long id, String nome, String autor, String dataLancamento, String editora) {
        this.id = id;
        this.nome = nome;
        this.autor = autor;
        this.dataLancamento = dataLancamento;
        this.editora = editora;
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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", dataLancamento=" + dataLancamento +
                ", editora='" + editora + '\'' +
                '}';
    }
}
