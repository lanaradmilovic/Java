/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import FormUcesnik.FormNoviUcesnik;
import FormUcesnik.FormPretragaUcesnika;
import FormTrka.FormPretragaTrke;

import controller.ClientController;
import domain.Administrator;
import domain.Sponzor;
import domain.Odrediste;
import domain.Prijava;
import domain.Ucesnik;
import domain.Trka;
import java.io.File;
import java.io.FileOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import models.TableModelPrijave;

import session.Session;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


/**
 *
 * @author Korisnik
 */
public class MainForm extends javax.swing.JFrame {

    Administrator ulogovani;

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        setLocationRelativeTo(null);
        this.ulogovani = Session.getInstance().getUlogovani();
        lblUlogovani.setText("Ulogovani administrator: " + ulogovani);
        setTitle("Klijentska forma");
        popuniOdredista();
        popuniSponzore();
        popuniUcesnike();
        tblPrijave.setModel(new TableModelPrijave());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUlogovani = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNapomena = new javax.swing.JTextArea();
        cmbUcesnik = new javax.swing.JComboBox();
        btnDodaj = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPrijave = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtDatumVremePocetka = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbPocetnoOdrediste = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        cmbKrajnjeOdrediste = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        cmbSponzor = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtOpis = new javax.swing.JTextArea();
        btnSacuvaj = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        miNoviPutnik = new javax.swing.JMenuItem();
        miPretragaPutnika = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        miPretragaVoznje = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        miOdjava = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblUlogovani.setText("Ulogovani");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Unos trke"));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Unos prijava"));

        jLabel2.setText("Ucesnik:");

        jLabel8.setText("Napomena:");

        txtNapomena.setColumns(20);
        txtNapomena.setRows(5);
        jScrollPane1.setViewportView(txtNapomena);

        cmbUcesnik.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbUcesnik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUcesnikActionPerformed(evt);
            }
        });

        btnDodaj.setText("Dodaj prijavu");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnObrisi.setText("Obrisi prijavu");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        tblPrijave.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tblPrijave);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(cmbUcesnik, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbUcesnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDodaj)
                    .addComponent(btnObrisi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Datum i vreme polaska:");

        txtDatumVremePocetka.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd.MM.yyyy HH:mm"))));
        txtDatumVremePocetka.setText("25.12.2023 10:00");

        jLabel3.setText("Pocetno odrediste:");

        cmbPocetnoOdrediste.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Krajnje odrediste:");

        cmbKrajnjeOdrediste.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Generalni sponzor:");

        cmbSponzor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("Opis:");

        txtOpis.setColumns(20);
        txtOpis.setRows(5);
        txtOpis.setText("Opis");
        jScrollPane2.setViewportView(txtOpis);

        btnSacuvaj.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnSacuvaj.setText("Sacuvaj trku");
        btnSacuvaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacuvajActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSacuvaj, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2)
                                .addComponent(cmbPocetnoOdrediste, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbKrajnjeOdrediste, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbSponzor, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDatumVremePocetka, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDatumVremePocetka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbPocetnoOdrediste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbKrajnjeOdrediste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbSponzor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSacuvaj, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu6.setText("Ucesnik");

        miNoviPutnik.setText("Novi ucesnik");
        miNoviPutnik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNoviPutnikActionPerformed(evt);
            }
        });
        jMenu6.add(miNoviPutnik);

        miPretragaPutnika.setText("Pretraga ucesnika");
        miPretragaPutnika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPretragaPutnikaActionPerformed(evt);
            }
        });
        jMenu6.add(miPretragaPutnika);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Trka");

        miPretragaVoznje.setText("Pretraga trke");
        miPretragaVoznje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPretragaVoznjeActionPerformed(evt);
            }
        });
        jMenu7.add(miPretragaVoznje);

        jMenuBar1.add(jMenu7);

        jMenu8.setText("Odjava");

        miOdjava.setText("Odjavi se");
        miOdjava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miOdjavaActionPerformed(evt);
            }
        });
        jMenu8.add(miOdjava);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUlogovani)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUlogovani)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miNoviPutnikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNoviPutnikActionPerformed
        new FormNoviUcesnik(this, true).setVisible(true);
    }//GEN-LAST:event_miNoviPutnikActionPerformed

    private void miPretragaPutnikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPretragaPutnikaActionPerformed
        new FormPretragaUcesnika(this, true).setVisible(true);
    }//GEN-LAST:event_miPretragaPutnikaActionPerformed

    private void miPretragaVoznjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPretragaVoznjeActionPerformed
        new FormPretragaTrke(this, true).setVisible(true);
    }//GEN-LAST:event_miPretragaVoznjeActionPerformed

    private void miOdjavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miOdjavaActionPerformed
        int result = JOptionPane.showConfirmDialog(this, "Da li ste sigurni da zelite da "
                + "se odjavite sa sistema?", "Konfirmacija", JOptionPane.YES_NO_OPTION);

        if (result == JOptionPane.NO_OPTION) {
            return;
        }

        if (result == JOptionPane.YES_OPTION) {
            new LoginForma().setVisible(true);
            Session.getInstance().setUlogovani(null);
            this.dispose();
        }
    }//GEN-LAST:event_miOdjavaActionPerformed

    private void cmbUcesnikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUcesnikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbUcesnikActionPerformed

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed

        Ucesnik ucesnik = (Ucesnik) cmbUcesnik.getSelectedItem();
        String napomena = txtNapomena.getText();

        Prijava p = new Prijava(null, -1, napomena, ucesnik);

        TableModelPrijave tm = (TableModelPrijave) tblPrijave.getModel();

        if (tm.postojiUcesnik(ucesnik)) {
            JOptionPane.showMessageDialog(this, "Vec ste uneli ovog ucesnika!");
            return;
        }

        tm.dodajPrijavu(p);

    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed

        int row = tblPrijave.getSelectedRow();

        if (row >= 0) {
            TableModelPrijave tm = (TableModelPrijave) tblPrijave.getModel();
            tm.obrisiPrijavu(row);
        }

    }//GEN-LAST:event_btnObrisiActionPerformed

    private void btnSacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacuvajActionPerformed

        try {
            if (txtDatumVremePocetka.getText().isEmpty()
                    || txtOpis.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Sva polja moraju biti popunjena!");
                return;
            }

            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm");
            Date datumVremePocetka = sdf.parse(txtDatumVremePocetka.getText());
            String opis = txtOpis.getText();
            Odrediste pocetnoOdrediste = (Odrediste) cmbPocetnoOdrediste.getSelectedItem();
            Odrediste krajnjeOdrediste = (Odrediste) cmbKrajnjeOdrediste.getSelectedItem();
            Sponzor sponzor = (Sponzor) cmbSponzor.getSelectedItem();

            TableModelPrijave tm = (TableModelPrijave) tblPrijave.getModel();

            Trka t = new Trka(null, datumVremePocetka, opis,
                    pocetnoOdrediste, krajnjeOdrediste, sponzor, ulogovani, tm.getLista());

            ClientController.getInstance().addTrka(t);
            
           // JOptionPane.showMessageDialog(this, "Uspesno sacuvana trka!");
            /* PDF
            int result = JOptionPane.showConfirmDialog(this, "Da li zelite da sacuvate detalje o voznji u PDF formatu?",
                    "Konfirmacija", JOptionPane.YES_NO_OPTION);

            if (result == JOptionPane.NO_OPTION) {
                return;
            }

            if (result == JOptionPane.YES_OPTION) {
                String path = "";
                JFileChooser j = new JFileChooser();
                j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int x = j.showSaveDialog(this);
                if (x == JFileChooser.APPROVE_OPTION) {
                    path = j.getSelectedFile().getPath();
                }
                Document doc = new Document();

                PdfWriter.getInstance(doc, new FileOutputStream(path + "\\trka.pdf"));
                doc.open();
                int l = 1;
                doc.add(new Paragraph("Trka rb. " + l++, new Font(Font.FontFamily.TIMES_ROMAN, 20, Font.BOLD)));
                doc.add(new Paragraph("Pocetno odrediste: " + t.getPocetnoOdrediste() + "\nKrajnje odrediste: " + t.getKrajnjeOdrediste()
                        + "\nDatum i vreme pocetka: " + t.getDatumVremePocetka() + "\n" + t.getSponzor()));
                doc.add(new Paragraph("Spisak ucesika: \n", new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD)));
                int i = 1;
                for (Prijava p : tm.getLista()) {
                    doc.add(new Paragraph("     " + (i++) + ". " + p.getUcesnik() + " (" + p.getUcesnik().getEmail() + ")"));
                }

                doc.close();

            }
            // EXCEL 
            int result2 = JOptionPane.showConfirmDialog(this, "Da li zelite da sacuvate detalje o voznji u Excel formatu?",
                    "Konfirmacija", JOptionPane.YES_NO_OPTION);

            if (result2 == JOptionPane.NO_OPTION) {
                return;
            }

            if (result2 == JOptionPane.YES_OPTION) {
                String path = "";
                JFileChooser j = new JFileChooser();
                j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int x = j.showSaveDialog(this);
                if (x == JFileChooser.APPROVE_OPTION) {
                    path = j.getSelectedFile().getPath();
                }

                File saveFile = new File(path + "\\trka.xlsx");
                Workbook wb = new XSSFWorkbook();
                Sheet sheet= wb.createSheet("Trka");
                
                Row rowCol= sheet.createRow(0);
                for(int i=0; i<tm.getColumnCount();i++){
                    Cell cell = rowCol.createCell(i);
                    cell.setCellValue(tm.getColumnName(i));
                }
                
                for(int m=0; m<tm.getRowCount();m++){
                    Row row = sheet.createRow(m+1);
                    for(int k=0; k<tm.getColumnCount();k++){
                        Cell cell= row.createCell(k);
                        if(tm.getValueAt(m, k)!= null){
                            cell.setCellValue(tm.getValueAt(m, k).toString());
                        }
                    }
                }
                
                FileOutputStream out = new FileOutputStream(new File(saveFile.toString()));
                wb.write(out);
                wb.close();
                out.close();

            }*/
            
            for (Prijava prijava : tm.getLista()) {
                 JavaMail.sendEmail(prijava.getUcesnik().getEmail());
            }
           
            
            Cuvanje c= new Cuvanje(this, true, tm.getLista(),tm);
            c.setVisible(true);
            resetujFormu();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
//            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnSacuvajActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnSacuvaj;
    private javax.swing.JComboBox cmbKrajnjeOdrediste;
    private javax.swing.JComboBox cmbPocetnoOdrediste;
    private javax.swing.JComboBox cmbSponzor;
    private javax.swing.JComboBox cmbUcesnik;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblUlogovani;
    private javax.swing.JMenuItem miNoviPutnik;
    private javax.swing.JMenuItem miOdjava;
    private javax.swing.JMenuItem miPretragaPutnika;
    private javax.swing.JMenuItem miPretragaVoznje;
    private javax.swing.JTable tblPrijave;
    private javax.swing.JFormattedTextField txtDatumVremePocetka;
    private javax.swing.JTextArea txtNapomena;
    private javax.swing.JTextArea txtOpis;
    // End of variables declaration//GEN-END:variables

    private void popuniOdredista() {
        try {
            ArrayList<Odrediste> odredista = ClientController.getInstance().getAllOdrediste();

            cmbPocetnoOdrediste.removeAllItems();
            cmbKrajnjeOdrediste.removeAllItems();

            for (Odrediste odrediste : odredista) {
                cmbPocetnoOdrediste.addItem(odrediste);
                cmbKrajnjeOdrediste.addItem(odrediste);
            }

        } catch (Exception ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void popuniSponzore() {
        try {
            ArrayList<Sponzor> sponzori = ClientController.getInstance().getAllSponzor();

            cmbSponzor.removeAllItems();

            for (Sponzor sponzor : sponzori) {
                cmbSponzor.addItem(sponzor);
            }

        } catch (Exception ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void popuniUcesnike() {
        try {
            ArrayList<Ucesnik> ucesnici = ClientController.getInstance().getAllUcesnik();

            cmbUcesnik.removeAllItems();

            for (Ucesnik ucesnik : ucesnici) {
                cmbUcesnik.addItem(ucesnik);
            }

        } catch (Exception ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void resetujFormu() {
        txtDatumVremePocetka.setText("");
        txtOpis.setText("");
        txtNapomena.setText("");
        TableModelPrijave tm = (TableModelPrijave) tblPrijave.getModel();
        tm.getLista().clear();
        tm.fireTableDataChanged();
    }

   

}
