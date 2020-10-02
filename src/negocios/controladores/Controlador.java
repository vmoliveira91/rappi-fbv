package controladores;

import src.dados.*;

public class Controlador {
    private IRepositorio rep;

    public Controlador() {
        this.rep = new Repositorio();
    }
}