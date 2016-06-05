/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siscom.beans;

import br.com.siscom.beans.ClienteEndereco;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author pablicio
 */
@Entity
@Table(name = "cliente", catalog = "siscomrefatorado", schema = "")
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByCodCliente", query = "SELECT c FROM Cliente c WHERE c.codCliente = :codCliente"),
    @NamedQuery(name = "Cliente.findByNomeCliente", query = "SELECT c FROM Cliente c WHERE c.nomeCliente = :nomeCliente"),
    @NamedQuery(name = "Cliente.findByCpfCliente", query = "SELECT c FROM Cliente c WHERE c.cpfCliente = :cpfCliente"),
    @NamedQuery(name = "Cliente.findByRgCliente", query = "SELECT c FROM Cliente c WHERE c.rgCliente = :rgCliente"),
    @NamedQuery(name = "Cliente.findByOrgaoRgCliente", query = "SELECT c FROM Cliente c WHERE c.orgaoRgCliente = :orgaoRgCliente"),
    @NamedQuery(name = "Cliente.findByNascimentorgCliente", query = "SELECT c FROM Cliente c WHERE c.nascimentorgCliente = :nascimentorgCliente"),
    @NamedQuery(name = "Cliente.findByDesdeCliente", query = "SELECT c FROM Cliente c WHERE c.desdeCliente = :desdeCliente"),
    @NamedQuery(name = "Cliente.findByProfissaoCliente", query = "SELECT c FROM Cliente c WHERE c.profissaoCliente = :profissaoCliente"),
    @NamedQuery(name = "Cliente.findByEmpresaCliente", query = "SELECT c FROM Cliente c WHERE c.empresaCliente = :empresaCliente"),
    @NamedQuery(name = "Cliente.findByFoneEmpresaCliente", query = "SELECT c FROM Cliente c WHERE c.foneEmpresaCliente = :foneEmpresaCliente"),
    @NamedQuery(name = "Cliente.findByRendaCliente", query = "SELECT c FROM Cliente c WHERE c.rendaCliente = :rendaCliente"),
    @NamedQuery(name = "Cliente.findByTipoCliente", query = "SELECT c FROM Cliente c WHERE c.tipoCliente = :tipoCliente"),
    @NamedQuery(name = "Cliente.findByCnpjCliente", query = "SELECT c FROM Cliente c WHERE c.cnpjCliente = :cnpjCliente"),
    @NamedQuery(name = "Cliente.findByReferenciaCliente", query = "SELECT c FROM Cliente c WHERE c.referenciaCliente = :referenciaCliente"),
    @NamedQuery(name = "Cliente.findByFoneReferenciaCliente", query = "SELECT c FROM Cliente c WHERE c.foneReferenciaCliente = :foneReferenciaCliente"),
    @NamedQuery(name = "Cliente.findByEmail", query = "SELECT c FROM Cliente c WHERE c.email = :email")})
