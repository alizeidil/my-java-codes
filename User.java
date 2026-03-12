/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socialmedia;


import java.util.*;

/**
 *
 * @author alizeidillazyuksel
 */
public class User {
    private String name;
    private String surname;
    private Date birthday;
    private String email;
    private String address;
    private User [] followers;
    private User [] followed;
    
    private Message [] inbox;
    private Message []outbox;
    private int inboxCount;
    private int outboxCount;
    
    private int followersCount;
    private int followedCount;
    
    public User(String name,String surname,Date birthday,String email,String address){
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.email = email;
        this.address = address;
        this.followers = new User[10000];
        this.followed = new User[10000];
        
        this.inbox = new Message[10];
        this.outbox = new Message[10];
    }
    
    public void AddFollower(User u){
        if(this.followersCount > this.followers.length -1){
            User temp [] = this.followers;
            this.followers = new User[temp.length*2];
            for(int i = 0; i<temp.length; i++){
                this.followers[i] = temp[i];
            }
        }
        
        this.followers[followersCount] = u;
        this.followersCount++;
        
    }
    
    public void follow(User u){
        if(this.followedCount > this.followed.length-1){
            User temp [] = this.followed;
            this.followed = new User[temp.length*2];
            for(int i = 0; i<temp.length; i++){
                this.followed[i] = temp[i];
            }
        }
        
        this.followed[followedCount] = u;
        this.followedCount++;
        u.AddFollower(this);
        
    }

    public User[] getFollowers() {
        return followers;
    }

    public void setFollowers(User[] followers) {
        this.followers = followers;
    }

    public User[] getFollowed() {
        return followed;
    }

    public void setFollowed(User[] followed) {
        this.followed = followed;
    }

    public int getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(int followersCount) {
        this.followersCount = followersCount;
    }

    public int getFollowedCount() {
        return followedCount;
    }

    public void setFollowedCount(int followedCount) {
        this.followedCount = followedCount;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setSurname(String surname){
        this.surname = surname;
    }
    
    public void setBirthday(Date birthday){
        this.birthday = birthday;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
        
    public void setAddress(String address){
        this.address = address;
    }    
    
    public String getName(){
        return this.name;
    }
    
    public String getSurname(){
        return this.surname;
    }
    
    public Date getBirthday(){
        return this.birthday;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    public void sendMessage(String content , User receiver){
        Message m = new Message(content,this,receiver);
        if(outboxCount > this.outbox.length-1){
            Message [] temp  = this.outbox;
            this.outbox =new Message[temp.length*2];
            for(int i = 0; i<temp.length; i++){
                this.outbox[i] =temp[i];
            }
        }
        this.outbox[outboxCount] = m;
        this.outboxCount++;
    }
    
    public void receiveMessage(Message m){
        if(inboxCount > this.inbox.length-1){
            Message [] temp  = this.inbox;
            this.inbox =new Message[temp.length*2];
            for(int i = 0; i<temp.length; i++){
                this.inbox[i] =temp[i];
            }
        }
        this.inbox[inboxCount] = m;
        this.inboxCount++;
    }
        
    public void showMessagefromInbox(int index){
            this.inbox[index].writeMessagetoConsole();
        }
        
    public void showMessagefromOutbox(int index){
           // this.inbox[index].
        }
        
}
