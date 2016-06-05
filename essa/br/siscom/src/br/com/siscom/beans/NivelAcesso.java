/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siscom.beans;

import br.com.siscom.beans.Funcionario;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "nivel_acesso", catalog = "siscomrefatorado", schema = "")
@NamedQueries({
    @NamedQuery(name = "NivelAcesso.findAll", query = "SELECT n FROM NivelAcesso n"),
    @NamedQuery(name = "NivelAcesso.findByCodigo", query = "SELECT n FROM NivelAcesso n WHERE n.codigo = :codigo"),
    @NamedQuery(name = "NivelAcesso.findByCodFuncionario", query = "SELECT n FROM NivelAcesso n WHERE n.codFuncionario = :codFuncionario"),
    @NamedQuery(name = "NivelAcesso.findByNomeModulo", query = "SELECT n FROM NivelAcesso n WHERE n.nomeModulo = :nomeModulo"),
    @NamedQuery(name = "NivelAcesso.verifiqueAcesso", query = "SELECT n FROM NivelAcesso n WHERE n.codFuncionario = :codFuncionario and n.nomeModulo = :nomeModulo")})
public class NivelAcesso implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "COD_FUNCIONARIO")
    private int codFuncionario;
    @Basic(optional = false)
    @Column(name = "NOME_MODULO")
    private String nomeModulo;
    @JoinColumn(name = "COD_FUNCIONARIO", referencedColumnName = "COD_FUNCIONARIO", updatable = false, insertable = false)
    @ManyToOne
    private Funcionario codFuncionario2;

    public NivelAcesso() {
    }

    public NivelAcesso(Integer codigo) {
        this.codigo = codigo;
    }

    public NivelAcesso(Integer codigo, int codFuncionario, String nomeModulo) {
        this.codigo = codigo;
        this.codFuncionario = codFuncionario;
        this.nomeModulo = nomeModulo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        Integer oldCodigo = this.codigo;
        this.codigo = codigo;
        changeSupport.firePropertyChange("codigo", oldCodigo, codigo);
    }

    public int getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(int codFuncionario) {
        int oldCodFuncionario = this.codFuncionario;
        this.codFuncionario = codFuncionario;
        changeSupport.firePropertyChange("codFuncionario", oldCodFuncionario, codFuncionario);
    }

    public String getNomeModulo() {
        return nomeModulo;
    }

    public void setNomeModulo(String nomeModulo) {
        String oldNomeModulo = this.nomeModulo;
        this.nomeModulo = nomeModulo;
        changeSupport.firePropertyChange("nomeModulo", oldNomeModulo, nomeModulo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NivelAcesso)) {
            return false;
        }
        NivelAcesso other = (NivelAcesso) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.siscom.beans.NivelAcesso[ codigo=" + codigo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

    public Funcionario getCodFuncionario2() {
        return codFuncionario2;
    }

    public void setCodFuncionario2(Funcionario codFuncionario2) {
        Funcionario oldCodFuncionario2 = this.codFuncionario2;
        this.codFuncionario2 = codFuncionario2;
        changeSupport.firePropertyChange("codFuncionario2", oldCodFuncionario2, codFuncionario2);
    }
    
}
