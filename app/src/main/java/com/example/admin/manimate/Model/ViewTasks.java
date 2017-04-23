package com.example.admin.manimate.Model;

import java.util.List;

/**
 * Created by Deep Joshi on 14-04-2017.
 */

public class ViewTasks {

    /**
     * status : 1
     * TaskDetail : [{"projectId":"4","taskName":"EM","taskPriority":"high","lable":"Task","taskAssign":"client,PM,Developer","status":"Closed","taskDiscription":"new PHP tast","estimationTime":"5","startDate":"4/4/2015","endDate":"4/4/2015"}]
     * message : Your Task Details
     */

    private int status;
    private String message;
    private List<TaskDetailBean> TaskDetail;

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

    public List<TaskDetailBean> getTaskDetail() {
        return TaskDetail;
    }

    public void setTaskDetail(List<TaskDetailBean> TaskDetail) {
        this.TaskDetail = TaskDetail;
    }

    public static class TaskDetailBean {
        /**
         * projectId : 4
         * taskName : EM
         * taskPriority : high
         * lable : Task
         * taskAssign : client,PM,Developer
         * status : Closed
         * taskDiscription : new PHP tast
         * estimationTime : 5
         * startDate : 4/4/2015
         * endDate : 4/4/2015
         */

        private String projectId;
        private String taskName;
        private String taskPriority;
        private String lable;
        private String taskAssign;
        private String status;
        private String taskDiscription;
        private String estimationTime;
        private String startDate;
        private String endDate;

        public String getProjectId() {
            return projectId;
        }

        public void setProjectId(String projectId) {
            this.projectId = projectId;
        }

        public String getTaskName() {
            return taskName;
        }

        public void setTaskName(String taskName) {
            this.taskName = taskName;
        }

        public String getTaskPriority() {
            return taskPriority;
        }

        public void setTaskPriority(String taskPriority) {
            this.taskPriority = taskPriority;
        }

        public String getLable() {
            return lable;
        }

        public void setLable(String lable) {
            this.lable = lable;
        }

        public String getTaskAssign() {
            return taskAssign;
        }

        public void setTaskAssign(String taskAssign) {
            this.taskAssign = taskAssign;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getTaskDiscription() {
            return taskDiscription;
        }

        public void setTaskDiscription(String taskDiscription) {
            this.taskDiscription = taskDiscription;
        }

        public String getEstimationTime() {
            return estimationTime;
        }

        public void setEstimationTime(String estimationTime) {
            this.estimationTime = estimationTime;
        }

        public String getStartDate() {
            return startDate;
        }

        public void setStartDate(String startDate) {
            this.startDate = startDate;
        }

        public String getEndDate() {
            return endDate;
        }

        public void setEndDate(String endDate) {
            this.endDate = endDate;
        }
    }
}
