package bean;
// Generated 21/09/2023 17:27:29 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * UsuariosGab generated by hbm2java
 */
@Entity
@Table(name="usuarios_gab"
    ,catalog="db_gustavo_barros"
)
public class UsuariosGab  implements java.io.Serializable {


     private int idUsuariosGab;
     private String nomeGab;
     private String apelidoGab;
     private String cpfGab;
     private Date dataNascimentoGab;
     private String senhaGab;
     private int nivelGab;
     private String ativoGab;

    public UsuariosGab() {
    }

    public UsuariosGab(int idUsuariosGab, String nomeGab, String apelidoGab, String cpfGab, Date dataNascimentoGab, String senhaGab, int nivelGab, String ativoGab) {
       this.idUsuariosGab = idUsuariosGab;
       this.nomeGab = nomeGab;
       this.apelidoGab = apelidoGab;
       this.cpfGab = cpfGab;
       this.dataNascimentoGab = dataNascimentoGab;
       this.senhaGab = senhaGab;
       this.nivelGab = nivelGab;
       this.ativoGab = ativoGab;
    }
   
     @Id

    
    @Column(name="idUsuarios_gab", unique=true, nullable=false)
    public int getIdUsuariosGab() {
        return this.idUsuariosGab;
    }
    
    public void setIdUsuariosGab(int idUsuariosGab) {
        this.idUsuariosGab = idUsuariosGab;
    }

    
    @Column(name="nome_gab", nullable=false, length=45)
    public String getNomeGab() {
        return this.nomeGab;
    }
    
    public void setNomeGab(String nomeGab) {
        this.nomeGab = nomeGab;
    }

    
    @Column(name="apelido_gab", nullable=false, length=45)
    public String getApelidoGab() {
        return this.apelidoGab;
    }
    
    public void setApelidoGab(String apelidoGab) {
        this.apelidoGab = apelidoGab;
    }

    
    @Column(name="cpf_gab", nullable=false, length=20)
    public String getCpfGab() {
        return this.cpfGab;
    }
    
    public void setCpfGab(String cpfGab) {
        this.cpfGab = cpfGab;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="dataNascimento_gab", nullable=false, length=10)
    public Date getDataNascimentoGab() {
        return this.dataNascimentoGab;
    }
    
    public void setDataNascimentoGab(Date dataNascimentoGab) {
        this.dataNascimentoGab = dataNascimentoGab;
    }

    
    @Column(name="senha_gab", nullable=false, length=45)
    public String getSenhaGab() {
        return this.senhaGab;
    }
    
    public void setSenhaGab(String senhaGab) {
        this.senhaGab = senhaGab;
    }

    
    @Column(name="nivel_gab", nullable=false)
    public int getNivelGab() {
        return this.nivelGab;
    }
    
    public void setNivelGab(int nivelGab) {
        this.nivelGab = nivelGab;
    }

    
    @Column(name="ativo_gab", nullable=false, length=1)
    public String getAtivoGab() {
        return this.ativoGab;
    }
    
    public void setAtivoGab(String ativoGab) {
        this.ativoGab = ativoGab;
    }




}


