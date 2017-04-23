package com.example.admin.manimate.Model;

import java.util.List;

/**
 * Created by HR on 19-04-2017.
 */

public class ViewProject {

    /**
     * status : 1
     * projectDetail : [{"projectId":"2","projectTitle":"EMS","projectLanguage":"PHP","projectDesc":"Employee management system"},{"projectId":"3","projectTitle":"Project","projectLanguage":"JAVA","projectDesc":"Employee management system"},{"projectId":"27","projectTitle":"Website22","projectLanguage":"PHP","projectDesc":"this is first project22"}]
     * message : Your Project Details
     */

    private int status;
    private String message;
    private List<ProjectDetailBean> projectDetail;

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

    public List<ProjectDetailBean> getProjectDetail() {
        return projectDetail;
    }

    public void setProjectDetail(List<ProjectDetailBean> projectDetail) {
        this.projectDetail = projectDetail;
    }

    public static class ProjectDetailBean {
        /**
         * projectId : 2
         * projectTitle : EMS
         * projectLanguage : PHP
         * projectDesc : Employee management system
         */

        private String projectId;
        private String projectTitle;
        private String projectLanguage;
        private String projectDesc;

        public String getProjectId() {
            return projectId;
        }

        public void setProjectId(String projectId) {
            this.projectId = projectId;
        }

        public String getProjectTitle() {
            return projectTitle;
        }

        public void setProjectTitle(String projectTitle) {
            this.projectTitle = projectTitle;
        }

        public String getProjectLanguage() {
            return projectLanguage;
        }

        public void setProjectLanguage(String projectLanguage) {
            this.projectLanguage = projectLanguage;
        }

        public String getProjectDesc() {
            return projectDesc;
        }

        public void setProjectDesc(String projectDesc) {
            this.projectDesc = projectDesc;
        }
    }
}
