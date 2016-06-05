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
@Table(name = "cot_det", catalog = "siscomrefatorado", schema = "")
@NamedQueries({
    @NamedQuery(name = "CotDet.findAll", query = "SELECT c FROM CotDet c"),
    @NamedQuery(name = "CotDet.findByQtdeCotDet", query = "SELECT c FROM CotDet c WHERE c.cotDetPK.qtdeCotDet = :qtdeCotDet"),
    @NamedQuery(name = "CotDet.findByCodReqCab", query = "SELECT c FROM CotDet c WHERE c.codReqCab = :codReqCab"),
    @NamedQuery(name = "CotDet.findByCodProduto", query = "SELECT c FROM CotDet c WHERE c.cotDetPK.codProduto = :codProduto"),
    @NamedQuery(name = "CotDet.findByCodCotCab", query = "SELECT c FROM CotDet c WHERE c.cotDetPK.codCotCab = :codCotCab"),
    @NamedQuery(name = "CotDet.findByUnit1", query = "SELECT c FROM CotDet c WHERE c.unit1 = :unit1"),
    @NamedQuery(name = "CotDet.findByUnit2", query = "SELECT c FROM CotDet c WHERE c.unit2 = :unit2"),
    @NamedQuery(name = "CotDet.findByUnit3", query = "SELECT c FROM CotDet c WHERE c.unit3 = :unit3"),
    @NamedQuery(name = "CotDet.findByUnit4", query = "SELECT c FROM CotDet c WHERE c.unit4 = :unit4"),
    @NamedQuery(name = "CotDet.findByUnit5", query = "SELECT c FROM CotDet c WHERE c.unit5 = :unit5"),
    @NamedQuery(name = "CotDet.findByTotal1", query = "SELECT c FROM CotDet c WHERE c.total1 = :total1"),
    @NamedQuery(name = "CotDet.findByTotal2", query = "SELECT c FROM CotDet c WHERE c.total2 = :total2"),
    @NamedQuery(name = "CotDet.findByTotal3", query = "SELECT c FROM CotDet c WHERE c.total3 = :total3"),
    @NamedQuery(name = "CotDet.findByTotal4", query = "SELECT c FROM CotDet c WHERE c.total4 = :total4"),
    @NamedQuery(name = "CotDet.findByTotal5", query = "SELECT c FROM CotDet c WHERE c.total5 = :total5")})
