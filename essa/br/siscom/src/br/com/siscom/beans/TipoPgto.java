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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author pablicio
 */
@Entity
@Table(name = "tipo_pgto", catalog = "siscomrefatorado", schema = "")
@NamedQueries({
    @NamedQuery(name = "TipoPgto.findAll", query = "SELECT t FROM TipoPgto t"),
    @NamedQuery(name = "TipoPgto.findByCodTipoPgto", query = "SELECT t FROM TipoPgto t WHERE t.codTipoPgto = :codTipoPgto"),
    @NamedQuery(name = "TipoPgto.findByDescricaoTipoPgto", query = "SELECT t FROM TipoPgto t WHERE t.descricaoTipoPgto = :descricaoTipoPgto")})
public class TipoPgto implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COD_TIPO_PGTO")
    private Integer codTipoPgto;
    @Column(name = "DESCRICAO_TIPO_PGTO")
    private String descricaoTipoPgto;

    public TipoPgto() {
    }

    public TipoPgto(Integer codTipoPgto) {
        this.codTipoPgto = codTipoPgto;
    }

    public Integer getCodTipoPgto() {
        return codTipoPgto;
    }

    public void setCodTipoPgto(Integer codTipoPgto) {
        Integer oldCodTipoPgto = this.codTipoPgto;
        this.codTipoPgto = codTipoPgto;
        changeSupport.firePropertyChange("codTipoPgto", oldCodTipoPgto, codTipoPgto);
    }

    public String getDescricaoTipoPgto() {
        return descricaoTipoPgto;
    }

    public void setDescricaoTipoPgto(String descricaoTipoPgto) {
        String oldDescricaoTipoPgto = this.descricaoTipoPgto;
        this.descricaoTipoPgto = descricaoTipoPgto;
        changeSupport.firePropertyChange("descricaoTipoPgto", oldDescricaoTipoPgto, descricaoTipoPgto);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codTipoPgto != null ? codTipoPgto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoPgto)) {
            return false;
        }
        TipoPgto other = (TipoPgto) object;
        if ((this.codTipoPgto == null && other.codTipoPgto != null) || (this.codTipoPgto != null && !this.codTipoPgto.equals(other.codTipoPgto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.siscom.beans.TipoPgto[ codTipoPgto=" + codTipoPgto + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
