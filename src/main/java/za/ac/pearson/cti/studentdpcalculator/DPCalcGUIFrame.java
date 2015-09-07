//Stephan Malan DV2015-0073
package za.ac.pearson.cti.studentdpcalculator;

import javax.swing.ImageIcon;

public class DPCalcGUIFrame extends javax.swing.JFrame {

    public DPCalcGUIFrame() {
        initComponents();
        EmoticonImg.setIcon(new ImageIcon("../C_ITOO121Project/src/main/java/Resources/Neutral.png"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calcPnl = new javax.swing.JPanel();
        headingLbl = new javax.swing.JLabel();
        semMarkLbl = new javax.swing.JLabel();
        assMarkLbl = new javax.swing.JLabel();
        contAssMarkLbl = new javax.swing.JLabel();
        semTestWeightLbl = new javax.swing.JLabel();
        contAssWeightLbl = new javax.swing.JLabel();
        passFailLbl = new javax.swing.JLabel();
        assWeightLbl = new javax.swing.JLabel();
        percLbl = new javax.swing.JLabel();
        calculateBtn = new javax.swing.JButton();
        EmoticonImg = new javax.swing.JLabel();
        subjectCmbBox = new javax.swing.JComboBox();
        semTestMarkTxtField = new javax.swing.JTextField();
        assMarkTxtField = new javax.swing.JTextField();
        contAssMarkTxtField = new javax.swing.JTextField();
        assWeightTxtField = new javax.swing.JTextField();
        contAssWeightTxtField = new javax.swing.JTextField();
        semTestWeightTxtField = new javax.swing.JTextField();
        addSubjectBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        helpBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DP Calculator - by Stephan Malan");

        headingLbl.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        headingLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headingLbl.setText("DP Calculator");

        semMarkLbl.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        semMarkLbl.setText("Semester Test Mark:");

        assMarkLbl.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        assMarkLbl.setText("Assignment Mark:");

        contAssMarkLbl.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        contAssMarkLbl.setText("Continuous Assessment Mark:");

        semTestWeightLbl.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        semTestWeightLbl.setText("Semester Test Weight:");

        contAssWeightLbl.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        contAssWeightLbl.setText("Continuous Assessment Weight:");

        passFailLbl.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        passFailLbl.setText("Press Calculate to calculate DP");

        assWeightLbl.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        assWeightLbl.setText("Assignment Weight:");

        percLbl.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        percLbl.setText("Percentage Achieved:");

        calculateBtn.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        calculateBtn.setText("Calculate");
        calculateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateBtnActionPerformed(evt);
            }
        });

        subjectCmbBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Subjects", "Object Orientated Programming", "Networking Technologies", "Introduction to Information Systems", "Human Computer Interaction", "Computer Skills Development B", "Software Development Project" }));

        assWeightTxtField.setText("0.2");

        contAssWeightTxtField.setText("0.2");

        semTestWeightTxtField.setText("0.6");

