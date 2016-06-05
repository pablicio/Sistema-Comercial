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
@Table(name = "movimento", catalog = "siscomrefatorado", schema = "")
@NamedQueries({
    @NamedQuery(name = "Movimento.findAll", query = "SELECT m FROM Movimento m"),
    @NamedQuery(name = "Movimento.findByCodMovimento", query = "SELECT m FROM Movimento m WHERE m.codMovimento = :codMovimento"),
    @NamedQuery(name = "Movimento.findByCodPlanoConta", query = "SELECT m FROM Movimento m WHERE m.codPlanoConta = :codPlanoConta"),
    @NamedQuery(name = "Movimento.findByMesAnoMovimento", query = "SELECT m FROM Movimento m WHERE m.mesAnoMovimento = :mesAnoMovimento"),
    @NamedQuery(name = "Movimento.findByNumChequeMovimento", query = "SELECT m FROM Movimento m WHERE m.numChequeMovimento = :numChequeMovimento"),
    @NamedQuery(name = "Movimento.findByNumDocMovimento", query = "SELECT m FROM Movimento m WHERE m.numDocMovimento = :numDocMovimento"),
    @NamedQuery(name = "Movimento.findByDataChequeMovimento", query = "SELECT m FROM Movimento m WHERE m.dataChequeMovimento = :dataChequeMovimento"),
    @NamedQuery(name = "Movimento.findByDataLancamentoMovimento", query = "SELECT m FROM Movimento m WHERE m.dataLancamentoMovimento = :dataLancamentoMovimento"),
    @NamedQuery(name = "Movimento.findByHistoricoMovimento", query = "SELECT m FROM Movimento m WHERE m.historicoMovimento = :historicoMovimento"),
    @NamedQuery(name = "Movimento.findByVlrDocMovimento", query = "SELECT m FROM Movimento m WHERE m.vlrDocMovimento = :vlrDocMovimento")})
public class Movimento implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COD_MOVIMENTO")
    private Integer codMovimento;
    @Column(name = "COD_PLANO_CONTA")
    private Integer codPlanoConta;
    @Column(name = "MES_ANO_MOVIMENTO")
    private String mesAnoMovimento;
    @Column(name = "NUM_CHEQUE_MOVIMENTO")
    private Integer numChequeMovimento;
    @Column(name = "NUM_DOC_MOVIMENTO")
    private String numDocMovimento;
    @Column(name = "DATA_CHEQUE_MOVIMENTO")
    @Temporal(TemporalType.DATE)
    private Date dataChequeMovimento;
    @Column(name = "DATA_LANCAMENTO_MOVIMENTO")
    @Temporal(TemporalType.DATE)
    private Date dataLancamentoMovimento;
    @Column(name = "HISTORICO_MOVIMENTO")
    private String historicoMovimento;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VLR_DOC_MOVIMENTO")
    private Double vlrDocMovimento;

    public Movimento() {
    }

    public Movimento(Integer codMovimento) {
        this.codMovimento = codMovimento;
    }

    public Integer getCodMovimento() {
        return codMovimento;
    }

    public void setCodMovimento(Integer codMovimento) {
        Integer oldCodMovimento = this.codMovimento;
        this.codMovimento = codMovimento;
        changeSupport.firePropertyChange("codMovimento", oldCodMovimento, codMovimento);
    }

    public Integer getCodPlanoConta() {
        return codPlanoConta;
    }

    public void setCodPlanoConta(Integer codPlanoConta) {
        Integer oldCodPlanoConta = this.codPlanoConta;
        this.codPlanoConta = codPlanoConta;
        changeSupport.firePropertyChange("codPlanoConta", oldCodPlanoConta, codPlanoConta);
    }

    public String getMesAnoMovimento() {
        return mesAnoMovimento;
    }

    public void setMesAnoMovimento(String mesAnoMovimento) {
        String oldMesAnoMovimento = this.mesAnoMovimento;
        this.mesAnoMovimento = mesAnoMovimento;
        changeSupport.firePropertyChange("mesAnoMovimento", oldMesAnoMovimento, mesAnoMovimento);
    }

    public Integer getNumChequeMovimento() {
        return numChequeMovimento;
    }

    public void setNumChequeMovimento(Integer numChequeMovimento) {
        Integer oldNumChequeMovimento = this.numChequeMovimento;
        this.numChequeMovimento = numChequeMovimento;
        changeSupport.firePropertyChange("numChequeMovimento", oldNumChequeMovimento, numChequeMovimento);
    }

    public String getNumDocMovimento() {
        return numDocMovimento;
    }

    public void setNumDocMovimento(String numDocMovimento) {
        String oldNumDocMovimento = this.numDocMovimento;
        this.numDocMovimento = numDocMovimento;
        changeSupport.firePropertyChange("numDocMovimento", oldNumDocMovimento, numDocMovimento);
    }

    public Date getDataChequeMovimento() {
        return dataChequeMovimento;
    }

    public void setDataChequeMovimento(Date dataChequeMovimento) {
        Date oldDataChequeMovimento = this.dataChequeMovimento;
        this.dataChequeMovimento = dataChequeMovimento;
        changeSupport.firePropertyChange("dataChequeMovimento", oldDataChequeMovimento, dataChequeMovimento);
    }

    public Date getDataLancamentoMovimento() {
        return dataLancamentoMovimento;
    }

    public void setDataLancamentoMovimento(Date dataLancamentoMovimento) {
        Date oldDataLancamentoMovimento = this.dataLancamentoMovimento;
        this.dataLancamentoMovimento = dataLancamentoMovimento;
        changeSupport.firePropertyChange("dataLancamentoMovimento", oldDataLancamentoMovimento, dataLancamentoMovimento);
    }

    public String getHistoricoMovimento() {
        return historicoMovimento;
    }

    public void setHistoricoMovimento(String historicoMovimento) {
        String oldHistoricoMovimento = this.historicoMovimento;
        this.historicoMovimento = historicoMovimento;
        changeSupport.firePropertyChange("historicoMovimento", oldHistoricoMovimento, historicoMovimento);
    }

    public Double getVlrDocMovimento() {
        return vlrDocMovimento;
    }

    public void setVlrDocMovimento(Double vlrDocMovimento) {
        Double oldVlrDocMovimento = this.vlrDocMovimento;
        this.vlrDocMovimento = vlrDocMovimento;
        changeSupport.firePropertyChange("vlrDocMovimento", oldVlrDocMovimento, vlrDocMovimento);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codMovimento != null ? codMovimento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movimento)) {
            return false;
        }
        Movimento other = (Movimento) object;
        if ((this.codMovimento == null && other.codMovimento != null) || (this.codMovimento != null && !this.codMovimento.equals(other.codMovimento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.siscom.beans.Movimento[ codMovimento=" + codMovimento + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
