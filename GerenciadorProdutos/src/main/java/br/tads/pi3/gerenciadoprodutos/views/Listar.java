package br.tads.pi3.gerenciadoprodutos.views;

import br.tads.pi3.gerenciadoprodutos.database.daoProduto;
import br.tads.pi3.gerenciadoprodutos.models.Produto;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final  class Listar extends javax.swing.JFrame {

    private EditItem editItem = null;
    private AddItem addItem = null;
    private List<Produto> prod;
    
    
    public  Listar() {

        initComponents();
        atualizar();
        
        
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
        jButtonSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDeResultados = new javax.swing.JTable();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonIncuir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Lista de Produtos");

        jButtonSair.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        tabelaDeResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Descrição", "Quantidade", "Preço de Compra", "Preço de Venda"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaDeResultados);

        jButtonAlterar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonIncuir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonIncuir.setText("Incluir");
        jButtonIncuir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncuirActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setText("Atualizar Tabela");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonIncuir, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSair)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonIncuir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
          
        if (tabelaDeResultados.getSelectedRow() >=0){
              
        final int row = tabelaDeResultados.getSelectedRow();
        String nome = (String) tabelaDeResultados.getValueAt(row, 1);
          
        int respostaConfirmacao = JOptionPane.showConfirmDialog(rootPane, 
                  "Alterar o produto \"" + nome + "\"?",
                    "Confirmar Alterção", JOptionPane.YES_NO_OPTION);
          
          if (respostaConfirmacao == JOptionPane.YES_OPTION){
          Integer id = (Integer) tabelaDeResultados.getValueAt(row, 0);
          
          if (editItem == null || !editItem.isDisplayable()) {
            editItem = new EditItem();
        }
          
            try {
               Produto p = daoProduto.obter(id);
               editItem.atualizarCampos(p);
            } catch (Exception ex) {
                Logger.getLogger(Listar.class.getName()).log(Level.SEVERE, null, ex);
            }
   
        editItem.setVisible(true);
        editItem.toFront();
        editItem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        editItem.setSize(610, 340);
        editItem.setResizable(false);
        editItem.setLocationRelativeTo(null);
          
        
         
          }       
        } else {
        
            JOptionPane.showMessageDialog(rootPane,"NENHUM PRODUTO NA BASE DE DADOS"
                    , "ERRO", JOptionPane.ERROR_MESSAGE);
        
        }
        
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        
          if (tabelaDeResultados.getSelectedRow() >=0){
              
          final int row = tabelaDeResultados.getSelectedRow();
          String nome = (String) tabelaDeResultados.getValueAt(row, 1);
          
          int respostaConfirmacao = JOptionPane.showConfirmDialog(rootPane, 
                  "Excluir o produto \"" + nome + "\"?",
                    "Confirmar exclusão", JOptionPane.YES_NO_OPTION);
          
          if (respostaConfirmacao == JOptionPane.YES_OPTION){
          Integer id = (Integer) tabelaDeResultados.getValueAt(row, 0);
          
              try {
                  daoProduto.excluir(id);  
                  atualizar();
              } catch (Exception ex) {
                  Logger.getLogger(Listar.class.getName()).log(Level.SEVERE, null, ex);
              }
         
          }        
        }else {
        
            JOptionPane.showMessageDialog(rootPane,"NENHUM PRODUTO NA BASE DE DADOS"
                    , "ERRO", JOptionPane.ERROR_MESSAGE);
        
        }                
          
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonIncuirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncuirActionPerformed

        if(addItem == null || !addItem.isDisplayable()){
            addItem = new AddItem();
        }
        addItem.setVisible(true);
        addItem.toFront();
        addItem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addItem.setSize(610, 340);
        addItem.setResizable(false);
        addItem.setLocationRelativeTo(null);
        
        atualizar(); 
        
    }//GEN-LAST:event_jButtonIncuirActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        atualizar();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                new Listar().setVisible(true);
                
                
                
                
            }
        });
    }

    public void atualizar (){
    
        try {
            prod = daoProduto.listar();
        } catch (Exception ex) {
            Logger.getLogger(Listar.class.getName()).log(Level.SEVERE, null, ex);
        }

        DefaultTableModel model = (DefaultTableModel) tabelaDeResultados.getModel();

        model.setRowCount(0);

        if (prod != null && prod.size() > 0) {
            for (int contador = 0; contador < prod.size(); contador++) {
                Produto produto = prod.get(contador);
                if (produto != null) {

                    Object[] row = new Object[6];
                    row[0] = produto.getID();
                    row[1] = produto.getNome();
                    row[2] = produto.getDescricao();
                    row[3] = produto.getQuantidade();
                    row[4] = produto.getpCompra();
                    row[5] = produto.getpVenda();

                    model.addRow(row);

                }

            }

        } 
        
    
    
    
    }
    
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonIncuir;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaDeResultados;
    // End of variables declaration//GEN-END:variables
}