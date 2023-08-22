package com.platzi.CursoJavaSpring.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Integer idCategoría;

    private String descripcion;

    private Boolean estado;


    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;

    public Integer getIdCategoría() {
        return idCategoría;
    }

    public void setIdCategoría(Integer idCategoría) {
        this.idCategoría = idCategoría;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
