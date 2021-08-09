public class Persona {
  private int cedula;
  private String nombre;
  private date fechaNacimiento;
  private Lugar lugarNacimiento;

  public int getCedula() {
    return cedula;
  }

  public void setCedula(int cedula) {
    this.cedula = cedula;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public date getFechaNacimiento() {
    return fechaNacimiento;
  }

  public void setFechaNacimiento(date fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  public Lugar getLugarNacimiento() {
    return lugarNacimiento;
  }

  public void setLugarNacimiento(Lugar lugarNacimiento) {
    this.lugarNacimiento = lugarNacimiento;
  }
}
