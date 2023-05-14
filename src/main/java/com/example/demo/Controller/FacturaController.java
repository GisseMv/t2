package com.example.demo.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.constraints.Null;


@Controller
public class FacturaController {
    @RequestMapping("/detalle")
    public String detalle(){
        return "detalle";
    }
}

