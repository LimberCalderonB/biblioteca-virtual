import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args){

        Autor BenitoCamelas= new Autor("Benito Camelas");
        Autor RosaMeltroso =new Autor("Rosa Meltroso");

        List<Autor> autores=new ArrayList<>();
        autores.add(BenitoCamelas);
        autores.add(RosaMeltroso);

        Categoria java=new Categoria("java");
        Categoria programacion= new Categoria("programacion");
        List<Categoria> categorias=new ArrayList<>();
        categorias.add(java);
        categorias.add(programacion);

        Titulo titulo=new Titulo();
        titulo.titulo="programacion orienta a objetos";
        titulo.edicion="Segunda Ediscion";
        titulo.ISBN="123QWE456ASD";
        titulo.autores=autores;
    }
}
