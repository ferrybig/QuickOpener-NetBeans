/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.quickopener.prefs;

import com.sessonad.oscommands.commands.Commands;
import javax.swing.JTextField;
import org.openide.util.HelpCtx;

/**
 *
 * @author markiewb
 */
public class EditCommandPanel extends javax.swing.JPanel {

    /**
     * Creates new form EditCommandPanel
     */
    public EditCommandPanel() {
        initComponents();
    }

    public JTextField getCmddescription() {
        return cmddescription;
    }

    public JTextField getCmdvalue() {
        return cmdvalue;
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
        cmddescription = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmdvalue = new javax.swing.JTextField();
        btnPlaceholders = new javax.swing.JButton();

        jLabel1.setLabelFor(cmddescription);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(EditCommandPanel.class, "EditCommandPanel.jLabel1.text")); // NOI18N

        cmddescription.setText(org.openide.util.NbBundle.getMessage(EditCommandPanel.class, "EditCommandPanel.cmddescription.text")); // NOI18N

        jLabel4.setLabelFor(cmdvalue);
        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(EditCommandPanel.class, "EditCommandPanel.jLabel4.text")); // NOI18N

        cmdvalue.setText(org.openide.util.NbBundle.getMessage(EditCommandPanel.class, "EditCommandPanel.cmdvalue.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(btnPlaceholders, org.openide.util.NbBundle.getMessage(EditCommandPanel.class, "EditCommandPanel.btnPlaceholders.text")); // NOI18N
        btnPlaceholders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceholdersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdvalue, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(cmddescription))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPlaceholders)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmddescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cmdvalue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btnPlaceholders))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlaceholdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceholdersActionPerformed
        new HelpCtx("me.dsnet.quickopener.placeholders").display();
    }//GEN-LAST:event_btnPlaceholdersActionPerformed
//    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {    
//            private final String cmdos = Commands.getPlatform().getOperatingSystem().getShellPrefix();
//        jLabel5.setText("(for your OS is: \'" + cmdos + "\')");
//
//        if (cmdos == null) {
//            return;
//        }
//        boolean value = jCheckBox1.isSelected();
//        String text = cmdvalue.getText();
//        if (value && text != null && !text.startsWith(cmdos)) {
//            text = cmdos + text;
//        } else if (!value && text != null && text.startsWith(cmdos)) {
//            text = text.replaceAll(cmdos, "");
//        }
//        cmdvalue.setText(text);
//    }   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPlaceholders;
    private javax.swing.JTextField cmddescription;
    private javax.swing.JTextField cmdvalue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}