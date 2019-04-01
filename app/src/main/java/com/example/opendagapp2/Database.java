package com.example.opendagapp2;

import java.util.ArrayList;

public class Database {
    private static final Database ourInstance = new Database();

    public static Database getInstance() {
        return ourInstance;
    }

    public ArrayList <Opendag> Opendagenlijst;
    public ArrayList <Gebouw>  Gebouwenlijst;
    public ArrayList <Opleiding> Opleidinglijst;

    private Database() {
        Opendagenlijst = new ArrayList<>();
        Gebouwenlijst = new ArrayList<>();
        Opleidinglijst = new ArrayList<>();
    }
    public void ImportData(){
        //Data inporteren
    }

    public ArrayList<Opendag> getOpendagenlijst() {
        return Opendagenlijst;
    }

    public void setOpendagenlijst(ArrayList<Opendag> opendagenlijst) {
        Opendagenlijst = opendagenlijst;
    }

    public ArrayList<Gebouw> getGebouwenlijst() {
        return Gebouwenlijst;
    }

    public void setGebouwenlijst(ArrayList<Gebouw> gebouwenlijst) {
        Gebouwenlijst = gebouwenlijst;
    }

    public ArrayList<Opleiding> getOpleidinglijst() {
        return Opleidinglijst;
    }

    public void setOpleidinglijst(ArrayList<Opleiding> opleidinglijst) {
        Opleidinglijst = opleidinglijst;
    }
}
