package src.dados;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Repositorio implements IRepositorio {
    private Conexao conexao;

    public Repositorio() {
        this.conexao = new Conexao();
    }

    // Implementar métodos da interface
}