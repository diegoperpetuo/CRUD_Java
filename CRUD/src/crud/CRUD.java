/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author diego
 */
public class CRUD extends javax.swing.JFrame {
    ArrayList<Turma> ListaTurma;//Lista de turmas
    ArrayList<Aluno> ListaAluno; //Lista de alunos
    String manipturma;
    String manipaluno;

    //Função para mostrar lista de turmas:
    public void TabelaTurma (){
        Object Coluna[] = {"Código", "Nome"}; //Classe Object/Vetor de colunas
        DefaultTableModel modelo = new DefaultTableModel (Coluna, 0);
        
        //Percorrer lista para informar as linhas:
        for (int i=0;i<ListaTurma.size();i++){
            Object row [] =  new Object[] {ListaTurma.get(i).getId(), ListaTurma.get(i).getNome()};
            modelo.addRow (row);//Para cada item, adicionar um modelo
       }
        tabelaturma.setModel(modelo); //Mudar o modelo da tabela (colunas e linhas)
        tabelaturma.getColumnModel().getColumn(0).setPreferredWidth(50);
        tabelaturma.getColumnModel().getColumn(1).setPreferredWidth(200);
    }
    
        public void TabelaAluno (){
         Object Coluna[] = {"Turma", "Nome"}; //Classe Object/Vetor de colunas
        DefaultTableModel modelo = new DefaultTableModel (Coluna, 0);
        
        //Percorrer lista para informar as linhas:
        for (int i=0;i<ListaAluno.size();i++){
            Object row [] =  new Object[] {ListaAluno.get(i).getMatricula(), ListaAluno.get(i).getNome()};
            modelo.addRow (row);//Para cada item, adicionar um modelo
       }
        tabelaalunos.setModel(modelo); //Mudar o modelo da tabela (colunas e linhas)
        tabelaalunos.getColumnModel().getColumn(0).setPreferredWidth(50);
        tabelaalunos.getColumnModel().getColumn(1).setPreferredWidth(200);       
   
    }
    
    public CRUD() {
        initComponents();
        setLocationRelativeTo(null); //Método que inicializa a janela no centro da tela
        ListaTurma = new ArrayList();
        manipturma = "Navegar";
        manipaluno = "Navegar";
        ManipulacaoTurma();
        ManipulacaoAluno();
    }
    
