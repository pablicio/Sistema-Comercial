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
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author pablicio
 */
@Entity
@Table(name = "conciliacao", catalog = "siscomrefatorado", schema = "")
@NamedQueries({
    @NamedQuery(name = "Conciliacao.findAll", query = "SELECT c FROM Conciliacao c"),
    @NamedQuery(name = "Conciliacao.findByCodConciliacao", query = "SELECT c FROM Conciliacao c WHERE c.codConciliacao = :codConciliacao"),
    @NamedQuery(name = "Conciliacao.findByNumChequeConciliacao", query = "SELECT c FROM Conciliacao c WHERE c.numChequeConciliacao = :numChequeConciliacao"),
    @NamedQuery(name = "Conciliacao.findByDataChequeConciliacao", query = "SELECT c FROM Conciliacao c WHERE c.dataChequeConciliacao = :dataChequeConciliacao"),
    @NamedQuery(name = "Conciliacao.findByVlrChequeConciliacao", query = "SELECT c FROM Conciliacao c WHERE c.vlrChequeConciliacao = :vlrChequeConciliacao"),
    @NamedQuery(name = "Conciliacao.findByMesAnoConciliacao", query = "SELECT c FROM Conciliacao c WHERE c.mesAnoConciliacao = :mesAnoConciliacao"),
    @NamedQuery(name = "Conciliacao.findByHistoricoConciliacao", query = "SELECT c FROM Conciliacao c WHERE c.historicoConciliacao = :historicoConciliacao")})
public class Conciliacao implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COD_CONCILIACAO")
    private Integer codConciliacao;
    @Column(name = "NUM_CHEQUE_CONCILIACAO")
    private Integer numChequeConciliacao;
    @Column(name = "DATA_CHEQUE_CONCILIACAO")
    @Temporal(TemporalType.DATE)
    private Date dataChequeConciliacao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VLR_CHEQUE_CONCILIACAO")
    private Double vlrChequeConciliacao;
    @Column(name = "MES_ANO_CONCILIACAO")
    private String mesAnoConciliacao;
    @Column(name = "HISTORICO_CONCILIACAO")
    private String historicoConciliacao;

    public Conciliacao() {
    }

    public Conciliacao(Integer codConciliacao) {
        this.codConciliacao = codConciliacao;
    }

    public Integer getCodConciliacao() {
        return codConciliacao;
    }

    public void setCodConciliacao(Integer codConciliacao) {
        Integer oldCodConciliacao = this.codConciliacao;
        this.codConciliacao = codConciliacao;
        changeSupport.firePropertyChange("codConciliacao", oldCodConciliacao, codConciliacao);
    }

    public Integer getNumChequeConciliacao() {
        return numChequeConciliacao;
    }

    public void setNumChequeConciliacao(Integer numChequeConciliacao) {
        Integer oldNumChequeConciliacao = this.numChequeConciliacao;
        this.numChequeConciliacao = numChequeConciliacao;
        changeSupport.firePropertyChange("numChequeConciliacao", oldNumChequeConciliacao, numChequeConciliacao);
    }

    public Date getDataChequeConciliacao() {
        return dataChequeConciliacao;
    }

    public void setDataChequeConciliacao(Date dataChequeConciliacao) {
        Date oldDataChequeConciliacao = this.dataChequeConciliacao;
        this.dataChequeConciliacao = dataChequeConciliacao;
        changeSupport.firePropertyChange("dataChequeConciliacao", oldDataChequeConciliacao, dataChequeConciliacao);
    }

    public Double getVlrChequeConciliacao() {
        return vlrChequeConciliacao;
    }

    public void setVlrChequeConciliacao(Double vlrChequeConciliacao) {
        Double oldVlrChequeConciliacao = this.vlrChequeConciliacao;
        this.vlrChequeConciliacao = vlrChequeConciliacao;
        changeSupport.firePropertyChange("vlrChequeConciliacao", oldVlrChequeConciliacao, vlrChequeConciliacao);
    }

    public String getMesAnoConciliacao() {
        return mesAnoConciliacao;
    }

    public void setMesAnoConciliacao(String mesAnoConciliacao) {
        String oldMesAnoConciliacao = this.mesAnoConciliacao;
        this.mesAnoConciliacao = mesAnoConciliacao;
        changeSupport.firePropertyChange("mesAnoConciliacao", oldMesAnoConciliacao, mesAnoConciliacao);
    }

    public String getHistoricoConciliacao() {
        return historicoConciliacao;
    }

    public void setHistoricoConciliacao(String historicoConciliacao) {
        String oldHistoricoConciliacao = this.historicoConciliacao;
        this.historicoConciliacao = historicoConciliacao;
        changeSupport.firePropertyChange("historicoConciliacao", oldHistoricoConciliacao, historicoConciliacao);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codConciliacao != null ? codConciliacao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Conciliacao)) {
            return false;
        }
        Conciliacao other = (Conciliacao) object;
        if ((this.codConciliacao == null && other.codConciliacao != null) || (this.codConciliacao != null && !this.codConciliacao.equals(other.codConciliacao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.siscom.beans.Conciliacao[ codConciliacao=" + codConciliacao + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
