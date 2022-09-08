import java.util.List;

public class Autor {
    String nombre;
    List<Titulo> titulo;
    public Autor() {

    }
    public Autor(String nombre){
        this.nombre=nombre;
    }
    public Autor(String nombre, List<Titulo> titulo) {
        this.nombre = nombre;
        this.titulo=titulo;
    }

}