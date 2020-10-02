import controladores.Controlador;

public class Fachada implements IFachada {
    private Controlador cont;
    private static Fachada instancia;

    private Fachada() {
        this.cont = new Controlador();
    }

    // Singleton
    public static Fachada getInstancia() {
        if(instancia == null)
            instancia = new Fachada();
        
        return instancia;
    }
}