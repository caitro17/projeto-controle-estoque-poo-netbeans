/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.gui;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projeto.erro.GeralException;
import projeto.modelo.fachada.Fachada;
import projeto.modelo.to.Tipo;

/**
 *
 * @author Felipe Carlos
 */
public class GuiMarcas extends javax.swing.JDialog {

    ArrayList<Tipo> listaTipo = null;
        public static Fachada fachada = new Fachada();
        
    /**
     * Creates new form GuiMarcas
     */
    public GuiMarcas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public GuiMarcas(){
        initComponents();
        listaTabelaTipo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTPesq = new javax.swing.JTextField();
        JlFuncionario = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtListarTipos = new javax.swing.JTable();
        btnAlterar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Marcas");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisa", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel1.setPreferredSize(new java.awt.Dimension(480, 82));

        jTPesq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTPesqKeyReleased(evt);
            }
        });

        JlFuncionario.setText("Descrição");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JlFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTPesq, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JlFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JtListarTipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JtListarTipos.setShowHorizontalLines(false);
        JtListarTipos.setShowVerticalLines(false);
        JtListarTipos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(JtListarTipos);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 376, 180));

        btnAlterar.setText("Alterar");
        btnAlterar.setMaximumSize(new java.awt.Dimension(63, 23));
        btnAlterar.setMinimumSize(new java.awt.Dimension(63, 23));
        btnAlterar.setPreferredSize(new java.awt.Dimension(63, 23));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 56, 70, 30));

        btnSalvar.setText("Novo");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 20, 70, 30));

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel2.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 92, 70, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, 489, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTPesqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTPesqKeyReleased
        // TODO add your handling code here:
        pesquisarTipo();
    }//GEN-LAST:event_jTPesqKeyReleased

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        alterarTipo();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        GuiSalvarTipo tela = new GuiSalvarTipo();
        tela.setVisible(true);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        apagarTipo();
        listaTabelaTipo();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        listaTabelaTipo();
    }//GEN-LAST:event_formWindowGainedFocus

     private DefaultTableModel geramodelo(ArrayList<Tipo> listaTipo) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Código");
        modelo.addColumn("Descrição");
      
        ArrayList<String> valores;
        int i = 0;
        for (Tipo t : listaTipo) {
            valores = new ArrayList<String>();
            valores.add(String.valueOf(t.getTipos_Codigo()));
            valores.add(t.getTipos_Descricao());
            modelo.insertRow(i, valores.toArray());
            i++;
        }
        return modelo;
    }
    
      /**
     * Método para listar todos os registros de Tipo;
     */
    private void listaTabelaTipo() {
        //MOSTRAR TODOS OS REGISTRO DE TIPOS
        
        try {
            listaTipo = (ArrayList<Tipo>) fachada.listarTipo();
        }catch (GeralException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        DefaultTableModel modelo = geramodelo(listaTipo);
            JtListarTipos.setModel(modelo);
    }

    /**
     * Método para apagar um registro selecionado na tabela;
     */
    private void apagarTipo() {
        int resposta;
        try {
            Tipo t = listaTipo.get(JtListarTipos.getSelectedRow());

            resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente Apagar ?", "", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                Tipo tConsult = fachada.consultarTipos(t.getTipos_Codigo());
                if (tConsult != null) {
                    fachada.excluirTipo(t.getTipos_Codigo());
                    JOptionPane.showMessageDialog(null, "Registro excluído!");
                }
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Selecione o Tipo!");
        } catch (GeralException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private void pesquisarTipo() {
        
        try {
            
            if ((jTPesq.getText() == "")||( jTPesq.getText() == null)) {
               listaTipo = (ArrayList<Tipo>) fachada.listarTipo();
               DefaultTableModel modelo = geramodelo(listaTipo);
            }
            else{
                listaTipo = (ArrayList<Tipo>) fachada.listarTiposDescricao(jTPesq.getText());
                DefaultTableModel modelo = geramodelo(listaTipo);
                JtListarTipos.setModel(modelo);
            }
        } catch (GeralException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
       
    }
    
     private void alterarTipo() {
        int resposta;
        try {
            Tipo tOld = listaTipo.get(JtListarTipos.getSelectedRow());

            resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente Alterar?", "", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
               GuiAlterarTipo guiAlterarTiposTeste= new GuiAlterarTipo();
               guiAlterarTiposTeste.jTDescTipo.setText(tOld.getTipos_Descricao());
               guiAlterarTiposTeste.jTCodTipo.setText(String.valueOf(tOld.getTipos_Codigo()));
               guiAlterarTiposTeste.setVisible(true);
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Selecione um endereço!");
        }
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
            java.util.logging.Logger.getLogger(GuiMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiMarcas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                GuiMarcas dialog = new GuiMarcas(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel JlFuncionario;
    private javax.swing.JTable JtListarTipos;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTPesq;
    // End of variables declaration//GEN-END:variables
}
