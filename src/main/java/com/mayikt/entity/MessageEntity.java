package com.mayikt.entity;

/**
 * @ClassName MessageEntity
 * @Description TODO
 * @Author mao
 * @Data 2021/7/15 15:41
 **/
public class MessageEntity {
    private String messageId;
    private String messageName;

    public MessageEntity(){

    }

    @Override
    public String toString() {
        return "MessageEntity{" +
                "messageId='" + messageId + '\'' +
                ", messageName='" + messageName + '\'' +
                '}';
    }
}
