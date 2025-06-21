package main.java.com.marlondev.processor.util;

import main.java.com.marlondev.processor.model.RegistroBase;
import main.java.com.marlondev.processor.model.RegistroFInanceiro;

import java.util.List;

public class AgregadorDados {

  public static <N extends Number, T extends RegistroFInanceiro> double somarValores(List<T> registros){
      double somaTotal =0;
      for(T o: registros){
          somaTotal += o.getValue();
      }
      return somaTotal;
  }

  public static <N extends Number, T extends RegistroFInanceiro> double CalcularMedia(List<T> registros){
      if (registros == null || registros.isEmpty()) {
          return 0.0; // Tratamento para lista vazia
      }
      double total =somarValores(registros);
      return total / registros.size();
  }

}
