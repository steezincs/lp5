/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.FornecedorGab;
import dao.FornecedorGabDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import pesquisa.JDlgFornecedorPesquisa_gab;
import tools.Util_gab;

/**
 *
 * @author User
 */
public class JDlgFornecedor_gab extends javax.swing.JDialog {
    
    private boolean incluindo;
    
    MaskFormatter mascaraCnpj, mascaraData, mascaraCEP;
    public FornecedorGab fornecedorGab;
    public FornecedorGabDAO fornecedorGabDAO;

    /**
     * Creates new form JDlgFornecedor
     */
    public JDlgFornecedor_gab(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        fornecedorGabDAO = new FornecedorGabDAO();
        
        Util_gab.habilitar(false,jTxtCodigo, jTxtNome, jFmtData, jTxtEmail, jFmtCnpj, jTxtEndereco, jTxtTelefone, jTxtResp, jFmtCep, jTxtPais, jTxtCidade, jTxtBairro, jTxtNumero, jCboAtivo, jTxtObs, jTxtPrazo);
        setLocationRelativeTo(null);
        setTitle("Cadastro de Fornecedor");
        Util_gab.limparCampos(jTxtCodigo, jTxtNome, jFmtData, jTxtEmail, jFmtCnpj, jTxtEndereco, jTxtTelefone, jTxtResp, jFmtCep, jTxtPais, jTxtCidade, jTxtBairro, jTxtNumero, jCboAtivo, jTxtObs, jTxtPrazo);
        try {
            mascaraCnpj = new MaskFormatter("###.###.###/####-##");
            mascaraData = new MaskFormatter("##/##/####");
            mascaraCEP = new MaskFormatter("#####-###");
        } catch (ParseException ex) {
            Logger.getLogger(JDlgUsuarios_gab.class.getName()).log(Level.SEVERE, null, ex);
        }
        jFmtCnpj.setFormatterFactory(new DefaultFormatterFactory(mascaraCnpj));
        jFmtData.setFormatterFactory(new DefaultFormatterFactory(mascaraData));
        jFmtCep.setFormatterFactory(new DefaultFormatterFactory(mascaraCEP));
    }
    
