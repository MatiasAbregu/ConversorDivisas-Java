package clases;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Matias Abregú
 */
public class InterfazConversor extends javax.swing.JFrame {

    private String moneda = "ARS", moneda2 = "DOLAR";

    public InterfazConversor() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Magic Cashy - Conversor Profesional");

        String NombreU = String.valueOf(JOptionPane.showInputDialog(null, "Digame su nombre porfavor: "));

        Bienvenido.setText("Bienvenido " + NombreU);

        ImageIcon ic = new ImageIcon("src/images/Arrows.png");
        Icon ico = new ImageIcon(ic.getImage().getScaledInstance(Convertir.getWidth(), Convertir.getHeight(), Image.SCALE_DEFAULT));
        Convertir.setIcon(ico);
        Convertir.setOpaque(false);

        ImageIcon arg = new ImageIcon("src/banderas/argentina.png");
        Icon ico1 = new ImageIcon(arg.getImage().getScaledInstance(Bandera.getWidth(), Bandera.getHeight(), Image.SCALE_DEFAULT));
        Bandera.setIcon(ico1);

        ImageIcon usa = new ImageIcon("src/banderas/usa.png");
        Icon ico2 = new ImageIcon(usa.getImage().getScaledInstance(Bandera12.getWidth(), Bandera12.getHeight(), Image.SCALE_DEFAULT));
        Bandera12.setIcon(ico2);
    }

    @Override
    public Image getIconImage() {
        Image retornar = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/IconoD.png"));
        return retornar;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Convertir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Bienvenido = new javax.swing.JLabel();
        Minimizar = new javax.swing.JLabel();
        Cerrar = new javax.swing.JLabel();
        Colores = new javax.swing.JComboBox<>();
        Modelo = new javax.swing.JLabel();
        Monto1 = new javax.swing.JTextField();
        MaC = new javax.swing.JLabel();
        Banderas1 = new javax.swing.JComboBox<>();
        Bandera = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        MT = new javax.swing.JLabel();
        Monto2 = new javax.swing.JTextField();
        Banderas2 = new javax.swing.JComboBox<>();
        Bandera12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Convertir.setBackground(new java.awt.Color(255, 255, 255));
        Convertir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Arrows.png"))); // NOI18N
        Convertir.setBorder(null);
        Convertir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Arrows.png"))); // NOI18N
        Convertir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Toma.png"))); // NOI18N
        Convertir.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Arrows.png"))); // NOI18N
        Convertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvertirActionPerformed(evt);
            }
        });
        getContentPane().add(Convertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 215, 70, 70));

        jPanel1.setBackground(new java.awt.Color(85, 213, 132));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bienvenido.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Bienvenido.setForeground(new java.awt.Color(255, 255, 255));
        Bienvenido.setText("Bienvenido");
        jPanel1.add(Bienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 275, 48));

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
        jPanel1.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, -10, 30, 30));

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
        jPanel1.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 30, 30));

        Colores.setBackground(new java.awt.Color(255, 255, 255));
        Colores.setForeground(new java.awt.Color(85, 213, 132));
        Colores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Verde - Blanco", "Rojo - Blanco", "Azul - Blanco" }));
        Colores.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ColoresItemStateChanged(evt);
            }
        });
        Colores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColoresActionPerformed(evt);
            }
        });
        jPanel1.add(Colores, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 110, -1));

        Modelo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Modelo.setForeground(new java.awt.Color(255, 255, 255));
        Modelo.setText("Modelo:");
        jPanel1.add(Modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        Monto1.setBackground(new java.awt.Color(85, 213, 132));
        Monto1.setFont(new java.awt.Font("Lucida Console", 0, 24)); // NOI18N
        Monto1.setForeground(new java.awt.Color(255, 255, 255));
        Monto1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel1.add(Monto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 190, 60));

        MaC.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        MaC.setForeground(new java.awt.Color(255, 255, 255));
        MaC.setText("Monto a convertir:");
        jPanel1.add(MaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 190, 30));

        Banderas1.setBackground(new java.awt.Color(255, 255, 255));
        Banderas1.setForeground(new java.awt.Color(85, 213, 132));
        Banderas1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ARS", "EURO", "DOLAR", "GBP", "MXN", "COP", "YEN" }));
        Banderas1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Banderas1ItemStateChanged(evt);
            }
        });
        jPanel1.add(Banderas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 80, 40));
        jPanel1.add(Bandera, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 130, 50, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 250));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MT.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        MT.setForeground(new java.awt.Color(85, 213, 132));
        MT.setText("Monto convertido:");
        jPanel2.add(MT, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 190, 30));

        Monto2.setEditable(false);
        Monto2.setBackground(new java.awt.Color(255, 255, 255));
        Monto2.setFont(new java.awt.Font("Lucida Console", 0, 24)); // NOI18N
        Monto2.setForeground(new java.awt.Color(85, 213, 132));
        jPanel2.add(Monto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 190, 60));

        Banderas2.setBackground(new java.awt.Color(85, 213, 132));
        Banderas2.setForeground(new java.awt.Color(255, 255, 255));
        Banderas2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DOLAR", "ARS", "EURO", "GBP", "MXN", "COP", "YEN" }));
        Banderas2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Banderas2ItemStateChanged(evt);
            }
        });
        jPanel2.add(Banderas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 80, 40));
        jPanel2.add(Bandera12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 50, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 500, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_MinimizarMouseClicked

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CerrarMouseClicked

    private void ColoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColoresActionPerformed
    }//GEN-LAST:event_ColoresActionPerformed

    private void ColoresItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ColoresItemStateChanged

        String color = Colores.getSelectedItem().toString();

        if (color.equals("Rojo - Blanco")) {
            jPanel1.setBackground(new Color(255, 105, 97));
            Monto1.setBackground(new Color(255, 105, 97));
            Colores.setForeground(new Color(255, 105, 97));
            MT.setForeground(new Color(255, 105, 97));
            Monto2.setForeground(new Color(255, 105, 97));
            Banderas1.setForeground(new Color(255, 105, 97));
            Banderas2.setBackground(new Color(255, 105, 97));
        } else if (color.equals("Verde - Blanco")) {
            jPanel1.setBackground(new Color(85, 213, 132));
            Monto1.setBackground(new Color(85, 213, 132));
            Colores.setForeground(new Color(85, 213, 132));
            MT.setForeground(new Color(85, 213, 132));
            Banderas1.setForeground(new Color(85, 213, 132));
            Banderas2.setBackground(new Color(85, 213, 132));
            Monto2.setForeground(new Color(85, 213, 132));
        } else if (color.equals("Azul - Blanco")) {
            jPanel1.setBackground(new Color(176, 223, 229));
            Monto1.setBackground(new Color(176, 223, 229));
            Colores.setForeground(new Color(176, 223, 229));
            MT.setForeground(new Color(176, 223, 229));
            Banderas1.setForeground(new Color(176, 223, 229));
            Banderas2.setBackground(new Color(176, 223, 229));
            Monto2.setForeground(new Color(176, 223, 229));
        }
    }//GEN-LAST:event_ColoresItemStateChanged

    private void Limpieza(){
        Monto1.setText("");
        Monto2.setText("");
    }
    
    private void Banderas1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Banderas1ItemStateChanged

        moneda = Banderas1.getSelectedItem().toString();

        ImageIcon arg = new ImageIcon("src/banderas/argentina.png");
        ImageIcon euro = new ImageIcon("src/banderas/euro.png");
        ImageIcon usa = new ImageIcon("src/banderas/usa.png");
        ImageIcon gbp = new ImageIcon("src/banderas/reino-unido.png");
        ImageIcon mxn = new ImageIcon("src/banderas/mexico.png");
        ImageIcon cop = new ImageIcon("src/banderas/colombia.png");
        ImageIcon yen = new ImageIcon("src/banderas/japon.png");

        if (moneda.equals("ARS")) {
            Icon ico1 = new ImageIcon(arg.getImage().getScaledInstance(Bandera.getWidth(), Bandera.getHeight(), Image.SCALE_DEFAULT));
            Bandera.setIcon(ico1);
            Limpieza();
        } else if (moneda.equals("EURO")) {
            Icon ico1 = new ImageIcon(euro.getImage().getScaledInstance(Bandera.getWidth(), Bandera.getHeight(), Image.SCALE_DEFAULT));
            Bandera.setIcon(ico1);
            Limpieza();
        } else if (moneda.equals("DOLAR")) {
            Icon ico1 = new ImageIcon(usa.getImage().getScaledInstance(Bandera.getWidth(), Bandera.getHeight(), Image.SCALE_DEFAULT));
            Bandera.setIcon(ico1);
            Limpieza();
        } else if (moneda.equals("GBP")) {
            Icon ico1 = new ImageIcon(gbp.getImage().getScaledInstance(Bandera.getWidth(), Bandera.getHeight(), Image.SCALE_DEFAULT));
            Bandera.setIcon(ico1);
            Limpieza();
        } else if (moneda.equals("MXN")) {
            Icon ico1 = new ImageIcon(mxn.getImage().getScaledInstance(Bandera.getWidth(), Bandera.getHeight(), Image.SCALE_DEFAULT));
            Bandera.setIcon(ico1);
            Limpieza();
        } else if (moneda.equals("COP")) {
            Icon ico1 = new ImageIcon(cop.getImage().getScaledInstance(Bandera.getWidth(), Bandera.getHeight(), Image.SCALE_DEFAULT));
            Bandera.setIcon(ico1);
            Limpieza();
        } else if (moneda.equals("YEN")) {
            Icon ico1 = new ImageIcon(yen.getImage().getScaledInstance(Bandera.getWidth(), Bandera.getHeight(), Image.SCALE_DEFAULT));
            Bandera.setIcon(ico1);
            Limpieza();
        }
    }//GEN-LAST:event_Banderas1ItemStateChanged

    private void Banderas2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Banderas2ItemStateChanged

        moneda2 = Banderas2.getSelectedItem().toString();

        ImageIcon arg = new ImageIcon("src/banderas/argentina.png");
        ImageIcon euro = new ImageIcon("src/banderas/euro.png");
        ImageIcon usa = new ImageIcon("src/banderas/usa.png");
        ImageIcon gbp = new ImageIcon("src/banderas/reino-unido.png");
        ImageIcon mxn = new ImageIcon("src/banderas/mexico.png");
        ImageIcon cop = new ImageIcon("src/banderas/colombia.png");
        ImageIcon yen = new ImageIcon("src/banderas/japon.png");

        if (moneda2.equals("ARS")) {
            Icon ico1 = new ImageIcon(arg.getImage().getScaledInstance(Bandera12.getWidth(), Bandera12.getHeight(), Image.SCALE_DEFAULT));
            Bandera12.setIcon(ico1);
            Limpieza();
        } else if (moneda2.equals("EURO")) {
            Icon ico1 = new ImageIcon(euro.getImage().getScaledInstance(Bandera12.getWidth(), Bandera12.getHeight(), Image.SCALE_DEFAULT));
            Bandera12.setIcon(ico1);
            Limpieza();
        } else if (moneda2.equals("DOLAR")) {
            Icon ico1 = new ImageIcon(usa.getImage().getScaledInstance(Bandera12.getWidth(), Bandera12.getHeight(), Image.SCALE_DEFAULT));
            Bandera12.setIcon(ico1);
            Limpieza();
        } else if (moneda2.equals("GBP")) {
            Icon ico1 = new ImageIcon(gbp.getImage().getScaledInstance(Bandera12.getWidth(), Bandera12.getHeight(), Image.SCALE_DEFAULT));
            Bandera12.setIcon(ico1);
            Limpieza();
        } else if (moneda2.equals("MXN")) {
            Icon ico1 = new ImageIcon(mxn.getImage().getScaledInstance(Bandera12.getWidth(), Bandera12.getHeight(), Image.SCALE_DEFAULT));
            Bandera12.setIcon(ico1);
            Limpieza();
        } else if (moneda2.equals("COP")) {
            Icon ico1 = new ImageIcon(cop.getImage().getScaledInstance(Bandera12.getWidth(), Bandera12.getHeight(), Image.SCALE_DEFAULT));
            Bandera12.setIcon(ico1);
            Limpieza();
        } else if (moneda2.equals("YEN")) {
            Icon ico1 = new ImageIcon(yen.getImage().getScaledInstance(Bandera12.getWidth(), Bandera12.getHeight(), Image.SCALE_DEFAULT));
            Bandera12.setIcon(ico1);
            Limpieza();
        }
    }//GEN-LAST:event_Banderas2ItemStateChanged

    private void ConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertirActionPerformed

        Double valorAConvertir = Double.parseDouble(Monto1.getText());
        Double resultado = 0.0;

        if (moneda.equals("ARS")) {

            switch (moneda2) {
                case "ARS":
                    resultado = valorAConvertir * 1;
                    Monto2.setText("ARS " + resultado);
                    break;
                case "EURO":
                    resultado = valorAConvertir * 0.0083;
                    Monto2.setText("€ " + resultado);
                    break;
                case "DOLAR":
                    resultado = valorAConvertir * 0.0091;
                    Monto2.setText("$ " + resultado);
                    break;
                case "GBP":
                    resultado = valorAConvertir * 0.0069;
                    Monto2.setText("£ " + resultado);
                    break;
                case "MXN":
                    resultado = valorAConvertir * 0.18;
                    Monto2.setText("MXN " + resultado);
                    break;
                case "COP":
                    resultado = valorAConvertir * 34.38;
                    Monto2.setText("COP " + resultado);
                    break;
                case "YEN":
                    resultado = valorAConvertir * 1.12;
                    Monto2.setText("¥ " + resultado);
            }

        } else if (moneda.equals("EURO")) {

            switch (moneda2) {
                case "ARS":
                    resultado = valorAConvertir * 120.88;
                    Monto2.setText("ARS " + resultado);
                    break;
                case "EURO":
                    resultado = valorAConvertir * 1;
                    Monto2.setText("€ " + resultado);
                    break;
                case "DOLAR":
                    resultado = valorAConvertir * 1.10;
                    Monto2.setText("$ " + resultado);
                    break;
                case "GBP":
                    resultado = valorAConvertir * 0.83;
                    Monto2.setText("£ " + resultado);
                    break;
                case "MXN":
                    resultado = valorAConvertir * 21.97;
                    Monto2.setText("MXN " + resultado);
                    break;
                case "COP":
                    resultado = valorAConvertir * 4155.53;
                    Monto2.setText("COP " + resultado);
                    break;
                case "YEN":
                    resultado = valorAConvertir * 135.36;
                    Monto2.setText("¥ " + resultado);
            }
            
        } else if (moneda.equals("DOLAR")) {

            switch (moneda2) {
                case "ARS":
                    resultado = valorAConvertir * 110.38;
                    Monto2.setText("ARS " + resultado);
                    break;
                case "EURO":
                    resultado = valorAConvertir * 0.91;
                    Monto2.setText("€ " + resultado);
                    break;
                case "DOLAR":
                    resultado = valorAConvertir * 1;
                    Monto2.setText("$ " + resultado);
                    break;
                case "GBP":
                    resultado = valorAConvertir * 0.76;
                    Monto2.setText("£ " + resultado);
                    break;
                case "MXN":
                    resultado = valorAConvertir * 20.06;
                    Monto2.setText("MXN " + resultado);
                    break;
                case "COP":
                    resultado = valorAConvertir * 3794.66;
                    Monto2.setText("COP " + resultado);
                    break;
                case "YEN":
                    resultado = valorAConvertir * 123.66;
                    Monto2.setText("¥ " + resultado);
            }
            
        } else if (moneda.equals("GBP")) {

            switch (moneda2) {
                case "ARS":
                    resultado = valorAConvertir * 145.18;
                    Monto2.setText("ARS " + resultado);
                    break;
                case "EURO":
                    resultado = valorAConvertir * 1.20;
                    Monto2.setText("€ " + resultado);
                    break;
                case "DOLAR":
                    resultado = valorAConvertir * 1.32;
                    Monto2.setText("$ " + resultado);
                    break;
                case "GBP":
                    resultado = valorAConvertir * 1;
                    Monto2.setText("£ " + resultado);
                    break;
                case "MXN":
                    resultado = valorAConvertir * 26.40;
                    Monto2.setText("MXN " + resultado);
                    break;
                case "COP":
                    resultado = valorAConvertir * 4990.44;
                    Monto2.setText("COP " + resultado);
                    break;
                case "YEN":
                    resultado = valorAConvertir * 162.76;
                    Monto2.setText("¥ " + resultado);
            }
            
        } else if (moneda.equals("MXN")) {

            switch (moneda2) {
                case "ARS":
                    resultado = valorAConvertir * 5.50;
                    Monto2.setText("ARS " + resultado);
                    break;
                case "EURO":
                    resultado = valorAConvertir * 0.045;
                    Monto2.setText("€ " + resultado);
                    break;
                case "DOLAR":
                    resultado = valorAConvertir * 0.050;
                    Monto2.setText("$ " + resultado);
                    break;
                case "GBP":
                    resultado = valorAConvertir * 0.038;
                    Monto2.setText("£ " + resultado);
                    break;
                case "MXN":
                    resultado = valorAConvertir * 1;
                    Monto2.setText("MXN " + resultado);
                    break;
                case "COP":
                    resultado = valorAConvertir * 189.08;
                    Monto2.setText("COP " + resultado);
                    break;
                case "YEN":
                    resultado = valorAConvertir * 6.16;
                    Monto2.setText("¥ " + resultado);
            }
            
        } else if (moneda.equals("COP")) {

             switch (moneda2) {
                case "ARS":
                    resultado = valorAConvertir * 0.029;
                    Monto2.setText("ARS " + resultado);
                    break;
                case "EURO":
                    resultado = valorAConvertir * 0.00024;
                    Monto2.setText("€ " + resultado);
                    break;
                case "DOLAR":
                    resultado = valorAConvertir * 0.00026;
                    Monto2.setText("$ " + resultado);
                    break;
                case "GBP":
                    resultado = valorAConvertir * 0.00020;
                    Monto2.setText("£ " + resultado);
                    break;
                case "MXN":
                    resultado = valorAConvertir * 0.0053;
                    Monto2.setText("MXN " + resultado);
                    break;
                case "COP":
                    resultado = valorAConvertir * 1;
                    Monto2.setText("COP " + resultado);
                    break;
                case "YEN":
                    resultado = valorAConvertir * 0.032;
                    Monto2.setText("¥ " + resultado);
            }
            
        } else if (moneda.equals("YEN")) {

             switch (moneda2) {
                case "ARS":
                    resultado = valorAConvertir * 0.89;
                    Monto2.setText("ARS " + resultado);
                    break;
                case "EURO":
                    resultado = valorAConvertir * 0.0074;
                    Monto2.setText("€ " + resultado);
                    break;
                case "DOLAR":
                    resultado = valorAConvertir * 0.0081;
                    Monto2.setText("$ " + resultado);
                    break;
                case "GBP":
                    resultado = valorAConvertir * 0.0061;
                    Monto2.setText("£ " + resultado);
                    break;
                case "MXN":
                    resultado = valorAConvertir * 0.16;
                    Monto2.setText("MXN " + resultado);
                    break;
                case "COP":
                    resultado = valorAConvertir * 30.67;
                    Monto2.setText("COP " + resultado);
                    break;
                case "YEN":
                    resultado = valorAConvertir * 1;
                    Monto2.setText("¥ " + resultado);
            }           
        }
    }//GEN-LAST:event_ConvertirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bandera;
    private javax.swing.JLabel Bandera12;
    private javax.swing.JComboBox<String> Banderas1;
    private javax.swing.JComboBox<String> Banderas2;
    private javax.swing.JLabel Bienvenido;
    private javax.swing.JLabel Cerrar;
    private javax.swing.JComboBox<String> Colores;
    private javax.swing.JButton Convertir;
    private javax.swing.JLabel MT;
    private javax.swing.JLabel MaC;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JLabel Modelo;
    private javax.swing.JTextField Monto1;
    private javax.swing.JTextField Monto2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
