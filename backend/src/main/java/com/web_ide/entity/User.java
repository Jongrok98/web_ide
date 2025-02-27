package com.web_ide.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@NoArgsConstructor
@Getter
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 30)
    private String loginId; //로그인 할 떄 쓰는 id

    @Setter
    @Column(nullable = false)
    private String pwd; //비번

    @Column(nullable = false, unique = true)
    private String email; //이메일

    @Setter
    @Column(nullable = false, length = 20)
    private String nickname; //닉네임

}
