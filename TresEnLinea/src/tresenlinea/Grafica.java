package tresenlinea;

public class Grafica extends javax.swing.JFrame {

    public int Turno;
    Tablero miTablero=new Tablero();
    
    public Grafica() {
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Boton1 = new javax.swing.JButton();
        Boton2 = new javax.swing.JButton();
        Boton3 = new javax.swing.JButton();
        Boton4 = new javax.swing.JButton();
        Boton5 = new javax.swing.JButton();
        Boton6 = new javax.swing.JButton();
        Boton7 = new javax.swing.JButton();
        Boton8 = new javax.swing.JButton();
        Boton9 = new javax.swing.JButton();
        Etiqueta = new javax.swing.JLabel();
        CuadroDeTexto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(370, 530));

        Boton1.setBackground(java.awt.Color.white);
        Boton1.setFont(new java.awt.Font("Purisa", 0, 36)); // NOI18N
        Boton1.setToolTipText("");
        Boton1.setBorder(null);
        Boton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton1MouseClicked(evt);
            }
        });

        Boton2.setBackground(java.awt.Color.white);
        Boton2.setFont(new java.awt.Font("Purisa", 0, 36)); // NOI18N
        Boton2.setToolTipText("");
        Boton2.setBorder(null);
        Boton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton2MouseClicked(evt);
            }
        });

        Boton3.setBackground(java.awt.Color.white);
        Boton3.setFont(new java.awt.Font("Purisa", 0, 36)); // NOI18N
        Boton3.setToolTipText("");
        Boton3.setBorder(null);
        Boton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton3MouseClicked(evt);
            }
        });

        Boton4.setBackground(java.awt.Color.white);
        Boton4.setFont(new java.awt.Font("Purisa", 0, 36)); // NOI18N
        Boton4.setToolTipText("");
        Boton4.setBorder(null);
        Boton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton4MouseClicked(evt);
            }
        });

        Boton5.setBackground(java.awt.Color.white);
        Boton5.setFont(new java.awt.Font("Purisa", 0, 36)); // NOI18N
        Boton5.setToolTipText("");
        Boton5.setBorder(null);
        Boton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton5MouseClicked(evt);
            }
        });

        Boton6.setBackground(java.awt.Color.white);
        Boton6.setFont(new java.awt.Font("Purisa", 0, 36)); // NOI18N
        Boton6.setToolTipText("");
        Boton6.setBorder(null);
        Boton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton6MouseClicked(evt);
            }
        });

        Boton7.setBackground(java.awt.Color.white);
        Boton7.setFont(new java.awt.Font("Purisa", 0, 36)); // NOI18N
        Boton7.setToolTipText("");
        Boton7.setBorder(null);
        Boton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton7MouseClicked(evt);
            }
        });

        Boton8.setBackground(java.awt.Color.white);
        Boton8.setFont(new java.awt.Font("Purisa", 0, 36)); // NOI18N
        Boton8.setToolTipText("");
        Boton8.setBorder(null);
        Boton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton8MouseClicked(evt);
            }
        });

        Boton9.setBackground(java.awt.Color.white);
        Boton9.setFont(new java.awt.Font("Purisa", 0, 36)); // NOI18N
        Boton9.setToolTipText("");
        Boton9.setBorder(null);
        Boton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton9MouseClicked(evt);
            }
        });

        Etiqueta.setBackground(java.awt.Color.blue);
        Etiqueta.setFont(new java.awt.Font("Purisa", 0, 36)); // NOI18N
        Etiqueta.setText("Tres en Línea");
        Etiqueta.setToolTipText("");
        Etiqueta.setBorder(null);

        CuadroDeTexto.setBackground(java.awt.Color.white);
        CuadroDeTexto.setFont(new java.awt.Font("Purisa", 0, 36)); // NOI18N
        CuadroDeTexto.setToolTipText("");
        CuadroDeTexto.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CuadroDeTexto)
                    .addComponent(Etiqueta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Etiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(CuadroDeTexto)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton1MouseClicked
    if(Turno==0){
        Boton1.setText("X");
        Turno=1;
        miTablero.Ficha[0][0]=0;
    }else{
        Boton1.setText("O");
        Turno=0;
        miTablero.Ficha[0][0]=1;
    }
    }//GEN-LAST:event_Boton1MouseClicked

    private void Boton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton2MouseClicked
    if(Turno==0){
        Boton2.setText("X");
        Turno=1;
        miTablero.Ficha[0][1]=0;
    }else{
        Boton2.setText("O");
        Turno=0;
        miTablero.Ficha[0][1]=1;
    }
    }//GEN-LAST:event_Boton2MouseClicked

    private void Boton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton3MouseClicked
    if(Turno==0){
        Boton3.setText("X");
        Turno=1;
        miTablero.Ficha[0][2]=0;
    }else{
        Boton3.setText("O");
        Turno=0;
        miTablero.Ficha[0][2]=1;
    }
    }//GEN-LAST:event_Boton3MouseClicked

    private void Boton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton4MouseClicked
    if(Turno==0){
        Boton4.setText("X");
        Turno=1;
        miTablero.Ficha[1][0]=0;
    }else{
        Boton4.setText("O");
        Turno=0;
        miTablero.Ficha[1][0]=1;
    }
    }//GEN-LAST:event_Boton4MouseClicked

    private void Boton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton5MouseClicked
    if(Turno==0){
        Boton5.setText("X");
        Turno=1;
        miTablero.Ficha[1][1]=0;
    }else{
        Boton5.setText("O");
        Turno=0;
        miTablero.Ficha[1][1]=1;
    }
    }//GEN-LAST:event_Boton5MouseClicked

    private void Boton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton6MouseClicked
    if(Turno==0){
        Boton6.setText("X");
        Turno=1;
        miTablero.Ficha[1][2]=0;
    }else{
        Boton6.setText("O");
        Turno=0;
        miTablero.Ficha[1][2]=1;
    }
    }//GEN-LAST:event_Boton6MouseClicked

    private void Boton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton7MouseClicked
    if(Turno==0){
        Boton7.setText("X");
        Turno=1;
        miTablero.Ficha[2][0]=0;
    }else{
        Boton7.setText("O");
        Turno=0;
        miTablero.Ficha[2][0]=1;
    }
    }//GEN-LAST:event_Boton7MouseClicked

    private void Boton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton8MouseClicked
    if(Turno==0){
        Boton8.setText("X");
        Turno=1;
        miTablero.Ficha[2][1]=0;
    }else{
        Boton8.setText("O");
        Turno=0;
        miTablero.Ficha[2][1]=1;
    }
    }//GEN-LAST:event_Boton8MouseClicked

    private void Boton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton9MouseClicked
    if(Turno==0){
        Boton9.setText("X");
        Turno=1;
        miTablero.Ficha[2][2]=0;
    }else{
        Boton9.setText("O");
        Turno=0;
        miTablero.Ficha[2][2]=1;
    }
    }//GEN-LAST:event_Boton9MouseClicked
 
    
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton1;
    private javax.swing.JButton Boton2;
    private javax.swing.JButton Boton3;
    private javax.swing.JButton Boton4;
    private javax.swing.JButton Boton5;
    private javax.swing.JButton Boton6;
    private javax.swing.JButton Boton7;
    private javax.swing.JButton Boton8;
    private javax.swing.JButton Boton9;
    private javax.swing.JTextField CuadroDeTexto;
    private javax.swing.JLabel Etiqueta;
    // End of variables declaration//GEN-END:variables
}
