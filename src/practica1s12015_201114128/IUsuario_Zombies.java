/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s12015_201114128;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author asus
 */
public class IUsuario_Zombies extends javax.swing.JPanel {

    /**
     * Creates new form IUsuario_Zombies
     */
    public IUsuario_Zombies() {
        initComponents();
        this.setSize(900,575);
    }

    
    
       @Override
    public void paintComponent(Graphics g){
        Dimension tam = getSize();
        ImageIcon ImagenFondo = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/zombie.png")).getImage());
        g.drawImage(ImagenFondo.getImage(),0,0,tam.width,tam.height,null);
        setOpaque(false);
        super.paintComponent(g);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
