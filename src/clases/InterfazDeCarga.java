package clases;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Matias Abregú
 */
public class InterfazDeCarga extends javax.swing.JFrame {
    
    public InterfazDeCarga() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Magic Cashy - Conversor Profesional");
        getContentPane().setBackground(new Color(176, 223, 229));

        ImageIcon icono = new ImageIcon("src/images/IconoD.png");
        Icon ic = new ImageIcon(icono.getImage().getScaledInstance(Logo.getWidth(), Logo.getHeight(), Image.SCALE_DEFAULT));
        Logo.setIcon(ic);

        Progreso.setOpaque(true);
        Progreso.setStringPainted(true);
        Progreso.setBackground(new Color(211, 211, 211));
        Progreso.setForeground(new Color(30, 34, 46));
        // Soluciones para arreglar la barra de progreso: https://es.stackoverflow.com/questions/92709/c%C3%B3mo-cambiar-el-color-de-una-jprogressbar
        //ambas soluciones son validas asique anotar en el cuaderno amba
        Barra ba = new Barra();
        ba.start();
    }
    
     public Image getIconImage(){
       Image retornar = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/IconoD.png"));
       return retornar;
    }
    
    //Clase para que la barra se pueda cargar
    class Barra extends Thread{
        
        @Override
        public void run(){
            try {
            for(int i = 0; i <= 100; i++){
                Thread.sleep(150);
                Progreso.setValue(i);
                if(i == 100){
                    Cargando.setText("Finalizado");
                    setVisible(false);
                    InterfazConversor ico = new InterfazConversor();
                    ico.setVisible(true);
                }
            }
        } catch (InterruptedException e) {
        }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Logo = new javax.swing.JLabel();
        Cargando = new javax.swing.JLabel();
        NombreDeConversor1 = new javax.swing.JLabel();
        Progreso = new javax.swing.JProgressBar();
        Cerrar = new javax.swing.JLabel();
        Minimizar = new javax.swing.JLabel();
        Leyenda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setFocusCycleRoot(false);
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(500, 500));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(510, 580));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 190, 190));

        Cargando.setBackground(new java.awt.Color(102, 102, 102));
        Cargando.setFont(new java.awt.Font("Calibri", 2, 24)); // NOI18N
        Cargando.setForeground(new java.awt.Color(153, 153, 153));
        Cargando.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cargando.setText("Cargando...");
        Cargando.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Cargando, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 330, 30));

        NombreDeConversor1.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        NombreDeConversor1.setForeground(new java.awt.Color(51, 51, 51));
        NombreDeConversor1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NombreDeConversor1.setText("Magic Cashy");
        NombreDeConversor1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(NombreDeConversor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 310, 50));

        Progreso.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        Progreso.setForeground(new java.awt.Color(0, 0, 0));
        Progreso.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Progreso.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Progreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 460, 40));

        Cerrar.setFont(new java.awt.Font("Segoe UI", 0, 68)); // NOI18N
        Cerrar.setForeground(new java.awt.Color(255, 153, 153));
        Cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cerrar.setText("•");
        Cerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });
        getContentPane().add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 30, 30));

        Minimizar.setFont(new java.awt.Font("Segoe UI", 0, 68)); // NOI18N
        Minimizar.setForeground(new java.awt.Color(255, 255, 153));
        Minimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Minimizar.setText("•");
        Minimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizarMouseClicked(evt);
            }
        });
        getContentPane().add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, -10, 30, 30));

        Leyenda.setBackground(new java.awt.Color(102, 102, 102));
        Leyenda.setFont(new java.awt.Font("Calibri", 2, 24)); // NOI18N
        Leyenda.setForeground(new java.awt.Color(153, 153, 153));
        Leyenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Leyenda.setText("El poder del dinero a un solo click");
        Leyenda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Leyenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 330, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CerrarMouseClicked

    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_MinimizarMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazDeCarga().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cargando;
    private javax.swing.JLabel Cerrar;
    private javax.swing.JLabel Leyenda;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JLabel NombreDeConversor1;
    private javax.swing.JProgressBar Progreso;
    // End of variables declaration//GEN-END:variables
}
