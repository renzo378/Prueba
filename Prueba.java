@Entity
public class Persona{
  private String nombre;
  private String apellido;
  public String nombreCompleto(){
    return this.nombre + this.apellido;
  }
}
