package com.web_ide.repository;

import com.web_ide.entity.SocialAccount;
import com.web_ide.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface SocialAccountRepository extends JpaRepository<SocialAccount, UUID> {
    boolean existsByUser(User user);
}
