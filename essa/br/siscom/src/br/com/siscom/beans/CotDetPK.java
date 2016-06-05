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
public class CotDetPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "QTDE_COT_DET")
    private int qtdeCotDet;
    @Basic(optional = false)
    @Column(name = "COD_PRODUTO")
    private String codProduto;
    @Basic(optional = false)
    @Column(name = "COD_COT_CAB")
    private int codCotCab;

    public CotDetPK() {
    }

    public CotDetPK(int qtdeCotDet, String codProduto, int codCotCab) {
        this.qtdeCotDet = qtdeCotDet;
        this.codProduto = codProduto;
        this.codCotCab = codCotCab;
    }

    public int getQtdeCotDet() {
        return qtdeCotDet;
    }

    public void setQtdeCotDet(int qtdeCotDet) {
        this.qtdeCotDet = qtdeCotDet;
    }

    public String getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    public int getCodCotCab() {
        return codCotCab;
    }

    public void setCodCotCab(int codCotCab) {
        this.codCotCab = codCotCab;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) qtdeCotDet;
        hash += (codProduto != null ? codProduto.hashCode() : 0);
        hash += (int) codCotCab;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CotDetPK)) {
            return false;
        }
        CotDetPK other = (CotDetPK) object;
        if (this.qtdeCotDet != other.qtdeCotDet) {
            return false;
        }
        if ((this.codProduto == null && other.codProduto != null) || (this.codProduto != null && !this.codProduto.equals(other.codProduto))) {
            return false;
        }
        if (this.codCotCab != other.codCotCab) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.siscom.beans.compras.CotDetPK[ qtdeCotDet=" + qtdeCotDet + ", codProduto=" + codProduto + ", codCotCab=" + codCotCab + " ]";
    }
    
}
