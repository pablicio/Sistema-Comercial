/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siscom.beans;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author pablicio
 */
@Entity
@Table(name = "pedido_det", catalog = "siscomrefatorado", schema = "")
@NamedQueries({
    @NamedQuery(name = "PedidoDet.findAll", query = "SELECT p FROM PedidoDet p"),
    @NamedQuery(name = "PedidoDet.findByCodPedidoCab", query = "SELECT p FROM PedidoDet p WHERE p.pedidoDetPK.codPedidoCab = :codPedidoCab"),
    @NamedQuery(name = "PedidoDet.findByQtdeCotDet", query = "SELECT p FROM PedidoDet p WHERE p.pedidoDetPK.qtdeCotDet = :qtdeCotDet"),
    @NamedQuery(name = "PedidoDet.findByCodReqCab", query = "SELECT p FROM PedidoDet p WHERE p.codReqCab = :codReqCab"),
    @NamedQuery(name = "PedidoDet.findByCodProduto", query = "SELECT p FROM PedidoDet p WHERE p.codProduto = :codProduto"),
    @NamedQuery(name = "PedidoDet.findByCodCotCab", query = "SELECT p FROM PedidoDet p WHERE p.codCotCab = :codCotCab"),
    @NamedQuery(name = "PedidoDet.findByQtdePedidoDet", query = "SELECT p FROM PedidoDet p WHERE p.qtdePedidoDet = :qtdePedidoDet"),
    @NamedQuery(name = "PedidoDet.findByVlrUnitPedidoDet", query = "SELECT p FROM PedidoDet p WHERE p.vlrUnitPedidoDet = :vlrUnitPedidoDet"),
    @NamedQuery(name = "PedidoDet.findByVlrTotalPedidoDet", query = "SELECT p FROM PedidoDet p WHERE p.vlrTotalPedidoDet = :vlrTotalPedidoDet")})
public class PedidoDet implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PedidoDetPK pedidoDetPK;
    @Basic(optional = false)
    @Column(name = "COD_REQ_CAB")
    private int codReqCab;
    @Basic(optional = false)
    @Column(name = "COD_PRODUTO")
    private String codProduto;
    @Basic(optional = false)
    @Column(name = "COD_COT_CAB")
    private int codCotCab;
    @Column(name = "QTDE_PEDIDO_DET")
    private Integer qtdePedidoDet;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VLR_UNIT_PEDIDO_DET")
    private Double vlrUnitPedidoDet;
    @Column(name = "VLR_TOTAL_PEDIDO_DET")
    private Double vlrTotalPedidoDet;
    @JoinColumn(name = "COD_PEDIDO_CAB", referencedColumnName = "COD_PEDIDO_CAB", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private PedidoCab pedidoCab;

    public PedidoDet() {
    }

    public PedidoDet(PedidoDetPK pedidoDetPK) {
        this.pedidoDetPK = pedidoDetPK;
    }

    public PedidoDet(PedidoDetPK pedidoDetPK, int codReqCab, String codProduto, int codCotCab) {
        this.pedidoDetPK = pedidoDetPK;
        this.codReqCab = codReqCab;
        this.codProduto = codProduto;
        this.codCotCab = codCotCab;
    }

    public PedidoDet(int codPedidoCab, int qtdeCotDet) {
        this.pedidoDetPK = new PedidoDetPK(codPedidoCab, qtdeCotDet);
    }

    public PedidoDetPK getPedidoDetPK() {
        return pedidoDetPK;
    }

    public void setPedidoDetPK(PedidoDetPK pedidoDetPK) {
        this.pedidoDetPK = pedidoDetPK;
    }

    public int getCodReqCab() {
        return codReqCab;
    }

    public void setCodReqCab(int codReqCab) {
        int oldCodReqCab = this.codReqCab;
        this.codReqCab = codReqCab;
        changeSupport.firePropertyChange("codReqCab", oldCodReqCab, codReqCab);
    }

    public String getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(String codProduto) {
        String oldCodProduto = this.codProduto;
        this.codProduto = codProduto;
        changeSupport.firePropertyChange("codProduto", oldCodProduto, codProduto);
    }

    public int getCodCotCab() {
        return codCotCab;
    }

    public void setCodCotCab(int codCotCab) {
        int oldCodCotCab = this.codCotCab;
        this.codCotCab = codCotCab;
        changeSupport.firePropertyChange("codCotCab", oldCodCotCab, codCotCab);
    }

    public Integer getQtdePedidoDet() {
        return qtdePedidoDet;
    }

    public void setQtdePedidoDet(Integer qtdePedidoDet) {
        Integer oldQtdePedidoDet = this.qtdePedidoDet;
        this.qtdePedidoDet = qtdePedidoDet;
        changeSupport.firePropertyChange("qtdePedidoDet", oldQtdePedidoDet, qtdePedidoDet);
    }

    public Double getVlrUnitPedidoDet() {
        return vlrUnitPedidoDet;
    }

    public void setVlrUnitPedidoDet(Double vlrUnitPedidoDet) {
        Double oldVlrUnitPedidoDet = this.vlrUnitPedidoDet;
        this.vlrUnitPedidoDet = vlrUnitPedidoDet;
        changeSupport.firePropertyChange("vlrUnitPedidoDet", oldVlrUnitPedidoDet, vlrUnitPedidoDet);
    }

    public Double getVlrTotalPedidoDet() {
        return vlrTotalPedidoDet;
    }

    public void setVlrTotalPedidoDet(Double vlrTotalPedidoDet) {
        Double oldVlrTotalPedidoDet = this.vlrTotalPedidoDet;
        this.vlrTotalPedidoDet = vlrTotalPedidoDet;
        changeSupport.firePropertyChange("vlrTotalPedidoDet", oldVlrTotalPedidoDet, vlrTotalPedidoDet);
    }

    public PedidoCab getPedidoCab() {
        return pedidoCab;
    }

    public void setPedidoCab(PedidoCab pedidoCab) {
        PedidoCab oldPedidoCab = this.pedidoCab;
        this.pedidoCab = pedidoCab;
        changeSupport.firePropertyChange("pedidoCab", oldPedidoCab, pedidoCab);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pedidoDetPK != null ? pedidoDetPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PedidoDet)) {
            return false;
        }
        PedidoDet other = (PedidoDet) object;
        if ((this.pedidoDetPK == null && other.pedidoDetPK != null) || (this.pedidoDetPK != null && !this.pedidoDetPK.equals(other.pedidoDetPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.siscom.beans.compras.PedidoDet[ pedidoDetPK=" + pedidoDetPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
