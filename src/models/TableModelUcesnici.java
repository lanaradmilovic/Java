/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import controller.ClientController;
import domain.Ucesnik;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Korisnik
 */
public class TableModelUcesnici extends AbstractTableModel implements Runnable {

    private ArrayList<Ucesnik> lista;
    private String[] kolone = {"ID", "Ime", "Prezime", "Email", "Telefon"};
    private String parametar = "";

    public TableModelUcesnici() {
        try {
            lista = ClientController.getInstance().getAllUcesnik();
        } catch (Exception ex) {
            Logger.getLogger(TableModelUcesnici.class.getName()).log(Level.SEVERE, null, ex);
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
        Ucesnik u = lista.get(row);

        switch (column) {
            case 0:
                return u.getUcesnikID();
            case 1:
                return u.getImeUcesnika();
            case 2:
                return u.getPrezimeUcesnika();
            case 3:
                return u.getEmail();
            case 4:
                return u.getTelefon();

            default:
                return null;
        }
    }

    public Ucesnik getSelectedUcesnik(int row) {
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
            Logger.getLogger(TableModelUcesnici.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setParametar(String parametar) {
        this.parametar = parametar;
        refreshTable();
    }

    public void refreshTable() {
        try {
            lista = ClientController.getInstance().getAllUcesnik();
            if (!parametar.equals("")) {
                ArrayList<Ucesnik> novaLista = new ArrayList<>();
                for (Ucesnik u : lista) {
                    if (u.getImeUcesnika().toLowerCase().contains(parametar.toLowerCase())
                            || u.getPrezimeUcesnika().toLowerCase().contains(parametar.toLowerCase())) {
                        novaLista.add(u);
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
