package com.web_ide.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(columnDefinition = "CHAR(36)")
    private UUID uuid;

    @Column(nullable = false, unique = true ,length = 30)
    private String id; //로그인 할 떄 쓰는 id

    @Column(nullable = false)
    @Setter
    private String pwd; //비번

    @Column(nullable = false,unique = true)
    private String email; //이메일

    @Setter
    @Column(nullable = false , length = 20)
    private String nickname; //닉네임
}
