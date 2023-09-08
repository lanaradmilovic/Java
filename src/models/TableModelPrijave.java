/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import controller.ClientController;
import domain.Prijava;
import domain.Ucesnik;
import domain.Trka;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Korisnik
 */
public class TableModelPrijave extends AbstractTableModel {

    private ArrayList<Prijava> lista;
    private String[] kolone = {"Rb", "Ucesnik", "Napomena"};
    private int rb = 0;

    public TableModelPrijave() {
        lista = new ArrayList<>();
    }

    public TableModelPrijave(Trka t) {
        try {
            lista = ClientController.getInstance().getAllPrijava(t);
        } catch (Exception ex) {
            Logger.getLogger(TableModelPrijave.class.getName()).log(Level.SEVERE, null, ex);
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
        Prijava p = lista.get(row);

        switch (column) {
            case 0:
                return p.getRbPrijave();
            case 1:
                return p.getUcesnik();
            case 2:
                return p.getNapomena();

            default:
                return null;
        }
    }

    public void dodajPrijavu(Prijava p) {
        rb = lista.size();
        p.setRbPrijave(++rb);
        lista.add(p);
        fireTableDataChanged();
    }

    public boolean postojiUcesnik(Ucesnik ucesnik) {
        for (Prijava prijava : lista) {
            if(prijava.getUcesnik().getUcesnikID().equals(ucesnik.getUcesnikID())){
                return true;
            }
        }
        return false;
    }

    public void obrisiPrijavu(int row) {
        lista.remove(row);
        
        rb = 0;
        for (Prijava prijava : lista) {
            prijava.setRbPrijave(++rb);
        }
        
        fireTableDataChanged();
    }

    public ArrayList<Prijava> getLista() {
        return lista;
    }

    public String getNapomena(int row) {
        return lista.get(row).getNapomena();
    }

}
