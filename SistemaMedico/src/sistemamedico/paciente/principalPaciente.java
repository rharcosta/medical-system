package sistemamedico.paciente;

import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sistemamedico.util.Conexao;

public class principalPaciente extends javax.swing.JFrame {

    public principalPaciente() {
        initComponents();

        conexao = new Conexao();
        conexao.abrirConexao();

        Color minhaCor = new Color(88, 151, 143);
        getContentPane().setBackground(minhaCor);

        popularTabela();
    }

    Conexao conexao;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtnAgendar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxtData = new javax.swing.JTextField();
        TxtHorario = new javax.swing.JTextField();
        BtnAlterar = new javax.swing.JButton();
        BtnRemover = new javax.swing.JButton();
        BtnLimpar = new javax.swing.JButton();
        TxtEspecialidade = new javax.swing.JTextField();
        TxtPrioridade = new javax.swing.JTextField();
        menuPaciente = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        jMenu2.setText("jMenu2");

        jMenu3.setText("File");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar1.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jTable1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificação", "Data", "Horário", "Especialidade", "Prioridade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(248, 248, 255));
        jLabel1.setText("SOBRE SUAS CONSULTAS:");

        jLabel5.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(248, 248, 255));
        jLabel5.setText("Identificação:");

        TxtId.setEditable(false);
        TxtId.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TxtId.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(248, 248, 255));
        jLabel2.setText("Data:");

        jLabel3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(248, 248, 255));
        jLabel3.setText("Horário:");

        BtnAgendar.setBackground(new java.awt.Color(255, 140, 0));
        BtnAgendar.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 15)); // NOI18N
        BtnAgendar.setForeground(new java.awt.Color(248, 248, 255));
        BtnAgendar.setText("AGENDAR");
        BtnAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgendarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(248, 248, 255));
        jLabel4.setText("Especialidade:");

        jLabel6.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(248, 248, 255));
        jLabel6.setText("Prioridade:");

        TxtData.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TxtData.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        TxtHorario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TxtHorario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        BtnAlterar.setBackground(new java.awt.Color(255, 140, 0));
        BtnAlterar.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 15)); // NOI18N
        BtnAlterar.setForeground(new java.awt.Color(248, 248, 255));
        BtnAlterar.setText("ALTERAR");
        BtnAlterar.setEnabled(false);
        BtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAlterarActionPerformed(evt);
            }
        });

        BtnRemover.setBackground(new java.awt.Color(255, 140, 0));
        BtnRemover.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 15)); // NOI18N
        BtnRemover.setForeground(new java.awt.Color(248, 248, 255));
        BtnRemover.setText("REMOVER");
        BtnRemover.setEnabled(false);
        BtnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRemoverActionPerformed(evt);
            }
        });

        BtnLimpar.setBackground(new java.awt.Color(255, 140, 0));
        BtnLimpar.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 15)); // NOI18N
        BtnLimpar.setForeground(new java.awt.Color(248, 248, 255));
        BtnLimpar.setText("LIMPAR");
        BtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimparActionPerformed(evt);
            }
        });

        TxtEspecialidade.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TxtEspecialidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        TxtPrioridade.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TxtPrioridade.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        menuPaciente.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jMenu1.setText("CONSULTAS");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        menuPaciente.add(jMenu1);

        jMenu8.setText("RESULTADOS");
        jMenu8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jMenu9.setText("Laudo");
        jMenu9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jMenu9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu9MouseClicked(evt);
            }
        });
        jMenu8.add(jMenu9);

        menuPaciente.add(jMenu8);

        jMenu5.setText("SAIR");
        jMenu5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        menuPaciente.add(jMenu5);

        setJMenuBar(menuPaciente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TxtData)
                    .addComponent(TxtHorario)
                    .addComponent(TxtId)
                    .addComponent(TxtPrioridade)
                    .addComponent(TxtEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnAgendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TxtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TxtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TxtEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TxtPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(BtnAgendar)
                        .addGap(28, 28, 28)
                        .addComponent(BtnLimpar)
                        .addGap(30, 30, 30)
                        .addComponent(BtnAlterar)
                        .addGap(33, 33, 33)
                        .addComponent(BtnRemover)))
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        if (JOptionPane.showConfirmDialog(this, "Deseja realmente sair?",
                "Confirmação da operação", JOptionPane.INFORMATION_MESSAGE)
                == JOptionPane.OK_OPTION) {
            System.exit(0);
        }

    }//GEN-LAST:event_jMenu5MouseClicked

    private void BtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_BtnLimparActionPerformed

    private void BtnAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgendarActionPerformed
        String data = TxtData.getText();
        String hora = TxtHorario.getText();
        String especialidade = TxtEspecialidade.getText();
        String prioridade = TxtPrioridade.getText();

        try {
            if (data.equals("") || hora.equals("") || especialidade.equals("") || prioridade.equals("")) {
                throw new Exception("Preencha todos os dados!!");
            }
            conexao.statement.executeUpdate("INSERT INTO Agendamento VALUES(null, '"
                    + data + "','"
                    + hora + "','"
                    + especialidade + "','"
                    + prioridade + "')");
            limparCampos();
            popularTabela();
            JOptionPane.showMessageDialog(this, "Agendamento realizado!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Houve uma erro na criação do agendamento!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_BtnAgendarActionPerformed

    private void popularTabela() {
        ((DefaultTableModel) jTable1.getModel()).setRowCount(0);
        try {
            ResultSet result = conexao.statement.executeQuery("SELECT * FROM Agendamento");
            while (result.next()) {
                String linha[] = {
                    String.valueOf(result.getInt(1)),
                    result.getString(2),
                    result.getString(3),
                    result.getString(4),
                    result.getString(5)
                };
                ((DefaultTableModel) jTable1.getModel()).addRow(linha);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void BtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAlterarActionPerformed
        int id = Integer.parseInt(TxtId.getText());
        String data = TxtData.getText();
        String horario = TxtHorario.getText();
        String especialidade = TxtEspecialidade.getText();
        String prioridade = TxtPrioridade.getText();

        try {
            if (data.equals("") || horario.equals("") || especialidade.equals("")
                    || prioridade.equals("")) {
                throw new Exception("Preencha todos os campos!!");
            }
            conexao.statement.executeUpdate("UPDATE Agendamento SET Data = '"
                    + data + "', Horario = '"
                    + horario + "', Especialidade = '"
                    + especialidade + "', Prioridade = '"
                    + prioridade + "' WHERE id =" + id);
            limparCampos();
            popularTabela();
            JOptionPane.showMessageDialog(this, "Alteração do agendamento realizado!");

        } catch (Exception e) {
           JOptionPane.showMessageDialog(this,
                    "Houve um erro na alteração do agendamento!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_BtnAlterarActionPerformed

    private void BtnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRemoverActionPerformed

        if (JOptionPane.showConfirmDialog(this, "Deseja realmente remover?",
                "Confirmação da operação", JOptionPane.INFORMATION_MESSAGE)
                == JOptionPane.OK_OPTION) {
            int id = Integer.parseInt(TxtId.getText());
            try {
                conexao.statement.executeUpdate("DELETE FROM Agendamento WHERE id=" + id);
                limparCampos();
                popularTabela();
                BtnAgendar.setEnabled(true);
                BtnAlterar.setEnabled(false);
                BtnRemover.setEnabled(false);
                JOptionPane.showMessageDialog(this, "Exclusão do agendamento realizado!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,
                        "Houve um erro na exclusão do agendamento!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_BtnRemoverActionPerformed

    private void jMenu9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu9MouseClicked
        new laudoPaciente().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu9MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (evt.getClickCount() == 2) {
            TxtId.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            TxtData.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
            TxtHorario.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
            TxtEspecialidade.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
            TxtPrioridade.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
            BtnAgendar.setEnabled(false);
            BtnAlterar.setEnabled(true);
            BtnRemover.setEnabled(true);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void limparCampos() {
        TxtId.setText(null);
        TxtData.setText(null);
        TxtHorario.setText(null);
        TxtEspecialidade.setText(null);
        TxtPrioridade.setText(null);
        TxtData.grabFocus();
    }

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
            java.util.logging.Logger.getLogger(principalPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principalPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principalPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principalPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principalPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgendar;
    private javax.swing.JButton BtnAlterar;
    private javax.swing.JButton BtnLimpar;
    private javax.swing.JButton BtnRemover;
    private javax.swing.JTextField TxtData;
    private javax.swing.JTextField TxtEspecialidade;
    private javax.swing.JTextField TxtHorario;
    private javax.swing.JTextField TxtId;
    private javax.swing.JTextField TxtPrioridade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuBar menuPaciente;
    // End of variables declaration//GEN-END:variables
}
