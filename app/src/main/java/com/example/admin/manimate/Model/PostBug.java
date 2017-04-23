package com.example.admin.manimate.Model;

// FIXME generate failure  field _$BugDetail65
/**
 * Created by Deep Joshi on 14-04-2017.
 */

public class PostBug {

    /**
     * status : 1
     * Bug Detail : {"projectName":"EMS","bugTypes":"new","bugName":"login fail","bugDesc":"can not login user","createdBy":"client","notify":"pm,developer"}
     * message : You are Successfully add bug
     */

    private int status;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public static class BugDetailBean {
        /**
         * projectName : EMS
         * bugTypes : new
         * bugName : login fail
         * bugDesc : can not login user
         * createdBy : client
         * notify : pm,developer
         */

        private String projectName;
        private String bugTypes;
        private String bugName;
        private String bugDesc;
        private String createdBy;
        private String notify;

        public String getProjectName() {
            return projectName;
        }

        public void setProjectName(String projectName) {
            this.projectName = projectName;
        }

        public String getBugTypes() {
            return bugTypes;
        }

        public void setBugTypes(String bugTypes) {
            this.bugTypes = bugTypes;
        }

        public String getBugName() {
            return bugName;
        }

        public void setBugName(String bugName) {
            this.bugName = bugName;
        }

        public String getBugDesc() {
            return bugDesc;
        }

        public void setBugDesc(String bugDesc) {
            this.bugDesc = bugDesc;
        }

        public String getCreatedBy() {
            return createdBy;
        }

        public void setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
        }

        public String getNotify() {
            return notify;
        }

        public void setNotify(String notify) {
            this.notify = notify;
        }
    }
}
