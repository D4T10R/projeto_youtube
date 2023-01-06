package entities.model.dao;

import java.util.List;

import entities.Livros;

public interface LivrosDAO {

    void insert(Livros livro);
    Livros procurarId(Integer id);
    List<Livros> visualizarTodos();
    
}
