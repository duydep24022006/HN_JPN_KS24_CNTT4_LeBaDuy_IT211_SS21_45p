# Hướng dẫn test nhanh Refresh Token / Revoke Token

## 1. Register
POST `http://localhost:8080/api/v1/auth/register`

```json
{
  "fullName": "Le Ba Duy",
  "username": "duy",
  "password": "123456"
}
```

## 2. Login
POST `http://localhost:8080/api/v1/auth/login`

```json
{
  "username": "duy",
  "password": "123456"
}
```

Response sẽ có `accessToken` và `refreshToken`.

## 3. Refresh Token
POST `http://localhost:8080/api/v1/auth/refresh-token`

```json
{
  "refreshToken": "PASTE_REFRESH_TOKEN_HERE"
}
```

## 4. Logout / Revoke Token
POST `http://localhost:8080/api/v1/auth/logout`

Header:

```text
Authorization: Bearer PASTE_ACCESS_TOKEN_HERE
```

Sau khi logout, toàn bộ refresh token của user hiện tại sẽ bị đánh dấu `revoked = true`.
