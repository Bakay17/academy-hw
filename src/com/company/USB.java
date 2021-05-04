package com.company;

import java.util.Random;

public class USB {
    private float[] portType;
    private String idPort;

    public USB(float[] portType, String idPort) {
        this.portType = portType;
        this.idPort = idPort;
    }

    public USB() {
    }

    public float[] getPortType() {
        return portType;
    }

    public void setPortType(float[] portType) {
        this.portType = portType;
    }

    public void printPortType(){
        Random rnd = new Random();
        int n = rnd.nextInt(portType.length);
        for (int i = 0; i < portType.length; i++) {
            portType[n] = portType[i];
        }
        System.out.print("тип: " + portType[n]);
    }

    public String getIdPort() {
        return idPort;
    }

    public void setIdPort(String idPort) {
        this.idPort = idPort;
    }

    public void IfoOfUsb(){
        printPortType();
        System.out.println(", id: " + idPort);
    }
}
