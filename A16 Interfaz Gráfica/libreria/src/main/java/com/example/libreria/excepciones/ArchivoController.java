package com.example.libreria.excepciones;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/archivo")
public class ArchivoController {

    private final FileContent vContenido;

    public ArchivoController(FileContent contenido) {
        this.vContenido = contenido;
    }

    @GetMapping("/lectura")
    public ResponseEntity<String> lectura(@RequestParam String ruta) {
        try {
            String elArchivo = vContenido.lecturaArchivo(ruta);
            return ResponseEntity.ok(elArchivo);
        } catch (RuntimeException error) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error en lectura de archivo: " + error.getMessage());
        }
    }
}