/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladoresVistas;

import Modelos.Circulo;
import Modelos.Cuadrado;
import Modelos.Imagen;
import java.awt.Color;

/**
 *
 * @author pipet
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        Cuadrado cuadrado1= new Cuadrado(10, 10, Color.black, Color.red, 90);
        Circulo circulo1=new Circulo(100, 10, Color.blue, Color.green, 70);
        Imagen elHongo=new Imagen(10, 100, "src/Imagenes/hongo.png", 64, 64);
//        this.lienzo1.getFiguras().add(cuadrado1);
//        this.lienzo1.getFiguras().add(circulo1);
//        this.lienzo1.getFiguras().add(elHongo);
        int  matrizColores [][]={
                            {0,0,0,0,0,1,1,1}, //
                            {0,0,0,0,1,1,1,1},//
                            {0,0,0,0,2,2,2,5},//
                            {0,0,0,2,5,2,5,5}, //
                            {0,0,0,2,5,2,2,5},//
                            {0,0,0,0,2,5,5,5}, //
                            {0,0,0,0,0,5,5,5}, //
                            {0,0,0,0,1,1,4,1},//
                            {0,0,0,1,1,1,4,1},//
                            {0,0,1,1,1,1,4,4},//
                            {0,0,5,5,1,4,5,4},//
                            {0,0,5,5,5,4,4,4},//
                            {0,0,5,5,4,4,4,4},//
                            {0,0,0,0,4,4,4,0},//
                            {0,0,0,2,2,2,0,0},
                            {0,0,2,2,2,2,0,0},
                           };
        
        primero(matrizColores);
        int matriz[][]={{0,0,3,4,0,0,0,1},
                        {0,0,0,0,0,0,0,0},
                        {1,1,1,1,4,0,0,1},
                        {1,1,1,1,1,1,1,1},
                        {1,1,1,1,4,0,0,1},
                        {1,1,1,1,4,0,0,1},
                        {1,1,1,1,4,0,0,1},
                        {1,1,1,1,4,0,0,1},
                        {1,1,1,1,4,0,0,1},
                        {1,1,1,1,4,0,0,1},
                        {1,1,1,1,4,0,0,1},
                        {1,1,1,1,4,0,0,1},
                        {1,1,1,1,4,0,0,1},
                        {1,1,1,1,4,0,0,1},
                        {1,1,1,1,4,0,0,1},
                        {1,1,1,1,4,0,0,1}};
        llamadoColores(matriz);
    }
        

    public void llamadoColores(int matriz[][]){
        for (int y = 0; y < 480; y=y+30) {
            for (int x = 0; x < 240; x=x+30) {
                if(matriz [y][x]==0){
          Cuadrado elCuadrado = new Cuadrado(x, y, Color.black, Color.red, 30);          
          this.lienzo1.getFiguras().add(elCuadrado);
                }
          
          
            }
        }
    }
    
    
            
    
    
    public void primero(int matrizColores[][]){
        Color brown=new Color(78, 59, 49);
        int y=0;
        for (int j = 0; j < 16; j++) {
            y=y+30;
            int x=0;
            for (int i = 0; i < 8; i++) {
                x=x+30;
                if (matrizColores[j][i]==0){
                    Cuadrado nuevoCuadrado=new Cuadrado(x, y, Color.BLACK, Color.WHITE, 30);
                    this.lienzo1.getFiguras().add(nuevoCuadrado);
                }
                if (matrizColores[j][i]==1){
                    Cuadrado nuevoCuadrado=new Cuadrado(x, y, Color.BLACK, Color.RED, 30);
                    this.lienzo1.getFiguras().add(nuevoCuadrado);
                }
                if (matrizColores[j][i]==2){
                    Cuadrado nuevoCuadrado=new Cuadrado(x, y, Color.BLACK, brown, 30);
                    this.lienzo1.getFiguras().add(nuevoCuadrado);
                }
                if (matrizColores[j][i]==3){
                    Cuadrado nuevoCuadrado=new Cuadrado(x, y, Color.BLACK, Color.BLACK, 30);
                    this.lienzo1.getFiguras().add(nuevoCuadrado);
                }
                if (matrizColores[j][i]==4){
                    Cuadrado nuevoCuadrado=new Cuadrado(x, y, Color.BLACK, Color.BLUE, 30);
                    this.lienzo1.getFiguras().add(nuevoCuadrado);
                }
                if (matrizColores[j][i]==5){
                    Cuadrado nuevoCuadrado=new Cuadrado(x, y, Color.BLACK, Color.YELLOW, 30);
                    this.lienzo1.getFiguras().add(nuevoCuadrado);
                }
            }
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

        lienzo1 = new ControladoresVistas.Lienzo();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout lienzo1Layout = new javax.swing.GroupLayout(lienzo1);
        lienzo1.setLayout(lienzo1Layout);
        lienzo1Layout.setHorizontalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 733, Short.MAX_VALUE)
        );
        lienzo1Layout.setVerticalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lienzo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lienzo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ControladoresVistas.Lienzo lienzo1;
    // End of variables declaration//GEN-END:variables
}
