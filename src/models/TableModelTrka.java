/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import controller.ClientController;
import domain.Prijava;
import domain.Trka;
import domain.Ucesnik;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Korisnik
 */
public class TableModelTrka extends AbstractTableModel implements Runnable {

    private ArrayList<Trka> lista;
    private String[] kolone = {"ID", "Datum i vreme pocetka",
        "Pocetno odrediste", "Krajnje odrediste", "Sponzor"};
    private String parametar = "";

    public TableModelTrka() {
        try {
            lista = ClientController.getInstance().getAllTrka();
        } catch (Exception ex) {
            Logger.getLogger(TableModelTrka.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public String getColumnName(int i) {
        return kolone[i];
    }

    @Override
    public Object getValueAt(int row, int column) {
        Trka t = lista.get(row);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm");

        switch (column) {
            case 0:
                return t.getTrkaID();
            case 1:
                return sdf.format(t.getDatumVremePocetka());

            case 2:
                return t.getPocetnoOdrediste();
            case 3:
                return t.getKrajnjeOdrediste();
            case 4:
                return t.getSponzor();

            default:
                return null;
        }
    }

    public Trka getSelectedTrka(int row) {
        return lista.get(row);
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                Thread.sleep(10000);
                refreshTable();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(TableModelTrka.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setParametar(String parametar) {
        this.parametar = parametar;
        refreshTable();
    }

    public void refreshTable() {
        try {
            lista = ClientController.getInstance().getAllTrka();
            if (!parametar.equals("")) {
                ArrayList<Trka> novaLista = new ArrayList<>();
                for (Trka t : lista) {
                    if (t.getPocetnoOdrediste().getNazivOdredista().toLowerCase().contains(parametar.toLowerCase())
                            || t.getKrajnjeOdrediste().getNazivOdredista().toLowerCase().contains(parametar.toLowerCase())) {
                        novaLista.add(t);
                    }
                }
                lista = novaLista;
            }

            fireTableDataChanged();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
