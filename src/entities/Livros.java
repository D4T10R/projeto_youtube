package entities;

import java.io.Serializable;
import java.util.Date;

public class Livros implements Serializable {
    
    private static final long serialVersionUID = 1L;
    // ATRIBUTOS
    private int id;
    private String nome;
    private Date lancamento;
    private String genero;

    private Autor autor;
    // ATRIBUTOS

    // CONSTRUTORES 
    public Livros() {
    }

    public Livros(int id, String nome, Date lancamento, String genero) {
        this.id = id;
        this.nome = nome;
        this.lancamento = lancamento;
        this.genero = genero;
    }

    public Livros(int id, String nome, Date lancamento, String genero, Autor autor) {
        this.id = id;
        this.nome = nome;
        this.lancamento = lancamento;
        this.genero = genero;
        this.autor = autor;
    }
    // CONSTRUTORES 

    // ENCAPSULAMENTO
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getLancamento() {
        return lancamento;
    }

    public void setLancamento(Date lancamento) {
        this.lancamento = lancamento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    // ENCAPSULAMENTO

    // HASHCODE e EQUALS
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Livros other = (Livros) obj;
        if (id != other.id)
            return false;
        return true;
    } 
    // HASHCODE e EQUALS

    @Override
    public String toString() {
        return "Livros [id=" + id + ", nome=" + nome + ", lancamento=" + lancamento + ", genero=" + genero + ", autor="
                + autor + "]";
    }
    

    

    

}