        public FornecedorGab viewBean() {
        FornecedorGab fornecedorGab = new FornecedorGab();
        
        fornecedorGab.setIdFornecedorGab(Util_gab.strInt(jTxtCodigo.getText()));
        fornecedorGab.setNomeGab(jTxtNome.getText());
        fornecedorGab.setDataCadastroGab(Util_gab.strDate(jFmtData.getText()));
        fornecedorGab.setEmailGab(jTxtEmail.getText());
        fornecedorGab.setEnderecoGab(jTxtEndereco.getText());
        fornecedorGab.setTelefoneGab(jTxtTelefone.getText());
        fornecedorGab.setCnpjGab(jFmtCnpj.getText());
        fornecedorGab.setResponsavelGab(jTxtResp.getText());
        fornecedorGab.setCepGab(jFmtCep.getText());
        fornecedorGab.setPaisGab(jTxtPais.getText());
        fornecedorGab.setCidadeGab(jTxtCidade.getText());
        fornecedorGab.setBairroGab(jTxtBairro.getText());
        fornecedorGab.setNumeroGab(jTxtNumero.getText());
        fornecedorGab.setObsGab(jTxtObs.getText());
        fornecedorGab.setPrazoGab(jTxtPrazo.getText());
        if (jCboAtivo.isSelected() == true) {
            fornecedorGab.setAtivoGab("S");
        } else {
            fornecedorGab.setAtivoGab("N");
        }
             
        return fornecedorGab;
    }
        public void beanView(FornecedorGab fornecedorgab) {
        String id = String.valueOf(fornecedorgab.getIdFornecedorGab());
        jTxtCodigo.setText(id);
        jTxtNome.setText(fornecedorgab.getNomeGab());
        jTxtEmail.setText(fornecedorgab.getEmailGab());
        jFmtCnpj.setText(fornecedorgab.getCnpjGab());
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        jFmtData.setText( formato.format( fornecedorgab.getDataCadastroGab() ) );
        jTxtEndereco.setText(fornecedorgab.getEnderecoGab());
        jTxtTelefone.setText(fornecedorgab.getTelefoneGab());
        jFmtCep.setText(fornecedorgab.getCepGab());
        jTxtPais.setText(fornecedorgab.getPaisGab());
        jTxtCidade.setText(fornecedorgab.getCidadeGab());
        jTxtBairro.setText(fornecedorgab.getBairroGab());
        jTxtNumero.setText(fornecedorgab.getNumeroGab());
        jTxtObs.setText(fornecedorgab.getObsGab());
        jTxtPrazo.setText(fornecedorgab.getPrazoGab());
        if (fornecedorgab.getAtivoGab().equals("S") == true) {
            jCboAtivo.setSelected(true);
        } else {
            jCboAtivo.setSelected(false);
        }
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jFmtCpf = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jTxtNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTxtEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jFmtCnpj = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jTxtEndereco = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTxtTelefone = new javax.swing.JTextField();
        jBtnIncluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnConfirmar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jBtnPesquisar = new javax.swing.JButton();
        jTxtCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTxtResp = new javax.swing.JTextField();
        jFmtCep = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTxtPais = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTxtCidade = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTxtBairro = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTxtNumero = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTxtObs = new javax.swing.JTextField();
        jFmtData = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jTxtPrazo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jCboAtivo = new javax.swing.JCheckBox();

        jLabel8.setText("CPF");

        jFmtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtCpfActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Nome");

        jLabel5.setText("Email");

        jLabel9.setText("CNPJ");

        jFmtCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtCnpjActionPerformed(evt);
            }
        });

        jLabel6.setText("Endereço");

        jLabel10.setText("Telefone ");

        jTxtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtTelefoneActionPerformed(evt);
            }
        });

        jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/incluir.png"))); // NOI18N
        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jBtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/alterar.png"))); // NOI18N
        jBtnAlterar.setText("Alterar");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/Excluir.png"))); // NOI18N
        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/gravar.png"))); // NOI18N
        jBtnConfirmar.setText("Confirmar");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/cancelar.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jBtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/pesquisar.png"))); // NOI18N
        jBtnPesquisar.setText("Pesquisar");
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });

        jLabel1.setText("Código");

        jLabel3.setText("Responsável");

        jFmtCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtCepActionPerformed(evt);
            }
        });

        jLabel12.setText("CEP");

        jLabel13.setText("País");

        jLabel15.setText("Cidade");

        jLabel16.setText("Bairro");

        jLabel17.setText("Número");

        jLabel19.setText("Observação");

        jFmtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtDataActionPerformed(evt);
            }
        });

        jLabel4.setText("Data de Cadastro");

        jLabel14.setText("Prazo");

        jCboAtivo.setText("Ativo");
        jCboAtivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboAtivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jFmtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTxtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                                        .addComponent(jTxtEndereco)
                                        .addComponent(jTxtNome))
                                    .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFmtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTxtBairro, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTxtCidade, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTxtPais, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel17)
                                    .addComponent(jTxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCboAtivo))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(207, 207, 207))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTxtResp)
                                        .addGap(48, 48, 48)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtObs)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTxtPrazo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 68, Short.MAX_VALUE)))))
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jBtnIncluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBtnExcluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jFmtData, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBtnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnPesquisar))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFmtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFmtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCboAtivo))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtObs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFmtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtPrazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnIncluir)
                    .addComponent(jBtnAlterar)
                    .addComponent(jBtnConfirmar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnCancelar)
                    .addComponent(jBtnExcluir)
                    .addComponent(jBtnPesquisar))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFmtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtCpfActionPerformed

    private void jFmtCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtCnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtCnpjActionPerformed

    private void jTxtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtTelefoneActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        // TODO add your handling code here:
        incluindo = true;
        Util_gab.limparCampos(jTxtCodigo, jTxtNome, jFmtData, jTxtEmail, jFmtCnpj, jTxtEndereco, jTxtTelefone, jTxtResp, jFmtCep, jTxtPais, jTxtCidade, jTxtBairro, jTxtNumero, jCboAtivo, jTxtObs, jTxtPrazo);
        Util_gab.habilitar(false, jBtnAlterar, jBtnExcluir, jBtnIncluir, jBtnPesquisar);
        Util_gab.habilitar(true,jTxtCodigo, jTxtNome, jFmtData, jTxtEmail, jFmtCnpj, jTxtEndereco, jTxtTelefone, jTxtResp, jFmtCep, jTxtPais, jTxtCidade, jTxtBairro, jTxtNumero, jCboAtivo, jTxtObs, jTxtPrazo);
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        // TODO add your handling code here:
        incluindo = false;
        Util_gab.habilitar(false, jBtnAlterar, jBtnExcluir, jBtnIncluir, jBtnPesquisar);
        Util_gab.habilitar(true,jTxtCodigo, jTxtNome, jFmtData, jTxtEmail, jFmtCnpj, jTxtEndereco, jTxtTelefone, jTxtResp, jFmtCep, jTxtPais, jTxtCidade, jTxtBairro, jTxtNumero, jCboAtivo, jTxtObs, jTxtPrazo);
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        // TODO add your handling code here:
if (Util_gab.perguntar("Deseja excluir o projeto?") == true){
    fornecedorGab = viewBean();
    fornecedorGabDAO.delete(fornecedorGab);        
    Util_gab.mensagem("Exclusão feita.");
        }else {
            Util_gab.mensagem("Exclusão cancelada.");
        }
