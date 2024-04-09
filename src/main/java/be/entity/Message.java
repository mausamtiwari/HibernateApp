package be.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@ToString



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



}
