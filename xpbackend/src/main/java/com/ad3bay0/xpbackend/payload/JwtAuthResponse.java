package com.ad3bay0.xpbackend.payload;

public class JwtAuthResponse {

    private String accessToken;
    private String tokenType = "Bearer";

    public JwtAuthResponse(){

    }

    public JwtAuthResponse(String accessToken){
        this.accessToken = accessToken;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }
}
