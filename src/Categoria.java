import java.util.List;
public class Categoria {
        String nombre;
        List<Titulo> titulo;
        Categoria superCategoria;
        public Categoria(){
        }
        public Categoria(String nombre){
            this.nombre=nombre;
        }
        public Categoria(String nombre, Categoria superCategoria){
             this.nombre=nombre;
             this.superCategoria=superCategoria;
        }
        public  Categoria(String nombre, List<Titulo> titulo){
            this.nombre=nombre;
            this.titulo=titulo;
        }
    }


