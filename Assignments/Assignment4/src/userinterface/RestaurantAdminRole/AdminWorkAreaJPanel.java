

package userinterface.RestaurantAdminRole;


import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author  raunak
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private UserAccount account;
    
    /** Creates new form AdminWorkAreaJPanel */
    public AdminWorkAreaJPanel(JPanel userProcessContainer) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        
        this.ecosystem = ecosystem;
        this.account = account;
      
        lblRestaurantName.setText(account.getUsername());
      
        //valueLabel.setText();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        manageRestaurantInfo = new javax.swing.JButton();
        manageMenu = new javax.swing.JButton();
        manageOrders = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        lblRestaurantName = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Restaurant Admin Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        manageRestaurantInfo.setText("Manage Restaurant Info");
        manageRestaurantInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageRestaurantInfoActionPerformed(evt);
            }
        });
        add(manageRestaurantInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 180, -1));

        manageMenu.setText("Manage menu");
        manageMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageMenuActionPerformed(evt);
            }
        });
        add(manageMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 180, -1));

        manageOrders.setText("Manage Orders");
        manageOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrdersActionPerformed(evt);
            }
        });
        add(manageOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 180, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Restaurant :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 120, 30));

        lblRestaurantName.setText("<value>");
        add(lblRestaurantName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 130, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void manageRestaurantInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageRestaurantInfoActionPerformed
        // TODO add your handling code here:
       ManageRestaurantInfoJPanel manageRestroJPanel = new ManageRestaurantInfoJPanel(userProcessContainer, account, ecosystem);
       userProcessContainer.add("ManageRestroInfo", manageRestroJPanel);
       CardLayout layout = (CardLayout) userProcessContainer.getLayout();
       layout.next(userProcessContainer);
    }//GEN-LAST:event_manageRestaurantInfoActionPerformed

    private void manageMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageMenuActionPerformed
       ManageMenuJPanel managemenuJPanel = new ManageMenuJPanel(userProcessContainer, account, ecosystem);
       userProcessContainer.add("ManageMenu", managemenuJPanel);
       CardLayout layout = (CardLayout) userProcessContainer.getLayout();
       layout.next(userProcessContainer);
        
    }//GEN-LAST:event_manageMenuActionPerformed

    private void manageOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrdersActionPerformed
       ManageOrdersJPanel manageorderJPanel = new ManageOrdersJPanel(userProcessContainer, account, ecosystem);
       userProcessContainer.add("ManageOrders", manageorderJPanel);
       CardLayout layout = (CardLayout) userProcessContainer.getLayout();
       layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrdersActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblRestaurantName;
    private javax.swing.JButton manageMenu;
    private javax.swing.JButton manageOrders;
    private javax.swing.JButton manageRestaurantInfo;
    // End of variables declaration//GEN-END:variables
    
}
