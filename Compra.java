import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Compra {
  
  private Double valor;
  private String descricao;
  private Date data;
  private List<Parcela> parcelas;

  public Compra(String descricao, Date data, Double valor, Integer numeroParcelas) {

    this.descricao = descricao;
    this.data = data;
    this.valor = valor;
    this.parcelas = new ArrayList<Parcela>();
 
    Double valorParcela = valor / numeroParcelas;

    for (int numero=1; numero <= numeroParcelas; numero++) {

      Parcela parcela = new Parcela();
      
      parcela.setNumero(numero);
      parcela.setData(numero, this.data);
      parcela.setValor(valorParcela);

      this.parcelas.add(parcela);

    }
  }

}
