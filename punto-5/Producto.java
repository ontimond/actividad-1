enum TipoProducto {
  LACTEO,
  CÁRNICO,
  FRUTA,
  ENLATADO,
}

public class Producto {
  private int id;
  private String nombre;
  private TipoProducto tipo;
  private date fechaExpiracion;
  private String nombreFabricante;
  private int cantidad;
  private double precioUnitario;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public TipoProducto getTipo() {
    return tipo;
  }

  public void setTipo(TipoProducto tipo) {
    this.tipo = tipo;
  }

  public date getFechaExpiracion() {
    return fechaExpiracion;
  }

  public void setFechaExpiracion(date fechaExpiracion) {
    this.fechaExpiracion = fechaExpiracion;
  }

  public String getNombreFabricante() {
    return nombreFabricante;
  }

  public void setNombreFabricante(String nombreFabricante) {
    this.nombreFabricante = nombreFabricante;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  public double getPrecioUnitario() {
    return precioUnitario;
  }

  public void setPrecioUnitario(double precioUnitario) {
    this.precioUnitario = precioUnitario;
  }
}
