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
@Table(name = "banco", catalog = "siscomrefatorado", schema = "")
@NamedQueries({
    @NamedQuery(name = "Banco.findAll", query = "SELECT b FROM Banco b"),
    @NamedQuery(name = "Banco.findByCodBanco", query = "SELECT b FROM Banco b WHERE b.codBanco = :codBanco"),
    @NamedQuery(name = "Banco.findByNomeBanco", query = "SELECT b FROM Banco b WHERE b.nomeBanco = :nomeBanco"),
    @NamedQuery(name = "Banco.findByAgenciaBanco", query = "SELECT b FROM Banco b WHERE b.agenciaBanco = :agenciaBanco"),
    @NamedQuery(name = "Banco.findByContaBanco", query = "SELECT b FROM Banco b WHERE b.contaBanco = :contaBanco"),
    @NamedQuery(name = "Banco.findByGerente", query = "SELECT b FROM Banco b WHERE b.gerente = :gerente"),
    @NamedQuery(name = "Banco.findByFonneBanco", query = "SELECT b FROM Banco b WHERE b.fonneBanco = :fonneBanco"),
})
public class Banco implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COD_BANCO")
    private Integer codBanco;
    @Column(name = "NOME_BANCO")
    private String nomeBanco;
    @Column(name = "AGENCIA_BANCO")
    private Integer agenciaBanco;
    @Column(name = "CONTA_BANCO")
    private Integer contaBanco;
    @Column(name = "GERENTE")
    private String gerente;
    @Column(name = "FONNE_BANCO")
    private String fonneBanco;

    public Banco() {
    }

    public Banco(Integer codBanco) {
        this.codBanco = codBanco;
    }

    public Integer getCodBanco() {
        return codBanco;
    }

    public void setCodBanco(Integer codBanco) {
        Integer oldCodBanco = this.codBanco;
        this.codBanco = codBanco;
        changeSupport.firePropertyChange("codBanco", oldCodBanco, codBanco);
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        String oldNomeBanco = this.nomeBanco;
        this.nomeBanco = nomeBanco;
        changeSupport.firePropertyChange("nomeBanco", oldNomeBanco, nomeBanco);
    }

    public Integer getAgenciaBanco() {
        return agenciaBanco;
    }

    public void setAgenciaBanco(Integer agenciaBanco) {
        Integer oldAgenciaBanco = this.agenciaBanco;
        this.agenciaBanco = agenciaBanco;
        changeSupport.firePropertyChange("agenciaBanco", oldAgenciaBanco, agenciaBanco);
    }

    public Integer getContaBanco() {
        return contaBanco;
    }

    public void setContaBanco(Integer contaBanco) {
        Integer oldContaBanco = this.contaBanco;
        this.contaBanco = contaBanco;
        changeSupport.firePropertyChange("contaBanco", oldContaBanco, contaBanco);
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        String oldGerente = this.gerente;
        this.gerente = gerente;
        changeSupport.firePropertyChange("gerente", oldGerente, gerente);
    }

    public String getFonneBanco() {
        return fonneBanco;
    }

    public void setFonneBanco(String fonneBanco) {
        String oldFonneBanco = this.fonneBanco;
        this.fonneBanco = fonneBanco;
        changeSupport.firePropertyChange("fonneBanco", oldFonneBanco, fonneBanco);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codBanco != null ? codBanco.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Banco)) {
            return false;
        }
        Banco other = (Banco) object;
        if ((this.codBanco == null && other.codBanco != null) || (this.codBanco != null && !this.codBanco.equals(other.codBanco))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.siscom.beans.Banco[ codBanco=" + codBanco + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
