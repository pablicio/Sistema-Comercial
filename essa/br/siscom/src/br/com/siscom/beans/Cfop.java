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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author pablicio
 */
@Entity
@Table(name = "cfop", catalog = "siscomrefatorado", schema = "")
@NamedQueries({
    @NamedQuery(name = "Cfop.findAll", query = "SELECT c FROM Cfop c"),
    @NamedQuery(name = "Cfop.findByCodCfop", query = "SELECT c FROM Cfop c WHERE c.codCfop = :codCfop")})
public class Cfop implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_CFOP")
    private Integer codCfop;
    @Lob
    @Column(name = "DESCRICAO_CFOP")
    private String descricaoCfop;

    public Cfop() {
    }

    public Cfop(Integer codCfop) {
        this.codCfop = codCfop;
    }

    public Integer getCodCfop() {
        return codCfop;
    }

    public void setCodCfop(Integer codCfop) {
        Integer oldCodCfop = this.codCfop;
        this.codCfop = codCfop;
        changeSupport.firePropertyChange("codCfop", oldCodCfop, codCfop);
    }

    public String getDescricaoCfop() {
        return descricaoCfop;
    }

    public void setDescricaoCfop(String descricaoCfop) {
        String oldDescricaoCfop = this.descricaoCfop;
        this.descricaoCfop = descricaoCfop;
        changeSupport.firePropertyChange("descricaoCfop", oldDescricaoCfop, descricaoCfop);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCfop != null ? codCfop.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cfop)) {
            return false;
        }
        Cfop other = (Cfop) object;
        if ((this.codCfop == null && other.codCfop != null) || (this.codCfop != null && !this.codCfop.equals(other.codCfop))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.siscom.beans.Cfop[ codCfop=" + codCfop + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
