import java.util.Date;
import java.util.Calendar;

public class Parcela {
  
  private Integer numero;
  private Date data;
  private Double valor;

  public Parcela (Integer numero, Date data, Double valor) {
    this.numero = numero;
    this.data = data;
    this.valor = valor;
  }
  
  public Parcela () {}

  public void setNumero (Integer numero) {
    this.numero = numero;
  }

  public void setData (Date data) {
    this.data = data;
  }

  public void setData (Integer numeroParcela, Date dataBase) {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(dataBase);
    calendar.add(Calendar.MONTH, numeroParcela - 1);
    this.setData(calendar.getTime());
  }

  public void setValor (Double valor) {
    this.valor = valor;
  }

}
