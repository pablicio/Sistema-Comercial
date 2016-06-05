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
public class ReqDetPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "COD_REQ_CAB")
    private int codReqCab;
    @Basic(optional = false)
    @Column(name = "COD_PRODUTO")
    private String codProduto;

    public ReqDetPK() {
    }

    public ReqDetPK(int codReqCab, String codProduto) {
        this.codReqCab = codReqCab;
        this.codProduto = codProduto;
    }

    public int getCodReqCab() {
        return codReqCab;
    }

    public void setCodReqCab(int codReqCab) {
        this.codReqCab = codReqCab;
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
        hash += (int) codReqCab;
        hash += (codProduto != null ? codProduto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReqDetPK)) {
            return false;
        }
        ReqDetPK other = (ReqDetPK) object;
        if (this.codReqCab != other.codReqCab) {
            return false;
        }
        if ((this.codProduto == null && other.codProduto != null) || (this.codProduto != null && !this.codProduto.equals(other.codProduto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.siscom.beans.compras.ReqDetPK[ codReqCab=" + codReqCab + ", codProduto=" + codProduto + " ]";
    }
    
}
