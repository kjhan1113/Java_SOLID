package org.solid.srp;

public interface IMessageService {
    void writeMessage(String msg);
    void replaceMessageContent(String srouce, String destination);
    void printMessage();
    void sendMessage();
}
