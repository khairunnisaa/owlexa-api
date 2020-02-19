package com.owlexa.chat.repository;

import com.owlexa.chat.model.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepo extends JpaRepository<ChatMessage, Integer> {

}
