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
@Table(name = "fornecedores", catalog = "siscomrefatorado", schema = "")
@NamedQueries({
    @NamedQuery(name = "Fornecedores.findAll", query = "SELECT f FROM Fornecedores f"),
    @NamedQuery(name = "Fornecedores.findByCodFornecedor", query = "SELECT f FROM Fornecedores f WHERE f.codFornecedor = :codFornecedor"),
    @NamedQuery(name = "Fornecedores.findByNomeFornecedor", query = "SELECT f FROM Fornecedores f WHERE f.nomeFornecedor = :nomeFornecedor"),
    @NamedQuery(name = "Fornecedores.findByCpfFornecedor", query = "SELECT f FROM Fornecedores f WHERE f.cpfFornecedor = :cpfFornecedor"),
    @NamedQuery(name = "Fornecedores.findByReFornecedor", query = "SELECT f FROM Fornecedores f WHERE f.reFornecedor = :reFornecedor"),
    @NamedQuery(name = "Fornecedores.findByOrgaoRgFornecedor", query = "SELECT f FROM Fornecedores f WHERE f.orgaoRgFornecedor = :orgaoRgFornecedor"),
    @NamedQuery(name = "Fornecedores.findByCnpjFornecedotipoFornecedorr", query = "SELECT f FROM Fornecedores f WHERE f.cnpjFornecedotipoFornecedorr = :cnpjFornecedotipoFornecedorr"),
    @NamedQuery(name = "Fornecedores.findByTipoFornecedor", query = "SELECT f FROM Fornecedores f WHERE f.tipoFornecedor = :tipoFornecedor"),
    @NamedQuery(name = "Fornecedores.findByEnderecoFornecedor", query = "SELECT f FROM Fornecedores f WHERE f.enderecoFornecedor = :enderecoFornecedor"),
    @NamedQuery(name = "Fornecedores.findByBairroFornecedor", query = "SELECT f FROM Fornecedores f WHERE f.bairroFornecedor = :bairroFornecedor"),
    @NamedQuery(name = "Fornecedores.findByCidadeFornecedor", query = "SELECT f FROM Fornecedores f WHERE f.cidadeFornecedor = :cidadeFornecedor"),
    @NamedQuery(name = "Fornecedores.findByUfFornecedor", query = "SELECT f FROM Fornecedores f WHERE f.ufFornecedor = :ufFornecedor"),
    @NamedQuery(name = "Fornecedores.findByCepFornecedor", query = "SELECT f FROM Fornecedores f WHERE f.cepFornecedor = :cepFornecedor"),
    @NamedQuery(name = "Fornecedores.findByEmailFornecedor", query = "SELECT f FROM Fornecedores f WHERE f.emailFornecedor = :emailFornecedor"),
    @NamedQuery(name = "Fornecedores.findBySiteFornecedor", query = "SELECT f FROM Fornecedores f WHERE f.siteFornecedor = :siteFornecedor"),
    @NamedQuery(name = "Fornecedores.findByFoneFornecedor", query = "SELECT f FROM Fornecedores f WHERE f.foneFornecedor = :foneFornecedor"),
    @NamedQuery(name = "Fornecedores.findByCelularFornecedor", query = "SELECT f FROM Fornecedores f WHERE f.celularFornecedor = :celularFornecedor"),
    @NamedQuery(name = "Fornecedores.findByFaxFornecedor", query = "SELECT f FROM Fornecedores f WHERE f.faxFornecedor = :faxFornecedor"),
    @NamedQuery(name = "Fornecedores.findByContatoFornecedor", query = "SELECT f FROM Fornecedores f WHERE f.contatoFornecedor = :contatoFornecedor")})
