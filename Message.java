/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socialmedia;

/**
 *
 * @author alizeidillazyuksel
 */




import java.text.SimpleDateFormat;
import java.util.Date;

public class Message {
    private String content;
    private User sender;
    private User receiver;
    private Date date;
    
    public Message(String content , User sender , User receiver){
        this.content = content;
        this.receiver = receiver;
        this.sender = sender;
        this.date = new Date();
        this.receiver.receiveMessage(this);
    }

    public String getContent() {
        return this.content;
    }

    public User getSender() {
        return this.sender;
    }

    public User getReceiver() {
        return this.receiver;
    }

    public Date getDate() {
        return this.date;
    }

    
    public void writeMessagetoConsole(){
        System.out.println("Sender : " + this.sender.getEmail());
        System.out.println("Receiver : " + this.receiver.getEmail());
        System.out.println("Message Content : " + this.content);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String mDate = sdf.format(this.date);
        System.out.println("Message Date : " + mDate);
    }
}
