package org.ghiorsi.client;

import javax.swing.*;
import java.io.IOException;
import java.net.Socket;

public class Client {
    public static final int PORT = Integer.parseInt(System.getenv("PORT"));
    public static final String ONLINE = " Online";

    public static void main(String[] args) {

        Socket mySocket = null;
        Sender mySender = null;
        //TODO: SET COLOR ON JOPTIONPANE
        String userNick = JOptionPane.showInputDialog("Write your Nick: ");
        try {
           mySocket = new Socket("192.168.1.14", PORT);
            mySender = new Sender(mySocket);
            mySender.notifyMyNick(userNick);
        } catch (IOException e) {
            e.printStackTrace();
        }
        MarcoCliente miMarco = new MarcoCliente(userNick, mySender);
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ReceiverWorker myReceiver = new ReceiverWorker(mySocket, miMarco.getLaminaMarcoCliente());
        myReceiver.start();
    }

    public static class MarcoCliente extends JFrame {

        public LaminaMarcoCliente milamina;
        public MarcoCliente(String userNick, Sender mySender) {
            setBounds(600, 300, 280, 350);
            milamina = new LaminaMarcoCliente(userNick, mySender);
            add(milamina);
            milamina.setBackground(java.awt.Color.GRAY);
            setVisible(true);
        }
        public LaminaMarcoCliente getLaminaMarcoCliente(){
            return milamina;
        }

    }

}

