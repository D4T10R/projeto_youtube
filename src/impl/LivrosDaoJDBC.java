package impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import entities.Livros;
import entities.model.dao.LivrosDAO;

public class LivrosDaoJDBC implements LivrosDAO {

    private Connection conn = null;
    
    public LivrosDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(Livros livro) {
        
    }

    @Override
    public Livros procurarId(Integer id) {
        try {
            Livros livro = new Livros();
            ResultSet rs = null;
            PreparedStatement st = conn.prepareStatement(
                        "SELECT * FROM livros " +
                        "WHERE id = ?"
                        );
            st.setInt(1, id);
            rs = st.executeQuery();

            if (rs.next()) {
                livro.setId(rs.getInt("id"));
                livro.setNome(rs.getString("nome"));
                livro.setLancamento(rs.getDate("lancamento"));
                livro.setGenero(rs.getString("genero"));
                return livro;

            }

        } catch (SQLException e) {
            e.getMessage();
        }
        return null;
    }

    @Override
    public List<Livros> visualizarTodos() {
        return null;
    }
    


}
