package transportationcost;

import javax.swing.JOptionPane;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class TransportationCost extends javax.swing.JFrame {
    String from, to;
    
    public TransportationCost() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        Vehicle = new javax.swing.JComboBox<>();
        From = new javax.swing.JComboBox<>();
        To = new javax.swing.JComboBox<>();
        map = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cost and Maps Helper");
        setLocation(new java.awt.Point(400, 200));
        setResizable(false);

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Tap Here");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Current Place");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Target Place");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Transport");

        clear.setBackground(new java.awt.Color(51, 51, 255));
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        Vehicle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Bus", "Easybike", "Mahindra" }));

        From.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Police Line", "Lonch Ghat", "Municipality", "Pachuria", "Nobinbag/Hospital", "LGED/Circuit House", "Sonakur/Nilamath/Gobra Madrasha", "Varsity/Sobhan Sorok", "Ghonapara" }));
        From.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FromActionPerformed(evt);
            }
        });

        To.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Police Line", "Lonch Ghat", "Municipality", "Pachuria", "Nobinbag/Hospital", "LGED/Circuit House", "Sonakur/Nilamath/Gobra Madrasha", "Varsity/Sobhan Sorok", "Ghonapara" }));
        To.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToActionPerformed(evt);
            }
        });

        map.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        map.setText("Maps");
        map.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Vehicle, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(From, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(To, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(84, 84, 84))
            .addGroup(layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(map)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(From, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(To, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Vehicle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(25, 25, 25)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(clear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(map)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
         TransportationCost obj = new TransportationCost();
         obj.setVisible(false);
          from = (String)From.getSelectedItem();
         
          to= (String)To.getSelectedItem();
         String transport = (String)Vehicle.getSelectedItem();
         
         
         if(from.equals("None") ||to.equals("None")||transport.equals("None")){
             JOptionPane.showMessageDialog(null,"Empty Field", "Message",JOptionPane.ERROR_MESSAGE);
             
         }
         else if(from.equals(to)){
             JOptionPane.showMessageDialog(null,"There is no differense between current place and target place.", "Message",JOptionPane.ERROR_MESSAGE);
         }
         else{
         switch (from) {
            
            case "Pachuria":   
                {
                    switch (to) {
                        case "Police Line":
                        {
                            switch(transport){
                                case "Mahindra":
                                {
                                    Unavailable o = new Unavailable();
                                    break;
                                }
                                case "Easybike":
                                {
                                    Ten o = new Ten();
                                    break;
                                }
                                case "Bus":
                                {
                                    Five o = new Five();
                                    break;
                                }
                                default:
                                break;
                            }
                            break;
                        }
            
            case "Lonch Ghat":
            case "Municipality":
            case "Nobinbag/Hospital":
            case "LGED/Circuit House":
            {
                Five o= new Five();
                break;
            }
            
            case "Sonakur/Nilamath/Gobra Madrasha":
            case "Sobhan Sorok/Varsity":
            case "Ghonapara":
            
                    {
                    switch(transport){
                        
                        case "Bus":
                        {
                            Five o= new Five();
                            break;
                        }
                        case "Mahindra":
                        case "Easybike":
                        {
                            Ten o= new Ten();
                            break;
                        }
                        default:
                            break;
                    }
                    break;
                }
            
                
            default:
                break;
        }
                    break;
                }
            case "Police Line":
                {
                    switch(to){

            case "Lonch Ghat":
            case "Municipality":
            {
                switch(transport){
                    case "Bus":
                    case "Easybike":
                    {
                        Five o= new Five();
                        break;
                    }
                    case "Mahindra":
                    {
                        Unavailable o= new Unavailable();
                        break;
                    }
                    default:
                        break;
                }
                break;
            }

            case "Pachuria":
            case "Nobinbag/Hospital":
            case "LGED/Circuit House":
            {
                switch(transport){
                    case "Bus":
                    {
                        Five o= new Five();
                        break;
                    }
                    case "Easybike":
                    {
                        Ten o= new Ten();
                        break;
                    }
                    case "Mahindra":
                    {
                        Unavailable o= new Unavailable();
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "Sonakur/Nilamath/Gobra Madrasha":
            case "Varsity/Sobhan Sorok":
            case "Ghonapara":
            {
                switch(transport){
                    case "Bus":
                    {
                        Ten o= new Ten();
                        break;
                    }
                    case "Easybike":
                    {
                        Fifteen o= new Fifteen();
                        break;
                    }
                    case "Mahindra":
                    {
                        Unavailable o= new Unavailable();
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            
            
            default:
                break;
        }
                    break;
                }

            case "Lonch Ghat":
                {
                    switch(to){
            case "Police Line":
            case "Municipality":
            case "Pachuria":
            case "Nobinbag/Hospital":
            case "LGED/Circuit House":
            
            {
                Five o= new Five();
                break;
            }
            case "Sonakur/Nilamath/Gobra Madrasha":
            case "Varsity/Sobhan Sorok":
            case "Ghonapara":
            {
                switch(transport){
                    case "Bus":
                    {
                        Five o= new Five();
                        break;
                    }
                    case "Mahindra":
                    case "Easybike":
                    {
                        Ten o= new Ten();
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            default:
                break;
        }
                    break;
                }
                case "Municipality":
                {
                    switch(to){
            case "Police Line":
            case "Lonch Ghat":
            case "Pachuria":
            case "Nobinbag/Hospital":
            case "LGED/Circuit House":
            
            {
                Five o= new Five();
                break;
            }
            case "Sonakur/Nilamath/Gobra Madrasha":
            case "Varsity/Sobhan Sorok":
            case "Ghonapara":
            {
                switch(transport){
                    case "Bus":
                    {
                        Five o= new Five();
                        break;
                    }
                    case "Mahindra":
                    case "Easybike":
                    {
                        Ten o= new Ten();
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            default:
                break;
        }
                    break;
                }
            case "Nobinbag/Hospital":
                {
                    switch(to){
            case "Police Line":
            {
                switch(transport){
                    case "Bus":
                    {
                        Five o= new Five();
                        break;
                    }
                    case "Mahindra":
                    {
                        Unavailable o= new Unavailable();
                        break;
                    }
                    case "Easybike":
                    {
                        Ten o= new Ten();
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "LGED/Circuit House":
            case "Lonch Ghat":
            case "Municipality":
            case "Pachuria":
            case "Sonakur/Nilamath/Gobra Madrasha":
            case "Varsity/Sobhan Sorok":
            case "Ghonapara":
            {
                Five o= new Five();
                break;
            }
                    default:
                        break;
        }
                    break;
                }
                case "LGED/Circuit House":
                {
                    switch(to){
            case "Police Line":
            {
                switch(transport){
                    case "Bus":
                    {
                        Five o= new Five();
                        break;
                    }
                    case "Mahindra":
                    {
                        Unavailable o= new Unavailable();
                        break;
                    }
                    case "Easybike":
                    {
                        Ten o= new Ten();
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "Nobinbag/Hospital":
            case "Lonch Ghat":
            case "Municipality":
            case "Pachuria":
            case "Sonakur/Nilamath/Gobra Madrasha":
            case "Varsity/Sobhan Sorok":
            case "Ghonapara":
            {
                Five o= new Five();
                break;
            }
                    default:
                        break;
        }
                    break;
                }
            case "Sonakur/Nilamath/Gobra Madrasha":
            {
                switch(to){
            
            case "Police Line":
            {
                switch(transport){
                    
                    case "Bus":
                    {
                        Ten o= new Ten();
                        break;
                    }
                    case "Easybike":
                    {
                        Fifteen o= new Fifteen();
                        break;
                    }
                    case "Mahindra": 
                    {
                        Unavailable o= new Unavailable();
                        break;
                    }
                            
                    default:
                        break;
                }
                break;
                
            }
            
            case "Lonch Ghat":
            case "Municipality":
            case "Pachuria":
            {
                switch(transport){
                    case "Bus":
                    {
                        Five o= new Five();
                        break;
                    }
                    
                    case "Easybike":
                    case "Mahindra":
                    {
                        Ten o= new Ten();
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            case "Varsity/Sobhan Sorok":
            case "Ghonapara":
            case "Nobinbag/Hospital":
            case "LGED/Circuit House":
            {
                switch(transport){
                    case "Bus":
                    case "Easybike":
                    case "Mahindra":
                    {
                        Five o = new Five();
                        break;
                    }
                    default:
                        break;
                }
                break;
            }
            default:
                break;
        }
                break;
            }
            case "Varsity/Sobhan Sorok":
            {
                switch(to){
            case "Police Line":
            {
                switch(transport){
                case "Bus":
                {
                    Ten o= new Ten();
                    break;
                }
                case "Mahindra":
                {
                    Unavailable o= new Unavailable();
                    break;
                }
                case "Easybike":
                {
                    Fifteen o = new Fifteen();
                    break;
                }
                    
                default:
                    break;
                }
                break;
                
            }
            case "Pachuria":
            case "Lonch Ghat":
            case "Municipality":
            {
                switch(transport){
                    case "Bus":
                    {
                        Five o= new Five();
                        break;
                    }
                    case "Mahindra":
                    case "Easybike":
                    {
                        Ten o= new Ten();
                        break;
                    }
                    
                    default:
                        break;
                }
                break;
            }
            case "Sonakur/Nilamath/Gobra Madrasha":
            case "Ghonapara":
            case "Nobinbag/Hospital":
            case "LGED/Circuit House":
            
            {
                switch(transport){
                case "Bus":
                case "Mahindra":
                case "Easybike":
                {
                    Five o= new Five();
                    break;
                }
                    default:
                        break;
                }
                break;
            }
            
            
        } 
                break;
            }
            case "Ghonapara":
            {
                switch(to){
            case "Police Line":
            {
                switch(transport){
                case "Bus":
                {
                    Ten o= new Ten();
                    break;
                }
                case "Mahindra":
                {
                    Unavailable o= new Unavailable();
                    break;
                }
                case "Easybike":
                {
                    Fifteen o = new Fifteen();
                    break;
                }
                    
                default:
                    break;
                }
                break;
                
            }
            case "Pachuria":
            case "Lonch Ghat":
            case "Municipality":
            {
                switch(transport){
                    case "Bus":
                    {
                        Five o= new Five();
                        break;
                    }
                    case "Mahindra":
                    case "Easybike":
                    {
                        Ten o= new Ten();
                        break;
                    }
                    
                    default:
                        break;
                }
                break;
            }
            case "Sonakur/Nilamath/Gobra Madrasha":
            case "Varsity/Sobhan Sorok":
            case "Nobinbag/Hospital":
            case "LGED/Circuit House":
            
            {
                switch(transport){
                case "Bus":
                case "Mahindra":
                case "Easybike":
                {
                    Five o= new Five();
                    break;
                }
                    default:
                        break;
                }
                break;
            }
            
            
        } 
                break;
            }
            default:
                break;
        }
    }
    
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
         TransportationCost obj = new TransportationCost();
         obj.setVisible(false);
         From.setSelectedItem("None");
         To.setSelectedItem("None");
         Vehicle.setSelectedItem("None");
    }//GEN-LAST:event_clearActionPerformed

    private void FromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FromActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_FromActionPerformed

    private void ToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ToActionPerformed

    private void mapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mapActionPerformed
        // TODO add your handling code here:
        from = (String)From.getSelectedItem();
        to= (String)To.getSelectedItem();
        
        if(from.equals("None") ||to.equals("None")){
             JOptionPane.showMessageDialog(null,"Empty Field", "Message",JOptionPane.ERROR_MESSAGE);
             
         }
         else if(from.equals(to)){
             JOptionPane.showMessageDialog(null,"There is no differense between current place and target place.", "Message",JOptionPane.ERROR_MESSAGE);
         }
         else{
                 Desktop link = Desktop.getDesktop();
            switch (from) {
            
            case "Pachuria":   
                {
                    switch (to) {
                        case "Police Line":
                        {
                            try{
                                link.browse(new URI("https://goo.gl/maps/s8brzg8u8iQ2"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
                        }
            
                        case "Lonch Ghat":
                        {
                            try{
                                link.browse(new URI("https://goo.gl/maps/YkFwFLCaxb22"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
                        }
            case "Municipality":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/HwYKAnjzrFL2"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Nobinbag/Hospital":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/n8KDSpvqe162"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "LGED/Circuit House":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/XTvhuvbrwss"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            
            case "Sonakur/Nilamath/Gobra Madrasha":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/6scYUzBGk9x"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Varsity/Sobhan Sorok":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/CKkFyyQJ1WP2"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Ghonapara":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/YUwkFsq2zJo"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            
                
            default:
                break;
        }
                    break;
                }
            case "Police Line":
                {
                    switch(to){

            case "Lonch Ghat":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/9Txsu9MWaMt"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Municipality":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/RGtG7bXGfAu"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }

            case "Pachuria":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/S2ng3s4VRJK2"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Nobinbag/Hospital":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/P2gXJwtHYio"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "LGED/Circuit House":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/wdVRRUygAXz"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Sonakur/Nilamath/Gobra Madrasha":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/BnkfjwLoxNT2"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Varsity/Sobhan Sorok":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/dHrBnmkkMoT2"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Ghonapara":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/XxjLcm1RWMu"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            
            
            default:
                break;
        }
                    break;
                }

            case "Lonch Ghat":
                {
                    switch(to){
            case "Police Line":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/aXPmuyFKBRw"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Municipality":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/5H4graTuddG2"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Pachuria":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/piwGhTGFjYC2"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Nobinbag/Hospital":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/kEBa7hyNauF2"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "LGED/Circuit House":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/hF1RgwfMN1B2"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Sonakur/Nilamath/Gobra Madrasha":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/JrNE28fiN5K2"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Varsity/Sobhan Sorok":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/wzBFTQqZ3HN2"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Ghonapara":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/4T6TPXxPaao"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            default:
                break;
        }
                    break;
                }
                case "Municipality":
                {
                    switch(to){
            case "Police Line":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/fEY66bKon8q"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Lonch Ghat":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/9MtAgrPnrV82"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Pachuria":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/2qcta9KrYfs"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Nobinbag/Hospital":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/uy4fR5kWzk62"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "LGED/Circuit House":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/5BLp7GzmpnJ2"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Sonakur/Nilamath/Gobra Madrasha":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/5FUvDpkaR4G2"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Varsity/Sobhan Sorok":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/MktjMvgKoPH2"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Ghonapara":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/MBHXgG9Gn2s"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            default:
                break;
        }
                    break;
                }
            case "Nobinbag/Hospital":
                {
                    switch(to){
            case "Police Line":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/PBTDpemDpgQ2"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "LGED/Circuit House":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/Gy6dEViXByK2"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Lonch Ghat":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/hf2dgm3AqyN2"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Municipality":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/UCFTo5a18PJ2"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Pachuria":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/EAFRgr87H8q"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Sonakur/Nilamath/Gobra Madrasha":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/3bybpRZfucM2"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Varsity/Sobhan Sorok":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/MVwSztueoRG2"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Ghonapara":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/ki6qJLbL1ev"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
                    default:
                        break;
        }
                    break;
                }
                case "LGED/Circuit House":
                {
                    switch(to){
            case "Police Line":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/bF9Lwtu65op"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Nobinbag/Hospital":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/KoXa22oSiNM2"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Lonch Ghat":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/J5usNaDJ9TN2"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Municipality":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/EWjd2Xz38dS2"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Pachuria":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/aKzq7ig8rEo"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Sonakur/Nilamath/Gobra Madrasha":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/P3yHaoFiynH2"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Varsity/Sobhan Sorok":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/6fkscX1cEJy"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Ghonapara":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/8iz3dFPTE7C2"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
                    default:
                        break;
        }
                    break;
                }
            case "Sonakur/Nilamath/Gobra Madrasha":
            {
                switch(to){
            
            case "Police Line":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/JbZZdzoeou72"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Lonch Ghat":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/LjqW3Li2GTk"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Municipality":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/6d6wYN9A7zq"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Pachuria":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/Xi4uAjw6g1q"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Varsity/Sobhan Sorok":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/LS4Kpzqu9sP2"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Ghonapara":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/qnAgkjm8X8A2"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Nobinbag/Hospital":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/De4sFbsz3tp"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "LGED/Circuit House":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/LkdcwtkJVkR2"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            default:
                break;
        }
                break;
            }
            case "Varsity/Sobhan Sorok":
            {
                switch(to){
            case "Police Line":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/otmrzf72T8C2"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Pachuria":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/eMUvdWFWVxm"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Lonch Ghat":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/86oFrhKbmdQ2"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Municipality":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/dZcVuhDc98s"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Sonakur/Nilamath/Gobra Madrasha":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/jGWhwJ51BeF2"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Ghonapara":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/4MkEGykFc1S2"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Nobinbag/Hospital":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/b3iNNnNgFYk"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "LGED/Circuit House":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/TwgzMgVagrD2"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            
            default:
                break;
            
        }       
                
                break;
            }
            case "Ghonapara":
            {
                switch(to){
            case "Police Line":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/7dMeyaFgPcS2"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Pachuria":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/i21yv7k2hGx"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Lonch Ghat":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/HQJTbvq7yRU2"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Municipality":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/RwAJ4Jdw7r92"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Sonakur/Nilamath/Gobra Madrasha":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/DgVhdS8M7Ls"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Varsity/Sobhan Sorok":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/DLks3SYqwHH2"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "Nobinbag/Hospital":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/8VnjhQSLbZ82"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            case "LGED/Circuit House":
            {
                            try{
                                link.browse(new URI("https://goo.gl/maps/2AHdQxt3rr82"));
                            }
                            catch(IOException | URISyntaxException err){
                                
                            }
                            break;
            }
            
            
            default:
                break;
        } 
                break;
            }
            default:
                break;
        }
        
    }
        
    }//GEN-LAST:event_mapActionPerformed

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
            java.util.logging.Logger.getLogger(TransportationCost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransportationCost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransportationCost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransportationCost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransportationCost().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> From;
    private javax.swing.JComboBox<String> To;
    private javax.swing.JComboBox<String> Vehicle;
    private javax.swing.JButton clear;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JButton map;
    // End of variables declaration//GEN-END:variables
}
