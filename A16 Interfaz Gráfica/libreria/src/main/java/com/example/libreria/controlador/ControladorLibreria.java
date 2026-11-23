package com.example.libreria.controlador;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.libreria.model.Libros;
import com.example.libreria.servicio.IServicioLibro;

@RestController
@RequestMapping("/api/libros")
public class ControladorLibreria {

    private final IServicioLibro iServicio;

    public ControladorLibreria(IServicioLibro iServicio) {
        this.iServicio = iServicio;
    }

    @GetMapping("/todos")
    public List<Libros> listar() {
        return iServicio.obtenerTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Libros> obtenerPorId(@PathVariable Long id) {
        Optional<Libros> libro = iServicio.obtenerPorId(id);
        return libro.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/buscar/{titulo}")
    public String dameLibro(@PathVariable String titulo) {
        return iServicio.buscaLibroPorTitulo(titulo);
    }

    @GetMapping("/clone")
    public String probarClone() {
        Libros original = new Libros(1L, "Miguel de Cervantes", "El Quijote", LocalDate.of(1605, 1, 16));
        Libros copia = original.clone();
        return "Original: " + original.toString() + " | Copia: " + copia.toString();
    }

    @PostMapping
    public ResponseEntity<Libros> crear(@RequestBody Libros libro) {
        iServicio.guardar(libro);
        return ResponseEntity.ok(libro);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        iServicio.eliminarPorId(id);
        return ResponseEntity.noContent().build();
    }
}