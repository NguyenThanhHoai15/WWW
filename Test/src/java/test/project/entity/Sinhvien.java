/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.project.entity;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Thanh Hoai
 */
@Entity
@Table(name = "sinhvien", catalog = "hoanganh", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sinhvien.findAll", query = "SELECT s FROM Sinhvien s")
    , @NamedQuery(name = "Sinhvien.findById", query = "SELECT s FROM Sinhvien s WHERE s.id = :id")
    , @NamedQuery(name = "Sinhvien.findByName", query = "SELECT s FROM Sinhvien s WHERE s.name = :name")})
public class Sinhvien implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "name", length = 30)
    private String name;

    public Sinhvien() {
    }

    public Sinhvien(String name) {
        this.name = name;
    }
    
    public Sinhvien(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        if (!(object instanceof Sinhvien)) {
            return false;
        }
        Sinhvien other = (Sinhvien) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Sinhvien[ id=" + id + " ]";
    }
    
}
