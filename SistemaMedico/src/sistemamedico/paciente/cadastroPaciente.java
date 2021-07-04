package sistemamedico.paciente;

import java.awt.Color;
import sistemamedico.util.Conexao;
import sistemamedico.util.ValidaCPF;
import javax.swing.JOptionPane;

public class cadastroPaciente extends javax.swing.JFrame {

    public cadastroPaciente() {
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

        jLabel22 = new javax.swing.JLabel();
        Sexo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        TxtCPF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        BtnValidar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        TxtEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtExp = new javax.swing.JTextField();
        TxtNome = new javax.swing.JTextField();
        TxtData = new javax.swing.JTextField();
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
        jLabel17 = new javax.swing.JLabel();
        TxtComp = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        TxtRes = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        TxtComer = new javax.swing.JTextField();
        TxtSenha = new javax.swing.JPasswordField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        TxtPai = new javax.swing.JTextField();
        TxtMae = new javax.swing.JTextField();
        TxtCel = new javax.swing.JTextField();
        BtnLimpar = new javax.swing.JButton();
        TxtNum = new javax.swing.JTextField();
        ComboSexo = new javax.swing.JComboBox<>();
        BtnSair = new javax.swing.JButton();

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel22.setText("Telefone Celular:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(248, 248, 255));
        jLabel1.setText("ENTRE COM SEUS DADOS PARA CADASTRAR");

        TxtCPF.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(248, 248, 255));
        jLabel9.setText("CPF:");

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

        TxtExp.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N

        TxtNome.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N

        TxtData.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(248, 248, 255));
        jLabel7.setText("Sexo:");

        TxtBairro.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(248, 248, 255));
        jLabel5.setText("E-mail:");

        TxtRua.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(248, 248, 255));
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

        TxtSenha.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(248, 248, 255));
        jLabel23.setText("Nome do Pai:");

        jLabel24.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(248, 248, 255));
        jLabel24.setText("Nome da Mãe:");

        TxtPai.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N

        TxtMae.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N

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

        TxtNum.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N

        ComboSexo.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        ComboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feminino", "Masculino ", "Outro" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(TxtRes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                    .addComponent(TxtComer, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtSenha, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addComponent(jLabel6))
                        .addGap(144, 144, 144)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BtnLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnCadastrar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel23)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel24))
                                        .addGap(32, 32, 32)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TxtPai, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtCel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtMae, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel18)
                                            .addComponent(jLabel16))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TxtExp, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                            .addComponent(TxtRua, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                            .addComponent(TxtNum, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                            .addComponent(ComboSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ComboEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(16, 16, 16))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TxtData, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtCEP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(TxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                                .addComponent(TxtComp, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(481, 481, 481)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(ComboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(TxtExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TxtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TxtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12))))
                    .addComponent(ComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18)
                        .addComponent(TxtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TxtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)
                        .addComponent(TxtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(TxtComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(TxtRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(TxtCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(TxtComer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(TxtPai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(TxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnLimpar)
                            .addComponent(BtnCadastrar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnValidar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnSair)))
                .addGap(152, 152, 152))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnValidar)
                    .addComponent(jLabel9)
                    .addComponent(BtnSair))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        String expedidor = TxtExp.getText();
        String rua = TxtRua.getText();
        String numero = TxtNum.getText();
        String celular = TxtCel.getText();
        String pai = TxtPai.getText();
        String mae = TxtMae.getText();
        String senha = TxtSenha.getText();
        String estado = ComboEstado.getSelectedItem().toString();
        String sexos = ComboSexo.getSelectedItem().toString();

        try {
            if (nome.equals("") || nascimento.equals("") || rg.equals("") || email.equals("") || cidade.equals("")
                    || cep.equals("") || bairro.equals("") || expedidor.equals("") || rua.equals("") || numero.equals("")
                    || celular.equals("") || pai.equals("") || mae.equals("") || senha.equals("")
                    || estado.equals("") || sexos.equals("")) {
                throw new Exception("Preencha todos os campos!");
            }
            int nmr = Integer.parseInt(numero);
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

            conexao.statement.executeUpdate("INSERT INTO Paciente VALUES ('"
                    + pai + "','"
                    + mae + "','"
                    + rg + "')");

            conexao.statement.executeUpdate("INSERT INTO Login VALUES ('"
                    + senha + "','"
                    + rg + "')");

            JOptionPane.showMessageDialog(this, "Dados Salvos!!!");
            limparCampos();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "O número da casa deve ser inteiro!", "ERRO", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Houve um erro na criação do cadastro!", "ERRO", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_BtnCadastrarActionPerformed

    private void BtnValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnValidarActionPerformed

        ValidaCPF validar = new ValidaCPF();
        cpf = TxtCPF.getText();
        if (validar.isCPF(cpf)) {
            TxtCPF.setText(validar.imprimeCPF(cpf));
            jPanel1.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "CPF invalido!");
            TxtCPF.setText(null);
            TxtCPF.grabFocus();
        }
    }//GEN-LAST:event_BtnValidarActionPerformed

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
        TxtExp.setText(null);
        TxtRua.setText(null);
        TxtNum.setText(null);
        TxtCel.setText(null);
        TxtPai.setText(null);
        TxtMae.setText(null);
        TxtSenha.setText(null);

        ComboEstado.setSelectedIndex(0);
        ComboSexo.setSelectedIndex(0);
        jPanel1.setVisible(false);
        TxtCPF.grabFocus();
    }

    private void BtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_BtnLimparActionPerformed

    private void BtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSairActionPerformed
        new Paciente().setVisible(true);
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
            java.util.logging.Logger.getLogger(cadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroPaciente().setVisible(true);
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
    private javax.swing.JTextField TxtCel;
    private javax.swing.JTextField TxtCidade;
    private javax.swing.JTextField TxtComer;
    private javax.swing.JTextField TxtComp;
    private javax.swing.JTextField TxtData;
    private javax.swing.JTextField TxtEmail;
    private javax.swing.JTextField TxtExp;
    private javax.swing.JTextField TxtMae;
    private javax.swing.JTextField TxtNome;
    private javax.swing.JTextField TxtNum;
    private javax.swing.JTextField TxtPai;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
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
