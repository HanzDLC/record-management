/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.awt.Color;
import javax.swing.JOptionPane;


/**
 *
 * @author ISAT-U
 */
public class Main extends javax.swing.JFrame {
   String[] studentName = new String[5];
   int index = 0;
   int nav;
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        first.setEnabled(false);
        prev.setEnabled(false);
        next.setEnabled(false);
        last.setEnabled(false);
        save.setEnabled(false);
        edit.setEnabled(false);
        delete.setEnabled(false);
        search.setEnabled(false);
        cancel.setEnabled(false);
        name.setEditable(false);
        name.setBackground(new Color(65,69,76));
    }
    public void save(String name)
    {
        studentName[index] = name;
    }
    public void navigate (int n)
    {
        name.setText(""+studentName[n]);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        next = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        first = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        save = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        view = new javax.swing.JButton();
        prev = new javax.swing.JButton();
        last = new javax.swing.JButton();
        photo = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        search = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 204));
        setPreferredSize(new java.awt.Dimension(677, 621));
        getContentPane().setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ISAT-U-logo.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 40, 160, 210);

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 30)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("RECORD MANAGEMENT ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 30, 410, 40);

        next.setBackground(javax.swing.UIManager.getDefaults().getColor(""Table.editor".background"));
        next.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        next.setForeground(javax.swing.UIManager.getDefaults().getColor("ArrowButton.background"));
        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/next.png"))); // NOI18N
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        getContentPane().add(next);
        next.setBounds(420, 320, 100, 40);

        cancel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel);
        cancel.setBounds(330, 500, 140, 70);

        first.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        first.setText("FIRST");
        first.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstActionPerformed(evt);
            }
        });
        getContentPane().add(first);
        first.setBounds(40, 300, 120, 70);

        edit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        edit.setText("EDIT");
        getContentPane().add(edit);
        edit.setBounds(180, 440, 140, 60);

        save.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save);
        save.setBounds(330, 380, 140, 60);

        name.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        getContentPane().add(name);
        name.setBounds(110, 240, 470, 50);

        add.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add);
        add.setBounds(180, 380, 140, 60);

        view.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        view.setText("VIEW");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        getContentPane().add(view);
        view.setBounds(270, 300, 130, 70);

        prev.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        prev.setText("PREV");
        prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevActionPerformed(evt);
            }
        });
        getContentPane().add(prev);
        prev.setBounds(160, 300, 110, 70);

        last.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        last.setText("LAST");
        last.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastActionPerformed(evt);
            }
        });
        getContentPane().add(last);
        last.setBounds(530, 300, 130, 70);

        photo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        getContentPane().add(photo);
        photo.setBounds(260, 80, 180, 150);

        delete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete);
        delete.setBounds(330, 440, 140, 60);

        search.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search);
        search.setBounds(180, 500, 140, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bluerad.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 680, 620);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
      name.setEditable(true);
      name.setBackground(new Color(255,255,255));
      add.setEnabled(false);
      view.setEnabled(false);
      cancel.setEnabled(true);
      save.setEnabled(true);
      name.setForeground(new Color(0,0,0));
      delete.setEnabled(false);
      first.setEnabled(false);
      prev.setEnabled(false);
      next.setEnabled(false);
      last.setEnabled(false);
    }//GEN-LAST:event_addActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
            // TODO add your handling code here:
        save.setEnabled(false);
        cancel.setEnabled(false);
        add.setEnabled(true);
        view.setEnabled(true);
        name.setBackground(new Color(65,69,76));
       
        String n = name.getText();
        save(n);
        this.index++;
        
        name.setText("");
        JOptionPane.showMessageDialog(null,"Successful!","",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_saveActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        // TODO add your handling code here:
      nav = 0;
      navigate(nav);
      name.setEditable(false);
      cancel.setEnabled(true);
      next.setEnabled(true);
      add.setEnabled(false);
      view.setEnabled(false); 
      prev.setEnabled(true);
      name.setForeground(new Color(255,255,255));
      delete.setEnabled(true);
      first.setEnabled(true);
      last.setEnabled(true);
      search.setEnabled(true);
    }//GEN-LAST:event_viewActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
       add.setEnabled(true);
       view.setEnabled(true);
       cancel.setEnabled(false);
       name.setEditable(false);
       save.setEnabled(false);
       name.setText("");
       name.setBackground(new Color(65,69,76)); 
       first.setEnabled(false);
       prev.setEnabled(false);
       next.setEnabled(false);
       last.setEnabled(false);
    }//GEN-LAST:event_cancelActionPerformed

    private void prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevActionPerformed
        nav--;
        navigate(nav);
        if(nav == index -1)
        {
            next.setEnabled(true);
        }
                           
    }//GEN-LAST:event_prevActionPerformed

    private void firstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstActionPerformed
        if (index > 0) {
        nav = 0;
        navigate(nav);
    } else {
        JOptionPane.showMessageDialog(null, "No inputs available.", "", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_firstActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
    if (index > 0) {
        save.setEnabled(false);
        cancel.setEnabled(false);
        add.setEnabled(true);
        view.setEnabled(true);
        name.setBackground(new Color(65, 69, 76));

        // Remove the current input from the array
        for (int i = nav; i < index - 1; i++) {
            studentName[i] = studentName[i + 1];
        }
        studentName[index - 1] = null;
        index--;

        // Update navigation if needed
        if (nav >= index) {
            nav = index - 1;
        }

        // Display the next or previous input after deletion
        if (index > 0) {
            navigate(nav);
        } else {
            name.setText("");
        }

        JOptionPane.showMessageDialog(null, "Input removed successfully!", "", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(null, "No inputs to delete.", "", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_deleteActionPerformed

    private void lastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastActionPerformed
        if (index > 0) {
        nav = index - 1;
        navigate(nav);
    } else {
        JOptionPane.showMessageDialog(null, "No inputs available.", "", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_lastActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String searchTerm = JOptionPane.showInputDialog(null, "Enter the name to search:", "Search", JOptionPane.QUESTION_MESSAGE);

    if (searchTerm != null) {
        boolean found = false;

        for (int i = 0; i < index; i++) {
            if (studentName[i] != null && studentName[i].equalsIgnoreCase(searchTerm)) {
                found = true;
                nav = i;
                navigate(nav);
                break;
            }
        }

        if (found) {
            JOptionPane.showMessageDialog(null, "Found: " + searchTerm, "", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Not found: " + searchTerm, "", JOptionPane.WARNING_MESSAGE);
        }
    
    }//GEN-LAST:event_searchActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
        nav++;
        navigate(nav);
        if(nav == index -1)
        {
            next.setEnabled(true);
        }
    }//GEN-LAST:event_nextActionPerformed
    }
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton cancel;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JButton first;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton last;
    private javax.swing.JTextField name;
    private javax.swing.JButton next;
    private javax.swing.JLabel photo;
    private javax.swing.JButton prev;
    private javax.swing.JButton save;
    private javax.swing.JButton search;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}
