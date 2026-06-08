package com.example.base_spring_boot.models.services;

import com.example.base_spring_boot.models.entities.RefreshToken;
import com.example.base_spring_boot.models.entities.User;

public interface IRefreshTokenService {
    RefreshToken createRefreshToken(Long userId);

    RefreshToken findByToken(String token);

    RefreshToken verifyExpiration(RefreshToken token);

    void revokeAllByUser(User user);
}
