package be.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Message {
    @Column(name = "MessageId")
    @Id
    private int messageId;

    @Column(name = "FromUserId")
    private Integer fromUserId;

    @Column(name = "ToUserId")
    private Integer toUserId;

    @Column(name = "Subject")
    private String subject;

    @Column(name = "Content")
    private String content;

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public Integer getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(Integer fromUserId) {
        this.fromUserId = fromUserId;
    }

    public Integer getToUserId() {
        return toUserId;
    }

    public void setToUserId(Integer toUserId) {
        this.toUserId = toUserId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageId=" + messageId +
                ", fromUserId=" + fromUserId +
                ", toUserId=" + toUserId +
                ", subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Message message)) return false;
        return messageId == message.messageId && Objects.equals(fromUserId, message.fromUserId) && Objects.equals(toUserId, message.toUserId) && Objects.equals(subject, message.subject) && Objects.equals(content, message.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageId, fromUserId, toUserId, subject, content);
    }
}
