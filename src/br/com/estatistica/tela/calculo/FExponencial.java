package br.com.estatistica.tela.calculo;

import br.com.estatistica.auxiliares.DProbabilidade;
import br.com.estatistica.auxiliares.IValores;
import br.com.estatistica.dao.DAOBinomial;
import br.com.estatistica.modelo.Binomial;
import br.com.estatistica.modelo.IModelo;
import br.com.estatistica.tela.generico.FrameGenerico;
import br.com.estatistica.tela.tablemodel.BinomialTableModel;
import com.zap.arca.LoggerEx;
import com.zap.arca.util.WindowUtils;
import java.awt.Component;
import java.math.BigDecimal;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * @author Edidelson
 */
public class FExponencial extends FrameGenerico implements IValores {

    private BinomialTableModel binomialTableModel = new BinomialTableModel();
    private Binomial binomial;

    public FExponencial() {
        initComponents();
        setLocationRelativeTo(null);
        iniciar();
        actionMenu(INCLUSAO);
 
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgEditar = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        tbAtalhos = new javax.swing.JToolBar();
        tbIncluir = new javax.swing.JToggleButton();
        tbAlterar = new javax.swing.JToggleButton();
        tbExcluir = new javax.swing.JToggleButton();
        spBar = new javax.swing.JToolBar.Separator();
        tbPesquisar = new javax.swing.JToggleButton();
        tbFiltrar = new javax.swing.JToggleButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbBinomial = new com.zap.arca.JATable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        plBotoes = new javax.swing.JPanel();
        btOk = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        plCampos = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbCodigo = new javax.swing.JLabel();
        tfCodigo = new com.zap.arca.JATextField();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        tfMedia = new com.zap.arca.JATextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfVariavelA = new com.zap.arca.JATextField();
        tfVariavelB = new com.zap.arca.JATextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        tfProbabilidade = new com.zap.arca.JATextField();
        mbPrincipal = new javax.swing.JMenuBar();
        mnArquivo = new javax.swing.JMenu();
        miArquivoSair = new com.zap.arca.JAMenuItem();
        mnEditar = new javax.swing.JMenu();
        miEdiIncluir = new javax.swing.JMenuItem();
        miEdiAlterar = new javax.swing.JMenuItem();
        miEdiExcluir = new javax.swing.JMenuItem();
        miEditarLimpar = new com.zap.arca.JAMenuItem();
        mnExibir = new javax.swing.JMenu();
        miExibirAtualizar = new com.zap.arca.JAMenuItem();
        spExibir = new javax.swing.JPopupMenu.Separator();
        miExibirFiltro = new javax.swing.JMenuItem();
        mnAjuda = new javax.swing.JMenu();
        miAjudaConteudo = new com.zap.arca.JAMenuItem();
        spAjuda = new javax.swing.JPopupMenu.Separator();
        miAjudaSobre = new com.zap.arca.JAMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Exponencial");

        tbAtalhos.setFloatable(false);
        tbAtalhos.setRollover(true);

        bgEditar.add(tbIncluir);
        tbIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagens/add.png"))); // NOI18N
        tbIncluir.setToolTipText("Incluir");
        tbIncluir.setFocusable(false);
        tbIncluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbIncluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbIncluirActionPerformed(evt);
            }
        });
        tbAtalhos.add(tbIncluir);

        bgEditar.add(tbAlterar);
        tbAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagens/edit.png"))); // NOI18N
        tbAlterar.setToolTipText("Alterar");
        tbAlterar.setFocusable(false);
        tbAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbAlterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbAlterarActionPerformed(evt);
            }
        });
        tbAtalhos.add(tbAlterar);

        bgEditar.add(tbExcluir);
        tbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagens/delete.png"))); // NOI18N
        tbExcluir.setFocusable(false);
        tbExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbExcluirActionPerformed(evt);
            }
        });
        tbAtalhos.add(tbExcluir);
        tbAtalhos.add(spBar);

        bgEditar.add(tbPesquisar);
        tbPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagens/pesquisar.png"))); // NOI18N
        tbPesquisar.setFocusable(false);
        tbPesquisar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbPesquisar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbPesquisarActionPerformed(evt);
            }
        });
        tbAtalhos.add(tbPesquisar);

        bgEditar.add(tbFiltrar);
        tbFiltrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagens/filter.png"))); // NOI18N
        tbFiltrar.setFocusable(false);
        tbFiltrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbFiltrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbFiltrarActionPerformed(evt);
            }
        });
        tbAtalhos.add(tbFiltrar);

        jSplitPane1.setDividerLocation(110);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        tbBinomial.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbBinomial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbBinomial);
        tbBinomial.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                alterar(tbBinomial);
            }
        });

        jSplitPane1.setTopComponent(jScrollPane1);

        btOk.setText("OK");
        btOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOkActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout plBotoesLayout = new javax.swing.GroupLayout(plBotoes);
        plBotoes.setLayout(plBotoesLayout);
        plBotoesLayout.setHorizontalGroup(
            plBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plBotoesLayout.createSequentialGroup()
                .addContainerGap(544, Short.MAX_VALUE)
                .addComponent(btOk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btCancelar)
                .addGap(6, 6, 6))
        );

        plBotoesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btCancelar, btOk});

        plBotoesLayout.setVerticalGroup(
            plBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btOk)
                .addComponent(btCancelar))
        );

        plCampos.setBackground(new java.awt.Color(255, 255, 255));
        plCampos.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Fórmula"));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagens/combinação.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagens/binomial.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lbCodigo.setText("Código:");

        tfCodigo.setEnabled(false);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("P( X = A )");
        jRadioButton2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton2ItemStateChanged(evt);
            }
        });
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("P( X < A )");
        jRadioButton3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton3ItemStateChanged(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("P( X ≤  A )");
        jRadioButton1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton1ItemStateChanged(evt);
            }
        });

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("P( X >  A )");
        jRadioButton4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton4ItemStateChanged(evt);
            }
        });

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("P( X ≥  A )");
        jRadioButton5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton5ItemStateChanged(evt);
            }
        });

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setText("P( A ≤ X ≤ B )");
        jRadioButton6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton6ItemStateChanged(evt);
            }
        });

        jLabel1.setText("Média ( µ ):");

        jLabel5.setText("Variável ( A ):");

        jLabel6.setText("Variável ( B ):");

        jButton1.setText("Calcular!");

        jLabel7.setText("Probabilidade:");

        javax.swing.GroupLayout plCamposLayout = new javax.swing.GroupLayout(plCampos);
        plCampos.setLayout(plCamposLayout);
        plCamposLayout.setHorizontalGroup(
            plCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plCamposLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(plCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plCamposLayout.createSequentialGroup()
                        .addComponent(lbCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(126, 126, 126)
                .addGroup(plCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(plCamposLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(43, 43, 43)
                        .addComponent(tfMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(plCamposLayout.createSequentialGroup()
                        .addGroup(plCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(plCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfVariavelA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfVariavelB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(plCamposLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(plCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(plCamposLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfProbabilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(41, 41, 41)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        plCamposLayout.setVerticalGroup(
            plCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plCamposLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(plCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(plCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(plCamposLayout.createSequentialGroup()
                        .addGroup(plCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(plCamposLayout.createSequentialGroup()
                                .addGroup(plCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioButton2)
                                    .addComponent(jLabel1)
                                    .addComponent(tfMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton3))
                            .addGroup(plCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(tfVariavelA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(plCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(plCamposLayout.createSequentialGroup()
                                .addGroup(plCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(tfVariavelB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(plCamposLayout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(3, 3, 3)
                                .addComponent(jRadioButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(plCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(tfProbabilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        tfCodigo.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                // verificaAlteracao();
                if(tfCodigo.getText().equals("")) {
                    tbAlterar.setSelected(false);
                    tbIncluir.setSelected(true);
                } else {
                    tbAlterar.setSelected(true);
                    tbIncluir.setSelected(false);
                }
            }
            public void changedUpdate(DocumentEvent e) { }
            public void removeUpdate(DocumentEvent e) {
                //verificaAlteracao();
                if(tfCodigo.getText().equals("")) {
                    tbAlterar.setSelected(false);
                    tbIncluir.setSelected(true);
                } else {
                    tbAlterar.setSelected(true);
                    tbIncluir.setSelected(false);
                }
            }
        });

        jTabbedPane1.addTab("Exponencial", plCampos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(plBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(plBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        jSplitPane1.setBottomComponent(jScrollPane2);

        mnArquivo.setText("Arquivo");

        miArquivoSair.setText("Sair");
        miArquivoSair.setPreferredSize(new java.awt.Dimension(120, 22));
        miArquivoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miArquivoSairActionPerformed(evt);
            }
        });
        mnArquivo.add(miArquivoSair);

        mbPrincipal.add(mnArquivo);

        mnEditar.setText("Editar");

        miEdiIncluir.setText("Incluir");
        miEdiIncluir.setPreferredSize(new java.awt.Dimension(120, 22));
        miEdiIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEdiIncluirActionPerformed(evt);
            }
        });
        mnEditar.add(miEdiIncluir);

        miEdiAlterar.setText("Alterar");
        miEdiAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEdiAlterarActionPerformed(evt);
            }
        });
        mnEditar.add(miEdiAlterar);

        miEdiExcluir.setText("Excluir");
        miEdiExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEdiExcluirActionPerformed(evt);
            }
        });
        mnEditar.add(miEdiExcluir);

        miEditarLimpar.setText("Limpar");
        miEditarLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEditarLimparActionPerformed(evt);
            }
        });
        mnEditar.add(miEditarLimpar);

        mbPrincipal.add(mnEditar);

        mnExibir.setText("Exibir");

        miExibirAtualizar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        miExibirAtualizar.setText("Atualizar");
        miExibirAtualizar.setPreferredSize(new java.awt.Dimension(150, 22));
        miExibirAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miExibirAtualizarActionPerformed(evt);
            }
        });
        mnExibir.add(miExibirAtualizar);
        mnExibir.add(spExibir);

        miExibirFiltro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F9, 0));
        miExibirFiltro.setText("Filtro...");
        miExibirFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miExibirFiltroActionPerformed(evt);
            }
        });
        mnExibir.add(miExibirFiltro);

        mbPrincipal.add(mnExibir);

        mnAjuda.setText("Ajuda");

        miAjudaConteudo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        miAjudaConteudo.setText("Conteúdo da Ajuda");
        mnAjuda.add(miAjudaConteudo);
        mnAjuda.add(spAjuda);

        miAjudaSobre.setText("Sobre...");
        miAjudaSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAjudaSobreActionPerformed(evt);
            }
        });
        mnAjuda.add(miAjudaSobre);

        mbPrincipal.add(mnAjuda);

        setJMenuBar(mbPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tbAtalhos, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tbAtalhos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE))
        );

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void tbIncluirActionPerformed( java.awt.event.ActionEvent evt ) {//GEN-FIRST:event_tbIncluirActionPerformed
        actionMenu(INCLUSAO);
     }//GEN-LAST:event_tbIncluirActionPerformed

    private void tbAlterarActionPerformed( java.awt.event.ActionEvent evt ) {//GEN-FIRST:event_tbAlterarActionPerformed
        actionMenu(ALTERACAO);
     }//GEN-LAST:event_tbAlterarActionPerformed

    private void miArquivoSairActionPerformed( java.awt.event.ActionEvent evt ) {//GEN-FIRST:event_miArquivoSairActionPerformed
        this.dispose();
     }//GEN-LAST:event_miArquivoSairActionPerformed

    private void miEdiIncluirActionPerformed( java.awt.event.ActionEvent evt ) {//GEN-FIRST:event_miEdiIncluirActionPerformed
        actionMenu(INCLUSAO);
     }//GEN-LAST:event_miEdiIncluirActionPerformed

    private void miEdiAlterarActionPerformed( java.awt.event.ActionEvent evt ) {//GEN-FIRST:event_miEdiAlterarActionPerformed
        actionMenu(ALTERACAO);
     }//GEN-LAST:event_miEdiAlterarActionPerformed

    private void miEdiExcluirActionPerformed( java.awt.event.ActionEvent evt ) {//GEN-FIRST:event_miEdiExcluirActionPerformed
        actionMenu(EXCLUSAO);
     }//GEN-LAST:event_miEdiExcluirActionPerformed

    private void miExibirAtualizarActionPerformed( java.awt.event.ActionEvent evt ) {//GEN-FIRST:event_miExibirAtualizarActionPerformed
        actionMenu(LIMPAR);
     }//GEN-LAST:event_miExibirAtualizarActionPerformed

    private void miExibirFiltroActionPerformed( java.awt.event.ActionEvent evt ) {//GEN-FIRST:event_miExibirFiltroActionPerformed
        actionMenu(FILTRAR);
     }//GEN-LAST:event_miExibirFiltroActionPerformed

    private void miEditarLimparActionPerformed( java.awt.event.ActionEvent evt ) {//GEN-FIRST:event_miEditarLimparActionPerformed
        actionMenu(LIMPAR);
    }//GEN-LAST:event_miEditarLimparActionPerformed

    private void miAjudaSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAjudaSobreActionPerformed
    }//GEN-LAST:event_miAjudaSobreActionPerformed

    private void tbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbExcluirActionPerformed
        actionMenu(EXCLUSAO);
    }//GEN-LAST:event_tbExcluirActionPerformed

    private void tbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbPesquisarActionPerformed
        actionMenu(PESQUISAR);
    }//GEN-LAST:event_tbPesquisarActionPerformed

    private void tbFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbFiltrarActionPerformed
        actionMenu(FILTRAR);
    }//GEN-LAST:event_tbFiltrarActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkActionPerformed
        if (verificarCampos(camposVerificar)) {
            inserirOuAlterar();
            limparCampos();
        }
        actionMenu(INCLUSAO);
    }//GEN-LAST:event_btOkActionPerformed

    private void jRadioButton2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton2ItemStateChanged
        tfVariavelB.setEnabled(false);
    }//GEN-LAST:event_jRadioButton2ItemStateChanged

    private void jRadioButton6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton6ItemStateChanged
        tfVariavelB.setEnabled(true);
    }//GEN-LAST:event_jRadioButton6ItemStateChanged

    private void jRadioButton3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton3ItemStateChanged
        tfVariavelB.setEnabled(false);
    }//GEN-LAST:event_jRadioButton3ItemStateChanged

    private void jRadioButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton1ItemStateChanged
        tfVariavelB.setEnabled(false);
    }//GEN-LAST:event_jRadioButton1ItemStateChanged

    private void jRadioButton4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton4ItemStateChanged
        tfVariavelB.setEnabled(false);
    }//GEN-LAST:event_jRadioButton4ItemStateChanged

    private void jRadioButton5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton5ItemStateChanged
        tfVariavelB.setEnabled(false);
    }//GEN-LAST:event_jRadioButton5ItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FExponencial().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgEditar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btOk;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JMenuBar mbPrincipal;
    private com.zap.arca.JAMenuItem miAjudaConteudo;
    private com.zap.arca.JAMenuItem miAjudaSobre;
    private com.zap.arca.JAMenuItem miArquivoSair;
    private javax.swing.JMenuItem miEdiAlterar;
    private javax.swing.JMenuItem miEdiExcluir;
    private javax.swing.JMenuItem miEdiIncluir;
    private com.zap.arca.JAMenuItem miEditarLimpar;
    private com.zap.arca.JAMenuItem miExibirAtualizar;
    private javax.swing.JMenuItem miExibirFiltro;
    private javax.swing.JMenu mnAjuda;
    private javax.swing.JMenu mnArquivo;
    private javax.swing.JMenu mnEditar;
    private javax.swing.JMenu mnExibir;
    private javax.swing.JPanel plBotoes;
    private javax.swing.JPanel plCampos;
    private javax.swing.JPopupMenu.Separator spAjuda;
    private javax.swing.JToolBar.Separator spBar;
    private javax.swing.JPopupMenu.Separator spExibir;
    private javax.swing.JToggleButton tbAlterar;
    private javax.swing.JToolBar tbAtalhos;
    private com.zap.arca.JATable tbBinomial;
    private javax.swing.JToggleButton tbExcluir;
    private javax.swing.JToggleButton tbFiltrar;
    private javax.swing.JToggleButton tbIncluir;
    private javax.swing.JToggleButton tbPesquisar;
    private com.zap.arca.JATextField tfCodigo;
    private com.zap.arca.JATextField tfMedia;
    private com.zap.arca.JATextField tfProbabilidade;
    private com.zap.arca.JATextField tfVariavelA;
    private com.zap.arca.JATextField tfVariavelB;
    // End of variables declaration//GEN-END:variables

    @Override
    public void iniciar() {
        dao = new DAOBinomial();

        tbPrincipal = tbBinomial;
        toggleButton = tbIncluir;
        ctChave = tfCodigo;

        tbBinomial.setName("TB_FBINOMIAL");
        tbBinomial.setModel(binomialTableModel);

        camposVerificar = new Component[]{ tfProbabilidade};
        camposLimpar = new Component[]{tfProbabilidade,tfCodigo};

        WindowUtils.nextEnter(plCampos);
        WindowUtils.exitEsc(this);
        configurarSincronizacao(dao, tbBinomial);

    }

 


    @Override
    public void inserirOuAlterar() {

    }

    @Override
    public void preencherCampos(IModelo m) {

    }

    @Override
    public void preencherTabela(int linha, IModelo i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setValor(BigDecimal probabilidade) {
        tfProbabilidade.setValue(probabilidade.doubleValue());
    }

}