package com.web_ide.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;





@Entity
@Getter
@NoArgsConstructor
@Table(name = "social_accounts")
public class SocialAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(columnDefinition = "CHAR(36)")
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false, length = 10)
    private String provider;

    @Column(name = "external_user_id" , nullable = false)
    private String externalUserId;

    @Column(name = "access_token" , nullable = false, columnDefinition = "TEXT")
    private String accessToken;

    @Column(name = "token_expiry" , nullable = false)
    private LocalDateTime tokenExpiry;
}
