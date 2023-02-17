package andresgoncalves.quiz1;

/**
 *
 * @author Andres
 */
public class CataloguePanel extends javax.swing.JPanel {
    
    private List<Series> series;
    
    /**
     * Creates new form CataloguePanel
     */
    public CataloguePanel() {
        initComponents();
    }
    
    public void loadCatalogue() {
        textArea.setText("");
        for(Node<Series> node = series.getFirst(); node != null; node = node.getNext()) {
            if(
                filterGroup.isSelected(showAllButton.getModel()) ||
                node.getValue().getType() == Series.KIDS && filterGroup.isSelected(showKidsButton.getModel()) ||
                node.getValue().getType() == Series.ADULTS && filterGroup.isSelected(showAdultsButton.getModel())
            ) {
                textArea.append("%s | %d Cap�tulos\n".formatted(
                        node.getValue().getName(), 
                        node.getValue().getEpisodes().getSize()
                ));
            }
        }
    }

    public void setSeries(List<Series> series) {
        this.series = series;
        loadCatalogue();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        filterGroup = new javax.swing.ButtonGroup();
        sortGroup = new javax.swing.ButtonGroup();
        scrollPane = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        filterPanel = new javax.swing.JPanel();
        showAllButton = new javax.swing.JRadioButton();
        showKidsButton = new javax.swing.JRadioButton();
        showAdultsButton = new javax.swing.JRadioButton();
        sortPanel = new javax.swing.JPanel();
        showAscendentButton = new javax.swing.JRadioButton();
        showDescendentButton = new javax.swing.JRadioButton();

        setLayout(new java.awt.GridBagLayout());

        textArea.setEditable(false);
        textArea.setColumns(40);
        textArea.setRows(10);
        scrollPane.setViewportView(textArea);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 20);
        add(scrollPane, gridBagConstraints);

        filterPanel.setLayout(new java.awt.GridBagLayout());

        filterGroup.add(showAllButton);
        showAllButton.setSelected(true);
        showAllButton.setText("Todos");
        showAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        filterPanel.add(showAllButton, gridBagConstraints);

        filterGroup.add(showKidsButton);
        showKidsButton.setText("Infantil");
        showKidsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        filterPanel.add(showKidsButton, gridBagConstraints);

        filterGroup.add(showAdultsButton);
        showAdultsButton.setText("Adultos");
        showAdultsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        filterPanel.add(showAdultsButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(filterPanel, gridBagConstraints);

        sortPanel.setLayout(new java.awt.GridBagLayout());

        sortGroup.add(showAscendentButton);
        showAscendentButton.setSelected(true);
        showAscendentButton.setText("Ascendente");
        showAscendentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        sortPanel.add(showAscendentButton, gridBagConstraints);

        sortGroup.add(showDescendentButton);
        showDescendentButton.setText("Descendente");
        showDescendentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        sortPanel.add(showDescendentButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(sortPanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        loadCatalogue();
    }//GEN-LAST:event_buttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup filterGroup;
    private javax.swing.JPanel filterPanel;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JRadioButton showAdultsButton;
    private javax.swing.JRadioButton showAllButton;
    private javax.swing.JRadioButton showAscendentButton;
    private javax.swing.JRadioButton showDescendentButton;
    private javax.swing.JRadioButton showKidsButton;
    private javax.swing.ButtonGroup sortGroup;
    private javax.swing.JPanel sortPanel;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}