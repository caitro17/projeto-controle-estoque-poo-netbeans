/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.gui;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projeto.erro.GeralException;
import projeto.modelo.fachada.Fachada;
import projeto.modelo.to.Fornecedor;
import projeto.modelo.to.Produto;
import projeto.modelo.to.Produto_Fornecedor;

/**
 *
 * @author diego
 */
public class GuiFornecedorForneceProduto extends javax.swing.JFrame {

    ArrayList<Produto_Fornecedor> listaProdutoFornecedor = null;
    
    Fachada fachada = new Fachada();
    
    private int selecionado;
    
    /**
     * Creates new form GuiFornecedorForneceProduto
     */
    public GuiFornecedorForneceProduto() {
        initComponents();
        setLocationRelativeTo(null);//mostra no centro da tela  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPFornecedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jFornecedorBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jProdutoBox = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabelaForneForneceProduto = new javax.swing.JTable();
        jBAtualizar = new javax.swing.JButton();
        jBNovo = new javax.swing.JButton();
        jBAlterar = new javax.swing.JButton();
        jBApagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Entrada de Produtos");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPFornecedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtro"));

        jLabel1.setText("Fornecedores.:");

        jFornecedorBox.setToolTipText("");
        jFornecedorBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jFornecedorBoxItemStateChanged(evt);
            }
        });

        jLabel2.setText("Produtos.:");

        jProdutoBox.setToolTipText("");
        jProdutoBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jProdutoBoxItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPFornecedorLayout = new javax.swing.GroupLayout(jPFornecedor);
        jPFornecedor.setLayout(jPFornecedorLayout);
        jPFornecedorLayout.setHorizontalGroup(
            jPFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFornecedorBox, 0, 423, Short.MAX_VALUE)
                    .addComponent(jProdutoBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPFornecedorLayout.setVerticalGroup(
            jPFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFornecedorBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jProdutoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Fornece..."));

        jTabelaForneForneceProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Produto", "Fornecedor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTabelaForneForneceProduto);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jBAtualizar.setText("Atualizar");
        jBAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAtualizarActionPerformed(evt);
            }
        });

        jBNovo.setText("Novo");
        jBNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNovoActionPerformed(evt);
            }
        });

        jBAlterar.setText("Alterar");
        jBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarActionPerformed(evt);
            }
        });

        jBApagar.setText("Excluir");
        jBApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBApagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jBAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBApagar))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAtualizarActionPerformed
        // TODO add your handling code here:
        //atualizar combobox Fornecedor e o Produto
        atualizarListaTodos();
    }//GEN-LAST:event_jBAtualizarActionPerformed

    private void jBApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBApagarActionPerformed
        // TODO add your handling code here:
         int resposta;

        try {
            //pegar o os dados do produto selecionado
            Produto_Fornecedor pf = listaProdutoFornecedor.get(jTabelaForneForneceProduto.getSelectedRow());

            resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente Apagar ?", "", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {

                //consulta a descrição do produto selecionado
                Produto pconsul = fachada.consultarProduto(pf.getProduto().getProdutos_Descricao());
                
                //consultar a descrição do fornecedor selecionado
                Fornecedor fconsul = fachada.consultarForRazaoSocial(pf.getFornecedor().getFornecedores_RazaoSocial());
                
                if (pconsul != null) {       //seta o codigo do produto selecionado da consulta
                    fachada.excluirProduto_Fornecedor(fconsul.getFornecedores_Codigo(),pconsul.getProdutos_Codigo());
                    
                    //Qual foi o fitro utilizado!
                    switch(selecionado){
                        case 1:
                            pesquisarFornecedor((String)jFornecedorBox.getSelectedItem());//atalizar a tabela do tal fornecedor selecionado
                            break;
                        case 2:
                            pesquisarProduto((String) jProdutoBox.getSelectedItem());//atualizar a tabela do tal produto selecionado
                    }
                    
                }
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Selecione o produto!");
        } catch (GeralException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jBApagarActionPerformed

    private void jFornecedorBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jFornecedorBoxItemStateChanged
        // TODO add your handling code here:
        pesquisarFornecedor((String) jFornecedorBox.getSelectedItem());
        
        //Isso indica que o filtro foi feito pelo Produto
        selecionado = 1;
    }//GEN-LAST:event_jFornecedorBoxItemStateChanged

    private void jProdutoBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jProdutoBoxItemStateChanged
        // TODO add your handling code here:
        pesquisarProduto((String)jProdutoBox.getSelectedItem());
        
        //Isso indica que o filtro foi feito pelo Produto
        selecionado = 2;
    }//GEN-LAST:event_jProdutoBoxItemStateChanged

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        atualizarFiltro();//atualiza o filtro
        
        atualizarListaTodos();//Lista todos os produtos que possuem Fornecedores
    }//GEN-LAST:event_formComponentShown

    private void jBNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNovoActionPerformed
        // TODO add your handling code here:
        GuiFornecedorFoneceNovoProduto gffnp = new GuiFornecedorFoneceNovoProduto();
        gffnp.setVisible(true);
    }//GEN-LAST:event_jBNovoActionPerformed

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
        // TODO add your handling code here:
         try{
             //criar o objeto alterar o fornecedor do produto
             GuiFornecedorAlterarForneceProduto altFornecedorProduto = new GuiFornecedorAlterarForneceProduto();
             
                        //LISTA DO FORNECEDOR
                Fornecedor forne;
                ArrayList<Fornecedor> listafo;
                    try{
                            //Lista dos os segmentos
                            listafo = (ArrayList<Fornecedor>)fachada.listarFornecedor();
                            for(Iterator<Fornecedor> it = listafo.iterator(); it.hasNext();){
                                forne = it.next();
                                altFornecedorProduto.jFornecedorBox.addItem(forne.getFornecedores_RazaoSocial());	
                            }
                    }catch (GeralException ex){
                            JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                    //LISTAR OS PRODUTDOS
                    Produto p;
                    ArrayList<Produto> listap;
                    try{
                            listap = (ArrayList<Produto>) fachada.listaProdutoTudo();
                            for(Iterator<Produto> it = listap.iterator(); it.hasNext();){
                                p = it.next();
                                altFornecedorProduto.jProdutoBox.addItem(p.getProdutos_Descricao());
                            }
                    }catch (GeralException ex){
                            JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                    
                    //pegar o objeto selecionado
            Produto_Fornecedor pf = pSelecionado();
            
            
            altFornecedorProduto.jFornecedorField.setText(pf.getFornecedor().getFornecedores_RazaoSocial());
            altFornecedorProduto.jFornecedorBox.setSelectedItem(pf.getFornecedor().getFornecedores_RazaoSocial());//setar o fornecedor
            altFornecedorProduto.jProdutoField.setText(pf.getProduto().getProdutos_Descricao());
            altFornecedorProduto.jProdutoBox.setSelectedItem(pf.getProduto().getProdutos_Descricao());//seta o produto
           
            try{
            //antes de abrir lança o codigo desse produto selecionado
            Produto_Fornecedor pfconsul = fachada.consultarLigacaoFornecedorProduto(pf.getFornecedor().getFornecedores_RazaoSocial(), pf.getProduto().getProdutos_Descricao());
            
            //Codigo do produto lançado para um Inteiro publico em GuiProdutoAlterar
            altFornecedorProduto.codFornecedor = pfconsul.getFornecedores_Codigo();
            altFornecedorProduto.codProduto = pfconsul.getProdutos_Codigo();
             
             
             //chama a tela para alterar
             altFornecedorProduto.setVisible(true);
             
            }catch(GeralException ex){
                JOptionPane.showMessageDialog(null,ex.getMessage());
            }
             
         }catch(ArrayIndexOutOfBoundsException ex){
            JOptionPane.showMessageDialog(null, "Selecione o produto!");
        }
    }//GEN-LAST:event_jBAlterarActionPerformed

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
            java.util.logging.Logger.getLogger(GuiFornecedorForneceProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiFornecedorForneceProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiFornecedorForneceProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiFornecedorForneceProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new GuiFornecedorForneceProduto().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBApagar;
    private javax.swing.JButton jBAtualizar;
    private javax.swing.JButton jBNovo;
    public javax.swing.JComboBox jFornecedorBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPFornecedor;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JComboBox jProdutoBox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabelaForneForneceProduto;
    // End of variables declaration//GEN-END:variables
    
    //ATUALIZAR OS COMBOBOX FORNECEDOR E PRODUTO
    public void atualizarFiltro(){
         //LISTA DO FORNECEDOR
       Fornecedor forne;
       ArrayList<Fornecedor> listafo;
	try{
		//Lista dos os segmentos
		listafo = (ArrayList<Fornecedor>)fachada.listarFornecedor();
		for(Iterator<Fornecedor> it = listafo.iterator(); it.hasNext();){
                    forne = it.next();
                    jFornecedorBox.addItem(forne.getFornecedores_RazaoSocial());	
		}
	}catch (GeralException ex){
		JOptionPane.showMessageDialog(null, ex.getMessage());
	}
        //LISTAR OS PRODUTDOS
        Produto p;
        ArrayList<Produto> listap;
        try{
                listap = (ArrayList<Produto>) fachada.listaProdutoTudo();
                for(Iterator<Produto> it = listap.iterator(); it.hasNext();){
                    p = it.next();
                    jProdutoBox.addItem(p.getProdutos_Descricao());
                }
        }catch (GeralException ex){
		JOptionPane.showMessageDialog(null, ex.getMessage());
	}
    }
    
    //MODELO DA TABELA FORNECEDOR FORNECE PRODUTO
    private DefaultTableModel geramodelo(ArrayList<Produto_Fornecedor> listaForneForneciProduto) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Produto");
        modelo.addColumn("Fornecedor");

        ArrayList<String> valores;
        int i = 0;
        for (Produto_Fornecedor pf : listaForneForneciProduto) {
            valores = new ArrayList<String>();
            valores.add(pf.getProduto().getProdutos_Descricao());
            valores.add(pf.getFornecedor().getFornecedores_RazaoSocial());
            modelo.insertRow(i, valores.toArray());
            i++;
        }
        return modelo;
    }
    
    //PESQUISAR TODO OS FORNECEDORES DO PRODUTO SELECIONADO
    private void pesquisarProduto(String descricao_produto){
        try {
            listaProdutoFornecedor = (ArrayList<Produto_Fornecedor>) fachada.listarFornecedoresdetalProduto(descricao_produto);
        } catch (GeralException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        DefaultTableModel modelo = geramodelo(listaProdutoFornecedor);
        jTabelaForneForneceProduto.setModel(modelo); 
    }
    
    //LISTAR TODOS OS PRODUTOS FORNECIDOS PELO FORNECEDOR SELECIONADO
    private void pesquisarFornecedor(String fornecedor_RazaoSocial){
        try {
            listaProdutoFornecedor = (ArrayList<Produto_Fornecedor>) fachada.listarFornecedordeProduto(fornecedor_RazaoSocial);
        } catch (GeralException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        DefaultTableModel modelo = geramodelo(listaProdutoFornecedor);
        jTabelaForneForneceProduto.setModel(modelo); 
     }
    
    //LISTAR TODOS OS PRODUTOS FORNECIDOS
    private void atualizarListaTodos(){
         try {
            listaProdutoFornecedor = (ArrayList<Produto_Fornecedor>) fachada.listarTodosProdutosFornecidos();
        } catch (GeralException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        DefaultTableModel modelo = geramodelo(listaProdutoFornecedor);
        jTabelaForneForneceProduto.setModel(modelo); 
    }
    
    //SELECIONA A LINHA
       public Produto_Fornecedor pSelecionado(){
        Produto_Fornecedor pf = listaProdutoFornecedor.get(jTabelaForneForneceProduto.getSelectedRow());
        return pf;
    }
    
//fim
}
