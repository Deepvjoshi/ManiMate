package com.example.admin.manimate.Model;

/**
 * Created by Deep Joshi on 08-04-2017.
 */

public class  Login {

    /**
     * status : 1
     * userDetail : {"emailId":"anup@gmail.com"}
     * message : You are Successfully Logged in
     */

    private int status;
    private UserDetailBean userDetail;
    private String message;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public UserDetailBean getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(UserDetailBean userDetail) {
        this.userDetail = userDetail;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static class UserDetailBean {
        /**
         * emailId : anup@gmail.com
         */

        private String emailId;

        public String getEmailId() {
            return emailId;
        }

        public void setEmailId(String emailId) {
            this.emailId = emailId;
        }
    }
}
