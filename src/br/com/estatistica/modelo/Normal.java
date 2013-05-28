/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estatistica.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Edidelson
 */
@Entity
@Table(name = "normal")
@NamedQueries({
    @NamedQuery(name = "Normal.getAll", query = "SELECT e FROM Normal e")
})
public class Normal implements Serializable, IModelo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="cp_normal")
    private int codigo;
    @Column(name="vl_desvio_padrao")
    private Double desvioPadrao;
    @Column(name="vl_media")
    private Double media;
    @Column(name="vl_variavel")
    private Double veriavel;
    @Column(name="vl_resultado")
    private Double resultado;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Double getDesvioPadrao() {
        return desvioPadrao;
    }

    public void setDesvioPadrao(Double desvioPadrao) {
        this.desvioPadrao = desvioPadrao;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public Double getVeriavel() {
        return veriavel;
    }

    public void setVeriavel(Double veriavel) {
        this.veriavel = veriavel;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }
    
    @Override
    public Object getCodigo() {
        return codigo;
    }

    @Override
    public boolean isInativo() {
        return false;
    }
}