    //Função para manipular interface
    public void ManipulacaoTurma(){
        
        switch (manipturma){
            
            case "Navegar"://Na tela de navegação, tudo bloqueado (menos o add):
                
            botao_turma_salvar.setEnabled(false);
            botao_turma_cancelar.setEnabled(false);
            texto_id.setEnabled(false);
            texto_nome.setEnabled(false);
            botao_turma_add.setEnabled(true);
            botao_turma_edit.setEnabled(false);
            botao_turma_excluir.setEnabled(false);
            break;
        
            case "Adicionar":
                
            botao_turma_salvar.setEnabled(true);
            botao_turma_cancelar.setEnabled(true);
            texto_id.setEnabled(true);
            texto_nome.setEnabled(true);
            botao_turma_add.setEnabled(false);
            botao_turma_edit.setEnabled(false);
            botao_turma_excluir.setEnabled(false);
            break;
            
            case "Editar":
                
            botao_turma_salvar.setEnabled(true);
            botao_turma_cancelar.setEnabled(true);
            texto_id.setEnabled(true);
            texto_nome.setEnabled(true);
            botao_turma_add.setEnabled(true);
            botao_turma_edit.setEnabled(false);
            botao_turma_excluir.setEnabled(false);
            break;
            
            case "Excluir":
                
            botao_turma_salvar.setEnabled(false);
            botao_turma_cancelar.setEnabled(false);
            texto_id.setEnabled(false);
            texto_nome.setEnabled(false);
            botao_turma_add.setEnabled(true);
            botao_turma_edit.setEnabled(false);
            botao_turma_excluir.setEnabled(false);
            break;
            
            case "Selecao":
                
            botao_turma_salvar.setEnabled(false);
            botao_turma_cancelar.setEnabled(false);
            texto_id.setEnabled(false);
            texto_nome.setEnabled(false);
            botao_turma_add.setEnabled(true);
            botao_turma_edit.setEnabled(true);
            botao_turma_excluir.setEnabled(true);
            break;
            
            default:System.out.println("Erro");
    }
    }
        public void ManipulacaoAluno(){
        
        switch (manipaluno){
            
            case "Navegar"://Na tela de navegação, tudo bloqueado (menos o add):
                
            botao_aluno_salvar.setEnabled(false);
            botao_aluno_cancelar.setEnabled(false);
            txt_id_aluno.setEnabled(false);
            txt_nome_aluno.setEnabled(false);
            botao_aluno_add.setEnabled(true);
            botao_aluno_edit.setEnabled(false);
            botao_aluno_excluir.setEnabled(false);
            break;
        
            case "Adicionar":
                
            botao_aluno_salvar.setEnabled(true);
            botao_aluno_cancelar.setEnabled(true);
            txt_id_aluno.setEnabled(true);
            txt_nome_aluno.setEnabled(true);
            botao_aluno_add.setEnabled(false);
            botao_aluno_edit.setEnabled(false);
            botao_aluno_excluir.setEnabled(false);
            break;
            
            case "Editar":
                
            botao_aluno_salvar.setEnabled(true);
            botao_aluno_cancelar.setEnabled(true);
            txt_id_aluno.setEnabled(true);
            txt_nome_aluno.setEnabled(true);
            botao_aluno_add.setEnabled(true);
            botao_aluno_edit.setEnabled(false);
            botao_aluno_excluir.setEnabled(false);
            break;
            
            case "Excluir":
                
            botao_aluno_salvar.setEnabled(false);
            botao_aluno_cancelar.setEnabled(false);
            txt_id_aluno.setEnabled(false);
            txt_nome_aluno.setEnabled(false);
            botao_aluno_add.setEnabled(true);
            botao_aluno_edit.setEnabled(false);
            botao_aluno_excluir.setEnabled(false);
            break;
            
            case "Selecao":
                
            botao_aluno_salvar.setEnabled(false);
            botao_aluno_cancelar.setEnabled(false);
            txt_id_aluno.setEnabled(false);
            txt_nome_aluno.setEnabled(false);
            botao_aluno_add.setEnabled(true);
            botao_aluno_edit.setEnabled(true);
            botao_aluno_excluir.setEnabled(true);
            break;
            
            default:System.out.println("Erro");
    }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaturma = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        texto_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        texto_nome = new javax.swing.JTextField();
        botao_turma_salvar = new javax.swing.JButton();
        botao_turma_cancelar = new javax.swing.JButton();
        botao_turma_edit = new javax.swing.JButton();
        botao_turma_excluir = new javax.swing.JButton();
        botao_turma_add = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        botao_aluno_edit = new javax.swing.JButton();
        botao_aluno_excluir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaalunos = new javax.swing.JTable();
        botao_aluno_add = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_id_aluno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        botao_aluno_salvar = new javax.swing.JButton();
        botao_aluno_cancelar = new javax.swing.JButton();
        txt_nome_aluno = new javax.swing.JTextField();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelaturma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaturma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaturmaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaturma);
        if (tabelaturma.getColumnModel().getColumnCount() > 0) {
            tabelaturma.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabelaturma.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Dados"));

        jLabel1.setText("Código:");

        texto_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_idActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        texto_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_nomeActionPerformed(evt);
            }
        });

        botao_turma_salvar.setText("Salvar");
        botao_turma_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_turma_salvarActionPerformed(evt);
            }
        });

        botao_turma_cancelar.setText("Cancelar");
        botao_turma_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_turma_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(botao_turma_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botao_turma_cancelar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(texto_id, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(texto_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(texto_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_turma_salvar)
                    .addComponent(botao_turma_cancelar))
                .addContainerGap())
        );

        botao_turma_edit.setText("Editar");
        botao_turma_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_turma_editActionPerformed(evt);
            }
        });

        botao_turma_excluir.setText("Excluir");
        botao_turma_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_turma_excluirActionPerformed(evt);
            }
        });

        botao_turma_add.setText("Adicionar");
        botao_turma_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_turma_addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(botao_turma_add, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botao_turma_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botao_turma_excluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botao_turma_add)
                            .addComponent(botao_turma_edit)
                            .addComponent(botao_turma_excluir))
                        .addGap(34, 153, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jPanel3.getAccessibleContext().setAccessibleName("");
        jPanel3.getAccessibleContext().setAccessibleDescription("");

        jTabbedPane1.addTab("Turmas", jPanel1);

        botao_aluno_edit.setText("Editar");
        botao_aluno_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_aluno_editActionPerformed(evt);
            }
        });

        botao_aluno_excluir.setText("Excluir");
        botao_aluno_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_aluno_excluirActionPerformed(evt);
            }
        });

        tabelaalunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Turma", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaalunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaalunosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaalunos);
        if (tabelaalunos.getColumnModel().getColumnCount() > 0) {
            tabelaalunos.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        botao_aluno_add.setText("Adicionar");
        botao_aluno_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_aluno_addActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Dados"));

        jLabel4.setText("Turma:");

        txt_id_aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_alunoActionPerformed(evt);
            }
        });

        jLabel5.setText("Nome:");

        botao_aluno_salvar.setText("Salvar");
        botao_aluno_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_aluno_salvarActionPerformed(evt);
            }
        });

        botao_aluno_cancelar.setText("Cancelar");
        botao_aluno_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_aluno_cancelarActionPerformed(evt);
            }
        });

        txt_nome_aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nome_alunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(botao_aluno_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botao_aluno_cancelar))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_id_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nome_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_id_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_nome_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_aluno_salvar)
                    .addComponent(botao_aluno_cancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(botao_aluno_add, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botao_aluno_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botao_aluno_excluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botao_aluno_add)
                            .addComponent(botao_aluno_edit)
                            .addComponent(botao_aluno_excluir))
                        .addGap(34, 153, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jTabbedPane1.addTab("Alunos", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void texto_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto_nomeActionPerformed

    private void botao_turma_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_turma_salvarActionPerformed
        int codigo = Integer.parseInt(texto_id.getText());//Converter int para String
        if (manipturma.equals("Adicionar")){
            Turma T = new Turma (codigo, texto_nome.getText());
            ListaTurma.add(T);            
            } else if (manipturma.equals("Editar")){
                int index = tabelaturma.getSelectedRow();
                ListaTurma.get(index).setId(codigo);
                ListaTurma.get(index).setNome(texto_nome.getText());
            }
        
        TabelaTurma();//Recarregar ao apertar em salvar

        texto_id.setText("");
        texto_nome.setText("");
        manipturma = "Adicionar";
        ManipulacaoTurma();
    }//GEN-LAST:event_botao_turma_salvarActionPerformed

    private void botao_turma_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_turma_addActionPerformed
       //Para "resetar" botões ao adicionar um novo departamento:
        texto_id.setText("");
        texto_nome.setText("");
        manipturma = "Adicionar";
        ManipulacaoTurma ();
    }//GEN-LAST:event_botao_turma_addActionPerformed

    private void botao_turma_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_turma_cancelarActionPerformed
        //Função de bloquear ao apertar botão de cancelar:
        texto_id.setText("");
        texto_nome.setText("");
        manipturma = "Navegar";
        ManipulacaoTurma ();
    }//GEN-LAST:event_botao_turma_cancelarActionPerformed

    private void texto_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto_idActionPerformed

    private void tabelaturmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaturmaMouseClicked
        // Quando clica na tabela, ativar modo Seleção
        int index = tabelaturma.getSelectedRow();
        
        if (index >=0 && index<ListaTurma.size()){
                Turma T = ListaTurma.get(index);
                texto_id.setText(String.valueOf(T.getId()));
                texto_nome.setText(T.getNome());
                manipturma = "Selecao";
                ManipulacaoTurma();
        }
    }//GEN-LAST:event_tabelaturmaMouseClicked

    private void botao_turma_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_turma_editActionPerformed
        manipturma = "Editar";
        ManipulacaoTurma();
    }//GEN-LAST:event_botao_turma_editActionPerformed

    private void botao_turma_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_turma_excluirActionPerformed
        int index = tabelaturma.getSelectedRow();
        
        if (index >=0 && index<ListaTurma.size()){
        ListaTurma.remove(index);
    }
        TabelaTurma();
        manipturma = "Navegar";
        ManipulacaoTurma();
    }//GEN-LAST:event_botao_turma_excluirActionPerformed

    private void tabelaalunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaalunosMouseClicked
       // Quando clica na tabela, ativar modo Seleção
        int index = tabelaalunos.getSelectedRow();
        
        if (index >=0 && index<ListaAluno.size()){
                Aluno A = ListaAluno.get(index);
                txt_id_aluno.setText(String.valueOf(A.getMatricula()));
                txt_nome_aluno.setText(A.getNome());
                manipaluno = "Selecao";
                ManipulacaoAluno();
        }
    }//GEN-LAST:event_tabelaalunosMouseClicked

    private void txt_id_alunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_alunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_alunoActionPerformed

    private void botao_aluno_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_aluno_salvarActionPerformed
        int codigo = Integer.parseInt(txt_id_aluno.getText());//Converter int para String
        if (manipaluno.equals("Adicionar")){
            Aluno A = new Aluno (codigo, txt_nome_aluno.getText());
            ListaAluno.add(A);            
            } else if (manipaluno.equals("Editar")){
                int index = tabelaalunos.getSelectedRow();
                ListaAluno.get(index).setMatricula(codigo);
                ListaAluno.get(index).setNome(txt_nome_aluno.getText());
            }
        
        TabelaAluno();//Recarregar ao apertar em salvar

        txt_id_aluno.setText("");
        txt_nome_aluno.setText("");
        manipaluno = "Adicionar";
        ManipulacaoAluno();
    }//GEN-LAST:event_botao_aluno_salvarActionPerformed

    private void botao_aluno_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_aluno_cancelarActionPerformed
        //Função de bloquear ao apertar botão de cancelar:
        txt_id_aluno.setText("");
        txt_nome_aluno.setText("");
        manipturma = "Navegar";
        ManipulacaoAluno ();
    }//GEN-LAST:event_botao_aluno_cancelarActionPerformed

    private void botao_aluno_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_aluno_excluirActionPerformed
        int index = tabelaalunos.getSelectedRow();
        
        if (index >=0 && index<ListaAluno.size()){
        ListaAluno.remove(index);
    }
        TabelaAluno();
        manipaluno = "Navegar";
        ManipulacaoAluno();
    }//GEN-LAST:event_botao_aluno_excluirActionPerformed

    private void botao_aluno_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_aluno_editActionPerformed
        manipaluno = "Editar";
        ManipulacaoAluno();
    }//GEN-LAST:event_botao_aluno_editActionPerformed

    private void botao_aluno_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_aluno_addActionPerformed
       //Para "resetar" botões ao adicionar um novo departamento:
        txt_id_aluno.setText("");
        txt_nome_aluno.setText("");
        manipaluno = "Adicionar";
        ManipulacaoAluno ();
    }//GEN-LAST:event_botao_aluno_addActionPerformed

    private void txt_nome_alunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nome_alunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nome_alunoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //Mudar design:
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_aluno_add;
    private javax.swing.JButton botao_aluno_cancelar;
    private javax.swing.JButton botao_aluno_edit;
    private javax.swing.JButton botao_aluno_excluir;
    private javax.swing.JButton botao_aluno_salvar;
    private javax.swing.JButton botao_turma_add;
    private javax.swing.JButton botao_turma_cancelar;
    private javax.swing.JButton botao_turma_edit;
    private javax.swing.JButton botao_turma_excluir;
    private javax.swing.JButton botao_turma_salvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabelaalunos;
    private javax.swing.JTable tabelaturma;
    private javax.swing.JTextField texto_id;
    private javax.swing.JTextField texto_nome;
    private javax.swing.JTextField txt_id_aluno;
    private javax.swing.JTextField txt_nome_aluno;
    // End of variables declaration//GEN-END:variables
}
