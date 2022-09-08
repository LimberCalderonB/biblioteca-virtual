public class Evaluacion {
    int cantidadEstrellas;
    String comentario;
    Titulo titulo;
    Usuario usuario;

    public Evaluacion(){
    }
    public Evaluacion(int cantidadEstrellas, String comentario,Titulo titulo, Usuario usuario){
        this.cantidadEstrellas=cantidadEstrellas;
        this.comentario=comentario;
        this.titulo=titulo;
        this.usuario=usuario;
    }
}
