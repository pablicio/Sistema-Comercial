/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siscom.beans;

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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author pablicio
 */
@Entity
@Table(name = "funcionario", catalog = "siscomrefatorado", schema = "")
@NamedQueries({
    @NamedQuery(name = "Funcionario.findAll", query = "SELECT f FROM Funcionario f"),
    @NamedQuery(name = "Funcionario.findByCodFuncionario", query = "SELECT f FROM Funcionario f WHERE f.codFuncionario = :codFuncionario"),
    @NamedQuery(name = "Funcionario.findByCodDepartamento", query = "SELECT f FROM Funcionario f WHERE f.codDepartamento = :codDepartamento"),
    @NamedQuery(name = "Funcionario.findByNomeFuncionario", query = "SELECT f FROM Funcionario f WHERE f.nomeFuncionario = :nomeFuncionario"),
    @NamedQuery(name = "Funcionario.findByFuncaoFuncionario", query = "SELECT f FROM Funcionario f WHERE f.funcaoFuncionario = :funcaoFuncionario"),
    @NamedQuery(name = "Funcionario.findByLoginFuncionario", query = "SELECT f FROM Funcionario f WHERE f.loginFuncionario = :loginFuncionario"),
    @NamedQuery(name = "Funcionario.findBySenhaFuncionario", query = "SELECT f FROM Funcionario f WHERE f.senhaFuncionario = :senhaFuncionario"),
    @NamedQuery(name = "Funcionario.findByAdmissaoFuncionario", query = "SELECT f FROM Funcionario f WHERE f.admissaoFuncionario = :admissaoFuncionario"),
    @NamedQuery(name = "Funcionario.findByAcessoTotalFuncionario", query = "SELECT f FROM Funcionario f WHERE f.acessoTotalFuncionario = :acessoTotalFuncionario"),
    @NamedQuery(name = "Funcionario.verificaLogin", query = "SELECT f FROM Funcionario f WHERE f.loginFuncionario = :loginFuncionario and f.senhaFuncionario = :senhaFuncionario")})
public class Funcionario implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COD_FUNCIONARIO")
    private Integer codFuncionario;
    @Basic(optional = false)
    @Column(name = "COD_DEPARTAMENTO")
    private int codDepartamento;
    @Column(name = "NOME_FUNCIONARIO")
    private String nomeFuncionario;
    @Column(name = "FUNCAO_FUNCIONARIO")
    private String funcaoFuncionario;
    @Column(name = "LOGIN_FUNCIONARIO")
    private String loginFuncionario;
    @Column(name = "SENHA_FUNCIONARIO")
    private String senhaFuncionario;
    @Column(name = "ADMISSAO_FUNCIONARIO")
    @Temporal(TemporalType.DATE)
    private Date admissaoFuncionario;
    @Column(name = "ACESSO_TOTAL_FUNCIONARIO")
    private Character acessoTotalFuncionario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codFuncionario2")
    private Collection<NivelAcesso> nivelAcessoCollection;

    public Funcionario() {
    }

    public Funcionario(Integer codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    public Funcionario(Integer codFuncionario, int codDepartamento) {
        this.codFuncionario = codFuncionario;
        this.codDepartamento = codDepartamento;
    }

    public Integer getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(Integer codFuncionario) {
        Integer oldCodFuncionario = this.codFuncionario;
        this.codFuncionario = codFuncionario;
        changeSupport.firePropertyChange("codFuncionario", oldCodFuncionario, codFuncionario);
    }

    public int getCodDepartamento() {
        return codDepartamento;
    }

    public void setCodDepartamento(int codDepartamento) {
        int oldCodDepartamento = this.codDepartamento;
        this.codDepartamento = codDepartamento;
        changeSupport.firePropertyChange("codDepartamento", oldCodDepartamento, codDepartamento);
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        String oldNomeFuncionario = this.nomeFuncionario;
        this.nomeFuncionario = nomeFuncionario;
        changeSupport.firePropertyChange("nomeFuncionario", oldNomeFuncionario, nomeFuncionario);
    }

    public String getFuncaoFuncionario() {
        return funcaoFuncionario;
    }

    public void setFuncaoFuncionario(String funcaoFuncionario) {
        String oldFuncaoFuncionario = this.funcaoFuncionario;
        this.funcaoFuncionario = funcaoFuncionario;
        changeSupport.firePropertyChange("funcaoFuncionario", oldFuncaoFuncionario, funcaoFuncionario);
    }

    public String getLoginFuncionario() {
        return loginFuncionario;
    }

    public void setLoginFuncionario(String loginFuncionario) {
        String oldLoginFuncionario = this.loginFuncionario;
        this.loginFuncionario = loginFuncionario;
        changeSupport.firePropertyChange("loginFuncionario", oldLoginFuncionario, loginFuncionario);
    }

    public String getSenhaFuncionario() {
        return senhaFuncionario;
    }

    public void setSenhaFuncionario(String senhaFuncionario) {
        String oldSenhaFuncionario = this.senhaFuncionario;
        this.senhaFuncionario = senhaFuncionario;
        changeSupport.firePropertyChange("senhaFuncionario", oldSenhaFuncionario, senhaFuncionario);
    }

    public Date getAdmissaoFuncionario() {
        return admissaoFuncionario;
    }

    public void setAdmissaoFuncionario(Date admissaoFuncionario) {
        Date oldAdmissaoFuncionario = this.admissaoFuncionario;
        this.admissaoFuncionario = admissaoFuncionario;
        changeSupport.firePropertyChange("admissaoFuncionario", oldAdmissaoFuncionario, admissaoFuncionario);
    }

    public Character getAcessoTotalFuncionario() {
        return acessoTotalFuncionario;
    }

    public void setAcessoTotalFuncionario(Character acessoTotalFuncionario) {
        Character oldAcessoTotalFuncionario = this.acessoTotalFuncionario;
        this.acessoTotalFuncionario = acessoTotalFuncionario;
        changeSupport.firePropertyChange("acessoTotalFuncionario", oldAcessoTotalFuncionario, acessoTotalFuncionario);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codFuncionario != null ? codFuncionario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Funcionario)) {
            return false;
        }
        Funcionario other = (Funcionario) object;
        if ((this.codFuncionario == null && other.codFuncionario != null) || (this.codFuncionario != null && !this.codFuncionario.equals(other.codFuncionario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.siscom.beans.Funcionario[ codFuncionario=" + codFuncionario + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

    public Collection<NivelAcesso> getNivelAcessoCollection() {
        return nivelAcessoCollection;
    }

    public void setNivelAcessoCollection(Collection<NivelAcesso> nivelAcessoCollection) {
        this.nivelAcessoCollection = nivelAcessoCollection;
    }
    
}
