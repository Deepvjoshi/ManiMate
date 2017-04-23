package com.example.admin.manimate.Model;

import java.util.List;

/**
 * Created by DJ on 07-04-2017.
 */

public class SignUp {

    /**
     * status : 1
     * userDetail : {"userId":"1","userName":"Anup","name":"Anupratap","password":"anup123","emailId":"anup@gmail.com","contactNumber":"9662164745","address":"C-50,Ahmedabed","designation":"PM"}
     * message : You are Successfully Registered
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
         * userId : 1
         * userName : Anup
         * name : Anupratap
         * password : anup123
         * emailId : anup@gmail.com
         * contactNumber : 9662164745
         * address : C-50,Ahmedabed
         * designation : PM
         */

        private String userId;
        private String userName;
        private String name;
        private String password;
        private String emailId;
        private String contactNumber;
        private String address;
        private String designation;

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getEmailId() {
            return emailId;
        }

        public void setEmailId(String emailId) {
            this.emailId = emailId;
        }

        public String getContactNumber() {
            return contactNumber;
        }

        public void setContactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getDesignation() {
            return designation;
        }

        public void setDesignation(String designation) {
            this.designation = designation;
        }
    }
}
