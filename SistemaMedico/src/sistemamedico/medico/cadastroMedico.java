package sistemamedico.medico;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import sistemamedico.util.ValidaCPF;
import javax.swing.JOptionPane;
import sistemamedico.util.Conexao;

public class cadastroMedico extends javax.swing.JFrame {

    public cadastroMedico() {
        initComponents();

        conexao = new Conexao();
        conexao.abrirConexao();

        Color minhaCor = new Color(88, 151, 143);
        getContentPane().setBackground(minhaCor);

        jPanel1.setBackground(minhaCor);
        jPanel1.setVisible(false);

    }

    String cpf;
    Conexao conexao;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        TxtEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtOrgao = new javax.swing.JTextField();
        TxtNome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TxtBairro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TxtRua = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TxtCEP = new javax.swing.JTextField();
        TxtRG = new javax.swing.JTextField();
        BtnCadastrar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        TxtCidade = new javax.swing.JTextField();
        ComboEstado = new javax.swing.JComboBox<>();
        TxtNum = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        TxtComp = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        TxtRes = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        TxtComer = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        TxtCRM = new javax.swing.JTextField();
        TxtSenha = new javax.swing.JPasswordField();
        TxtCel = new javax.swing.JTextField();
        BtnLimpar = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        TxtEspec = new javax.swing.JTextField();
        ComboSexo = new javax.swing.JComboBox<>();
        TxtData = new javax.swing.JTextField();
        BtnValidar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        TxtCPF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        BtnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(248, 248, 255));
        jLabel3.setText("Registro Geral (RG):");

        TxtEmail.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(248, 248, 255));
        jLabel11.setText("Cidade:");

        jLabel4.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(248, 248, 255));
        jLabel4.setText("Senha:");

        TxtOrgao.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N

        TxtNome.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(248, 248, 255));
        jLabel7.setText("Sexo:");

        TxtBairro.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(248, 248, 255));
        jLabel5.setText("E-mail:");

        TxtRua.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Órgão Expedidor:");

        TxtCEP.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N

        TxtRG.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N

        BtnCadastrar.setBackground(new java.awt.Color(255, 140, 0));
        BtnCadastrar.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 15)); // NOI18N
        BtnCadastrar.setForeground(new java.awt.Color(248, 248, 255));
        BtnCadastrar.setText("CADASTRAR");
        BtnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadastrarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(248, 248, 255));
        jLabel8.setText("Data de Nascimento:");

        jLabel6.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(248, 248, 255));
        jLabel6.setText("Nome:");

        jLabel12.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(248, 248, 255));
        jLabel12.setText("Estado:");

        jLabel13.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(248, 248, 255));
        jLabel13.setText("CEP:");

        jLabel14.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(248, 248, 255));
        jLabel14.setText("Telefone Residencial:");

        jLabel15.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(248, 248, 255));
        jLabel15.setText("Bairro:");

        jLabel16.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(248, 248, 255));
        jLabel16.setText("Número:");

        TxtCidade.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N

        ComboEstado.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        ComboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santos", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul\t", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina\t\t", "São Paulo", "Sergipe", "Tocantins" }));
        ComboEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        TxtNum.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(248, 248, 255));
        jLabel17.setText("Complemento:");

        TxtComp.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(248, 248, 255));
        jLabel18.setText("Rua:");

        TxtRes.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(248, 248, 255));
        jLabel19.setText("Telefone Celular:");

        jLabel20.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(248, 248, 255));
        jLabel20.setText("Telefone Comercial:");

        TxtComer.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(248, 248, 255));
        jLabel21.setText("CRM:");

        TxtCRM.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N

        TxtSenha.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N

        TxtCel.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N

        BtnLimpar.setBackground(new java.awt.Color(255, 140, 0));
        BtnLimpar.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 15)); // NOI18N
        BtnLimpar.setForeground(new java.awt.Color(248, 248, 255));
        BtnLimpar.setText("LIMPAR");
        BtnLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimparActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(248, 248, 255));
        jLabel22.setText("Especialidade:");

        TxtEspec.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N

        ComboSexo.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        ComboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feminino ", "Masculino", "Outro" }));
        ComboSexo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3)
                            .addComponent(jLabel11)
                            .addComponent(jLabel6)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17)
                            .addComponent(jLabel13)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(BtnLimpar)
                                .addGap(18, 18, 18)
                                .addComponent(BtnCadastrar)
                                .addGap(126, 126, 126))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtData, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(TxtBairro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                        .addComponent(TxtComp, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel22)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(TxtEspec, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(TxtNum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel19)
                                                .addGap(18, 18, 18)
                                                .addComponent(TxtCel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(TxtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(141, 141, 141))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(TxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel18)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(TxtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel10)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel12))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(TxtOrgao, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                                        .addComponent(ComboEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(ComboSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                                .addGap(24, 24, 24))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel20)
                            .addComponent(jLabel4)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TxtCRM, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtSenha)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtRes, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                    .addComponent(TxtComer))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(ComboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10)
                    .addComponent(TxtOrgao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(TxtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(TxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(TxtComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(ComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(TxtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(TxtRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TxtComer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TxtCRM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(TxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22)
                                    .addComponent(TxtEspec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BtnCadastrar)
                                    .addComponent(BtnLimpar))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(jLabel19)
                        .addGap(151, 151, 151))))
        );

        BtnValidar.setBackground(new java.awt.Color(255, 140, 0));
        BtnValidar.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 15)); // NOI18N
        BtnValidar.setForeground(new java.awt.Color(248, 248, 255));
        BtnValidar.setText("VALIDAR");
        BtnValidar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnValidarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(248, 248, 255));
        jLabel9.setText("CPF:");

        jLabel1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(248, 248, 255));
        jLabel1.setText("ENTRE COM SEUS DADOS PARA CADASTRAR");

        BtnSair.setBackground(new java.awt.Color(255, 140, 0));
        BtnSair.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 15)); // NOI18N
        BtnSair.setForeground(new java.awt.Color(248, 248, 255));
        BtnSair.setText("SAIR");
        BtnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSairActionPerformed(evt);
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
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(TxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnValidar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnSair)
                                .addGap(227, 227, 227))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(145, 145, 145))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnValidar)
                    .addComponent(jLabel9)
                    .addComponent(BtnSair))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void BtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadastrarActionPerformed
        cpf = TxtCPF.getText();
        String nome = TxtNome.getText();
        String nascimento = TxtData.getText();
        String rg = TxtRG.getText();
        String email = TxtEmail.getText();
        String cidade = TxtCidade.getText();
        String cep = TxtCEP.getText();
        String bairro = TxtBairro.getText();
        String complemento = TxtComp.getText();
        String residencial = TxtRes.getText();
        String comercial = TxtComer.getText();
        String expedidor = TxtOrgao.getText();
        String rua = TxtRua.getText();
        String numero = TxtNum.getText();
        String celular = TxtCel.getText();
        String especialidade = TxtEspec.getText();
        String crm = TxtCRM.getText();
        String senha = TxtSenha.getText();
        String estado = ComboEstado.getSelectedItem().toString();
        String sexos = ComboSexo.getSelectedItem().toString();

        try {
            if (nome.equals("") || nascimento.equals("") || rg.equals("") || email.equals("") || cidade.equals("")
                    || cep.equals("") || bairro.equals("") || expedidor.equals("") || rua.equals("") || numero.equals("")
                    || celular.equals("") || especialidade.equals("") || crm.equals("") || senha.equals("")
                    || estado.equals("") || sexos.equals("")) {
                throw new Exception("Preencha todos os campos!");
            }
            int nmr = Integer.parseInt(numero);
            int CRM = Integer.parseInt(crm);
            conexao.statement.executeUpdate("INSERT INTO Pessoa VALUES('"
                    + nome + "','"
                    + sexos + "','"
                    + nascimento + "','"
                    + cpf + "','"
                    + rg + "','"
                    + expedidor + "','"
                    + email + "')");

            conexao.statement.executeUpdate("INSERT INTO Endereco VALUES('"
                    + cidade + "','"
                    + estado + "','"
                    + cep + "','"
                    + rua + "','"
                    + bairro + "','"
                    + nmr + "','"
                    + complemento + "','"
                    + rg + "')");

            conexao.statement.executeUpdate("INSERT INTO Telefone VALUES ('"
                    + residencial + "','"
                    + celular + "','"
                    + comercial + "','"
                    + rg + "')");

            conexao.statement.executeUpdate("INSERT INTO Medico VALUES ('"
                    + CRM + "','"
                    + especialidade + "','"
                    + rg + "')");

            conexao.statement.executeUpdate("INSERT INTO Login VALUES ('"
                    + senha + "','"
                    + rg + "')");

            JOptionPane.showMessageDialog(this, "Dados Salvos!!!");
            limparCampos();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "O número da casa ou o CRM devem ser inteiros!", "ERRO", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_BtnCadastrarActionPerformed

    private void BtnValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnValidarActionPerformed
        ValidaCPF validar = new ValidaCPF();
        cpf = TxtCPF.getText();

        if (validar.isCPF(cpf)) {
            try {
                String query = "SELECT (SELECT COUNT(*) FROM Pessoa WHERE CPF=?) > 0";
                PreparedStatement stmt = conexao.connection.prepareStatement(query);
                stmt.setString(1, TxtCPF.getText());
                ResultSet RS = stmt.executeQuery();
                if (RS.next()) {
                    JOptionPane.showMessageDialog(null, "CPF já está cadastrado.");
                } else {
                    TxtCPF.setText(validar.imprimeCPF(cpf));
                    jPanel1.setVisible(true);
                }

            } catch (Exception e) {

            }

        } else {
            JOptionPane.showMessageDialog(this, "CPF invalido!");
            TxtCPF.setText(null);
            TxtCPF.grabFocus();
        }
    }//GEN-LAST:event_BtnValidarActionPerformed

    private void BtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_BtnLimparActionPerformed

    private void limparCampos() {
        TxtCPF.setText(null);
        TxtNome.setText(null);
        TxtData.setText(null);
        TxtRG.setText(null);
        TxtEmail.setText(null);
        TxtCidade.setText(null);
        TxtCEP.setText(null);
        TxtBairro.setText(null);
        TxtComp.setText(null);
        TxtRes.setText(null);
        TxtComer.setText(null);
        TxtOrgao.setText(null);
        TxtRua.setText(null);
        TxtNum.setText(null);
        TxtCel.setText(null);
        TxtEspec.setText(null);
        TxtCRM.setText(null);
        TxtSenha.setText(null);

        ComboEstado.setSelectedIndex(0);
        ComboSexo.setSelectedIndex(0);
        jPanel1.setVisible(false);
        TxtCPF.grabFocus();
    }

    private void BtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSairActionPerformed
        new Medico().setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnSairActionPerformed

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
            java.util.logging.Logger.getLogger(cadastroMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastroMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastroMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCadastrar;
    private javax.swing.JButton BtnLimpar;
    private javax.swing.JButton BtnSair;
    private javax.swing.JButton BtnValidar;
    private javax.swing.JComboBox<String> ComboEstado;
    private javax.swing.JComboBox<String> ComboSexo;
    private javax.swing.ButtonGroup Sexo;
    private javax.swing.JTextField TxtBairro;
    private javax.swing.JTextField TxtCEP;
    private javax.swing.JTextField TxtCPF;
    private javax.swing.JTextField TxtCRM;
    private javax.swing.JTextField TxtCel;
    private javax.swing.JTextField TxtCidade;
    private javax.swing.JTextField TxtComer;
    private javax.swing.JTextField TxtComp;
    private javax.swing.JTextField TxtData;
    private javax.swing.JTextField TxtEmail;
    private javax.swing.JTextField TxtEspec;
    private javax.swing.JTextField TxtNome;
    private javax.swing.JTextField TxtNum;
    private javax.swing.JTextField TxtOrgao;
    private javax.swing.JTextField TxtRG;
    private javax.swing.JTextField TxtRes;
    private javax.swing.JTextField TxtRua;
    private javax.swing.JPasswordField TxtSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