public class Fornecedores implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COD_FORNECEDOR")
    private Integer codFornecedor;
    @Column(name = "NOME_FORNECEDOR")
    private String nomeFornecedor;
    @Column(name = "CPF_FORNECEDOR")
    private String cpfFornecedor;
    @Column(name = "RE_FORNECEDOR")
    private String reFornecedor;
    @Column(name = "ORGAO_RG_FORNECEDOR")
    private String orgaoRgFornecedor;
    @Column(name = "CNPJ_FORNECEDOTIPO_FORNECEDORR")
    private String cnpjFornecedotipoFornecedorr;
    @Column(name = "TIPO_FORNECEDOR")
    private Character tipoFornecedor;
    @Column(name = "ENDERECO_FORNECEDOR")
    private String enderecoFornecedor;
    @Column(name = "BAIRRO_FORNECEDOR")
    private String bairroFornecedor;
    @Column(name = "CIDADE_FORNECEDOR")
    private String cidadeFornecedor;
    @Column(name = "UF_FORNECEDOR")
    private String ufFornecedor;
    @Column(name = "CEP_FORNECEDOR")
    private String cepFornecedor;
    @Column(name = "EMAIL_FORNECEDOR")
    private String emailFornecedor;
    @Column(name = "SITE_FORNECEDOR")
    private String siteFornecedor;
    @Column(name = "FONE_FORNECEDOR")
    private String foneFornecedor;
    @Column(name = "CELULAR_FORNECEDOR")
    private String celularFornecedor;
    @Column(name = "FAX_FORNECEDOR")
    private String faxFornecedor;
    @Column(name = "CONTATO_FORNECEDOR")
    private String contatoFornecedor;

    public Fornecedores() {
    }

    public Fornecedores(Integer codFornecedor) {
        this.codFornecedor = codFornecedor;
    }

    public Integer getCodFornecedor() {
        return codFornecedor;
    }

    public void setCodFornecedor(Integer codFornecedor) {
        Integer oldCodFornecedor = this.codFornecedor;
        this.codFornecedor = codFornecedor;
        changeSupport.firePropertyChange("codFornecedor", oldCodFornecedor, codFornecedor);
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        String oldNomeFornecedor = this.nomeFornecedor;
        this.nomeFornecedor = nomeFornecedor;
        changeSupport.firePropertyChange("nomeFornecedor", oldNomeFornecedor, nomeFornecedor);
    }

    public String getCpfFornecedor() {
        return cpfFornecedor;
    }

    public void setCpfFornecedor(String cpfFornecedor) {
        String oldCpfFornecedor = this.cpfFornecedor;
        this.cpfFornecedor = cpfFornecedor;
        changeSupport.firePropertyChange("cpfFornecedor", oldCpfFornecedor, cpfFornecedor);
    }

    public String getReFornecedor() {
        return reFornecedor;
    }

    public void setReFornecedor(String reFornecedor) {
        String oldReFornecedor = this.reFornecedor;
        this.reFornecedor = reFornecedor;
        changeSupport.firePropertyChange("reFornecedor", oldReFornecedor, reFornecedor);
    }

    public String getOrgaoRgFornecedor() {
        return orgaoRgFornecedor;
    }

    public void setOrgaoRgFornecedor(String orgaoRgFornecedor) {
        String oldOrgaoRgFornecedor = this.orgaoRgFornecedor;
        this.orgaoRgFornecedor = orgaoRgFornecedor;
        changeSupport.firePropertyChange("orgaoRgFornecedor", oldOrgaoRgFornecedor, orgaoRgFornecedor);
    }

    public String getCnpjFornecedotipoFornecedorr() {
        return cnpjFornecedotipoFornecedorr;
    }

    public void setCnpjFornecedotipoFornecedorr(String cnpjFornecedotipoFornecedorr) {
        String oldCnpjFornecedotipoFornecedorr = this.cnpjFornecedotipoFornecedorr;
        this.cnpjFornecedotipoFornecedorr = cnpjFornecedotipoFornecedorr;
        changeSupport.firePropertyChange("cnpjFornecedotipoFornecedorr", oldCnpjFornecedotipoFornecedorr, cnpjFornecedotipoFornecedorr);
    }

    public Character getTipoFornecedor() {
        return tipoFornecedor;
    }

    public void setTipoFornecedor(Character tipoFornecedor) {
        Character oldTipoFornecedor = this.tipoFornecedor;
        this.tipoFornecedor = tipoFornecedor;
        changeSupport.firePropertyChange("tipoFornecedor", oldTipoFornecedor, tipoFornecedor);
    }

    public String getEnderecoFornecedor() {
        return enderecoFornecedor;
    }

    public void setEnderecoFornecedor(String enderecoFornecedor) {
        String oldEnderecoFornecedor = this.enderecoFornecedor;
        this.enderecoFornecedor = enderecoFornecedor;
        changeSupport.firePropertyChange("enderecoFornecedor", oldEnderecoFornecedor, enderecoFornecedor);
    }

    public String getBairroFornecedor() {
        return bairroFornecedor;
    }

    public void setBairroFornecedor(String bairroFornecedor) {
        String oldBairroFornecedor = this.bairroFornecedor;
        this.bairroFornecedor = bairroFornecedor;
        changeSupport.firePropertyChange("bairroFornecedor", oldBairroFornecedor, bairroFornecedor);
    }

    public String getCidadeFornecedor() {
        return cidadeFornecedor;
    }

    public void setCidadeFornecedor(String cidadeFornecedor) {
        String oldCidadeFornecedor = this.cidadeFornecedor;
        this.cidadeFornecedor = cidadeFornecedor;
        changeSupport.firePropertyChange("cidadeFornecedor", oldCidadeFornecedor, cidadeFornecedor);
    }

    public String getUfFornecedor() {
        return ufFornecedor;
    }

    public void setUfFornecedor(String ufFornecedor) {
        String oldUfFornecedor = this.ufFornecedor;
        this.ufFornecedor = ufFornecedor;
        changeSupport.firePropertyChange("ufFornecedor", oldUfFornecedor, ufFornecedor);
    }

    public String getCepFornecedor() {
        return cepFornecedor;
    }

    public void setCepFornecedor(String cepFornecedor) {
        String oldCepFornecedor = this.cepFornecedor;
        this.cepFornecedor = cepFornecedor;
        changeSupport.firePropertyChange("cepFornecedor", oldCepFornecedor, cepFornecedor);
    }

    public String getEmailFornecedor() {
        return emailFornecedor;
    }

    public void setEmailFornecedor(String emailFornecedor) {
        String oldEmailFornecedor = this.emailFornecedor;
        this.emailFornecedor = emailFornecedor;
        changeSupport.firePropertyChange("emailFornecedor", oldEmailFornecedor, emailFornecedor);
    }

    public String getSiteFornecedor() {
        return siteFornecedor;
    }

    public void setSiteFornecedor(String siteFornecedor) {
        String oldSiteFornecedor = this.siteFornecedor;
        this.siteFornecedor = siteFornecedor;
        changeSupport.firePropertyChange("siteFornecedor", oldSiteFornecedor, siteFornecedor);
    }

    public String getFoneFornecedor() {
        return foneFornecedor;
    }

    public void setFoneFornecedor(String foneFornecedor) {
        String oldFoneFornecedor = this.foneFornecedor;
        this.foneFornecedor = foneFornecedor;
        changeSupport.firePropertyChange("foneFornecedor", oldFoneFornecedor, foneFornecedor);
    }

    public String getCelularFornecedor() {
        return celularFornecedor;
    }

    public void setCelularFornecedor(String celularFornecedor) {
        String oldCelularFornecedor = this.celularFornecedor;
        this.celularFornecedor = celularFornecedor;
        changeSupport.firePropertyChange("celularFornecedor", oldCelularFornecedor, celularFornecedor);
    }

    public String getFaxFornecedor() {
        return faxFornecedor;
    }

    public void setFaxFornecedor(String faxFornecedor) {
        String oldFaxFornecedor = this.faxFornecedor;
        this.faxFornecedor = faxFornecedor;
        changeSupport.firePropertyChange("faxFornecedor", oldFaxFornecedor, faxFornecedor);
    }

    public String getContatoFornecedor() {
        return contatoFornecedor;
    }

    public void setContatoFornecedor(String contatoFornecedor) {
        String oldContatoFornecedor = this.contatoFornecedor;
        this.contatoFornecedor = contatoFornecedor;
        changeSupport.firePropertyChange("contatoFornecedor", oldContatoFornecedor, contatoFornecedor);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codFornecedor != null ? codFornecedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fornecedores)) {
            return false;
        }
        Fornecedores other = (Fornecedores) object;
        if ((this.codFornecedor == null && other.codFornecedor != null) || (this.codFornecedor != null && !this.codFornecedor.equals(other.codFornecedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.siscom.beans.Fornecedores[ codFornecedor=" + codFornecedor + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
