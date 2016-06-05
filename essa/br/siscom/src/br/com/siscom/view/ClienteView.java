/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siscom.view;

import br.com.adilson.util.PrinterMatrix;

import br.com.siscom.beans.Cliente;
import br.com.siscom.beans.Conexao;
import java.awt.EventQueue;
import java.beans.Beans;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.File;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.persistence.RollbackException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author pablicio
 */
public class ClienteView extends JPanel {

    public ClienteView() {
        initComponents();
        if (!Beans.isDesignTime()) {
            entityManager.getTransaction().begin();
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("siscomrefatorado?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT C FROM Cliente C");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        masterScrollPane = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();
        newButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        detailScrollPane = new javax.swing.JScrollPane();
        detailTable = new javax.swing.JTable();
        saveButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        deleteDetailButton = new javax.swing.JButton();
        newDetailButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        FormListener formListener = new FormListener();

        setBackground(new java.awt.Color(231, 231, 255));

        masterTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nomeCliente}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cpfCliente}"));
        columnBinding.setColumnName("CPF");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${rgCliente}"));
        columnBinding.setColumnName("RG");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${orgaoRgCliente}"));
        columnBinding.setColumnName("Órgão Expedidor");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nascimentorgCliente}"));
        columnBinding.setColumnName("Aniversário");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${desdeCliente}"));
        columnBinding.setColumnName("Data de ENtrada");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${profissaoCliente}"));
        columnBinding.setColumnName("Profissão");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${empresaCliente}"));
        columnBinding.setColumnName("Empresa ");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${foneEmpresaCliente}"));
        columnBinding.setColumnName("Telefone da Empresa");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${rendaCliente}"));
        columnBinding.setColumnName("Renda");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tipoCliente}"));
        columnBinding.setColumnName("Tipo F/J");
        columnBinding.setColumnClass(Character.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cnpjCliente}"));
        columnBinding.setColumnName("CNPJ");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${referenciaCliente}"));
        columnBinding.setColumnName("Referência");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${foneReferenciaCliente}"));
        columnBinding.setColumnName("Fone Referencia Cliente");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${email}"));
        columnBinding.setColumnName("Email");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        masterScrollPane.setViewportView(masterTable);

        newButton.setBackground(new java.awt.Color(255, 255, 255));
        newButton.setText("Inserir Cliente");
        newButton.addActionListener(formListener);

        deleteButton.setBackground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Excluir Cliente");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), deleteButton, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        deleteButton.addActionListener(formListener);

        detailTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${selectedElement.clienteEnderecoCollection}");
        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, eLProperty, detailTable);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${logradouroEndereco}"));
        columnBinding.setColumnName("Logradouro Endereco");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${complementoEndereco}"));
        columnBinding.setColumnName("Complemento Endereco");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cepEndereco}"));
        columnBinding.setColumnName("Cep Endereco");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${bairroEndereco}"));
        columnBinding.setColumnName("Bairro Endereco");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cidadeEndereco}"));
        columnBinding.setColumnName("Cidade Endereco");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ufEndereco}"));
        columnBinding.setColumnName("Uf Endereco");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codCliente}"));
        columnBinding.setColumnName("Cod Cliente");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codEndereco}"));
        columnBinding.setColumnName("Cod Endereco");
        columnBinding.setColumnClass(Integer.class);
        jTableBinding.setSourceUnreadableValue(java.util.Collections.emptyList());
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        detailScrollPane.setViewportView(detailTable);

        saveButton.setBackground(new java.awt.Color(255, 255, 255));
        saveButton.setText("Salvar");
        saveButton.addActionListener(formListener);

        refreshButton.setBackground(new java.awt.Color(255, 255, 255));
        refreshButton.setText("Cancelar");
        refreshButton.addActionListener(formListener);

        deleteDetailButton.setBackground(new java.awt.Color(255, 255, 255));
        deleteDetailButton.setText("Excluir endereço");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, detailTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), deleteDetailButton, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        deleteDetailButton.addActionListener(formListener);

        newDetailButton.setBackground(new java.awt.Color(255, 255, 255));
        newDetailButton.setText("Novo Endereço");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), newDetailButton, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        newDetailButton.addActionListener(formListener);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Editar Cliente");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jButton1, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jButton1.addActionListener(formListener);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siscom/imagens/print.png"))); // NOI18N
        jButton2.addActionListener(formListener);

        jButton3.setText("jButton3");
        jButton3.addActionListener(formListener);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(newButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton3)
                                .addGap(31, 31, 31)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(newDetailButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteDetailButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(refreshButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saveButton))
                            .addComponent(masterScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE)
                            .addComponent(detailScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {deleteButton, newButton});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {deleteDetailButton, newDetailButton, refreshButton, saveButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(masterScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteButton)
                            .addComponent(newButton)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(detailScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saveButton)
                            .addComponent(refreshButton)
                            .addComponent(deleteDetailButton)
                            .addComponent(newDetailButton)
                            .addComponent(jButton2)))
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        bindingGroup.bind();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == newButton) {
                ClienteView.this.newButtonActionPerformed(evt);
            }
            else if (evt.getSource() == deleteButton) {
                ClienteView.this.deleteButtonActionPerformed(evt);
            }
            else if (evt.getSource() == saveButton) {
                ClienteView.this.saveButtonActionPerformed(evt);
            }
            else if (evt.getSource() == refreshButton) {
                ClienteView.this.refreshButtonActionPerformed(evt);
            }
            else if (evt.getSource() == deleteDetailButton) {
                ClienteView.this.deleteDetailButtonActionPerformed(evt);
            }
            else if (evt.getSource() == newDetailButton) {
                ClienteView.this.newDetailButtonActionPerformed(evt);
            }
            else if (evt.getSource() == jButton1) {
                ClienteView.this.jButton1ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton2) {
                ClienteView.this.jButton2ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton3) {
                ClienteView.this.jButton3ActionPerformed(evt);
            }
        }
    }// </editor-fold>//GEN-END:initComponents


    private void deleteDetailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDetailButtonActionPerformed
        int index = masterTable.getSelectedRow();
        br.com.siscom.beans.Cliente C = list.get(masterTable.convertRowIndexToModel(index));
        Collection<br.com.siscom.beans.ClienteEndereco> cs = C.getClienteEnderecoCollection();
        int[] selected = detailTable.getSelectedRows();
        List<br.com.siscom.beans.ClienteEndereco> toRemove = new ArrayList<br.com.siscom.beans.ClienteEndereco>(selected.length);
        for (int idx = 0; idx < selected.length; idx++) {
            selected[idx] = detailTable.convertRowIndexToModel(selected[idx]);
            int count = 0;
            Iterator<br.com.siscom.beans.ClienteEndereco> iter = cs.iterator();
            while (count++ < selected[idx]) {
                iter.next();
            }
            br.com.siscom.beans.ClienteEndereco c = iter.next();
            toRemove.add(c);
            entityManager.remove(c);
        }
        cs.removeAll(toRemove);
        masterTable.clearSelection();
        masterTable.setRowSelectionInterval(index, index);
    }//GEN-LAST:event_deleteDetailButtonActionPerformed

    private void newDetailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newDetailButtonActionPerformed
        int index = masterTable.getSelectedRow();
        br.com.siscom.beans.Cliente C = list.get(masterTable.convertRowIndexToModel(index));
        Collection<br.com.siscom.beans.ClienteEndereco> cs = C.getClienteEnderecoCollection();
        if (cs == null) {
            cs = new LinkedList<br.com.siscom.beans.ClienteEndereco>();
            C.setClienteEnderecoCollection((List) cs);
        }
        br.com.siscom.beans.ClienteEndereco c = new br.com.siscom.beans.ClienteEndereco();
        entityManager.persist(c);
        c.setCodCliente2(C);
        cs.add(c);
        masterTable.clearSelection();
        masterTable.setRowSelectionInterval(index, index);
        int row = cs.size() - 1;
        detailTable.setRowSelectionInterval(row, row);
        detailTable.scrollRectToVisible(detailTable.getCellRect(row, 0, true));
    }//GEN-LAST:event_newDetailButtonActionPerformed

    @SuppressWarnings("unchecked")
    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        entityManager.getTransaction().rollback();
        entityManager.getTransaction().begin();
        java.util.Collection data = query.getResultList();
        for (Object entity : data) {
            entityManager.refresh(entity);
        }
        list.clear();
        list.addAll(data);
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int[] selected = masterTable.getSelectedRows();
        List<br.com.siscom.beans.Cliente> toRemove = new ArrayList<br.com.siscom.beans.Cliente>(selected.length);
        for (int idx = 0; idx < selected.length; idx++) {
            br.com.siscom.beans.Cliente C = list.get(masterTable.convertRowIndexToModel(selected[idx]));
            toRemove.add(C);
            entityManager.remove(C);
        }
        list.removeAll(toRemove);
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed

        br.com.siscom.beans.Cliente C = new br.com.siscom.beans.Cliente();
        entityManager.persist(C);
        list.add(C);
        int row = list.size() - 1;
        masterTable.setRowSelectionInterval(row, row);
        masterTable.scrollRectToVisible(masterTable.getCellRect(row, 0, true));

        //JFrame frame = new JFrame();
        ClientEditView ce = new ClientEditView(null, true);
        ce.setRegistroAtual(C);
        ce.setVisible(true);

        if (ce.isConfirmaCliente()) {
            saveButton.doClick();
        } else {
            refreshButton.doClick();
        }

    }//GEN-LAST:event_newButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        try {
            entityManager.getTransaction().commit();
            entityManager.getTransaction().begin();
        } catch (RollbackException rex) {
            rex.printStackTrace();
            entityManager.getTransaction().begin();
            List<br.com.siscom.beans.Cliente> merged = new ArrayList<br.com.siscom.beans.Cliente>(list.size());
            for (br.com.siscom.beans.Cliente C : list) {
                merged.add(entityManager.merge(C));
            }
            list.clear();
            list.addAll(merged);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ClientEditView ce = new ClientEditView(null, true);
        ce.setRegistroAtual(list.get(masterTable.getSelectedRow()));
        ce.setVisible(true);

        if (ce.isConfirmaCliente()) {
            saveButton.doClick();
        } else {
            refreshButton.doClick();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PrinterMatrix p = new PrinterMatrix();

        /*
        ------------------------------------------------------------
            Universidade Estadual da Paraíba
        ------------------------------------------------------------
        Relação de clientes
        ------------------------------------------------------------
        Código             Nascimento          E-mail
        ------------------------------------------------------------
        Thiago             04/10/1990          pabliciotjg@gmail.com
     
         */
        //Tamanho da tela de impressão
        p.setOutSize(25, 100);
        p.printCharAtCol(1, 1, 100, "_");
        p.printTextLinCol(2, 1, "Universidade Estadual da Paraíba");
        p.printCharAtCol(3, 1, 100, "_");
        p.printTextLinCol(4, 1, "Relação dos Clientes");
        p.printCharAtCol(5, 1, 100, "_");
        p.printTextLinCol(6, 1, "Código");
        p.printTextLinCol(6, 8, "Nome");
        p.printTextLinCol(6, 60, "E-mail");
        p.printTextLinCol(6, 84, "Profissão");
        p.printCharAtCol(7, 1, 100, "_");

        int linha = 8;
        for (Cliente cliente : list) {
            p.printTextLinCol(linha, 1, String.valueOf(cliente.getCodCliente()));
            p.printTextLinCol(linha, 8, cliente.getNomeCliente());
            p.printTextLinCol(linha, 60, cliente.getEmail());
                        p.printTextLinCol(linha, 84, cliente.getProfissaoCliente());

            linha++;
        }
        p.printCharAtCol(7, 1, 80, "_");
        
        p.toFile("impressao.txt");
           String arg[] = {""};
            ImpressaoView.main(arg);

    }//GEN-LAST:event_jButton2ActionPerformed
    private Connection connection = new Conexao().conectar();

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Map p = new  HashMap();
        
        try {
            System.out.println( new File("").getAbsolutePath());
            JasperReport  report = JasperCompileManager.compileReport("C:\\Users\\pablicio\\Documents\\essa\\br\\siscom\\src\\br\\com\\siscom\\relatorios\\Clientes.jrxml");
            JasperPrint print = JasperFillManager.fillReport(report, p,connection);
            JasperViewer view = new JasperViewer(print, false);
            view.setTitle("Relatório de Quartos");
            view.setVisible(true);
            view.toFront();
        } catch (Exception e) {
            e.printStackTrace();
        }    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton deleteDetailButton;
    private javax.swing.JScrollPane detailScrollPane;
    private javax.swing.JTable detailTable;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private java.util.List<br.com.siscom.beans.Cliente> list;
    private javax.swing.JScrollPane masterScrollPane;
    private javax.swing.JTable masterTable;
    private javax.swing.JButton newButton;
    private javax.swing.JButton newDetailButton;
    private javax.persistence.Query query;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton saveButton;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();
                frame.setContentPane(new ClienteView());
                //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
                frame.setTitle(args[0]);
                frame.setLocationRelativeTo(null);
            }
        });
    }

}