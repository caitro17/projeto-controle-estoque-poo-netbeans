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
import projeto.modelo.to.Marca;
import projeto.modelo.to.Produto;
import projeto.modelo.to.Segmento;
import projeto.modelo.to.Tipo;

/**
 *
 * @author diego
 */
public class GuiProdutoNovo extends javax.swing.JFrame {

    public static Fachada fachada = new Fachada();
    
    private GuiProduto guiPro = new GuiProduto();

    /**
     * Creates new form GuiProdutoNovo
     */
    public GuiProdutoNovo() {
        initComponents();
        setLocationRelativeTo(null);//mostra no centro da tela  
        jDescricaoField.requestFocus();//setar o focu na descrição
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSegmentoBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jDescricaoField = new javax.swing.JTextField();
        jTipoBox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMarcaBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jValorUnitarioField = new projeto.modelo.componente.ValorReal();
        jQtdeField = new projeto.modelo.componente.SoNumero();
        jbSalvar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Novo Produto");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setText("Segmento.:");

        jLabel2.setText("Descrição.:");

        jLabel5.setText("Tipo.:");

        jLabel6.setText("Marca.:");

        jLabel3.setText("Valor Unitário R$.:");

        jValorUnitarioField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.##"))));
        jValorUnitarioField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jValorUnitarioField.setToolTipText("");

        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jLabel4.setText("Quantidade.:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDescricaoField, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jValorUnitarioField, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jQtdeField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel1))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTipoBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 176, Short.MAX_VALUE)
                            .addComponent(jSegmentoBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jMarcaBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addComponent(jDescricaoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jQtdeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jValorUnitarioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jSegmentoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTipoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jMarcaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalvar))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-370)/2, (screenSize.height-266)/2, 370, 266);
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        // TODO add your handling code here:    
        
        try {
            //preparando o novo produto para ser salvo no DAO
            Produto pSalvar = new Produto();
            //pegando o codigo do segmento selecionado
            Segmento sgsalvar = fachada.consultarSegmentos((String) jSegmentoBox.getSelectedItem());
            pSalvar.setSegmentos_Codigo(sgsalvar.getSegmentos_Codigo());

            //pegando o codigo do tipo selecionado
            Tipo tpsalvar = fachada.consultarTipos((String) jTipoBox.getSelectedItem());
            pSalvar.setTipos_Codigo(tpsalvar.getTipos_Codigo());

            //pegando o codigo da marca selecionada
            Marca masalvar = fachada.consultarMarcas((String) jMarcaBox.getSelectedItem());
            pSalvar.setMarcas_Codigo(masalvar.getMarcas_Codigo());

            pSalvar.setProdutos_Descricao(jDescricaoField.getText());

            //CONVERTE O VALOR INFORMADO
            String converterValor = converterValorReal(jValorUnitarioField.getText());
            pSalvar.setProdutos_ValorVenda(Double.parseDouble(converterValor));

            pSalvar.setProdutos_Quantidade(Integer.parseInt(jQtdeField.getText()));

            //CHAMAR O DAO SALVAR
            fachada.salvarProduto(pSalvar);

            JOptionPane.showMessageDialog(null, "Produto Inserido!");
            dispose();

        } catch (GeralException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_jbSalvarActionPerformed

    //CONVERTE O VALOR DOUBLE PARA SALVAR DO BD
    private String converterValorReal(String valorx) {
        String valorConvertido = "";

        for (int i = 0, x = 1; i < valorx.length(); i++, x++) {

            if (valorx.substring(i, x).equals(",")) {

                valorConvertido = valorConvertido + ".";

            } else if (!valorx.substring(i, x).equals(".")) {

                valorConvertido = valorConvertido + valorx.substring(i, x);

            }
        }

        return valorConvertido;
    }

    // LIMPAR OS CAMPOS DO PRODUTO  
    private void limparTodosCampos() {
        //limpar os comboboxs
        jSegmentoBox.removeAllItems();
        jTipoBox.removeAllItems();
        jMarcaBox.removeAllItems();
        //limpar os edits
        jDescricaoField.setText("");
        jValorUnitarioField.setText("");
        jQtdeField.setText("");
    }

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:

        jDescricaoField.grabFocus();//setar o focul

        //LISTA DO SEGMENTO
        Segmento sg;
        ArrayList<Segmento> listasg;
        try {
            //Lista dos os segmentos
            listasg = (ArrayList<Segmento>) fachada.listarSegmentos("");
            for (Iterator<Segmento> it = listasg.iterator(); it.hasNext();) {
                sg = it.next();
                jSegmentoBox.addItem(sg.getSegmentos_Descricao());
            }
        } catch (GeralException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        //LISTAR OS TIPOS
        Tipo tp;
        ArrayList<Tipo> listatp;
        try {
            listatp = (ArrayList<Tipo>) fachada.listarTipo();
            for (Iterator<Tipo> it = listatp.iterator(); it.hasNext();) {
                tp = it.next();
                jTipoBox.addItem(tp.getTipos_Descricao());
            }
        } catch (GeralException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        //LISTAR MARCA
        Marca ma;
        ArrayList<Marca> listama;
        try {
            listama = (ArrayList<Marca>) fachada.listarMarca();
            for (Iterator<Marca> it = listama.iterator(); it.hasNext();) {
                ma = it.next();
                jMarcaBox.addItem(ma.getMarcas_Descricao());
            }
        } catch (GeralException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_formComponentShown

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        guiPro.atualizarTabela();
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(GuiProdutoNovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiProdutoNovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiProdutoNovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiProdutoNovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new GuiProdutoNovo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jDescricaoField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox jMarcaBox;
    private javax.swing.JTextField jQtdeField;
    private javax.swing.JComboBox jSegmentoBox;
    private javax.swing.JComboBox jTipoBox;
    private javax.swing.JFormattedTextField jValorUnitarioField;
    private javax.swing.JButton jbSalvar;
    // End of variables declaration//GEN-END:variables
    
    private void caracteresSelecionados(){
        try{
            javax.swing.text.MaskFormatter data = new
                    javax.swing.text.MaskFormatter("0,1,2,3,4,5,6,7,8,9,',','.'");
            jQtdeField = new javax.swing.JFormattedTextField(data);
            
        
    }   catch(Exception ex){
    JOptionPane.showMessageDialog(null, "DEU PAU");
    }
}    
 
    
    //fim

}