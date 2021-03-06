package com.smarthomies.realtimetalk.models.network;

/**
 * Created by ensar on 31/10/16.
 */
public class AuthenticationResponse {
    public static final String TAG = AuthenticationResponse.class.getSimpleName();

    private String token;
    private int id;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
