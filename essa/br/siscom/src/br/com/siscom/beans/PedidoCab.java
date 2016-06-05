/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siscom.beans;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author pablicio
 */
@Entity
@Table(name = "pedido_cab", catalog = "siscomrefatorado", schema = "")
@NamedQueries({
    @NamedQuery(name = "PedidoCab.findAll", query = "SELECT p FROM PedidoCab p"),
    @NamedQuery(name = "PedidoCab.findByCodPedidoCab", query = "SELECT p FROM PedidoCab p WHERE p.codPedidoCab = :codPedidoCab"),
    @NamedQuery(name = "PedidoCab.findByCodCotCab", query = "SELECT p FROM PedidoCab p WHERE p.codCotCab = :codCotCab"),
    @NamedQuery(name = "PedidoCab.findByCodFornecedor", query = "SELECT p FROM PedidoCab p WHERE p.codFornecedor = :codFornecedor"),
    @NamedQuery(name = "PedidoCab.findByDataPedidoCab", query = "SELECT p FROM PedidoCab p WHERE p.dataPedidoCab = :dataPedidoCab"),
    @NamedQuery(name = "PedidoCab.findByEnderecoEntregaPedidoCab", query = "SELECT p FROM PedidoCab p WHERE p.enderecoEntregaPedidoCab = :enderecoEntregaPedidoCab"),
    @NamedQuery(name = "PedidoCab.findByEnderecoCobrancaPedidoCab", query = "SELECT p FROM PedidoCab p WHERE p.enderecoCobrancaPedidoCab = :enderecoCobrancaPedidoCab"),
    @NamedQuery(name = "PedidoCab.findByVlrPedidoCab", query = "SELECT p FROM PedidoCab p WHERE p.vlrPedidoCab = :vlrPedidoCab"),
    @NamedQuery(name = "PedidoCab.findByDescontoPedidoCab", query = "SELECT p FROM PedidoCab p WHERE p.descontoPedidoCab = :descontoPedidoCab"),
    @NamedQuery(name = "PedidoCab.findByTotalPedidoCab", query = "SELECT p FROM PedidoCab p WHERE p.totalPedidoCab = :totalPedidoCab")})