public class Cliente implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COD_CLIENTE")
    private Integer codCliente;
    @Column(name = "NOME_CLIENTE")
    private String nomeCliente;
    @Column(name = "CPF_CLIENTE")
    private String cpfCliente;
    @Column(name = "RG_CLIENTE")
    private String rgCliente;
    @Column(name = "ORGAO_RG_CLIENTE")
    private String orgaoRgCliente;
    @Column(name = "NASCIMENTORG_CLIENTE")
    @Temporal(TemporalType.DATE)
    private Date nascimentorgCliente;
    @Column(name = "DESDE_CLIENTE")
    @Temporal(TemporalType.DATE)
    private Date desdeCliente;
    @Column(name = "PROFISSAO_CLIENTE")
    private String profissaoCliente;
    @Column(name = "EMPRESA_CLIENTE")
    private String empresaCliente;
    @Column(name = "FONE_EMPRESA_CLIENTE")
    private String foneEmpresaCliente;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "RENDA_CLIENTE")
    private Double rendaCliente;
    @Column(name = "TIPO_CLIENTE")
    private Character tipoCliente;
    @Column(name = "CNPJ_CLIENTE")
    private String cnpjCliente;
    @Column(name = "REFERENCIA_CLIENTE")
    private String referenciaCliente;
    @Column(name = "FONE_REFERENCIA_CLIENTE")
    private String foneReferenciaCliente;
    @Column(name = "EMAIL")
    private String email;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "cliente")
    private ClienteEndereco clienteEndereco;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codCliente2")
    private Collection<ClienteEndereco> clienteEnderecoCollection;

    public Cliente() {
    }

    public Cliente(Integer codCliente) {
        this.codCliente = codCliente;
    }

    public Integer getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Integer codCliente) {
        Integer oldCodCliente = this.codCliente;
        this.codCliente = codCliente;
        changeSupport.firePropertyChange("codCliente", oldCodCliente, codCliente);
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        String oldNomeCliente = this.nomeCliente;
        this.nomeCliente = nomeCliente;
        changeSupport.firePropertyChange("nomeCliente", oldNomeCliente, nomeCliente);
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        String oldCpfCliente = this.cpfCliente;
        this.cpfCliente = cpfCliente;
        changeSupport.firePropertyChange("cpfCliente", oldCpfCliente, cpfCliente);
    }

    public String getRgCliente() {
        return rgCliente;
    }

    public void setRgCliente(String rgCliente) {
        String oldRgCliente = this.rgCliente;
        this.rgCliente = rgCliente;
        changeSupport.firePropertyChange("rgCliente", oldRgCliente, rgCliente);
    }

    public String getOrgaoRgCliente() {
        return orgaoRgCliente;
    }

    public void setOrgaoRgCliente(String orgaoRgCliente) {
        String oldOrgaoRgCliente = this.orgaoRgCliente;
        this.orgaoRgCliente = orgaoRgCliente;
        changeSupport.firePropertyChange("orgaoRgCliente", oldOrgaoRgCliente, orgaoRgCliente);
    }

    public Date getNascimentorgCliente() {
        return nascimentorgCliente;
    }

    public void setNascimentorgCliente(Date nascimentorgCliente) {
        Date oldNascimentorgCliente = this.nascimentorgCliente;
        this.nascimentorgCliente = nascimentorgCliente;
        changeSupport.firePropertyChange("nascimentorgCliente", oldNascimentorgCliente, nascimentorgCliente);
    }

    public Date getDesdeCliente() {
        return desdeCliente;
    }

    public void setDesdeCliente(Date desdeCliente) {
        Date oldDesdeCliente = this.desdeCliente;
        this.desdeCliente = desdeCliente;
        changeSupport.firePropertyChange("desdeCliente", oldDesdeCliente, desdeCliente);
    }

    public String getProfissaoCliente() {
        return profissaoCliente;
    }

    public void setProfissaoCliente(String profissaoCliente) {
        String oldProfissaoCliente = this.profissaoCliente;
        this.profissaoCliente = profissaoCliente;
        changeSupport.firePropertyChange("profissaoCliente", oldProfissaoCliente, profissaoCliente);
    }

    public String getEmpresaCliente() {
        return empresaCliente;
    }

    public void setEmpresaCliente(String empresaCliente) {
        String oldEmpresaCliente = this.empresaCliente;
        this.empresaCliente = empresaCliente;
        changeSupport.firePropertyChange("empresaCliente", oldEmpresaCliente, empresaCliente);
    }

    public String getFoneEmpresaCliente() {
        return foneEmpresaCliente;
    }

    public void setFoneEmpresaCliente(String foneEmpresaCliente) {
        String oldFoneEmpresaCliente = this.foneEmpresaCliente;
        this.foneEmpresaCliente = foneEmpresaCliente;
        changeSupport.firePropertyChange("foneEmpresaCliente", oldFoneEmpresaCliente, foneEmpresaCliente);
    }

    public Double getRendaCliente() {
        return rendaCliente;
    }

    public void setRendaCliente(Double rendaCliente) {
        Double oldRendaCliente = this.rendaCliente;
        this.rendaCliente = rendaCliente;
        changeSupport.firePropertyChange("rendaCliente", oldRendaCliente, rendaCliente);
    }

    public Character getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(Character tipoCliente) {
        Character oldTipoCliente = this.tipoCliente;
        this.tipoCliente = tipoCliente;
        changeSupport.firePropertyChange("tipoCliente", oldTipoCliente, tipoCliente);
    }

    public String getCnpjCliente() {
        return cnpjCliente;
    }

    public void setCnpjCliente(String cnpjCliente) {
        String oldCnpjCliente = this.cnpjCliente;
        this.cnpjCliente = cnpjCliente;
        changeSupport.firePropertyChange("cnpjCliente", oldCnpjCliente, cnpjCliente);
    }

    public String getReferenciaCliente() {
        return referenciaCliente;
    }

    public void setReferenciaCliente(String referenciaCliente) {
        String oldReferenciaCliente = this.referenciaCliente;
        this.referenciaCliente = referenciaCliente;
        changeSupport.firePropertyChange("referenciaCliente", oldReferenciaCliente, referenciaCliente);
    }

    public String getFoneReferenciaCliente() {
        return foneReferenciaCliente;
    }

    public void setFoneReferenciaCliente(String foneReferenciaCliente) {
        String oldFoneReferenciaCliente = this.foneReferenciaCliente;
        this.foneReferenciaCliente = foneReferenciaCliente;
        changeSupport.firePropertyChange("foneReferenciaCliente", oldFoneReferenciaCliente, foneReferenciaCliente);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public ClienteEndereco getClienteEndereco() {
        return clienteEndereco;
    }

    public void setClienteEndereco(ClienteEndereco clienteEndereco) {
        this.clienteEndereco = clienteEndereco;
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
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.codCliente == null && other.codCliente != null) || (this.codCliente != null && !this.codCliente.equals(other.codCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.siscom.beans.Cliente[ codCliente=" + codCliente + " ]";
    }

    public Collection<ClienteEndereco> getClienteEnderecoCollection() {
        return clienteEnderecoCollection;
    }

    public void setClienteEnderecoCollection(Collection<ClienteEndereco> clienteEnderecoCollection) {
        this.clienteEnderecoCollection = clienteEnderecoCollection;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
