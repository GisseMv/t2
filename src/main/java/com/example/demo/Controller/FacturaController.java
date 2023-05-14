package com.example.demo.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.model.Model;
import jakarta.validation.constraints.Null;


@Controller
public class FacturaController {
    @RequestMapping("/detalle")
    public String detalle(){
        return "detalle";
    }


    @RequestMapping("/respuesta/{nombrep}/{cantidad}/{precio_U}/{cuponD}/{factura}")
    public String calVentaProducto(
      @PathVariable String nombre,
      @PathVariable Integer cantidad,
      @PathVariable Double precio_U,
      @PathVariable String cuponD,
      @PathVariable String factura,
      Model model
      ){
      double Bruta= cantidad * precio_U;
      double descuentoC;
      int ultimoC = Integer.parseInt(cuponD.substring(cuponD.length() - 1));
      if (ultimoC % 2 == 0){descuentoC = Bruta* 0.1;
      }else{descuentoC = Bruta* 0.05;}
      
      double factura2;
      if(factura.equals("si")){
          factura2 = Bruta * 0.08;
      }else{
          factura2 = 0;
      }
      
      double total = Bruta - descuentoC + factura2;
  
      model.addAttribute("nombre", nombre);
      model.addAttribute("Bruta",Bruta);
      model.addAttribute("descuentoC", descuentoC);
      model.addAttribute("factura2", factura2);
      model.addAttribute("total", total);
  
      return "respuesta";
}



