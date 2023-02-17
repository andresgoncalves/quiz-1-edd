package andresgoncalves.quiz1;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Andres
 */
public class App extends javax.swing.JFrame {
    
    private List<Series> series = new List<Series>();

    /**
     * Creates new form App
     */
    public App() {
        initComponents();
    }
    
    public void loadFile(File file) {
        try {
            series = DataLoader.load(file);
            JOptionPane.showMessageDialog(this, "Se cargaron %d series".formatted(series.getSize()), "Error", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "No se pudo cargar el archivo", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public List<Series> getSeries() {
        return series;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileLoaderPanel = new andresgoncalves.quiz1.FileLoaderPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new java.awt.CardLayout());
        getContentPane().add(fileLoaderPanel, "FileLoaderCard");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private static App instance;
            
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());         
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            instance = new App();
            instance.setVisible(true);
        });
    }

    public static App getInstance() {
        return instance;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private andresgoncalves.quiz1.FileLoaderPanel fileLoaderPanel;
    // End of variables declaration//GEN-END:variables
}
