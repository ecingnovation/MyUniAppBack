package com.MyUniApp.MyUniAppBack.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Kioskos")
public class KioskoMenu {

    @Id
    private String id;
    private String titulo;
    private String tipo;
    private Long precio;
    private String descripcion;
    private String kiosko;
    private String imageURL;

    public KioskoMenu(String id, String titulo, String tipo, Long precio, String descripcion, String kiosko, String imageURL) {
        this.id = id;
        this.titulo = titulo;
        this.tipo = tipo; //El tipo puede ser A: Almuerzo, D: Desayuno, I:Individual, B: Bebida, C: Combo.
        this.precio = precio;
        this.descripcion = descripcion;
        this.kiosko = kiosko; // El kiosko puede ser RS: Restaurante, K1: Kiosko 1, K2: Kiosko 2, K3: Kiosko 3, HV: Harveys.
        this.imageURL = imageURL;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getKiosko() {
        return kiosko;
    }

    public void setKiosko(String kiosko) {
        this.kiosko = kiosko;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return "KioskoMenu{" +
                "id='" + id + '\'' +
                ", titulo='" + titulo + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                ", kiosko='" + kiosko + '\'' +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }
}
