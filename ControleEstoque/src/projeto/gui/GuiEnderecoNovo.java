/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.gui;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import projeto.erro.GeralException;
import projeto.modelo.fachada.Fachada;
import projeto.modelo.to.Cidade;
import projeto.modelo.to.Endereco;

/**
 *
 * @author Daniel
 */
public class GuiEnderecoNovo extends javax.swing.JDialog {
    
    public static Fachada fachada = new Fachada();

    /**
     * Creates new form GuiEnderecoNovo
     */
    public GuiEnderecoNovo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        jFormattedTextFieldCEP.requestFocus();
    }
    
    GuiEnderecoNovo() {
        initComponents();
        setLocationRelativeTo(null);
        jFormattedTextFieldCEP.requestFocus();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuiEnderecoNovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiEnderecoNovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiEnderecoNovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiEnderecoNovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                GuiEnderecoNovo dialog = new GuiEnderecoNovo(new javax.swing.JFrame(), true);
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelNovoEndereco = new javax.swing.JPanel();
        jLabelCEP = new javax.swing.JLabel();
        jLabelLogradouro = new javax.swing.JLabel();
        jLabelCidade = new javax.swing.JLabel();
        jTextFieldEntradaLog = new javax.swing.JTextField();
        jComboBoxCidade = new javax.swing.JComboBox();
        jButtonConsultarCEP = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonIncluirCidade = new javax.swing.JButton();
        jFormattedTextFieldCEP = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Salvar novo endereço");
        setModal(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanelNovoEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder("Novo Endereço"));

        jLabelCEP.setText("CEP.:");

        jLabelLogradouro.setText("Logradouro.:");

        jLabelCidade.setText("Cidade.:");

        jButtonConsultarCEP.setText("Consultar CEP");
        jButtonConsultarCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarCEPActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar Endereço");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonIncluirCidade.setText("Gerenciar Cidade");
        jButtonIncluirCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirCidadeActionPerformed(evt);
            }
        });

        try {
            jFormattedTextFieldCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanelNovoEnderecoLayout = new javax.swing.GroupLayout(jPanelNovoEndereco);
        jPanelNovoEndereco.setLayout(jPanelNovoEnderecoLayout);
        jPanelNovoEnderecoLayout.setHorizontalGroup(
            jPanelNovoEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNovoEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelNovoEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLogradouro)
                    .addComponent(jLabelCEP)
                    .addComponent(jLabelCidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelNovoEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelNovoEnderecoLayout.createSequentialGroup()
                        .addGroup(jPanelNovoEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextFieldCEP))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelNovoEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonConsultarCEP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonIncluirCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextFieldEntradaLog))
                .addContainerGap())
        );
        jPanelNovoEnderecoLayout.setVerticalGroup(
            jPanelNovoEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNovoEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelNovoEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCEP)
                    .addComponent(jButtonConsultarCEP)
                    .addComponent(jFormattedTextFieldCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelNovoEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLogradouro)
                    .addComponent(jTextFieldEntradaLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelNovoEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCidade)
                    .addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonIncluirCidade))
                .addGap(18, 18, 18)
                .addComponent(jButtonSalvar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelNovoEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelNovoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConsultarCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarCEPActionPerformed
        consultarCep();
    }//GEN-LAST:event_jButtonConsultarCEPActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        salvarEndereco();
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonIncluirCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirCidadeActionPerformed
        GuiCidade cidade = new GuiCidade();
        cidade.setVisible(true);
    }//GEN-LAST:event_jButtonIncluirCidadeActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        jFormattedTextFieldCEP.requestFocus();
        listarComboBoxCidade();
    }//GEN-LAST:event_formComponentShown
    
    /**
     * Método que salva um novo registro Endereco;
     */
    private void salvarEndereco() {
        int resposta;
        int enderecos_Codigo;
        int cidades_Codigo;
        String enderecos_CEP;
        String enderecos_Logradouro;
        String cidades_Nome;
        String str_cep;
        try {
            str_cep = jFormattedTextFieldCEP.getText();
            str_cep = str_cep.replace('-', ' ');
            str_cep = str_cep.replaceAll(" ", "");
            enderecos_CEP = str_cep;
            enderecos_Codigo = 0;
            enderecos_Logradouro = jTextFieldEntradaLog.getText();
            cidades_Nome = jComboBoxCidade.getSelectedItem().toString();
            Cidade cd = fachada.consultarCidade(cidades_Nome);
            cidades_Codigo = cd.getCidades_Codigo();
            Endereco end = new Endereco(enderecos_Codigo, enderecos_CEP, enderecos_Logradouro, cidades_Codigo, cidades_Nome);
            fachada.salvarEndereco(end);
            resposta = JOptionPane.showConfirmDialog(null, "Registro salvo com sucesso!\nDeseja continuar?", "", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.NO_OPTION) {
                dispose();
            } else {
                limparCampos();
            }
        } catch (GeralException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            jFormattedTextFieldCEP.requestFocus();
        }
    }

    /**
     * Método que limpa os campos dos filtros;
     */
    private void limparCampos() {
        //limpar os edits
        jFormattedTextFieldCEP.setText("");
        jTextFieldEntradaLog.setText("");
    }

    /**
     * Método que verifica se já existe o CEP cadastrado, caso exista, escolha se quer consultar outro ou sair;
     */
    private void consultarCep() {
        int resComCadastro;
        int resSemCadastro;
        String str_cep;
        String enderecos_CEP;
        try {
            str_cep = jFormattedTextFieldCEP.getText();
            str_cep = str_cep.replace('-', ' ');
            str_cep = str_cep.replaceAll(" ", "");
            enderecos_CEP = str_cep;
            Endereco end = fachada.consultarEndCep(enderecos_CEP);
            if (end != null) {
                resComCadastro = JOptionPane.showConfirmDialog(null, "CEP já está cadastrado!\nDeseja cadastrar outro?", "", JOptionPane.YES_NO_OPTION);
                if (resComCadastro == JOptionPane.YES_OPTION) {
                    jFormattedTextFieldCEP.setValue(null);
                    jFormattedTextFieldCEP.requestFocus();
                } else {
                    dispose();
                }
            } else {
                resSemCadastro = JOptionPane.showConfirmDialog(null, "CEP não está cadastrado!\nDeseja continuar?", "", JOptionPane.YES_NO_OPTION);
                if (resSemCadastro == JOptionPane.YES_OPTION) {
                    jTextFieldEntradaLog.requestFocus();
                } else {
                    dispose();
                }
            }
        } catch (GeralException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    /**
     * Método que cria um ArrayList de Cidade, para ser inserido no ComboBox Cidade;
     */
    private void listarComboBoxCidade() {
        Cidade cid;
        ArrayList<Cidade> listaCd;
        try {
            listaCd = (ArrayList<Cidade>) fachada.listarCidadeTudo();
            for (Iterator<Cidade> it = listaCd.iterator(); it.hasNext();) {
                cid = it.next();
                jComboBoxCidade.addItem(cid.getCidades_Nome());
            }
        } catch (GeralException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsultarCEP;
    private javax.swing.JButton jButtonIncluirCidade;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox jComboBoxCidade;
    public javax.swing.JFormattedTextField jFormattedTextFieldCEP;
    private javax.swing.JLabel jLabelCEP;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelLogradouro;
    private javax.swing.JPanel jPanelNovoEndereco;
    public javax.swing.JTextField jTextFieldEntradaLog;
    // End of variables declaration//GEN-END:variables
}
