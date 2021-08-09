enum TipoNivelCarrera {
  PREGADRO,
  POSTGRADO
}

public class Carrera {
  private String nombre;
  private int creditos;
  private int semestres;
  private TipoNivelCarrera nivel;

  private Facultad facultad;

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

  public int getSemestres() {
    return semestres;
  }

  public void setSemestres(int semestres) {
    this.semestres = semestres;
  }

  public TipoNivelCarrera getNivel() {
    return nivel;
  }

  public void setNivel(TipoNivelCarrera nivel) {
    this.nivel = nivel;
  }
}