        addSubjectBtn.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        addSubjectBtn.setText("Add Subject");
        addSubjectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSubjectBtnActionPerformed(evt);
            }
        });

        resetBtn.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        helpBtn.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        helpBtn.setText("Help");
        helpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout calcPnlLayout = new javax.swing.GroupLayout(calcPnl);
        calcPnl.setLayout(calcPnlLayout);
        calcPnlLayout.setHorizontalGroup(
            calcPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headingLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, calcPnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(subjectCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
            .addGroup(calcPnlLayout.createSequentialGroup()
                .addGroup(calcPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(calcPnlLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(calcPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(semMarkLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(assMarkLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(contAssMarkLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(semTestWeightLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(contAssWeightLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(assWeightLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passFailLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(percLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(calcPnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(EmoticonImg, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(calcPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(semTestMarkTxtField)
                    .addComponent(assMarkTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addComponent(contAssMarkTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addComponent(assWeightTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addComponent(contAssWeightTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addComponent(semTestWeightTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addGroup(calcPnlLayout.createSequentialGroup()
                        .addGroup(calcPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addSubjectBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(calculateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(resetBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(helpBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(25, Short.MAX_VALUE))))
        );
        calcPnlLayout.setVerticalGroup(
            calcPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calcPnlLayout.createSequentialGroup()
                .addComponent(headingLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subjectCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(calcPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(semMarkLbl)
                    .addComponent(semTestMarkTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(calcPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contAssMarkLbl)
                    .addComponent(contAssMarkTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(calcPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(assMarkLbl)
                    .addComponent(assMarkTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(calcPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(semTestWeightLbl)
                    .addComponent(semTestWeightTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(calcPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(calcPnlLayout.createSequentialGroup()
                        .addComponent(contAssWeightLbl)
                        .addGap(18, 18, 18)
                        .addGroup(calcPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(assWeightLbl)
                            .addComponent(assWeightTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(contAssWeightTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(passFailLbl)
                .addGap(18, 18, 18)
                .addComponent(percLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(calcPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EmoticonImg, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(calcPnlLayout.createSequentialGroup()
                        .addComponent(calculateBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addSubjectBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(helpBtn)))
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(calcPnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(calcPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateBtnActionPerformed
        DPcalc dpcalc = new DPcalc(Double.parseDouble(semTestMarkTxtField.getText()), Double.parseDouble(contAssMarkTxtField.getText()), Double.parseDouble(assMarkTxtField.getText()), "", "", "", Double.parseDouble(semTestWeightTxtField.getText()), Double.parseDouble(contAssWeightTxtField.getText()), Double.parseDouble(assWeightTxtField.getText()));
        percLbl.setText("Percentage Acheived: " + dpcalc.calculateDP() + "%");
        if (dpcalc.canWriteExams()) {
            EmoticonImg.setIcon(new ImageIcon("../C_ITOO121Project/src/main/java/Resources/Happy.png"));
            passFailLbl.setText("Pass");
        } else {
            EmoticonImg.setIcon(new ImageIcon("../C_ITOO121Project/src/main/java/Resources/Sad.png"));
            passFailLbl.setText("Fail");
        }
    }//GEN-LAST:event_calculateBtnActionPerformed

    private void addSubjectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSubjectBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addSubjectBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        semTestMarkTxtField.setText("");
        contAssMarkTxtField.setText("");
        assMarkTxtField.setText("");
        passFailLbl.setText("Press Calculate to calculate DP");
        percLbl.setText("Percentage Acheived:");
        subjectCmbBox.setSelectedIndex(0);
        EmoticonImg.setIcon(new ImageIcon("../C_ITOO121Project/src/main/java/Resources/Neutral.png"));
    }//GEN-LAST:event_resetBtnActionPerformed

    private void helpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_helpBtnActionPerformed

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
            java.util.logging.Logger.getLogger(DPCalcGUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DPCalcGUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DPCalcGUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DPCalcGUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DPCalcGUIFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EmoticonImg;
    private javax.swing.JButton addSubjectBtn;
    private javax.swing.JLabel assMarkLbl;
    private javax.swing.JTextField assMarkTxtField;
    private javax.swing.JLabel assWeightLbl;
    private javax.swing.JTextField assWeightTxtField;
    private javax.swing.JPanel calcPnl;
    private javax.swing.JButton calculateBtn;
    private javax.swing.JLabel contAssMarkLbl;
    private javax.swing.JTextField contAssMarkTxtField;
    private javax.swing.JLabel contAssWeightLbl;
    private javax.swing.JTextField contAssWeightTxtField;
    private javax.swing.JLabel headingLbl;
    private javax.swing.JButton helpBtn;
    private javax.swing.JLabel passFailLbl;
    private javax.swing.JLabel percLbl;
    private javax.swing.JButton resetBtn;
    private javax.swing.JLabel semMarkLbl;
    private javax.swing.JTextField semTestMarkTxtField;
    private javax.swing.JLabel semTestWeightLbl;
    private javax.swing.JTextField semTestWeightTxtField;
    private javax.swing.JComboBox subjectCmbBox;
    // End of variables declaration//GEN-END:variables
}
