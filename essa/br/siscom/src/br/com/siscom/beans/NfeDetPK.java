/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siscom.beans;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author pablicio
 */
@Embeddable
public class NfeDetPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "NUM_NFE_CAB")
    private int numNfeCab;
    @Basic(optional = false)
    @Column(name = "COD_PRODUTO")
    private String codProduto;

    public NfeDetPK() {
    }

    public NfeDetPK(int numNfeCab, String codProduto) {
        this.numNfeCab = numNfeCab;
        this.codProduto = codProduto;
    }

    public int getNumNfeCab() {
        return numNfeCab;
    }

    public void setNumNfeCab(int numNfeCab) {
        this.numNfeCab = numNfeCab;
    }

    public String getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) numNfeCab;
        hash += (codProduto != null ? codProduto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NfeDetPK)) {
            return false;
        }
        NfeDetPK other = (NfeDetPK) object;
        if (this.numNfeCab != other.numNfeCab) {
            return false;
        }
        if ((this.codProduto == null && other.codProduto != null) || (this.codProduto != null && !this.codProduto.equals(other.codProduto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.siscom.beans.estoque.NfeDetPK[ numNfeCab=" + numNfeCab + ", codProduto=" + codProduto + " ]";
    }
    
}
