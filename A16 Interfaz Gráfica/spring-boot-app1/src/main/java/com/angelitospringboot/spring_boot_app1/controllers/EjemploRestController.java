package com.angelitospringboot.spring_boot_app1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.angelitospringboot.spring_boot_app1.models.dto.ClaseDTO;

@RestController
@RequestMapping("/api")
public class EjemploRestController {

    @GetMapping("/detalles_info2")
    public ClaseDTO detallesInfo2() {
        ClaseDTO usuario1 = new ClaseDTO();
        usuario1.setTitulo("Administrador");
        usuario1.setUsuario("InformaticConfig");
        return usuario1;
    }
}