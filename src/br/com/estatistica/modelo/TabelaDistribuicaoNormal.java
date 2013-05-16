/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.estatistica.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "tabela_distribuicao_normal")
@NamedQueries({
    @NamedQuery(name = "TabelaDistribuicaoNormal.findAll", query = "SELECT t FROM TabelaDistribuicaoNormal t ORDER BY t.codigo DESC"),
    @NamedQuery(name = "TabelaDistribuicaoNormal.findByVerticalZ", query = "SELECT t FROM TabelaDistribuicaoNormal t WHERE t.verticalZ = :verticalZ"),
    @NamedQuery(name = "TabelaDistribuicaoNormal.findByDecimalZ1", query = "SELECT t FROM TabelaDistribuicaoNormal t WHERE t.decimalZ1 = :decimalZ1"),
    @NamedQuery(name = "TabelaDistribuicaoNormal.findByDecimalZ2", query = "SELECT t FROM TabelaDistribuicaoNormal t WHERE t.decimalZ2 = :decimalZ2"),
    @NamedQuery(name = "TabelaDistribuicaoNormal.findByDecimalZ3", query = "SELECT t FROM TabelaDistribuicaoNormal t WHERE t.decimalZ3 = :decimalZ3"),
    @NamedQuery(name = "TabelaDistribuicaoNormal.findByDecimalZ4", query = "SELECT t FROM TabelaDistribuicaoNormal t WHERE t.decimalZ4 = :decimalZ4"),
    @NamedQuery(name = "TabelaDistribuicaoNormal.findByDecimalZ5", query = "SELECT t FROM TabelaDistribuicaoNormal t WHERE t.decimalZ5 = :decimalZ5"),
    @NamedQuery(name = "TabelaDistribuicaoNormal.findByDecimalZ6", query = "SELECT t FROM TabelaDistribuicaoNormal t WHERE t.decimalZ6 = :decimalZ6"),
    @NamedQuery(name = "TabelaDistribuicaoNormal.findByDecimalZ7", query = "SELECT t FROM TabelaDistribuicaoNormal t WHERE t.decimalZ7 = :decimalZ7"),
    @NamedQuery(name = "TabelaDistribuicaoNormal.findByDecimalZ8", query = "SELECT t FROM TabelaDistribuicaoNormal t WHERE t.decimalZ8 = :decimalZ8"),
    @NamedQuery(name = "TabelaDistribuicaoNormal.findByDecimalZ9", query = "SELECT t FROM TabelaDistribuicaoNormal t WHERE t.decimalZ9 = :decimalZ9"),
    @NamedQuery(name = "TabelaDistribuicaoNormal.findByDecimalZ10", query = "SELECT t FROM TabelaDistribuicaoNormal t WHERE t.decimalZ10 = :decimalZ10")})
public class TabelaDistribuicaoNormal implements Serializable , IModelo{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cp_tabela")
    private Integer codigo;
    @Column(name = "vertical_z")
    private String verticalZ;
    @Column(name = "decimalZ_1")
    private BigDecimal decimalZ1;
    @Column(name = "decimalZ_2")
    private BigDecimal decimalZ2;
    @Column(name = "decimalZ_3")
    private BigDecimal decimalZ3;
    @Column(name = "decimalZ_4")
    private BigDecimal decimalZ4;
    @Column(name = "decimalZ_5")
    private BigDecimal decimalZ5;
    @Column(name = "decimalZ_6")
    private BigDecimal decimalZ6;
    @Column(name = "decimalZ_7")
    private BigDecimal decimalZ7;
    @Column(name = "decimalZ_8")
    private BigDecimal decimalZ8;
    @Column(name = "decimalZ_9")
    private BigDecimal decimalZ9;
    @Column(name = "decimalZ_10")
    private BigDecimal decimalZ10;

    public TabelaDistribuicaoNormal() {
    }

    public TabelaDistribuicaoNormal(Integer cpTabela) {
        this.codigo = cpTabela;
    }

    public Integer getCpTabela() {
        return codigo;
    }

    public void setCpTabela(Integer cpTabela) {
        this.codigo = cpTabela;
    }

    public String getVerticalZ() {
        return verticalZ;
    }

    public void setVerticalZ(String verticalZ) {
        this.verticalZ = verticalZ;
    }

    public BigDecimal getDecimalZ1() {
        return decimalZ1;
    }

    public void setDecimalZ1(BigDecimal decimalZ1) {
        this.decimalZ1 = decimalZ1;
    }

    public BigDecimal getDecimalZ2() {
        return decimalZ2;
    }

    public void setDecimalZ2(BigDecimal decimalZ2) {
        this.decimalZ2 = decimalZ2;
    }

    @Override
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public BigDecimal getDecimalZ3() {
        return decimalZ3;
    }

    public void setDecimalZ3(BigDecimal decimalZ3) {
        this.decimalZ3 = decimalZ3;
    }

    public BigDecimal getDecimalZ4() {
        return decimalZ4;
    }

    public void setDecimalZ4(BigDecimal decimalZ4) {
        this.decimalZ4 = decimalZ4;
    }

    public BigDecimal getDecimalZ5() {
        return decimalZ5;
    }

    public void setDecimalZ5(BigDecimal decimalZ5) {
        this.decimalZ5 = decimalZ5;
    }

    public BigDecimal getDecimalZ6() {
        return decimalZ6;
    }

    public void setDecimalZ6(BigDecimal decimalZ6) {
        this.decimalZ6 = decimalZ6;
    }

    public BigDecimal getDecimalZ7() {
        return decimalZ7;
    }

    public void setDecimalZ7(BigDecimal decimalZ7) {
        this.decimalZ7 = decimalZ7;
    }

    public BigDecimal getDecimalZ8() {
        return decimalZ8;
    }

    public void setDecimalZ8(BigDecimal decimalZ8) {
        this.decimalZ8 = decimalZ8;
    }

    public BigDecimal getDecimalZ9() {
        return decimalZ9;
    }

    public void setDecimalZ9(BigDecimal decimalZ9) {
        this.decimalZ9 = decimalZ9;
    }

    public BigDecimal getDecimalZ10() {
        return decimalZ10;
    }

    public void setDecimalZ10(BigDecimal decimalZ10) {
        this.decimalZ10 = decimalZ10;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabelaDistribuicaoNormal)) {
            return false;
        }
        TabelaDistribuicaoNormal other = (TabelaDistribuicaoNormal) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public boolean isInativo() {
        return false;
    }
    
}
