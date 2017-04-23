package com.example.admin.manimate.Model;

import java.util.List;

/**
 * Created by Deep Joshi on 14-04-2017.
 */

public class AssignTask {
    /**
     * status : 1
     * myTaskList : {"projectId":"2","taskName":"EMS","taskPriority":"high","lable":"Task","taskAssign":["client","PM","Developer"],"status":"1","taskDiscription":"new PHP tast"}
     * Message : myTaskList fetched successfully
     */

    private int status;
    private MyTaskListBean myTaskList;
    private String Message;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public MyTaskListBean getMyTaskList() {
        return myTaskList;
    }

    public void setMyTaskList(MyTaskListBean myTaskList) {
        this.myTaskList = myTaskList;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public static class MyTaskListBean {
        /**
         * projectId : 2
         * taskName : EMS
         * taskPriority : high
         * lable : Task
         * taskAssign : ["client","PM","Developer"]
         * status : 1
         * taskDiscription : new PHP tast
         */

        private String projectId;
        private String taskName;
        private String taskPriority;
        private String lable;
        private String status;
        private String taskDiscription;
        private List<String> taskAssign;

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

        public List<String> getTaskAssign() {
            return taskAssign;
        }

        public void setTaskAssign(List<String> taskAssign) {
            this.taskAssign = taskAssign;
        }
    }
}
