package com.web_ide.service;

import com.web_ide.dto.UserRequestDto;
import com.web_ide.dto.UserResponseDto;
import com.web_ide.entity.User;
import com.web_ide.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserResponseDto registerUser(UserRequestDto requestDto) {
        // DTO → Entity 변환 후 저장
        User user = userRepository.save(requestDto.toEntity());
        // Entity → DTO 변환 후 반환
        return UserResponseDto.fromEntity(user);
    }

    public UserResponseDto getUserById(Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("유저를 찾을 수 없습니다."));
        return UserResponseDto.fromEntity(user);
    }
}