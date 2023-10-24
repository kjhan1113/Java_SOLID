package org.solid.srp;

public class MessageServiceImpl implements IMessageService{

    String content;

    @Override
    public void writeMessage(String msg) {
        content = msg;
    }

    @Override
    public void replaceMessageContent(String source, String destination) {
        content = content.replace(source, destination);
    }

    @Override
    public void printMessage() {
        System.out.println("Message is : "+content);
    }

    @Override
    public void sendMessage() {
        System.out.println("Message sent and the content is : " + content);
    }
}