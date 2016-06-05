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
@Table(name = "nfe_cab", catalog = "siscomrefatorado", schema = "")
@NamedQueries({
    @NamedQuery(name = "NfeCab.findAll", query = "SELECT n FROM NfeCab n"),
    @NamedQuery(name = "NfeCab.findByNumNfeCab", query = "SELECT n FROM NfeCab n WHERE n.numNfeCab = :numNfeCab"),
    @NamedQuery(name = "NfeCab.findByCodCfop", query = "SELECT n FROM NfeCab n WHERE n.codCfop = :codCfop"),
    @NamedQuery(name = "NfeCab.findByCodFornecedor", query = "SELECT n FROM NfeCab n WHERE n.codFornecedor = :codFornecedor"),
    @NamedQuery(name = "NfeCab.findByEmissaoNfeCab", query = "SELECT n FROM NfeCab n WHERE n.emissaoNfeCab = :emissaoNfeCab"),
    @NamedQuery(name = "NfeCab.findByEntradaNfeCab", query = "SELECT n FROM NfeCab n WHERE n.entradaNfeCab = :entradaNfeCab"),
    @NamedQuery(name = "NfeCab.findByTotalNfeCab", query = "SELECT n FROM NfeCab n WHERE n.totalNfeCab = :totalNfeCab")})
public class NfeCab implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUM_NFE_CAB")
    private Integer numNfeCab;
    @Basic(optional = false)
    @Column(name = "COD_CFOP")
    private int codCfop;
    @Basic(optional = false)
    @Column(name = "COD_FORNECEDOR")
    private int codFornecedor;
    @Column(name = "EMISSAO_NFE_CAB")
    @Temporal(TemporalType.DATE)
    private Date emissaoNfeCab;
    @Column(name = "ENTRADA_NFE_CAB")
    @Temporal(TemporalType.DATE)
    private Date entradaNfeCab;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOTAL_NFE_CAB")
    private Double totalNfeCab;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nfeCab")
    private List<NfeDet> nfeDetList;

    public NfeCab() {
    }

    public NfeCab(Integer numNfeCab) {
        this.numNfeCab = numNfeCab;
    }

    public NfeCab(Integer numNfeCab, int codCfop, int codFornecedor) {
        this.numNfeCab = numNfeCab;
        this.codCfop = codCfop;
        this.codFornecedor = codFornecedor;
    }

    public Integer getNumNfeCab() {
        return numNfeCab;
    }

    public void setNumNfeCab(Integer numNfeCab) {
        Integer oldNumNfeCab = this.numNfeCab;
        this.numNfeCab = numNfeCab;
        changeSupport.firePropertyChange("numNfeCab", oldNumNfeCab, numNfeCab);
    }

    public int getCodCfop() {
        return codCfop;
    }

    public void setCodCfop(int codCfop) {
        int oldCodCfop = this.codCfop;
        this.codCfop = codCfop;
        changeSupport.firePropertyChange("codCfop", oldCodCfop, codCfop);
    }

    public int getCodFornecedor() {
        return codFornecedor;
    }

    public void setCodFornecedor(int codFornecedor) {
        int oldCodFornecedor = this.codFornecedor;
        this.codFornecedor = codFornecedor;
        changeSupport.firePropertyChange("codFornecedor", oldCodFornecedor, codFornecedor);
    }

    public Date getEmissaoNfeCab() {
        return emissaoNfeCab;
    }

    public void setEmissaoNfeCab(Date emissaoNfeCab) {
        Date oldEmissaoNfeCab = this.emissaoNfeCab;
        this.emissaoNfeCab = emissaoNfeCab;
        changeSupport.firePropertyChange("emissaoNfeCab", oldEmissaoNfeCab, emissaoNfeCab);
    }

    public Date getEntradaNfeCab() {
        return entradaNfeCab;
    }

    public void setEntradaNfeCab(Date entradaNfeCab) {
        Date oldEntradaNfeCab = this.entradaNfeCab;
        this.entradaNfeCab = entradaNfeCab;
        changeSupport.firePropertyChange("entradaNfeCab", oldEntradaNfeCab, entradaNfeCab);
    }

    public Double getTotalNfeCab() {
        return totalNfeCab;
    }

    public void setTotalNfeCab(Double totalNfeCab) {
        Double oldTotalNfeCab = this.totalNfeCab;
        this.totalNfeCab = totalNfeCab;
        changeSupport.firePropertyChange("totalNfeCab", oldTotalNfeCab, totalNfeCab);
    }

    public List<NfeDet> getNfeDetList() {
        return nfeDetList;
    }

    public void setNfeDetList(List<NfeDet> nfeDetList) {
        this.nfeDetList = nfeDetList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numNfeCab != null ? numNfeCab.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NfeCab)) {
            return false;
        }
        NfeCab other = (NfeCab) object;
        if ((this.numNfeCab == null && other.numNfeCab != null) || (this.numNfeCab != null && !this.numNfeCab.equals(other.numNfeCab))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.siscom.beans.estoque.NfeCab[ numNfeCab=" + numNfeCab + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
