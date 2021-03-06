/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.awt.Color;
import java.text.ParseException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Luis
 */
public class Tela extends javax.swing.JFrame {

    private MaskFormatter mascara_cpf;
    private MaskFormatter mascara_cnpj;
    
    public Tela() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setBackground(Color.BLUE);
        getMascara_cpf();
        getMascara_cnpj();
        tbinfo.setModel(new CategoriaTableModel());
        redimensionaTabela();
    }
    
    private void redimensionaTabela(){
        tbinfo.getColumnModel().getColumn(0).setPreferredWidth(100);
        tbinfo.getColumnModel().getColumn(1).setPreferredWidth(300);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grbotoes = new javax.swing.ButtonGroup();
        lbcabecalho = new javax.swing.JLabel();
        jtaba = new javax.swing.JTabbedPane();
        jpprimeiraaba = new javax.swing.JPanel();
        btexibirmensagem = new javax.swing.JButton();
        btexibirpergunta = new javax.swing.JButton();
        jptestesplitpanel = new javax.swing.JPanel();
        jptestecombobox = new javax.swing.JPanel();
        cbexibirdias = new javax.swing.JComboBox<>();
        btincluirdias = new javax.swing.JButton();
        cbexibircategorias = new javax.swing.JComboBox<>();
        btincluircategorias = new javax.swing.JButton();
        jptestejtable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbinfo = new javax.swing.JTable();
        lbcodigo = new javax.swing.JLabel();
        tfcodigo = new javax.swing.JTextField();
        lbdescricao = new javax.swing.JLabel();
        tfdescricao = new javax.swing.JTextField();
        btinserir = new javax.swing.JButton();
        jptestejradiobutton = new javax.swing.JPanel();
        rbfisico = new javax.swing.JRadioButton();
        rbjuridico = new javax.swing.JRadioButton();
        lbcpfcnpj = new javax.swing.JLabel();
        tfcpfcnpj = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela");
        setResizable(false);

        lbcabecalho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbcabecalho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbcabecalho.setText("Projeto Swing - Cabeçalho do Aplicativo");

        jtaba.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jtaba.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jtaba.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        btexibirmensagem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btexibirmensagem.setText("Exibir Mensagem");
        btexibirmensagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btexibirmensagemActionPerformed(evt);
            }
        });

        btexibirpergunta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btexibirpergunta.setText("Exibir Pergunta");
        btexibirpergunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btexibirperguntaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpprimeiraabaLayout = new javax.swing.GroupLayout(jpprimeiraaba);
        jpprimeiraaba.setLayout(jpprimeiraabaLayout);
        jpprimeiraabaLayout.setHorizontalGroup(
            jpprimeiraabaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpprimeiraabaLayout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addGroup(jpprimeiraabaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btexibirpergunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btexibirmensagem, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        jpprimeiraabaLayout.setVerticalGroup(
            jpprimeiraabaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpprimeiraabaLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btexibirmensagem)
                .addGap(33, 33, 33)
                .addComponent(btexibirpergunta)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jtaba.addTab("Primeira Aba", jpprimeiraaba);

        javax.swing.GroupLayout jptestesplitpanelLayout = new javax.swing.GroupLayout(jptestesplitpanel);
        jptestesplitpanel.setLayout(jptestesplitpanelLayout);
        jptestesplitpanelLayout.setHorizontalGroup(
            jptestesplitpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 581, Short.MAX_VALUE)
        );
        jptestesplitpanelLayout.setVerticalGroup(
            jptestesplitpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 176, Short.MAX_VALUE)
        );

        jtaba.addTab("Teste SplitPane", jptestesplitpanel);

        cbexibirdias.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbexibirdias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Exibir Dias" }));

        btincluirdias.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btincluirdias.setText("Incluir Dias");
        btincluirdias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btincluirdiasActionPerformed(evt);
            }
        });

        cbexibircategorias.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbexibircategorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Exibir Categorias" }));

        btincluircategorias.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btincluircategorias.setText("Incluir Categorias");
        btincluircategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btincluircategoriasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jptestecomboboxLayout = new javax.swing.GroupLayout(jptestecombobox);
        jptestecombobox.setLayout(jptestecomboboxLayout);
        jptestecomboboxLayout.setHorizontalGroup(
            jptestecomboboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jptestecomboboxLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jptestecomboboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbexibircategorias, 0, 150, Short.MAX_VALUE)
                    .addComponent(cbexibirdias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53)
                .addGroup(jptestecomboboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btincluirdias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btincluircategorias, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        jptestecomboboxLayout.setVerticalGroup(
            jptestecomboboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jptestecomboboxLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jptestecomboboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbexibirdias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btincluirdias))
                .addGap(38, 38, 38)
                .addGroup(jptestecomboboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbexibircategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btincluircategorias))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jtaba.addTab("Teste ComboBox", jptestecombobox);

        tbinfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "null", "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbinfo.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbinfo);
        if (tbinfo.getColumnModel().getColumnCount() > 0) {
            tbinfo.getColumnModel().getColumn(0).setResizable(false);
            tbinfo.getColumnModel().getColumn(1).setResizable(false);
        }

        lbcodigo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbcodigo.setText("Código:");

        lbdescricao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbdescricao.setText("Descrição:");

        btinserir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btinserir.setText("Inserir");
        btinserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btinserirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jptestejtableLayout = new javax.swing.GroupLayout(jptestejtable);
        jptestejtable.setLayout(jptestejtableLayout);
        jptestejtableLayout.setHorizontalGroup(
            jptestejtableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jptestejtableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jptestejtableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btinserir)
                    .addComponent(lbdescricao)
                    .addComponent(lbcodigo)
                    .addComponent(tfcodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(tfdescricao))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jptestejtableLayout.setVerticalGroup(
            jptestejtableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jptestejtableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jptestejtableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jptestejtableLayout.createSequentialGroup()
                        .addComponent(lbcodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(lbdescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btinserir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jtaba.addTab("Teste JTable", jptestejtable);

        grbotoes.add(rbfisico);
        rbfisico.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbfisico.setText("Físico");
        rbfisico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbfisicoActionPerformed(evt);
            }
        });

        grbotoes.add(rbjuridico);
        rbjuridico.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbjuridico.setText("Jurídico");
        rbjuridico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbjuridicoActionPerformed(evt);
            }
        });

        lbcpfcnpj.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbcpfcnpj.setText("CPF:");

        javax.swing.GroupLayout jptestejradiobuttonLayout = new javax.swing.GroupLayout(jptestejradiobutton);
        jptestejradiobutton.setLayout(jptestejradiobuttonLayout);
        jptestejradiobuttonLayout.setHorizontalGroup(
            jptestejradiobuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jptestejradiobuttonLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jptestejradiobuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jptestejradiobuttonLayout.createSequentialGroup()
                        .addComponent(lbcpfcnpj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfcpfcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jptestejradiobuttonLayout.createSequentialGroup()
                        .addComponent(rbfisico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbjuridico)))
                .addContainerGap(302, Short.MAX_VALUE))
        );
        jptestejradiobuttonLayout.setVerticalGroup(
            jptestejradiobuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jptestejradiobuttonLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jptestejradiobuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbfisico)
                    .addComponent(rbjuridico))
                .addGap(29, 29, 29)
                .addGroup(jptestejradiobuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbcpfcnpj)
                    .addComponent(tfcpfcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jtaba.addTab("Teste JRadioButton", jptestejradiobutton);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbcabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtaba, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbcabecalho)
                .addGap(18, 18, 18)
                .addComponent(jtaba, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btexibirmensagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexibirmensagemActionPerformed
        JOptionPane.showMessageDialog(null, "Mensagem", "Título da Mensagem", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btexibirmensagemActionPerformed

    private void btexibirperguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexibirperguntaActionPerformed
        int recebe = JOptionPane.showConfirmDialog(null, "Mensagem", "Título da Mensagem", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        switch (recebe) {
            case JOptionPane.YES_OPTION:
                JOptionPane.showMessageDialog(null, "Você clicou no botão SIM");
                break;
            case JOptionPane.NO_OPTION:
                JOptionPane.showMessageDialog(null, "Você clicou no botão NÃO");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Você clicou no botão CANCELAR");
                break;
        }
    }//GEN-LAST:event_btexibirperguntaActionPerformed

    private void btincluirdiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btincluirdiasActionPerformed
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Domingo");
        modelo.addElement("Segunda");
        modelo.addElement("Terça");
        modelo.addElement("Quarta");
        modelo.addElement("Quinta");
        modelo.addElement("Sexta");
        modelo.addElement("Sábado");
        cbexibirdias.setModel(modelo);
    }//GEN-LAST:event_btincluirdiasActionPerformed

    private void btincluircategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btincluircategoriasActionPerformed
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Informática");
        modelo.addElement("Celulares");
        cbexibircategorias.setModel(modelo);
    }//GEN-LAST:event_btincluircategoriasActionPerformed

    private void btinserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btinserirActionPerformed
        CategoriaTableModel modelo = (CategoriaTableModel) tbinfo.getModel();
        if(!tfcodigo.getText().equals("") && !tfdescricao.getText().equals("")){
            Object[] linha = new Object[]{tfcodigo.getText(), tfdescricao.getText()};
            modelo.addRow(linha);
            tfcodigo.setText("");
            tfdescricao.setText("");
            tfcodigo.grabFocus();
        }else{
            JOptionPane.showMessageDialog(null, "Impossível avançar sem todos os campos!");
        }
    }//GEN-LAST:event_btinserirActionPerformed

    private void rbfisicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbfisicoActionPerformed
        lbcpfcnpj.setText("CPF:");
        mascara_cpf.install(tfcpfcnpj);
        tfcpfcnpj.requestFocus();
    }//GEN-LAST:event_rbfisicoActionPerformed

    private void rbjuridicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbjuridicoActionPerformed
        lbcpfcnpj.setText("CNPJ:");
        mascara_cnpj.install(tfcpfcnpj);
        tfcpfcnpj.requestFocus();
    }//GEN-LAST:event_rbjuridicoActionPerformed

    private MaskFormatter getMascara_cpf(){
        if(mascara_cpf == null){
            mascara_cpf = new MaskFormatter();
            try{
                mascara_cpf.setMask("###.###.###-##");
                mascara_cpf.setPlaceholderCharacter('-');
            }catch(ParseException e){
                e.printStackTrace();
            }
        }
        return mascara_cpf;
    }
    
    private MaskFormatter getMascara_cnpj(){
        if(mascara_cnpj == null){
            mascara_cnpj = new MaskFormatter();
            try{
                mascara_cnpj.setMask("##.###.###/####-##");
                mascara_cnpj.setPlaceholderCharacter('-');
            }catch(ParseException e){
                e.printStackTrace();
            }
        }
        return mascara_cnpj;
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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btexibirmensagem;
    private javax.swing.JButton btexibirpergunta;
    private javax.swing.JButton btincluircategorias;
    private javax.swing.JButton btincluirdias;
    private javax.swing.JButton btinserir;
    private javax.swing.JComboBox<String> cbexibircategorias;
    private javax.swing.JComboBox<String> cbexibirdias;
    private javax.swing.ButtonGroup grbotoes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpprimeiraaba;
    private javax.swing.JPanel jptestecombobox;
    private javax.swing.JPanel jptestejradiobutton;
    private javax.swing.JPanel jptestejtable;
    private javax.swing.JPanel jptestesplitpanel;
    private javax.swing.JTabbedPane jtaba;
    private javax.swing.JLabel lbcabecalho;
    private javax.swing.JLabel lbcodigo;
    private javax.swing.JLabel lbcpfcnpj;
    private javax.swing.JLabel lbdescricao;
    private javax.swing.JRadioButton rbfisico;
    private javax.swing.JRadioButton rbjuridico;
    private javax.swing.JTable tbinfo;
    private javax.swing.JTextField tfcodigo;
    private javax.swing.JFormattedTextField tfcpfcnpj;
    private javax.swing.JTextField tfdescricao;
    // End of variables declaration//GEN-END:variables
}
