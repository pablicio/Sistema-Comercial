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
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "produto", catalog = "siscomrefatorado", schema = "")
@NamedQueries({
    @NamedQuery(name = "Produto.findAll", query = "SELECT p FROM Produto p"),
    @NamedQuery(name = "Produto.findByCodProduto", query = "SELECT p FROM Produto p WHERE p.codProduto = :codProduto"),
    @NamedQuery(name = "Produto.findByCodFornecedor", query = "SELECT p FROM Produto p WHERE p.codFornecedor = :codFornecedor"),
    @NamedQuery(name = "Produto.findByCodUnidade", query = "SELECT p FROM Produto p WHERE p.codUnidade = :codUnidade"),
    @NamedQuery(name = "Produto.findByDescricaoProduto", query = "SELECT p FROM Produto p WHERE p.descricaoProduto = :descricaoProduto"),
    @NamedQuery(name = "Produto.findByVlrCompraProduto", query = "SELECT p FROM Produto p WHERE p.vlrCompraProduto = :vlrCompraProduto"),
    @NamedQuery(name = "Produto.findByVlrVendaProduto", query = "SELECT p FROM Produto p WHERE p.vlrVendaProduto = :vlrVendaProduto"),
    @NamedQuery(name = "Produto.findByEstoqueProduto", query = "SELECT p FROM Produto p WHERE p.estoqueProduto = :estoqueProduto"),
    @NamedQuery(name = "Produto.findByDriticoProduto", query = "SELECT p FROM Produto p WHERE p.driticoProduto = :driticoProduto")})
public class Produto implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_PRODUTO", nullable = false)
    private String codProduto;
    @Basic(optional = false)
    
    @Column(name = "COD_FORNECEDOR")
    private int codFornecedor;
    @Basic(optional = false)
    
    //@JoinColumn(name = "COD_UNIDADE", referencedColumnName = "COD_UNIDADE")
    

    @Column(name = "COD_UNIDADE")
    // @ManyToOne(optional = true)
    private int codUnidade;
    
    
    
    @Column(name = "DESCRICAO_PRODUTO")
    private String descricaoProduto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VLR_COMPRA_PRODUTO")
    private Double vlrCompraProduto;
    @Column(name = "VLR_VENDA_PRODUTO")
    private Double vlrVendaProduto;
    @Column(name = "ESTOQUE_PRODUTO")
    private Integer estoqueProduto;
    @Column(name = "DRITICO_PRODUTO")
    private Integer driticoProduto;

    public Produto() {
    }

    public Produto(String codProduto) {
        this.codProduto = codProduto;
    }

    public Produto(String codProduto, int codFornecedor, int codUnidade) {
        this.codProduto = codProduto;
        this.codFornecedor = codFornecedor;
        this.codUnidade = codUnidade;
    }

    public String getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(String codProduto) {
        String oldCodProduto = this.codProduto;
        this.codProduto = codProduto;
        changeSupport.firePropertyChange("codProduto", oldCodProduto, codProduto);
    }

    public int getCodFornecedor() {
        return codFornecedor;
    }

    public void setCodFornecedor(int codFornecedor) {
        int oldCodFornecedor = this.codFornecedor;
        this.codFornecedor = codFornecedor;
        changeSupport.firePropertyChange("codFornecedor", oldCodFornecedor, codFornecedor);
    }

    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        int oldCodUnidade = this.codUnidade;
        this.codUnidade = codUnidade;
        changeSupport.firePropertyChange("codUnidade", oldCodUnidade, codUnidade);
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        String oldDescricaoProduto = this.descricaoProduto;
        this.descricaoProduto = descricaoProduto;
        changeSupport.firePropertyChange("descricaoProduto", oldDescricaoProduto, descricaoProduto);
    }

    public Double getVlrCompraProduto() {
        return vlrCompraProduto;
    }

    public void setVlrCompraProduto(Double vlrCompraProduto) {
        Double oldVlrCompraProduto = this.vlrCompraProduto;
        this.vlrCompraProduto = vlrCompraProduto;
        changeSupport.firePropertyChange("vlrCompraProduto", oldVlrCompraProduto, vlrCompraProduto);
    }

    public Double getVlrVendaProduto() {
        return vlrVendaProduto;
    }

    public void setVlrVendaProduto(Double vlrVendaProduto) {
        Double oldVlrVendaProduto = this.vlrVendaProduto;
        this.vlrVendaProduto = vlrVendaProduto;
        changeSupport.firePropertyChange("vlrVendaProduto", oldVlrVendaProduto, vlrVendaProduto);
    }

    public Integer getEstoqueProduto() {
        return estoqueProduto;
    }

    public void setEstoqueProduto(Integer estoqueProduto) {
        Integer oldEstoqueProduto = this.estoqueProduto;
        this.estoqueProduto = estoqueProduto;
        changeSupport.firePropertyChange("estoqueProduto", oldEstoqueProduto, estoqueProduto);
    }

    public Integer getDriticoProduto() {
        return driticoProduto;
    }

    public void setDriticoProduto(Integer driticoProduto) {
        Integer oldDriticoProduto = this.driticoProduto;
        this.driticoProduto = driticoProduto;
        changeSupport.firePropertyChange("driticoProduto", oldDriticoProduto, driticoProduto);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codProduto != null ? codProduto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if ((this.codProduto == null && other.codProduto != null) || (this.codProduto != null && !this.codProduto.equals(other.codProduto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.siscom.beans.Produto[ codProduto=" + codProduto + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
