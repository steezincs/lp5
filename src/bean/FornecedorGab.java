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
 * FornecedorGab generated by hbm2java
 */
@Entity
@Table(name="fornecedor_gab"
    ,catalog="db_gustavo_barros"
)
public class FornecedorGab  implements java.io.Serializable {


     private int idFornecedorGab;
     private String nomeGab;
     private String emailGab;
     private String cnpjGab;
     private String enderecoGab;
     private String telefoneGab;
     private String responsavelGab;
     private String cepGab;
     private String paisGab;
     private String cidadeGab;
     private String bairroGab;
     private String numeroGab;
     private String ativoGab;
     private String obsGab;
     private String prazoGab;
     private Date dataCadastroGab;
     
    public FornecedorGab() {
    }

	
    public FornecedorGab(int idFornecedorGab, String nomeGab, String emailGab, String cnpjGab, String enderecoGab, String telefoneGab, String responsavelGab, String cepGab, String paisGab, String cidadeGab, String bairroGab, String numeroGab, String ativoGab, String obsGab, String prazoGab, Date dataCadastroGab) {
        this.idFornecedorGab = idFornecedorGab;
        this.nomeGab = nomeGab;
        this.emailGab = emailGab;
        this.cnpjGab = cnpjGab;
        this.enderecoGab = enderecoGab;
        this.telefoneGab = telefoneGab;
        this.responsavelGab = responsavelGab;
        this.cepGab = cepGab;
        this.paisGab = paisGab;
        this.cidadeGab = cidadeGab;
        this.ativoGab = ativoGab;
        this.bairroGab = bairroGab;
        this.numeroGab = numeroGab;
        this.obsGab = obsGab;
        this.prazoGab = prazoGab;
        this.dataCadastroGab = dataCadastroGab;
    }
   
     @Id 

    
    @Column(name="idFornecedor_gab", unique=true, nullable=false)
    public int getIdFornecedorGab() {
        return this.idFornecedorGab;
    }
    
    public void setIdFornecedorGab(int idFornecedorGab) {
        this.idFornecedorGab = idFornecedorGab;
    }

    
    @Column(name="nome_gab", nullable=false, length=45)
    public String getNomeGab() {
        return this.nomeGab;
    }
    
    public void setNomeGab(String nomeGab) {
        this.nomeGab = nomeGab;
    }

    
    @Column(name="email_gab", nullable=false, length=45)
    public String getEmailGab() {
        return this.emailGab;
    }
    
    public void setEmailGab(String emailGab) {
        this.emailGab = emailGab;
    }

    
    @Column(name="cnpj_gab", nullable=false, length=45)
    public String getCnpjGab() {
        return this.cnpjGab;
    }
    
    public void setCnpjGab(String cnpjGab) {
        this.cnpjGab = cnpjGab;
    }

    
    @Column(name="endereco_gab", nullable=false, length=45)
    public String getEnderecoGab() {
        return this.enderecoGab;
    }
    
    public void setEnderecoGab(String enderecoGab) {
        this.enderecoGab = enderecoGab;
    }

    
    @Column(name="telefone_gab", nullable=false, length=45)
    public String getTelefoneGab() {
        return this.telefoneGab;
    }
    
    public void setTelefoneGab(String telefoneGab) {
        this.telefoneGab = telefoneGab;
    }

    
    @Column(name="responsavel_gab", nullable=false, length=45)
    public String getResponsavelGab() {
        return this.responsavelGab;
    }
    
    public void setResponsavelGab(String responsavelGab) {
        this.responsavelGab = responsavelGab;
    }

    
    @Column(name="cep_gab", nullable=false, length=45)
    public String getCepGab() {
        return this.cepGab;
    }
    
    public void setCepGab(String cepGab) {
        this.cepGab = cepGab;
    }

    
    @Column(name="pais_gab", nullable=false, length=45)
    public String getPaisGab() {
        return this.paisGab;
    }
    
    public void setPaisGab(String paisGab) {
        this.paisGab = paisGab;
    }

    
    @Column(name="cidade_gab", nullable=false, length=45)
    public String getCidadeGab() {
        return this.cidadeGab;
    }
    
    public void setCidadeGab(String cidadeGab) {
        this.cidadeGab = cidadeGab;
    }

    
    @Column(name="bairro_gab", nullable=false, length=45)
    public String getBairroGab() {
        return this.bairroGab;
    }
    
    public void setBairroGab(String bairroGab) {
        this.bairroGab = bairroGab;
    }

    
    @Column(name="numero_gab", nullable=false, length=45)
    public String getNumeroGab() {
        return this.numeroGab;
    }
    
    public void setNumeroGab(String numeroGab) {
        this.numeroGab = numeroGab;
    }
  
    @Column(name="obs_gab", nullable=false, length=45)
    public String getObsGab() {
        return this.obsGab;
    }
    
    public void setObsGab(String obsGab) {
        this.obsGab = obsGab;
    }

    
    @Column(name="prazo_gab", nullable=false, length=45)
    public String getPrazoGab() {
        return this.prazoGab;
    }
    
    public void setPrazoGab(String prazoGab) {
        this.prazoGab = prazoGab;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="dataCadastro_gab", nullable=false, length=10)
    public Date getDataCadastroGab() {
        return this.dataCadastroGab;
    }
    
    public void setDataCadastroGab(Date dataCadastroGab) {
        this.dataCadastroGab = dataCadastroGab;
    }
    
    @Column(name="ativo_gab", nullable=false, length=45)
    public String getAtivoGab() {
        return this.ativoGab;
    }
    
    public void setAtivoGab(String ativoGab) {
        this.ativoGab = ativoGab;
    }







}


