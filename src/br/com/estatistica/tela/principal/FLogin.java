package br.com.estatistica.tela.principal;

import br.com.estatistica.dao.DAOUsuario;
import br.com.estatistica.modelo.Usuario;
import br.com.util.Administrador;
import br.com.util.Util;
import com.zap.arca.JAConfigurarConexao;
import com.zap.arca.LoggerEx;
import com.zap.arca.auth.Criptografia;
import com.zap.arca.util.WindowUtils;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import org.hibernate.HibernateException;

/**
 *
 * @author Everton
 */
public class FLogin extends javax.swing.JFrame {

    private static final Logger logger = Logger.getLogger("br.com.estatistica.tela");
    private Util util = new Util();
    private Criptografia crip;
    // Bloco de inicialização que aplica o ícone da aplicação

    {
        WindowUtils.setSystemLookAndFeel();
        util.inserirIconeAplicacao(this);
    }

    /**
     * Creates new form FLogin
     */
    public FLogin() {
        crip = new Criptografia();
        initComponents();
        new Thread(new Conexao()).start();
    }

    /**
     * Verifica se o usuário pode acessar o sistema
     */
    public void autenticar() {
        try {
            Usuario usuario = obterUsuario();
            if (usuario != null) {
                new FPrincipal(usuario).setVisible(true);

                DAOUsuario.setUsuarioAtual(usuario);
                dispose();
                logger.log(Level.INFO, "Usuário {0}, entrou no sistema", usuario.getNome());
            } else if (tfUsuario.getText().equals("") && String.valueOf(pfSenha.getPassword()).isEmpty()) {
                JOptionPane.showMessageDialog(null, "Entre com usuário e senha");

            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos");
                tfUsuario.requestFocus();
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            Util.logException(ex);
            LoggerEx.log(ex);
        }
    }

    /**
     * Obtem um usuário a partir dos dados informados no formulário se os dados
     * não forem válidos retorna NULL
     *
     * @return
     */
    private Usuario obterUsuario() {
        String nome = tfUsuario.getText();
        String senha = crip.criptografar(pfSenha.getPassword());

        if (nome.equals("ADMIN") || nome.equals("lunna")) {
            return new Administrador().autenticar(nome, senha);
        } else {
            return new DAOUsuario().autenticar(nome, senha);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        plAutenticacao = new javax.swing.JPanel();
        lbUsuario = new javax.swing.JLabel();
        lbSenha = new javax.swing.JLabel();
        tfUsuario = new com.zap.arca.JATextField(10,1);
        pfSenha = new com.zap.arca.JAPasswordField();
        btEntrar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        pbConexao = new javax.swing.JProgressBar();
        lbStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Autenticação");
        setResizable(false);

        plAutenticacao.setBorder(javax.swing.BorderFactory.createTitledBorder("Autenticação"));

        lbUsuario.setText("Usuário:");

        lbSenha.setText("Senha:");

        tfUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfUsuarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfUsuarioKeyTyped(evt);
            }
        });

        pfSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pfSenhaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pfSenhaKeyTyped(evt);
            }
        });

        btEntrar.setText("Entrar");
        btEntrar.setEnabled(false);
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout plAutenticacaoLayout = new javax.swing.GroupLayout(plAutenticacao);
        plAutenticacao.setLayout(plAutenticacaoLayout);
        plAutenticacaoLayout.setHorizontalGroup(
            plAutenticacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plAutenticacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plAutenticacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(plAutenticacaoLayout.createSequentialGroup()
                        .addGroup(plAutenticacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbUsuario)
                            .addComponent(lbSenha))
                        .addGap(18, 18, 18)
                        .addGroup(plAutenticacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfUsuario)
                            .addComponent(pfSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)))
                    .addGroup(plAutenticacaoLayout.createSequentialGroup()
                        .addComponent(btEntrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btCancelar)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        plAutenticacaoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btCancelar, btEntrar});

        plAutenticacaoLayout.setVerticalGroup(
            plAutenticacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plAutenticacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plAutenticacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUsuario)
                    .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(plAutenticacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSenha)
                    .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(plAutenticacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEntrar)
                    .addComponent(btCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pbConexao.setIndeterminate(true);

        lbStatus.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lbStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbStatus.setText("Estabelecendo conexão com banco de dados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbStatus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addComponent(pbConexao, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(plAutenticacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(plAutenticacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(pbConexao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbStatus)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void tfUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUsuarioKeyTyped
        if (evt.getKeyChar() == (char) KeyEvent.VK_ENTER) {
            pfSenha.requestFocus();
        }
}//GEN-LAST:event_tfUsuarioKeyTyped

    private void pfSenhaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pfSenhaKeyTyped
        if (evt.getKeyChar() == (char) KeyEvent.VK_ENTER) {
            btEntrar.requestFocus();
            btEntrar.doClick();
        }
}//GEN-LAST:event_pfSenhaKeyTyped

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
        autenticar();
}//GEN-LAST:event_btEntrarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        System.exit(0);
}//GEN-LAST:event_btCancelarActionPerformed

    private void tfUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUsuarioKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_F10) {
            new JAConfigurarConexao(this, true).setVisible(true);
        }
    }//GEN-LAST:event_tfUsuarioKeyReleased

    private void pfSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pfSenhaKeyReleased
        Toolkit tk = Toolkit.getDefaultToolkit();
        if (tk.getLockingKeyState(KeyEvent.VK_CAPS_LOCK)) {
            JOptionPane.showMessageDialog(null, "CapsLock está ativada");
        }
    }//GEN-LAST:event_pfSenhaKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FLogin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btEntrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JProgressBar pbConexao;
    private javax.swing.JPasswordField pfSenha;
    private javax.swing.JPanel plAutenticacao;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables

    class Conexao implements Runnable {

        public void run() {
            // Iniciando barra de progresso
            SwingUtilities.invokeLater(new Update(true, "Estabelecendo conexão com banco de dados"));
            try {
                new DAOUsuario().consultar(0);
                SwingUtilities.invokeLater(new Update(false, "Conexão estabelecida"));
                SwingUtilities.invokeLater(new Update(100, "Conexão estabelecida"));
            } catch (HibernateException ex) {
                ex.printStackTrace();
                Util.logException(ex);
                pbConexao.setIndeterminate(false);
                pbConexao.setValue(0);
                lbStatus.setText("Falha ao estabelecer conexao com o banco de dados");
                LoggerEx.log(ex);
            } catch (Exception ex) {
                ex.printStackTrace();
                LoggerEx.log(ex);
            }
        }
    }

    // Classe para atualizar os componentes da tela dentro de uma thread
    class Update implements Runnable {

        private Boolean estado;
        private String mensagem;
        private int progresso;

        Update(boolean estado, String mensagem) {
            this.estado = estado;
            this.mensagem = mensagem;
        }

        Update(int progresso, String mensagem) {
            this.progresso = progresso;
            this.mensagem = mensagem;
        }

        public void run() {
            if (estado != null && estado) {
                pbConexao.setIndeterminate(true);
                lbStatus.setText(mensagem);
                btEntrar.setEnabled(false);
            } else if (estado != null && !estado) {
                pbConexao.setIndeterminate(false);
                lbStatus.setText(mensagem);
                btEntrar.setEnabled(true);
            } else {
                pbConexao.setIndeterminate(false);
                pbConexao.setValue(progresso);
                lbStatus.setText(mensagem);
            }
        }
    }
}
