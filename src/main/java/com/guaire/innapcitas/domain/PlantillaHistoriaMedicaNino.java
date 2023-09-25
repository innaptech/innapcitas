package com.guaire.innapcitas.domain;


import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * A PlantillaHistoriaMedicaNino.
 */
@Entity
@Table(name = "plantilla_historia_medica_nino")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class PlantillaHistoriaMedicaNino implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "contenido")
    private String contenido;

    @Column(name = "activo")
    private Boolean activo;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public PlantillaHistoriaMedicaNino nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContenido() {
        return contenido;
    }

    public PlantillaHistoriaMedicaNino contenido(String contenido) {
        this.contenido = contenido;
        return this;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Boolean isActivo() {
        return activo;
    }

    public PlantillaHistoriaMedicaNino activo(Boolean activo) {
        this.activo = activo;
        return this;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PlantillaHistoriaMedicaNino plantillaHistoriaMedicaNino = (PlantillaHistoriaMedicaNino) o;
        if (plantillaHistoriaMedicaNino.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), plantillaHistoriaMedicaNino.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "PlantillaHistoriaMedicaNino{" +
            "id=" + getId() +
            ", nombre='" + getNombre() + "'" +
            ", contenido='" + getContenido() + "'" +
            ", activo='" + isActivo() + "'" +
            "}";
    }
}
