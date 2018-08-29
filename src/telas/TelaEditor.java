/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;



/**
 *
 * @author JeanioGuimaraes
 */
public class TelaEditor extends javax.swing.JFrame {

    /**
     * Creates new form TelaEditor
     */
    public TelaEditor() {//Aqui é o módulo construtor
        initComponents();
        setLocationRelativeTo(null);
        dialogoArquivo = new JFileChooser();
        dialogoCor = new JColorChooser();
        negrito = Font.PLAIN;
        italico = Font.PLAIN;
        areaTexto.setFont(new Font("Tahoma",negrito+italico,14));
        setSize(550, 471);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraFerramentas = new javax.swing.JToolBar();
        btNovo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTexto = new javax.swing.JTextArea();
        barraMenu = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        itemNovo = new javax.swing.JMenuItem();
        itemAbrir = new javax.swing.JMenuItem();
        itemSalvar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itemSair = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        itemCopiar = new javax.swing.JMenuItem();
        itemRecortar = new javax.swing.JMenuItem();
        itemColar = new javax.swing.JMenuItem();
        menuExibir = new javax.swing.JMenu();
        menuFundo = new javax.swing.JMenu();
        itemAzul = new javax.swing.JMenuItem();
        itemAmarelo = new javax.swing.JMenuItem();
        itemBranco = new javax.swing.JMenuItem();
        itemVerde = new javax.swing.JMenuItem();
        itemVermelho = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        itemCorFundo = new javax.swing.JMenuItem();
        menuFonte = new javax.swing.JMenu();
        menuEstilo = new javax.swing.JMenu();
        itemCheckNegrito = new javax.swing.JCheckBoxMenuItem();
        itemCheckItalico = new javax.swing.JCheckBoxMenuItem();
        itemCorFonte = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        itemSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editor de Texto Java");
        setIconImage(new ImageIcon(getClass().getResource("/telas/imagens/logo_bloco.png")).getImage());

        barraFerramentas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        barraFerramentas.setRollover(true);

        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconesimagens/novo.png"))); // NOI18N
        btNovo.setToolTipText("Novo");
        btNovo.setFocusable(false);
        btNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btNovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });
        barraFerramentas.add(btNovo);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconesimagens/abrir.png"))); // NOI18N
        jButton1.setToolTipText("Abrir");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        barraFerramentas.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconesimagens/salvar.PNG"))); // NOI18N
        jButton2.setToolTipText("Salvar");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        barraFerramentas.add(jButton2);
        barraFerramentas.add(jSeparator3);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconesimagens/copiar.png"))); // NOI18N
        jButton3.setToolTipText("Copiar");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        barraFerramentas.add(jButton3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconesimagens/recortar.png"))); // NOI18N
        jButton4.setToolTipText("Recortar");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        barraFerramentas.add(jButton4);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconesimagens/colar.PNG"))); // NOI18N
        jButton5.setToolTipText("Colar");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        barraFerramentas.add(jButton5);
        barraFerramentas.add(jSeparator4);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconesimagens/info.PNG"))); // NOI18N
        jButton6.setToolTipText("Sobre");
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        barraFerramentas.add(jButton6);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconesimagens/sair.PNG"))); // NOI18N
        jButton7.setToolTipText("Sair");
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        barraFerramentas.add(jButton7);

        areaTexto.setLineWrap(true);
        areaTexto.setWrapStyleWord(true);
        jScrollPane1.setViewportView(areaTexto);

        menuArquivo.setText("Arquivo");

        itemNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconesbarra/novo.png"))); // NOI18N
        itemNovo.setText("Novo");
        itemNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNovoActionPerformed(evt);
            }
        });
        menuArquivo.add(itemNovo);

        itemAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconesbarra/abrir.png"))); // NOI18N
        itemAbrir.setText("Abrir");
        itemAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAbrirActionPerformed(evt);
            }
        });
        menuArquivo.add(itemAbrir);

        itemSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconesbarra/salvar.png"))); // NOI18N
        itemSalvar.setText("Salvar");
        itemSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSalvarActionPerformed(evt);
            }
        });
        menuArquivo.add(itemSalvar);
        menuArquivo.add(jSeparator1);

        itemSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconesbarra/sair.png"))); // NOI18N
        itemSair.setText("Sair");
        itemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSairActionPerformed(evt);
            }
        });
        menuArquivo.add(itemSair);

        barraMenu.add(menuArquivo);

        menuEditar.setText("Editar");

        itemCopiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconesbarra/copiar.PNG"))); // NOI18N
        itemCopiar.setText("Copiar");
        itemCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCopiarActionPerformed(evt);
            }
        });
        menuEditar.add(itemCopiar);

        itemRecortar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconesbarra/recortar.PNG"))); // NOI18N
        itemRecortar.setText("Recortar");
        itemRecortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRecortarActionPerformed(evt);
            }
        });
        menuEditar.add(itemRecortar);

        itemColar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconesbarra/colar.png"))); // NOI18N
        itemColar.setText("Colar");
        itemColar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemColarActionPerformed(evt);
            }
        });
        menuEditar.add(itemColar);

        barraMenu.add(menuEditar);

        menuExibir.setText("Exibir");

        menuFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/imagens/fundo.PNG"))); // NOI18N
        menuFundo.setText("Fundo");

        itemAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/imagens/azul.PNG"))); // NOI18N
        itemAzul.setText("Azul");
        itemAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAzulActionPerformed(evt);
            }
        });
        menuFundo.add(itemAzul);

        itemAmarelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/imagens/amarelo.PNG"))); // NOI18N
        itemAmarelo.setText("Amarelo");
        itemAmarelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAmareloActionPerformed(evt);
            }
        });
        menuFundo.add(itemAmarelo);

        itemBranco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/imagens/branco.PNG"))); // NOI18N
        itemBranco.setText("Branco");
        itemBranco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBrancoActionPerformed(evt);
            }
        });
        menuFundo.add(itemBranco);

        itemVerde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/imagens/verde.PNG"))); // NOI18N
        itemVerde.setText("Verde");
        itemVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVerdeActionPerformed(evt);
            }
        });
        menuFundo.add(itemVerde);

        itemVermelho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/imagens/vermelho.PNG"))); // NOI18N
        itemVermelho.setText("Vermelho");
        itemVermelho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVermelhoActionPerformed(evt);
            }
        });
        menuFundo.add(itemVermelho);
        menuFundo.add(jSeparator2);

        itemCorFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/imagens/outracor.PNG"))); // NOI18N
        itemCorFundo.setText("Outra Cor...");
        itemCorFundo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCorFundoActionPerformed(evt);
            }
        });
        menuFundo.add(itemCorFundo);

        menuExibir.add(menuFundo);

        menuFonte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/imagens/fonte.PNG"))); // NOI18N
        menuFonte.setText("Fonte");

        menuEstilo.setText("Estilo");

        itemCheckNegrito.setSelected(true);
        itemCheckNegrito.setText("Negrito");
        itemCheckNegrito.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                itemCheckNegritoItemStateChanged(evt);
            }
        });
        itemCheckNegrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCheckNegritoActionPerformed(evt);
            }
        });
        menuEstilo.add(itemCheckNegrito);

        itemCheckItalico.setSelected(true);
        itemCheckItalico.setText("Itálico");
        itemCheckItalico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                itemCheckItalicoItemStateChanged(evt);
            }
        });
        menuEstilo.add(itemCheckItalico);

        menuFonte.add(menuEstilo);

        itemCorFonte.setText("Cor");
        itemCorFonte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCorFonteActionPerformed(evt);
            }
        });
        menuFonte.add(itemCorFonte);

        menuExibir.add(menuFonte);

        barraMenu.add(menuExibir);

        menuAjuda.setText("Ajuda");

        itemSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconesbarra/info.PNG"))); // NOI18N
        itemSobre.setText("Sobre");
        itemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSobreActionPerformed(evt);
            }
        });
        menuAjuda.add(itemSobre);

        barraMenu.add(menuAjuda);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barraFerramentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(barraFerramentas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNovoActionPerformed
        // Botão novo
        areaTexto.setText("");
    }//GEN-LAST:event_itemNovoActionPerformed

    private void itemAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAbrirActionPerformed
        // Botão abrir
        int retorno;
        retorno = dialogoArquivo.showOpenDialog(this);
        if (retorno == JFileChooser.APPROVE_OPTION) {
            File arquivo = dialogoArquivo.getSelectedFile();
            try{
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                String textoLido = "";
                while (br.ready()){
                    textoLido = textoLido + br.readLine() + "\n";
                }
                areaTexto.setText(textoLido.toString());
                br.close();
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro na leitura do arquivo!");
            }
        }
    }//GEN-LAST:event_itemAbrirActionPerformed

    private void itemSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalvarActionPerformed
        // Botão salvar
        int retorno;
        retorno = dialogoArquivo.showSaveDialog(this);
        if(retorno == JFileChooser.APPROVE_OPTION){
            File arquivo = dialogoArquivo.getSelectedFile();
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
                Scanner leitor = new Scanner(areaTexto.getText());
                while (leitor.hasNextLine()) {
                    bw.write(leitor.nextLine());
                    bw.newLine();
                }
                bw.close();
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro na gravação do arquivo!");
            }
        }
    }//GEN-LAST:event_itemSalvarActionPerformed

    private void itemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSairActionPerformed
        // Botão sair
        System.exit(0);
    }//GEN-LAST:event_itemSairActionPerformed

    private void itemCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCopiarActionPerformed
        // Botão copiar
        areaTexto.copy();
    }//GEN-LAST:event_itemCopiarActionPerformed

    private void itemRecortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRecortarActionPerformed
        //Botão recortar
        areaTexto.cut();
    }//GEN-LAST:event_itemRecortarActionPerformed

    private void itemColarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemColarActionPerformed
        // botãO COLAR
        
        areaTexto.paste();
    }//GEN-LAST:event_itemColarActionPerformed

    private void itemAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAzulActionPerformed
        // item azul
        areaTexto.setBackground(Color.BLUE);
    }//GEN-LAST:event_itemAzulActionPerformed

    private void itemAmareloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAmareloActionPerformed
        // TODO add your handling code here:
        areaTexto.setBackground(Color.YELLOW);
    }//GEN-LAST:event_itemAmareloActionPerformed

    private void itemBrancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBrancoActionPerformed
        // TODO add your handling code here:
        areaTexto.setBackground(Color.WHITE);
    }//GEN-LAST:event_itemBrancoActionPerformed

    private void itemVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVerdeActionPerformed
        // TODO add your handling code here:
        areaTexto.setBackground(Color.GREEN);
    }//GEN-LAST:event_itemVerdeActionPerformed

    private void itemVermelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVermelhoActionPerformed
        // TODO add your handling code here:
        areaTexto.setBackground(Color.RED);
    }//GEN-LAST:event_itemVermelhoActionPerformed

    private void itemCorFundoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCorFundoActionPerformed
        // Outras Cores...
        Color corFundo;
        corFundo = dialogoCor.showDialog(this, "Cor do Fundo", Color.WHITE);
        areaTexto.setBackground(corFundo);
    }//GEN-LAST:event_itemCorFundoActionPerformed

    private void itemCheckNegritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCheckNegritoActionPerformed
        // Negrito
        
    }//GEN-LAST:event_itemCheckNegritoActionPerformed

    private void itemCheckNegritoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_itemCheckNegritoItemStateChanged
        // Item negrito
        if(itemCheckNegrito.isSelected()){
            negrito = Font.BOLD;
        }
        else {
            negrito = Font.PLAIN;
        }
        areaTexto.setFont(new Font("Tahoma",negrito+italico,14));
        
    }//GEN-LAST:event_itemCheckNegritoItemStateChanged

    private void itemCheckItalicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_itemCheckItalicoItemStateChanged
        // TODO add your handling code here:
        if(itemCheckItalico.isSelected()){
            italico = Font.ITALIC;
        }
        else {
            italico = Font.PLAIN;
        }
        areaTexto.setFont(new Font("Tahoma",negrito+italico,14));
    }//GEN-LAST:event_itemCheckItalicoItemStateChanged

    private void itemCorFonteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCorFonteActionPerformed
        // TODO add your handling code here:
        Color corFonte;
        corFonte = dialogoCor.showDialog(this,"Cor da Fonte", Color.BLACK);
        areaTexto.setForeground(corFonte);
    }//GEN-LAST:event_itemCorFonteActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        // TODO add your handling code here:
        itemNovoActionPerformed(evt);
    }//GEN-LAST:event_btNovoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        itemAbrirActionPerformed(evt);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        itemSalvarActionPerformed(evt);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // copiar
        itemCopiarActionPerformed(evt);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // recortar
        itemRecortarActionPerformed(evt);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // colar
        itemColarActionPerformed(evt);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // sobre
        itemSobreActionPerformed(evt);
       
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        itemSairActionPerformed(evt);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void itemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSobreActionPerformed
        // TODO add your handling code here:
        if (telaSobre == null) {
            telaSobre = new TelaSobre();
        }
        telaSobre.setVisible(true);
    }//GEN-LAST:event_itemSobreActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEditor().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTexto;
    private javax.swing.JToolBar barraFerramentas;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton btNovo;
    private javax.swing.JMenuItem itemAbrir;
    private javax.swing.JMenuItem itemAmarelo;
    private javax.swing.JMenuItem itemAzul;
    private javax.swing.JMenuItem itemBranco;
    private javax.swing.JCheckBoxMenuItem itemCheckItalico;
    private javax.swing.JCheckBoxMenuItem itemCheckNegrito;
    private javax.swing.JMenuItem itemColar;
    private javax.swing.JMenuItem itemCopiar;
    private javax.swing.JMenuItem itemCorFonte;
    private javax.swing.JMenuItem itemCorFundo;
    private javax.swing.JMenuItem itemNovo;
    private javax.swing.JMenuItem itemRecortar;
    private javax.swing.JMenuItem itemSair;
    private javax.swing.JMenuItem itemSalvar;
    private javax.swing.JMenuItem itemSobre;
    private javax.swing.JMenuItem itemVerde;
    private javax.swing.JMenuItem itemVermelho;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenu menuEstilo;
    private javax.swing.JMenu menuExibir;
    private javax.swing.JMenu menuFonte;
    private javax.swing.JMenu menuFundo;
    // End of variables declaration//GEN-END:variables
    //New declarations
    private JFileChooser dialogoArquivo;
    private JColorChooser dialogoCor;
    private int negrito, italico;
    private TelaSobre telaSobre;
}

