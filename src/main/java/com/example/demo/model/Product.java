package com.example.demo.model;

import java.time.LocalDateTime;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Data 
@AllArgsConstructor 
@NoArgsConstructor 
@Schema(description = "Entidad representativa de un Producto en el catálogo")
public class Product {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "ID único del producto", example = "1", accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;

    @Schema(description = "Nombre o título del producto", example = "Camiseta Casual")
    private String nombre;

    @Schema(description = "Descripción detallada del producto", example = "Camiseta 100% algodón de alta calidad")
    private String descripcion;

    @Schema(description = "Precio unitario del producto", example = "19.99")
    private double precio;

    @Schema(description = "URL de la imagen del producto", example = "https://images.unsplash.com/photo-1521572267360-ee0c2909d518")
    private String img_url;

    @Schema(description = "Fecha y hora de creación del registro", accessMode = Schema.AccessMode.READ_ONLY)
    private LocalDateTime created_at;
}
