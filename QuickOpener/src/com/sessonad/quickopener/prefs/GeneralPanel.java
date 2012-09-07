/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sessonad.quickopener.prefs;

import com.sessonad.quickopener.QuickMessages;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;

/**
 *
 * @author SessonaD
 */
public class GeneralPanel extends javax.swing.JPanel {

    /**
     * Creates new form GeneralPanel
     */
    public GeneralPanel() {
        initComponents();
        QuickOpenerProperty customSeparator=PrefsUtil.load(null,"generalseparator",getOSSeparator());
        jLabel2.setText(customSeparator.getValue());
        QuickOpenerProperty customShell=PrefsUtil.load(null,"customShell",null);
        cShellLabel.setText((customShell.getValue()==null)?"not defined":customShell.getValue());            
    }

    private String getOSSeparator(){
        return System.getProperty("file.separator");
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        defaultButton = new javax.swing.JButton();
        applyButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cShellLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        defaultCShellButton = new javax.swing.JButton();
        applyCShellButton = new javax.swing.JButton();
        cshellTextField = new javax.swing.JTextField();

        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(GeneralPanel.class, "GeneralPanel.jLabel3.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(GeneralPanel.class, "GeneralPanel.jLabel4.text")); // NOI18N

        setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(GeneralPanel.class, "GeneralPanel.border.title"))); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(GeneralPanel.class, "GeneralPanel.jLabel1.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(GeneralPanel.class, "GeneralPanel.jLabel2.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(defaultButton, org.openide.util.NbBundle.getMessage(GeneralPanel.class, "GeneralPanel.defaultButton.text")); // NOI18N
        defaultButton.setToolTipText(org.openide.util.NbBundle.getMessage(GeneralPanel.class, "GeneralPanel.defaultButton.toolTipText")); // NOI18N
        defaultButton.setBorderPainted(false);
        defaultButton.setFocusPainted(false);
        defaultButton.setFocusable(false);
        defaultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defaultButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(applyButton, org.openide.util.NbBundle.getMessage(GeneralPanel.class, "GeneralPanel.applyButton.text")); // NOI18N
        applyButton.setBorderPainted(false);
        applyButton.setFocusable(false);
        applyButton.setRequestFocusEnabled(false);
        applyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyButtonActionPerformed(evt);
            }
        });

        jTextField1.setText(org.openide.util.NbBundle.getMessage(GeneralPanel.class, "GeneralPanel.jTextField1.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel5, org.openide.util.NbBundle.getMessage(GeneralPanel.class, "GeneralPanel.jLabel5.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel6, org.openide.util.NbBundle.getMessage(GeneralPanel.class, "GeneralPanel.jLabel6.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(cShellLabel, org.openide.util.NbBundle.getMessage(GeneralPanel.class, "GeneralPanel.cShellLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel8, org.openide.util.NbBundle.getMessage(GeneralPanel.class, "GeneralPanel.jLabel8.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(defaultCShellButton, org.openide.util.NbBundle.getMessage(GeneralPanel.class, "GeneralPanel.defaultCShellButton.text")); // NOI18N
        defaultCShellButton.setToolTipText(org.openide.util.NbBundle.getMessage(GeneralPanel.class, "GeneralPanel.defaultCShellButton.toolTipText")); // NOI18N
        defaultCShellButton.setBorderPainted(false);
        defaultCShellButton.setFocusPainted(false);
        defaultCShellButton.setFocusable(false);
        defaultCShellButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defaultCShellButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(applyCShellButton, org.openide.util.NbBundle.getMessage(GeneralPanel.class, "GeneralPanel.applyCShellButton.text")); // NOI18N
        applyCShellButton.setBorderPainted(false);
        applyCShellButton.setFocusable(false);
        applyCShellButton.setRequestFocusEnabled(false);
        applyCShellButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyCShellButtonActionPerformed(evt);
            }
        });

        cshellTextField.setText(org.openide.util.NbBundle.getMessage(GeneralPanel.class, "GeneralPanel.cshellTextField.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(applyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(defaultButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cShellLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cshellTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(applyCShellButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(defaultCShellButton))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(defaultButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(applyButton)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cShellLabel)
                    .addComponent(jLabel8)
                    .addComponent(defaultCShellButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(applyCShellButton)
                    .addComponent(cshellTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(210, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void applyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyButtonActionPerformed
        String customSep = jTextField1.getText();
        if(customSep!=null && !customSep.isEmpty()){
            PrefsUtil.store("generalseparator" , customSep);
            jLabel2.setText(customSep);
        }else{
            NotifyDescriptor d = new NotifyDescriptor.Message(QuickMessages.SEPARATOR_NULL,NotifyDescriptor.WARNING_MESSAGE);
            DialogDisplayer.getDefault().notify(d);
        }
    }//GEN-LAST:event_applyButtonActionPerformed

    private void defaultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defaultButtonActionPerformed
        PrefsUtil.store("generalseparator" , getOSSeparator());
        jLabel2.setText(getOSSeparator());
    }//GEN-LAST:event_defaultButtonActionPerformed

    private void defaultCShellButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defaultCShellButtonActionPerformed
        PrefsUtil.removeSingleProperty("customShell");
        cShellLabel.setText("not defined");
        cshellTextField.setText("not defined");
    }//GEN-LAST:event_defaultCShellButtonActionPerformed

    private void applyCShellButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyCShellButtonActionPerformed
        String cshell = cshellTextField.getText();
        if(cshell!=null && !cshell.isEmpty()){
            PrefsUtil.store("customShell" , cshell);
            cShellLabel.setText(cshell);
        }else{
            NotifyDescriptor d = new NotifyDescriptor.Message(QuickMessages.CUSTOM_SHELL,NotifyDescriptor.WARNING_MESSAGE);
            DialogDisplayer.getDefault().notify(d);
        }
    }//GEN-LAST:event_applyCShellButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton applyButton;
    private javax.swing.JButton applyCShellButton;
    private javax.swing.JLabel cShellLabel;
    private javax.swing.JTextField cshellTextField;
    private javax.swing.JButton defaultButton;
    private javax.swing.JButton defaultCShellButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
