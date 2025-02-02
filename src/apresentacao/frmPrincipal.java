/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package apresentacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import modelo.Equipe;
import modelo.ListaEquipe;
import modelo.Musica;
import modelo.Musica.Playlist;

/**
 *
 * @author nickb
 */
public class frmPrincipal extends javax.swing.JDialog {

    /**
     * Creates new form frmPrincipal
     */
   
    public frmPrincipal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setResizable(false);    
    }
    

        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblBRTS = new javax.swing.JLabel();
        btnBrasil = new javax.swing.JButton();
        btnAmerica = new javax.swing.JButton();
        btnEuropa = new javax.swing.JButton();
        btnEditor = new javax.swing.JButton();
        lblWallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Inicial");
        setBackground(new java.awt.Color(255, 255, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Segoe UI Black", 1, 70)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("GERADOR DE TORNEIO");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 900, 101));

        lblBRTS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logos/brts.png"))); // NOI18N
        getContentPane().add(lblBRTS, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 50, 50));

        btnBrasil.setBackground(new java.awt.Color(255, 255, 255));
        btnBrasil.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        btnBrasil.setForeground(new java.awt.Color(0, 0, 0));
        btnBrasil.setText("Torneio BRASIL");
        btnBrasil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        btnBrasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrasilActionPerformed(evt);
            }
        });
        getContentPane().add(btnBrasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 340, 69));

        btnAmerica.setBackground(new java.awt.Color(255, 255, 255));
        btnAmerica.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        btnAmerica.setForeground(new java.awt.Color(0, 0, 0));
        btnAmerica.setText("Torneio AMÉRICA");
        btnAmerica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        btnAmerica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmericaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAmerica, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 340, 69));

        btnEuropa.setBackground(new java.awt.Color(255, 255, 255));
        btnEuropa.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        btnEuropa.setForeground(new java.awt.Color(0, 0, 0));
        btnEuropa.setText("Torneio EUROPA");
        btnEuropa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        btnEuropa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEuropaActionPerformed(evt);
            }
        });
        getContentPane().add(btnEuropa, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 340, 69));

        btnEditor.setBackground(new java.awt.Color(255, 255, 255));
        btnEditor.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        btnEditor.setForeground(new java.awt.Color(0, 0, 0));
        btnEditor.setText("Torneio EDITOR");
        btnEditor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        btnEditor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditorActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditor, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 340, 69));

        lblWallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/back-principal.png"))); // NOI18N
        getContentPane().add(lblWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBrasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrasilActionPerformed
        List<Equipe> listaFinal = new ArrayList<>();
        
        for(int i = 0 ; i < ListaEquipe.listaEquipe().size() ; i++)
        {
            if(ListaEquipe.listaEquipe().get(i).getPais() == 1)
            {
                listaFinal.add(ListaEquipe.listaEquipe().get(i));
            }
        }
        
        Collections.shuffle(listaFinal);
        
        for(int i = listaFinal.size() -1 ; i >= 8 ; i--)
        {
            listaFinal.remove(i);
        }
        
        frmCampeonato frmC = new frmCampeonato(null, true, listaFinal, 1);
        setVisible(false);
        frmC.setVisible(true);
        setVisible(true);
    }//GEN-LAST:event_btnBrasilActionPerformed

    private void btnEuropaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEuropaActionPerformed
        List<Equipe> listaFinal = new ArrayList<>();
        
        for(int i = 0 ; i < ListaEquipe.listaEquipe().size() ; i++)
        {
            if(ListaEquipe.listaEquipe().get(i).getPais() == 2)
            {
                listaFinal.add(ListaEquipe.listaEquipe().get(i));
            }
        }
        
        Collections.shuffle(listaFinal);
        
        for(int i = listaFinal.size() -1 ; i >= 8 ; i--)
        {
            listaFinal.remove(i);
        }
        
        frmCampeonato frmC = new frmCampeonato(null, true, listaFinal, 2);
        setVisible(false);
        frmC.setVisible(true);
        setVisible(true);
    }//GEN-LAST:event_btnEuropaActionPerformed

    private void btnEditorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditorActionPerformed
        frmEquipes frmE = new frmEquipes(null, true);
        setVisible(false);
        frmE.setVisible(true);
        if(frmE.retorno().size() == 9)
        {
            try 
            {
                frmCampeonato frmC = new frmCampeonato(null, true, frmE.retorno(), frmE.retorno().get(8).getPais());
                setVisible(false);
                frmC.setVisible(true);
                setVisible(true);
            } 
            catch (Exception e)
            {
            }
        }
        else
        {
            setVisible(true);
        }
        
    }//GEN-LAST:event_btnEditorActionPerformed

    private void btnAmericaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmericaActionPerformed
        List<Equipe> listaFinal = new ArrayList<>();
        
        for(int i = 0 ; i < ListaEquipe.listaEquipe().size() ; i++)
        {
            if(ListaEquipe.listaEquipe().get(i).getPais() == 3)
            {
                listaFinal.add(ListaEquipe.listaEquipe().get(i));
            }
        }
        
        Collections.shuffle(listaFinal);
        
        for(int i = listaFinal.size() -1 ; i >= 8 ; i--)
        {
            listaFinal.remove(i);
        }
        
        frmCampeonato frmC = new frmCampeonato(null, true, listaFinal, 3);
        setVisible(false);
        frmC.setVisible(true);
        setVisible(true);
    }//GEN-LAST:event_btnAmericaActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmPrincipal dialog = new frmPrincipal(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAmerica;
    private javax.swing.JButton btnBrasil;
    private javax.swing.JButton btnEditor;
    private javax.swing.JButton btnEuropa;
    private javax.swing.JLabel lblBRTS;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblWallpaper;
    // End of variables declaration//GEN-END:variables
}
