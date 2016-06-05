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
public class PedidoDetPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "COD_PEDIDO_CAB")
    private int codPedidoCab;
    @Basic(optional = false)
    @Column(name = "QTDE_COT_DET")
    private int qtdeCotDet;

    public PedidoDetPK() {
    }

    public PedidoDetPK(int codPedidoCab, int qtdeCotDet) {
        this.codPedidoCab = codPedidoCab;
        this.qtdeCotDet = qtdeCotDet;
    }

    public int getCodPedidoCab() {
        return codPedidoCab;
    }

    public void setCodPedidoCab(int codPedidoCab) {
        this.codPedidoCab = codPedidoCab;
    }

    public int getQtdeCotDet() {
        return qtdeCotDet;
    }

    public void setQtdeCotDet(int qtdeCotDet) {
        this.qtdeCotDet = qtdeCotDet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codPedidoCab;
        hash += (int) qtdeCotDet;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PedidoDetPK)) {
            return false;
        }
        PedidoDetPK other = (PedidoDetPK) object;
        if (this.codPedidoCab != other.codPedidoCab) {
            return false;
        }
        if (this.qtdeCotDet != other.qtdeCotDet) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.siscom.beans.compras.PedidoDetPK[ codPedidoCab=" + codPedidoCab + ", qtdeCotDet=" + qtdeCotDet + " ]";
    }
    
}
