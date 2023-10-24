package org.solid.srp;

public class SingleResponsibilityPrinciple {
    public static void main(String[] args) {
        IMessageService imgService = new MessageServiceImpl();
        imgService.writeMessage("SOLID Principles - SRP");
        imgService.printMessage(); 
    }
}
