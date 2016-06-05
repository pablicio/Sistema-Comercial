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
@Table(name = "cidades", catalog = "siscomrefatorado", schema = "")
@NamedQueries({
    @NamedQuery(name = "Cidades.findAll", query = "SELECT c FROM Cidades c"),
    @NamedQuery(name = "Cidades.findById", query = "SELECT c FROM Cidades c WHERE c.id = :id"),
    @NamedQuery(name = "Cidades.findByNome", query = "SELECT c FROM Cidades c WHERE c.nome = :nome"),
    @NamedQuery(name = "Cidades.findByUf", query = "SELECT c FROM Cidades c WHERE c.uf = :uf"),
    @NamedQuery(name = "Cidades.findByCep2", query = "SELECT c FROM Cidades c WHERE c.cep2 = :cep2"),
    @NamedQuery(name = "Cidades.findByEstadoCod", query = "SELECT c FROM Cidades c WHERE c.estadoCod = :estadoCod"),
    @NamedQuery(name = "Cidades.findByCep", query = "SELECT c FROM Cidades c WHERE c.cep = :cep")})
public class Cidades implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "uf")
    private String uf;
    @Basic(optional = false)
    @Column(name = "cep2")
    private String cep2;
    @Basic(optional = false)
    @Column(name = "estado_cod")
    private int estadoCod;
    @Basic(optional = false)
    @Column(name = "cep")
    private String cep;

    public Cidades() {
    }

    public Cidades(Integer id) {
        this.id = id;
    }

    public Cidades(Integer id, String nome, String uf, String cep2, int estadoCod, String cep) {
        this.id = id;
        this.nome = nome;
        this.uf = uf;
        this.cep2 = cep2;
        this.estadoCod = estadoCod;
        this.cep = cep;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        String oldUf = this.uf;
        this.uf = uf;
        changeSupport.firePropertyChange("uf", oldUf, uf);
    }

    public String getCep2() {
        return cep2;
    }

    public void setCep2(String cep2) {
        String oldCep2 = this.cep2;
        this.cep2 = cep2;
        changeSupport.firePropertyChange("cep2", oldCep2, cep2);
    }

    public int getEstadoCod() {
        return estadoCod;
    }

    public void setEstadoCod(int estadoCod) {
        int oldEstadoCod = this.estadoCod;
        this.estadoCod = estadoCod;
        changeSupport.firePropertyChange("estadoCod", oldEstadoCod, estadoCod);
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        String oldCep = this.cep;
        this.cep = cep;
        changeSupport.firePropertyChange("cep", oldCep, cep);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cidades)) {
            return false;
        }
        Cidades other = (Cidades) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.siscom.beans.Cidades[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
