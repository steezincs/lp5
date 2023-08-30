package bean;
// Generated 29/08/2023 10:54:47 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Os generated by hbm2java
 */
@Entity
@Table(name="os"
    ,catalog="mpv_aluno"
)
public class Os  implements java.io.Serializable {


     private int idos;
     private Clientes clientes;
     private Usuarios usuarios;
     private Date data;
     private BigDecimal total;
     private Set osProdutoses = new HashSet(0);

    public Os() {
    }

	
    public Os(int idos) {
        this.idos = idos;
    }
    public Os(int idos, Clientes clientes, Usuarios usuarios, Date data, BigDecimal total, Set osProdutoses) {
       this.idos = idos;
       this.clientes = clientes;
       this.usuarios = usuarios;
       this.data = data;
       this.total = total;
       this.osProdutoses = osProdutoses;
    }
   
     @Id 

    
    @Column(name="idos", unique=true, nullable=false)
    public int getIdos() {
        return this.idos;
    }
    
    public void setIdos(int idos) {
        this.idos = idos;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cliente")
    public Clientes getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="usuarios")
    public Usuarios getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="data", length=10)
    public Date getData() {
        return this.data;
    }
    
    public void setData(Date data) {
        this.data = data;
    }

    
    @Column(name="total", precision=10)
    public BigDecimal getTotal() {
        return this.total;
    }
    
    public void setTotal(BigDecimal total) {
        this.total = total;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="os")
    public Set getOsProdutoses() {
        return this.osProdutoses;
    }
    
    public void setOsProdutoses(Set osProdutoses) {
        this.osProdutoses = osProdutoses;
    }




}


