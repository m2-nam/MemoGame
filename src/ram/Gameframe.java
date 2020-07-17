package ram;
public class Gameframe extends javax.swing.JFrame{
    private final Board tlb = new Board();
    public Gameframe(){
        initComponents();
        this.jpContenedor.add(tlb);
        this.jpContenedor.repaint();
        setResizable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpContenedor = new javax.swing.JPanel();
        Bar = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        cmdPlay = new javax.swing.JMenuItem();
        cmdExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpContenedor.setPreferredSize(new java.awt.Dimension(1200, 720));

        javax.swing.GroupLayout jpContenedorLayout = new javax.swing.GroupLayout(jpContenedor);
        jpContenedor.setLayout(jpContenedorLayout);
        jpContenedorLayout.setHorizontalGroup(
            jpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        jpContenedorLayout.setVerticalGroup(
            jpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        Menu.setForeground(new java.awt.Color(204, 204, 255));
        Menu.setText("File");

        cmdPlay.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        cmdPlay.setForeground(new java.awt.Color(204, 204, 255));
        cmdPlay.setText("Play");
        cmdPlay.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        cmdPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdPlayActionPerformed(evt);
            }
        });
        Menu.add(cmdPlay);

        cmdExit.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        cmdExit.setForeground(new java.awt.Color(204, 204, 255));
        cmdExit.setText("Exit");
        cmdExit.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        cmdExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdExitActionPerformed(evt);
            }
        });
        Menu.add(cmdExit);

        Bar.add(Menu);

        setJMenuBar(Bar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jpContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jpContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdPlayActionPerformed
        tlb.startgame();
    }//GEN-LAST:event_cmdPlayActionPerformed

    private void cmdExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cmdExitActionPerformed
    public static void main(String args[]){
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new Gameframe().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Bar;
    private javax.swing.JMenu Menu;
    private javax.swing.JMenuItem cmdExit;
    private javax.swing.JMenuItem cmdPlay;
    private javax.swing.JPanel jpContenedor;
    // End of variables declaration//GEN-END:variables
}