public class PedidoCab implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COD_PEDIDO_CAB")
    private Integer codPedidoCab;
    @Column(name = "COD_COT_CAB")
    private Integer codCotCab;
    @Column(name = "COD_FORNECEDOR")
    private Integer codFornecedor;
    @Column(name = "DATA_PEDIDO_CAB")
    @Temporal(TemporalType.DATE)
    private Date dataPedidoCab;
    @Column(name = "ENDERECO_ENTREGA_PEDIDO_CAB")
    private String enderecoEntregaPedidoCab;
    @Column(name = "ENDERECO_COBRANCA_PEDIDO_CAB")
    private String enderecoCobrancaPedidoCab;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VLR_PEDIDO_CAB")
    private Double vlrPedidoCab;
    @Column(name = "DESCONTO_PEDIDO_CAB")
    private Double descontoPedidoCab;
    @Column(name = "TOTAL_PEDIDO_CAB")
    private Double totalPedidoCab;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pedidoCab")
    private List<PedidoDet> pedidoDetList;

    public PedidoCab() {
    }

    public PedidoCab(Integer codPedidoCab) {
        this.codPedidoCab = codPedidoCab;
    }

    public Integer getCodPedidoCab() {
        return codPedidoCab;
    }

    public void setCodPedidoCab(Integer codPedidoCab) {
        Integer oldCodPedidoCab = this.codPedidoCab;
        this.codPedidoCab = codPedidoCab;
        changeSupport.firePropertyChange("codPedidoCab", oldCodPedidoCab, codPedidoCab);
    }

    public Integer getCodCotCab() {
        return codCotCab;
    }

    public void setCodCotCab(Integer codCotCab) {
        Integer oldCodCotCab = this.codCotCab;
        this.codCotCab = codCotCab;
        changeSupport.firePropertyChange("codCotCab", oldCodCotCab, codCotCab);
    }

    public Integer getCodFornecedor() {
        return codFornecedor;
    }

    public void setCodFornecedor(Integer codFornecedor) {
        Integer oldCodFornecedor = this.codFornecedor;
        this.codFornecedor = codFornecedor;
        changeSupport.firePropertyChange("codFornecedor", oldCodFornecedor, codFornecedor);
    }

    public Date getDataPedidoCab() {
        return dataPedidoCab;
    }

    public void setDataPedidoCab(Date dataPedidoCab) {
        Date oldDataPedidoCab = this.dataPedidoCab;
        this.dataPedidoCab = dataPedidoCab;
        changeSupport.firePropertyChange("dataPedidoCab", oldDataPedidoCab, dataPedidoCab);
    }

    public String getEnderecoEntregaPedidoCab() {
        return enderecoEntregaPedidoCab;
    }

    public void setEnderecoEntregaPedidoCab(String enderecoEntregaPedidoCab) {
        String oldEnderecoEntregaPedidoCab = this.enderecoEntregaPedidoCab;
        this.enderecoEntregaPedidoCab = enderecoEntregaPedidoCab;
        changeSupport.firePropertyChange("enderecoEntregaPedidoCab", oldEnderecoEntregaPedidoCab, enderecoEntregaPedidoCab);
    }

    public String getEnderecoCobrancaPedidoCab() {
        return enderecoCobrancaPedidoCab;
    }

    public void setEnderecoCobrancaPedidoCab(String enderecoCobrancaPedidoCab) {
        String oldEnderecoCobrancaPedidoCab = this.enderecoCobrancaPedidoCab;
        this.enderecoCobrancaPedidoCab = enderecoCobrancaPedidoCab;
        changeSupport.firePropertyChange("enderecoCobrancaPedidoCab", oldEnderecoCobrancaPedidoCab, enderecoCobrancaPedidoCab);
    }

    public Double getVlrPedidoCab() {
        return vlrPedidoCab;
    }

    public void setVlrPedidoCab(Double vlrPedidoCab) {
        Double oldVlrPedidoCab = this.vlrPedidoCab;
        this.vlrPedidoCab = vlrPedidoCab;
        changeSupport.firePropertyChange("vlrPedidoCab", oldVlrPedidoCab, vlrPedidoCab);
    }

    public Double getDescontoPedidoCab() {
        return descontoPedidoCab;
    }

    public void setDescontoPedidoCab(Double descontoPedidoCab) {
        Double oldDescontoPedidoCab = this.descontoPedidoCab;
        this.descontoPedidoCab = descontoPedidoCab;
        changeSupport.firePropertyChange("descontoPedidoCab", oldDescontoPedidoCab, descontoPedidoCab);
    }

    public Double getTotalPedidoCab() {
        return totalPedidoCab;
    }

    public void setTotalPedidoCab(Double totalPedidoCab) {
        Double oldTotalPedidoCab = this.totalPedidoCab;
        this.totalPedidoCab = totalPedidoCab;
        changeSupport.firePropertyChange("totalPedidoCab", oldTotalPedidoCab, totalPedidoCab);
    }

    public List<PedidoDet> getPedidoDetList() {
        return pedidoDetList;
    }

    public void setPedidoDetList(List<PedidoDet> pedidoDetList) {
        this.pedidoDetList = pedidoDetList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPedidoCab != null ? codPedidoCab.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PedidoCab)) {
            return false;
        }
        PedidoCab other = (PedidoCab) object;
        if ((this.codPedidoCab == null && other.codPedidoCab != null) || (this.codPedidoCab != null && !this.codPedidoCab.equals(other.codPedidoCab))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.siscom.beans.compras.PedidoCab[ codPedidoCab=" + codPedidoCab + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
