import java.util.List;
public class Titulo{
    String titulo;
    String edicion;
    String ISBN;
    List<Autor> autores;
    List<Categoria>categoria;

    public Titulo(){

    }
    public Titulo(String titulo, String edicion, String ISBN){
        this.titulo=titulo;
        this.edicion=edicion;
        this.ISBN=ISBN;
    }
}
