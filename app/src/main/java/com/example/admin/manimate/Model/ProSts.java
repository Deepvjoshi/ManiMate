package com.example.admin.manimate.Model;

// FIXME generate failure  field _$ProjectStatus209
/**
 * Created by Deep Joshi on 15-04-2017.
 */

public class ProSts {

    /**
     * status : 1
     * Project Status : [{"projectId":"2","projectTitle":"EMS","projectStatus":"Open"}]
     */

    private int status;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public static class ProjectStatusBean {
        /**
         * projectId : 2
         * projectTitle : EMS
         * projectStatus : Open
         */

        private String projectId;
        private String projectTitle;
        private String projectStatus;

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

        public String getProjectStatus() {
            return projectStatus;
        }

        public void setProjectStatus(String projectStatus) {
            this.projectStatus = projectStatus;
        }
    }
}