Util_gab.habilitar(false,jTxtCodigo, jTxtNome, jFmtData, jTxtEmail, jFmtCnpj, jTxtEndereco, jTxtTelefone, jTxtResp, jFmtCep, jTxtPais, jTxtCidade, jTxtBairro, jTxtNumero, jCboAtivo, jTxtObs, jTxtPrazo);        
Util_gab.limparCampos(jTxtCodigo, jTxtNome, jFmtData, jTxtEmail, jFmtCnpj, jTxtEndereco, jTxtTelefone, jTxtResp, jFmtCep, jTxtPais, jTxtCidade, jTxtBairro, jTxtNumero, jCboAtivo, jTxtObs, jTxtPrazo);
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
        fornecedorGab = viewBean();
        if (incluindo ==true ){
        fornecedorGabDAO.insert(fornecedorGab);}
        else{
                fornecedorGabDAO.update(fornecedorGab);
                }
        
        Util_gab.habilitar(false,jTxtCodigo, jTxtNome, jFmtData, jTxtEmail, jFmtCnpj, jTxtEndereco, jTxtTelefone, jTxtResp, jFmtCep, jTxtPais, jTxtCidade, jTxtBairro, jTxtNumero, jCboAtivo, jTxtObs, jTxtPrazo);
        Util_gab.habilitar(true, jBtnAlterar, jBtnExcluir, jBtnIncluir, jBtnPesquisar);
        Util_gab.limparCampos(jTxtCodigo, jTxtNome, jFmtData, jTxtEmail, jFmtCnpj, jTxtEndereco, jTxtTelefone, jTxtResp, jFmtCep, jTxtPais, jTxtCidade, jTxtBairro, jTxtNumero, jCboAtivo, jTxtObs, jTxtPrazo);
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
        Util_gab.habilitar(false,jTxtCodigo, jTxtNome, jFmtData, jTxtEmail, jFmtCnpj, jTxtEndereco, jTxtTelefone, jTxtResp, jFmtCep, jTxtPais, jTxtCidade, jTxtBairro, jTxtNumero, jCboAtivo, jTxtObs, jTxtPrazo);
        Util_gab.habilitar(true, jBtnAlterar, jBtnExcluir, jBtnIncluir, jBtnPesquisar);
        Util_gab.mensagem("Operação Cancelada");
        Util_gab.limparCampos(jTxtCodigo, jTxtNome, jFmtData, jTxtEmail, jFmtCnpj, jTxtEndereco, jTxtTelefone, jTxtResp, jFmtCep, jTxtPais, jTxtCidade, jTxtBairro, jTxtNumero, jCboAtivo, jTxtObs, jTxtPrazo);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        JDlgFornecedorPesquisa_gab jDlgFornecedorPesquisa_gab = new JDlgFornecedorPesquisa_gab(null, true);
        jDlgFornecedorPesquisa_gab.setTelaAnterior(this);
        jDlgFornecedorPesquisa_gab.setVisible(true);
        Util_gab.habilitar(true, jBtnAlterar, jBtnCancelar, jBtnExcluir);
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void jFmtCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtCepActionPerformed

    private void jFmtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtDataActionPerformed

    private void jCboAtivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboAtivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboAtivoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JDlgFornecedor_gab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgFornecedor_gab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgFornecedor_gab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgFornecedor_gab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgFornecedor_gab dialog = new JDlgFornecedor_gab(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JCheckBox jCboAtivo;
    private javax.swing.JFormattedTextField jFmtCep;
    private javax.swing.JFormattedTextField jFmtCnpj;
    private javax.swing.JFormattedTextField jFmtCpf;
    private javax.swing.JFormattedTextField jFmtData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTxtBairro;
    private javax.swing.JTextField jTxtCidade;
    private javax.swing.JTextField jTxtCodigo;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtEndereco;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtNumero;
    private javax.swing.JTextField jTxtObs;
    private javax.swing.JTextField jTxtPais;
    private javax.swing.JTextField jTxtPrazo;
    private javax.swing.JTextField jTxtResp;
    private javax.swing.JTextField jTxtTelefone;
    // End of variables declaration//GEN-END:variables
}
