import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Teste {
  
  public static void main(String[] args) {
    
    List<String> data = getContent("data.txt");
    
    for (int i=0; i < data.size(); i++) {
      String[] item = data.get(i).split(":");
      
      String descricao = item[0];
      Date dataCompra = toDate(item[3]);
      Double valor = Double.valueOf(item[2]);
      Integer numeroParcelas = Integer.valueOf(item[1]);
      
      Compra compra = new Compra (
        descricao,
        dataCompra,
        valor,
        numeroParcelas
      );
    }

  }

  private static Date toDate(String dateValue) {
    
    SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
    
    try {
      return format.parse(dateValue);
    } catch (ParseException ex) {
      ex.printStackTrace();
    }

    return null;
  }

  private static List<String> getContent(String fileName) {
    
    ArrayList<String> content = new ArrayList<String>();
    
    try {
      File file = new File(fileName);
      Scanner reader = new Scanner(file);
      while (reader.hasNextLine()) {
        String data = reader.nextLine();
        content.add(data);
      }
      reader.close();
    } catch (FileNotFoundException ex) {
      ex.printStackTrace();
    }

    return content;

  }

}
