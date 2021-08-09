enum Mes {
  ENERO,
  FEBRERO,
  MARZO,
  ABRIL,
  MAYO,
  JUNIO,
  JULIO,
  AGOSTO,
  SEPTIEMBRE,
  OCTUBRE,
  NOVIEMBRE,
  DICIEMBRE
}

public class Fecha {
  private int ano;
  private Mes mes;
  private int dia;

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public Mes getMes() {
    return mes;
  }

  public void setMes(Mes mes) {
    this.mes = mes;
  }

  public int getDia() {
    return dia;
  }

  public void setDia(int dia) {
    this.dia = dia;
  }
}
