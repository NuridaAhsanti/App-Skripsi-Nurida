/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package contohkoneksi;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author nury
 */
@Entity
@Table(name = "appdb", catalog = "tutorialdb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Appdb.findAll", query = "SELECT a FROM Appdb a"),
    @NamedQuery(name = "Appdb.findByAutoid", query = "SELECT a FROM Appdb a WHERE a.autoid = :autoid"),
    @NamedQuery(name = "Appdb.findById", query = "SELECT a FROM Appdb a WHERE a.id = :id"),
    @NamedQuery(name = "Appdb.findByNama", query = "SELECT a FROM Appdb a WHERE a.nama = :nama"),
    @NamedQuery(name = "Appdb.findByKelas", query = "SELECT a FROM Appdb a WHERE a.kelas = :kelas"),
    @NamedQuery(name = "Appdb.findByKonst", query = "SELECT a FROM Appdb a WHERE a.konst = :konst"),
    @NamedQuery(name = "Appdb.findByTipe", query = "SELECT a FROM Appdb a WHERE a.tipe = :tipe"),
    @NamedQuery(name = "Appdb.findByVar", query = "SELECT a FROM Appdb a WHERE a.var = :var"),
    @NamedQuery(name = "Appdb.findByKata", query = "SELECT a FROM Appdb a WHERE a.kata = :kata"),
    @NamedQuery(name = "Appdb.findBySoal", query = "SELECT a FROM Appdb a WHERE a.soal = :soal")})
public class Appdb implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "autoid")
    private Integer autoid;
    @Column(name = "id")
    private String id;
    @Column(name = "nama")
    private String nama;
    @Column(name = "kelas")
    private String kelas;
    @Column(name = "konst")
    private String konst;
    @Column(name = "tipe")
    private String tipe;
    @Column(name = "var")
    private String var;
    @Column(name = "kata")
    private String kata;
    @Column(name = "soal")
    private String soal;
    @Lob
    @Column(name = "foto")
    private byte[] foto;

    public Appdb() {
    }

    public Appdb(Integer autoid) {
        this.autoid = autoid;
    }

    public Integer getAutoid() {
        return autoid;
    }

    public void setAutoid(Integer autoid) {
        Integer oldAutoid = this.autoid;
        this.autoid = autoid;
        changeSupport.firePropertyChange("autoid", oldAutoid, autoid);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        String oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        String oldNama = this.nama;
        this.nama = nama;
        changeSupport.firePropertyChange("nama", oldNama, nama);
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        String oldKelas = this.kelas;
        this.kelas = kelas;
        changeSupport.firePropertyChange("kelas", oldKelas, kelas);
    }

    public String getKonst() {
        return konst;
    }

    public void setKonst(String konst) {
        String oldKonst = this.konst;
        this.konst = konst;
        changeSupport.firePropertyChange("konst", oldKonst, konst);
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        String oldTipe = this.tipe;
        this.tipe = tipe;
        changeSupport.firePropertyChange("tipe", oldTipe, tipe);
    }

    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        String oldVar = this.var;
        this.var = var;
        changeSupport.firePropertyChange("var", oldVar, var);
    }

    public String getKata() {
        return kata;
    }

    public void setKata(String kata) {
        String oldKata = this.kata;
        this.kata = kata;
        changeSupport.firePropertyChange("kata", oldKata, kata);
    }

    public String getSoal() {
        return soal;
    }

    public void setSoal(String soal) {
        String oldSoal = this.soal;
        this.soal = soal;
        changeSupport.firePropertyChange("soal", oldSoal, soal);
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        byte[] oldFoto = this.foto;
        this.foto = foto;
        changeSupport.firePropertyChange("foto", oldFoto, foto);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (autoid != null ? autoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Appdb)) {
            return false;
        }
        Appdb other = (Appdb) object;
        if ((this.autoid == null && other.autoid != null) || (this.autoid != null && !this.autoid.equals(other.autoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "contohkoneksi.Appdb[ autoid=" + autoid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
