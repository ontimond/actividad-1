public class Estudiante extends Persona {
  private int semestre;
  private date fechaIngreso;

  private Carrera carrera;

  public int getSemestre() {
    return semestre;
  }

  public void setSemestre(int semestre) {
    this.semestre = semestre;
  }

  public date getFechaIngreso() {
    return fechaIngreso;
  }

  public void setFechaIngreso(date fechaIngreso) {
    this.fechaIngreso = fechaIngreso;
  }
}
