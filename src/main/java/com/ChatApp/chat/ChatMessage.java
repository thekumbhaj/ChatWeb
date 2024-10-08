package com.ChatApp.chat;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ChatMessage {

private String content;
private String sender;
private MessageType type;


}
