public class Curso {
  private int codigo;
  private String nombre;
  private int creditos;
  private int salon;

  private Profesor profesor;

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getCreditos() {
    return creditos;
  }

  public void setCreditos(int creditos) {
    this.creditos = creditos;
  }

  public int getSalon() {
    return salon;
  }

  public void setSalon(int salon) {
    this.salon = salon;
  }
}
