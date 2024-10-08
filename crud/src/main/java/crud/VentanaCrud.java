package crud;

import java.util.List;

public class VentanaCrud extends javax.swing.JFrame {

    /**
     * Creates new form VentanaCrud
     */
    public VentanaCrud() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabs = new javax.swing.JTabbedPane();
        addPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        addBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addNameField = new javax.swing.JTextField();
        addNumberField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        addResult = new javax.swing.JLabel();
        getPanel = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        getBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        getNameField = new javax.swing.JTextField();
        getNumberField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        getResult = new javax.swing.JList<>();
        getAllBtn = new javax.swing.JButton();
        deletePanel = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        deleteBtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        deleteNameField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        deleteResult = new javax.swing.JLabel();
        updatePanel = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        updateBtn = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        updateNameField = new javax.swing.JTextField();
        updateNumberField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        updateResult = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addBtn.setFont(new java.awt.Font("MesloLGS NF", 0, 12)); // NOI18N
        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("MesloLGS NF", 0, 12)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("MesloLGS NF", 0, 12)); // NOI18N
        jLabel2.setText("Number");

        addNameField.setFont(new java.awt.Font("MesloLGS NF", 0, 12)); // NOI18N
        addNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNameFieldActionPerformed(evt);
            }
        });

        addNumberField.setFont(new java.awt.Font("MesloLGS NF", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("MesloLGS NF", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ADD CONTACT INFORMATION");

        addResult.setFont(new java.awt.Font("MesloLGS NF", 0, 18)); // NOI18N
        addResult.setText("Nothing added yet");

        javax.swing.GroupLayout addPanelLayout = new javax.swing.GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addBtn)
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(addPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(addResult, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(addPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(addPanelLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(addNumberField, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                .addComponent(addNameField))))
                    .addContainerGap()))
        );
        addPanelLayout.setVerticalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addResult)
                .addContainerGap(195, Short.MAX_VALUE))
            .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(addPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3)
                    .addGap(19, 19, 19)
                    .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(addNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(addNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(320, Short.MAX_VALUE)))
        );

        tabs.addTab("ADD CONTACT", addPanel);

        getBtn.setFont(new java.awt.Font("MesloLGS NF", 0, 12)); // NOI18N
        getBtn.setText("GET CONTACT");
        getBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getBtnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("MesloLGS NF", 0, 12)); // NOI18N
        jLabel9.setText("Name");

        jLabel10.setFont(new java.awt.Font("MesloLGS NF", 0, 12)); // NOI18N
        jLabel10.setText("Number");

        getNameField.setFont(new java.awt.Font("MesloLGS NF", 0, 12)); // NOI18N
        getNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getNameFieldActionPerformed(evt);
            }
        });

        getNumberField.setFont(new java.awt.Font("MesloLGS NF", 0, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("MesloLGS NF", 0, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("GET CONTACT INFORMATION");

        jScrollPane1.setViewportView(getResult);

        getAllBtn.setText("GET ALL");
        getAllBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getAllBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout getPanelLayout = new javax.swing.GroupLayout(getPanel);
        getPanel.setLayout(getPanelLayout);
        getPanelLayout.setHorizontalGroup(
            getPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, getPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(getAllBtn)
                .addGap(18, 18, 18)
                .addComponent(getBtn)
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, getPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator3)
                .addContainerGap())
            .addGroup(getPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(getPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(getPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(getPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(getPanelLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(getPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(getPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(getNumberField, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                .addComponent(getNameField))))
                    .addContainerGap()))
        );
        getPanelLayout.setVerticalGroup(
            getPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(getPanelLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addGroup(getPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(getBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getAllBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
            .addGroup(getPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(getPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel11)
                    .addGap(19, 19, 19)
                    .addGroup(getPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9)
                        .addComponent(getNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(getPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10)
                        .addComponent(getNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(320, Short.MAX_VALUE)))
        );

        tabs.addTab("GET CONTACT", getPanel);

        deleteBtn.setFont(new java.awt.Font("MesloLGS NF", 0, 12)); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("MesloLGS NF", 0, 12)); // NOI18N
        jLabel13.setText("Name");

        deleteNameField.setFont(new java.awt.Font("MesloLGS NF", 0, 12)); // NOI18N
        deleteNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteNameFieldActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("MesloLGS NF", 0, 24)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("DELETE CONTACT INFORMATION");

        deleteResult.setFont(new java.awt.Font("MesloLGS NF", 0, 18)); // NOI18N
        deleteResult.setText("Nothing deleted yet");

        javax.swing.GroupLayout deletePanelLayout = new javax.swing.GroupLayout(deletePanel);
        deletePanel.setLayout(deletePanelLayout);
        deletePanelLayout.setHorizontalGroup(
            deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deletePanelLayout.createSequentialGroup()
                .addContainerGap(631, Short.MAX_VALUE)
                .addComponent(deleteBtn)
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deletePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator4)
                .addContainerGap())
            .addGroup(deletePanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(deleteResult, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(deletePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(deletePanelLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(deleteNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap()))
        );
        deletePanelLayout.setVerticalGroup(
            deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletePanelLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteResult)
                .addContainerGap(195, Short.MAX_VALUE))
            .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(deletePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel15)
                    .addGap(19, 19, 19)
                    .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel13)
                        .addComponent(deleteNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(364, Short.MAX_VALUE)))
        );

        tabs.addTab("DELETE CONTACT", deletePanel);

        updateBtn.setFont(new java.awt.Font("MesloLGS NF", 0, 12)); // NOI18N
        updateBtn.setText("UPDATE");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("MesloLGS NF", 0, 12)); // NOI18N
        jLabel17.setText("Name");

        jLabel18.setFont(new java.awt.Font("MesloLGS NF", 0, 12)); // NOI18N
        jLabel18.setText("Number");

        updateNameField.setFont(new java.awt.Font("MesloLGS NF", 0, 12)); // NOI18N
        updateNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateNameFieldActionPerformed(evt);
            }
        });

        updateNumberField.setFont(new java.awt.Font("MesloLGS NF", 0, 12)); // NOI18N

        jLabel19.setFont(new java.awt.Font("MesloLGS NF", 0, 24)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("UPDATE CONTACT INFORMATION");

        updateResult.setFont(new java.awt.Font("MesloLGS NF", 0, 18)); // NOI18N
        updateResult.setText("Nothing updated yet");

        javax.swing.GroupLayout updatePanelLayout = new javax.swing.GroupLayout(updatePanel);
        updatePanel.setLayout(updatePanelLayout);
        updatePanelLayout.setHorizontalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatePanelLayout.createSequentialGroup()
                .addContainerGap(631, Short.MAX_VALUE)
                .addComponent(updateBtn)
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator5)
                .addContainerGap())
            .addGroup(updatePanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(updateResult, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(updatePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(updatePanelLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(updateNumberField, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                .addComponent(updateNameField))))
                    .addContainerGap()))
        );
        updatePanelLayout.setVerticalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatePanelLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateResult)
                .addContainerGap(195, Short.MAX_VALUE))
            .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(updatePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel19)
                    .addGap(19, 19, 19)
                    .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel17)
                        .addComponent(updateNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel18)
                        .addComponent(updateNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(320, Short.MAX_VALUE)))
        );

        tabs.addTab("UPDATE CONTACT", updatePanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        String name = addNameField.getText();
        String number = addNumberField.getText();
        
        String[] arr = {name, number};
        addResult.setText(AddContact.addContact(arr));
    }//GEN-LAST:event_addBtnActionPerformed

    private void addNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addNameFieldActionPerformed

    private void getBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getBtnActionPerformed
        String name = getNameField.getText();
        String number = getNumberField.getText();
        
        String[] arr = {name, number};
        List<String> list = ReadContact.readSingleContact(arr);
        String[] finalArr = list.toArray(new String[0]);
        
        getResult.setListData(finalArr);
    }//GEN-LAST:event_getBtnActionPerformed

    private void getNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getNameFieldActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        String name = deleteNameField.getText();
        
        String[] arr = {name};
        deleteResult.setText(DeleteContact.deleteContact(arr));
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void deleteNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteNameFieldActionPerformed

    }//GEN-LAST:event_deleteNameFieldActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        String name = updateNameField.getText();
        String number = updateNumberField.getText();
        
        String[] arr = {name, number};
        updateResult.setText(UpdateContact.updateContact(arr));
    }//GEN-LAST:event_updateBtnActionPerformed

    private void updateNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateNameFieldActionPerformed

    private void getAllBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getAllBtnActionPerformed
        List<String> list = ReadContact.readAllContacts();
        String[] parsedArr = list.toArray(new String[0]);
        getResult.setListData(parsedArr);
        
    }//GEN-LAST:event_getAllBtnActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCrud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField addNameField;
    private javax.swing.JTextField addNumberField;
    private javax.swing.JPanel addPanel;
    private javax.swing.JLabel addResult;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField deleteNameField;
    private javax.swing.JPanel deletePanel;
    private javax.swing.JLabel deleteResult;
    private javax.swing.JButton getAllBtn;
    private javax.swing.JButton getBtn;
    private javax.swing.JTextField getNameField;
    private javax.swing.JTextField getNumberField;
    private javax.swing.JPanel getPanel;
    private javax.swing.JList<String> getResult;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JButton updateBtn;
    private javax.swing.JTextField updateNameField;
    private javax.swing.JTextField updateNumberField;
    private javax.swing.JPanel updatePanel;
    private javax.swing.JLabel updateResult;
    // End of variables declaration//GEN-END:variables
}