public class CotDet implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CotDetPK cotDetPK;
    @Basic(optional = false)
    @Column(name = "COD_REQ_CAB")
    private int codReqCab;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "UNIT1")
    private Double unit1;
    @Column(name = "UNIT2")
    private Double unit2;
    @Column(name = "UNIT3")
    private Double unit3;
    @Column(name = "UNIT4")
    private Double unit4;
    @Column(name = "UNIT5")
    private Double unit5;
    @Column(name = "TOTAL1")
    private Double total1;
    @Column(name = "TOTAL2")
    private Double total2;
    @Column(name = "TOTAL3")
    private Double total3;
    @Column(name = "TOTAL4")
    private Double total4;
    @Column(name = "TOTAL5")
    private Double total5;
    @JoinColumn(name = "COD_COT_CAB", referencedColumnName = "COD_COT_CAB", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private CotCab cotCab;
    
    
   
     @Transient
    private int quantidadeReq;
    
       public int getQuantidadeReq() {
        return quantidadeReq;
    }

    public void setQuantidadeReq(int q) {
        this.quantidadeReq = q;
    }
    
        @Transient
    private Double vlrTotal;
    
       public Double getVlrTotal() {
        return vlrTotal;
    }

    public void setVlrTotal(Double v) {
        this.vlrTotal = v;
    }


     @Transient
    private String descricaoProduto;
    
     public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String d) {
        this.descricaoProduto = d;
    }


    public CotDet() {
    }

    public CotDet(CotDetPK cotDetPK) {
        this.cotDetPK = cotDetPK;
    }

    public CotDet(CotDetPK cotDetPK, int codReqCab) {
        this.cotDetPK = cotDetPK;
        this.codReqCab = codReqCab;
    }

    public CotDet(int qtdeCotDet, String codProduto, int codCotCab) {
        this.cotDetPK = new CotDetPK(qtdeCotDet, codProduto, codCotCab);
    }

    public CotDetPK getCotDetPK() {
        return cotDetPK;
    }

    public void setCotDetPK(CotDetPK cotDetPK) {
        this.cotDetPK = cotDetPK;
    }

    public int getCodReqCab() {
        return codReqCab;
    }

    public void setCodReqCab(int codReqCab) {
        int oldCodReqCab = this.codReqCab;
        this.codReqCab = codReqCab;
        changeSupport.firePropertyChange("codReqCab", oldCodReqCab, codReqCab);
    }

    public Double getUnit1() {
        return unit1;
    }

    public void setUnit1(Double unit1) {
        Double oldUnit1 = this.unit1;
        this.unit1 = unit1;
        changeSupport.firePropertyChange("unit1", oldUnit1, unit1);
    }

    public Double getUnit2() {
        return unit2;
    }

    public void setUnit2(Double unit2) {
        Double oldUnit2 = this.unit2;
        this.unit2 = unit2;
        changeSupport.firePropertyChange("unit2", oldUnit2, unit2);
    }

    public Double getUnit3() {
        return unit3;
    }

    public void setUnit3(Double unit3) {
        Double oldUnit3 = this.unit3;
        this.unit3 = unit3;
        changeSupport.firePropertyChange("unit3", oldUnit3, unit3);
    }

    public Double getUnit4() {
        return unit4;
    }

    public void setUnit4(Double unit4) {
        Double oldUnit4 = this.unit4;
        this.unit4 = unit4;
        changeSupport.firePropertyChange("unit4", oldUnit4, unit4);
    }

    public Double getUnit5() {
        return unit5;
    }

    public void setUnit5(Double unit5) {
        Double oldUnit5 = this.unit5;
        this.unit5 = unit5;
        changeSupport.firePropertyChange("unit5", oldUnit5, unit5);
    }

    public Double getTotal1() {
        return total1;
    }

    public void setTotal1(Double total1) {
        Double oldTotal1 = this.total1;
        this.total1 = total1;
        changeSupport.firePropertyChange("total1", oldTotal1, total1);
    }

    public Double getTotal2() {
        return total2;
    }

    public void setTotal2(Double total2) {
        Double oldTotal2 = this.total2;
        this.total2 = total2;
        changeSupport.firePropertyChange("total2", oldTotal2, total2);
    }

    public Double getTotal3() {
        return total3;
    }

    public void setTotal3(Double total3) {
        Double oldTotal3 = this.total3;
        this.total3 = total3;
        changeSupport.firePropertyChange("total3", oldTotal3, total3);
    }

    public Double getTotal4() {
        return total4;
    }

    public void setTotal4(Double total4) {
        Double oldTotal4 = this.total4;
        this.total4 = total4;
        changeSupport.firePropertyChange("total4", oldTotal4, total4);
    }

    public Double getTotal5() {
        return total5;
    }

    public void setTotal5(Double total5) {
        Double oldTotal5 = this.total5;
        this.total5 = total5;
        changeSupport.firePropertyChange("total5", oldTotal5, total5);
    }

    public CotCab getCotCab() {
        return cotCab;
    }

    public void setCotCab(CotCab cotCab) {
        CotCab oldCotCab = this.cotCab;
        this.cotCab = cotCab;
        changeSupport.firePropertyChange("cotCab", oldCotCab, cotCab);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cotDetPK != null ? cotDetPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CotDet)) {
            return false;
        }
        CotDet other = (CotDet) object;
        if ((this.cotDetPK == null && other.cotDetPK != null) || (this.cotDetPK != null && !this.cotDetPK.equals(other.cotDetPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.siscom.beans.compras.CotDet[ cotDetPK=" + cotDetPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
