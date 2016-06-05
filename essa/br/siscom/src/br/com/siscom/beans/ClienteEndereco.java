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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author pablicio
 */
@Entity
@Table(name = "cliente_endereco", catalog = "siscomrefatorado", schema = "")
@NamedQueries({
    @NamedQuery(name = "ClienteEndereco.findAll", query = "SELECT c FROM ClienteEndereco c"),
    @NamedQuery(name = "ClienteEndereco.findByCodCliente", query = "SELECT c FROM ClienteEndereco c WHERE c.codCliente = :codCliente"),
    @NamedQuery(name = "ClienteEndereco.findByCodEndereco", query = "SELECT c FROM ClienteEndereco c WHERE c.codEndereco = :codEndereco"),
    @NamedQuery(name = "ClienteEndereco.findByLogradouroEndereco", query = "SELECT c FROM ClienteEndereco c WHERE c.logradouroEndereco = :logradouroEndereco"),
    @NamedQuery(name = "ClienteEndereco.findByComplementoEndereco", query = "SELECT c FROM ClienteEndereco c WHERE c.complementoEndereco = :complementoEndereco"),
    @NamedQuery(name = "ClienteEndereco.findByCepEndereco", query = "SELECT c FROM ClienteEndereco c WHERE c.cepEndereco = :cepEndereco"),
    @NamedQuery(name = "ClienteEndereco.findByBairroEndereco", query = "SELECT c FROM ClienteEndereco c WHERE c.bairroEndereco = :bairroEndereco"),
    @NamedQuery(name = "ClienteEndereco.findByCidadeEndereco", query = "SELECT c FROM ClienteEndereco c WHERE c.cidadeEndereco = :cidadeEndereco"),
    @NamedQuery(name = "ClienteEndereco.findByUfEndereco", query = "SELECT c FROM ClienteEndereco c WHERE c.ufEndereco = :ufEndereco")})
public class ClienteEndereco implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_CLIENTE")
    private Integer codCliente;
    @Basic(optional = false)
    @Column(name = "COD_ENDERECO")
    private int codEndereco;
    @Column(name = "LOGRADOURO_ENDERECO")
    private String logradouroEndereco;
    @Column(name = "COMPLEMENTO_ENDERECO")
    private String complementoEndereco;
    @Column(name = "CEP_ENDERECO")
    private String cepEndereco;
    @Column(name = "BAIRRO_ENDERECO")
    private String bairroEndereco;
    @Column(name = "CIDADE_ENDERECO")
    private String cidadeEndereco;
    @Column(name = "UF_ENDERECO")
    private String ufEndereco;
    @JoinColumn(name = "COD_CLIENTE", referencedColumnName = "COD_CLIENTE", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Cliente cliente;
    @JoinColumn(name = "COD_CLIENTE", referencedColumnName = "COD_CLIENTE", updatable = false, insertable = false)
    @ManyToOne
    private Cliente codCliente2;

    public ClienteEndereco() {
    }

    public ClienteEndereco(Integer codCliente) {
        this.codCliente = codCliente;
    }

    public ClienteEndereco(Integer codCliente, int codEndereco) {
        this.codCliente = codCliente;
        this.codEndereco = codEndereco;
    }

    public Integer getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Integer codCliente) {
        Integer oldCodCliente = this.codCliente;
        this.codCliente = codCliente;
        changeSupport.firePropertyChange("codCliente", oldCodCliente, codCliente);
    }

    public int getCodEndereco() {
        return codEndereco;
    }

    public void setCodEndereco(int codEndereco) {
        int oldCodEndereco = this.codEndereco;
        this.codEndereco = codEndereco;
        changeSupport.firePropertyChange("codEndereco", oldCodEndereco, codEndereco);
    }

    public String getLogradouroEndereco() {
        return logradouroEndereco;
    }

    public void setLogradouroEndereco(String logradouroEndereco) {
        String oldLogradouroEndereco = this.logradouroEndereco;
        this.logradouroEndereco = logradouroEndereco;
        changeSupport.firePropertyChange("logradouroEndereco", oldLogradouroEndereco, logradouroEndereco);
    }

    public String getComplementoEndereco() {
        return complementoEndereco;
    }

    public void setComplementoEndereco(String complementoEndereco) {
        String oldComplementoEndereco = this.complementoEndereco;
        this.complementoEndereco = complementoEndereco;
        changeSupport.firePropertyChange("complementoEndereco", oldComplementoEndereco, complementoEndereco);
    }

    public String getCepEndereco() {
        return cepEndereco;
    }

    public void setCepEndereco(String cepEndereco) {
        String oldCepEndereco = this.cepEndereco;
        this.cepEndereco = cepEndereco;
        changeSupport.firePropertyChange("cepEndereco", oldCepEndereco, cepEndereco);
    }

    public String getBairroEndereco() {
        return bairroEndereco;
    }

    public void setBairroEndereco(String bairroEndereco) {
        String oldBairroEndereco = this.bairroEndereco;
        this.bairroEndereco = bairroEndereco;
        changeSupport.firePropertyChange("bairroEndereco", oldBairroEndereco, bairroEndereco);
    }

    public String getCidadeEndereco() {
        return cidadeEndereco;
    }

    public void setCidadeEndereco(String cidadeEndereco) {
        String oldCidadeEndereco = this.cidadeEndereco;
        this.cidadeEndereco = cidadeEndereco;
        changeSupport.firePropertyChange("cidadeEndereco", oldCidadeEndereco, cidadeEndereco);
    }

    public String getUfEndereco() {
        return ufEndereco;
    }

    public void setUfEndereco(String ufEndereco) {
        String oldUfEndereco = this.ufEndereco;
        this.ufEndereco = ufEndereco;
        changeSupport.firePropertyChange("ufEndereco", oldUfEndereco, ufEndereco);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCliente != null ? codCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClienteEndereco)) {
            return false;
        }
        ClienteEndereco other = (ClienteEndereco) object;
        if ((this.codCliente == null && other.codCliente != null) || (this.codCliente != null && !this.codCliente.equals(other.codCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.siscom.view.ClienteEndereco[ codCliente=" + codCliente + " ]";
    }

    public Cliente getCodCliente2() {
        return codCliente2;
    }

    public void setCodCliente2(Cliente codCliente2) {
        Cliente oldCodCliente2 = this.codCliente2;
        this.codCliente2 = codCliente2;
        changeSupport.firePropertyChange("codCliente2", oldCodCliente2, codCliente2);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
