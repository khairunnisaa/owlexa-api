package com.owlexa.chat.model;

import javax.persistence.*;

@Entity
@Table(name="chat_message")
public class ChatMessage {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    @Column(name="type")
    private MessageType type;
    @Column(name="content")
    private String content;
    @Column(name="sender")
    private String sender;

    public enum MessageType {
        CHAT,
        JOIN,
        LEAVE
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
