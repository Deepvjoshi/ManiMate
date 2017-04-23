package com.example.admin.manimate.Model;

/**
 * Created by Deep Joshi on 08-04-2017.
 */

public class FrPassword {

    /**
     * status : 1
     * message : Your password has been sent to your registered Email-id
     */

    private int status;
    private String message;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
