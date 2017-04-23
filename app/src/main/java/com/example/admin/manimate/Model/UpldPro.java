package com.example.admin.manimate.Model;

/**
 * Created by Deep Joshi on 14-04-2017.
 */

public class UpldPro {


    /**
     * status : 1
     * projectDetail : {"projectId":"2","userId":"2","clientUserId":"6","projectTitle":"EMS","projectDesc":"Employee management system","projectStartDate":"23/03/2015","projectEndDate":"25/03/2015","developerUserId":"5"}
     * message : Your Project is Created
     */

    private int status;
    private ProjectDetailBean projectDetail;
    private String message;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public ProjectDetailBean getProjectDetail() {
        return projectDetail;
    }

    public void setProjectDetail(ProjectDetailBean projectDetail) {
        this.projectDetail = projectDetail;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static class ProjectDetailBean {
        /**
         * projectId : 2
         * userId : 2
         * clientUserId : 6
         * projectTitle : EMS
         * projectDesc : Employee management system
         * projectStartDate : 23/03/2015
         * projectEndDate : 25/03/2015
         * developerUserId : 5
         */

        private String projectId;
        private String userId;
        private String clientUserId;
        private String projectTitle;
        private String projectDesc;
        private String projectStartDate;
        private String projectEndDate;
        private String developerUserId;

        public String getProjectId() {
            return projectId;
        }

        public void setProjectId(String projectId) {
            this.projectId = projectId;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getClientUserId() {
            return clientUserId;
        }

        public void setClientUserId(String clientUserId) {
            this.clientUserId = clientUserId;
        }

        public String getProjectTitle() {
            return projectTitle;
        }

        public void setProjectTitle(String projectTitle) {
            this.projectTitle = projectTitle;
        }

        public String getProjectDesc() {
            return projectDesc;
        }

        public void setProjectDesc(String projectDesc) {
            this.projectDesc = projectDesc;
        }

        public String getProjectStartDate() {
            return projectStartDate;
        }

        public void setProjectStartDate(String projectStartDate) {
            this.projectStartDate = projectStartDate;
        }

        public String getProjectEndDate() {
            return projectEndDate;
        }

        public void setProjectEndDate(String projectEndDate) {
            this.projectEndDate = projectEndDate;
        }

        public String getDeveloperUserId() {
            return developerUserId;
        }

        public void setDeveloperUserId(String developerUserId) {
            this.developerUserId = developerUserId;
        }
    }
}
