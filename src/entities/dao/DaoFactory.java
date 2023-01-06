package entities.dao;

import db.DB;
import entities.model.dao.LivrosDAO;
import impl.LivrosDaoJDBC;

public class DaoFactory {

    public static LivrosDAO createLivrosDao() {
        return new LivrosDaoJDBC(DB.getConnection());
    }
    
}
