/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import domain.Administrator;
import domain.Sponzor;
import domain.Odrediste;
import domain.Prijava;
import domain.Ucesnik;
import domain.Trka;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import session.Session;
import transfer.Request;
import transfer.Response;
import transfer.util.ResponseStatus;
import transfer.util.Operation;

/**
 *
 * @author Korisnik
 */
public class ClientController {

    private static ClientController instance;

    private ClientController() {
    }

    public static ClientController getInstance() {
        if (instance == null) {
            instance = new ClientController();
        }
        return instance;
    }

    public Administrator login(Administrator administrator) throws Exception {
        return (Administrator) sendRequest(Operation.LOGIN, administrator);
    }

    public void addUcesnik(Ucesnik ucesnik) throws Exception {
        sendRequest(Operation.ADD_UCESNIK, ucesnik);
    }

    public void addTrka(Trka trka) throws Exception {
        sendRequest(Operation.ADD_TRKA, trka);
    }

    public void deleteUcesnik(Ucesnik ucesnik) throws Exception {
        sendRequest(Operation.DELETE_UCESNIK, ucesnik);
    }

    public void deleteTrka(Trka trka) throws Exception {
        sendRequest(Operation.DELETE_TRKA, trka);
    }

    public void updateUcesnik(Ucesnik ucesnik) throws Exception {
        sendRequest(Operation.UPDATE_UCESNIK, ucesnik);
    }

    public void updateTrke(Trka trka) throws Exception {
        sendRequest(Operation.UPDATE_TRKA, trka);
    }

    public ArrayList<Administrator> getAllAdministrator() throws Exception {
        return (ArrayList<Administrator>) sendRequest(Operation.GET_ALL_ADMINISTRATOR, null);
    }

    public ArrayList<Ucesnik> getAllUcesnik() throws Exception {
        return (ArrayList<Ucesnik>) sendRequest(Operation.GET_ALL_UCESNIK, null);
    }

    public ArrayList<Trka> getAllTrka() throws Exception {
        return (ArrayList<Trka>) sendRequest(Operation.GET_ALL_TRKA, null);
    }

    public ArrayList<Sponzor> getAllSponzor() throws Exception {
        return (ArrayList<Sponzor>) sendRequest(Operation.GET_ALL_SPONZOR, null);
    }

    public ArrayList<Odrediste> getAllOdrediste() throws Exception {
        return (ArrayList<Odrediste>) sendRequest(Operation.GET_ALL_ODREDISTE, null);
    }

    public ArrayList<Prijava> getAllPrijava(Trka t) throws Exception {
        return (ArrayList<Prijava>) sendRequest(Operation.GET_ALL_PRIJAVA, t);
    }

    private Object sendRequest(int operation, Object data) throws Exception {
        Request request = new Request(operation, data);

        ObjectOutputStream out = new ObjectOutputStream(Session.getInstance().getSocket().getOutputStream());
        out.writeObject(request);

        ObjectInputStream in = new ObjectInputStream(Session.getInstance().getSocket().getInputStream());
        Response response = (Response) in.readObject();

        if (response.getResponseStatus().equals(ResponseStatus.Error)) {
            throw response.getException();
        } else {
            return response.getData();
        }

    }

    
}
