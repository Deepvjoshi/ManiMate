package com.example.admin.manimate.Model;

/**
 * Created by Deep Joshi on 14-04-2017.
 */

public class ViewBug {

    /**
     * bugId : 5
     * projectId : 5
     * bugTypes : new
     * bugName : login fail
     * bugDesc : can not login user
     * createdBy : client
     * notify : pm,developer
     * pdffile : <base-64>
     * message : Your Bug Details
     */

    private int bugId;
    private int projectId;
    private String bugTypes;
    private String bugName;
    private String bugDesc;
    private String createdBy;
    private String notify;
    private String pdffile;
    private String message;

    public int getBugId() {
        return bugId;
    }

    public void setBugId(int bugId) {
        this.bugId = bugId;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
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

    public String getPdffile() {
        return pdffile;
    }

    public void setPdffile(String pdffile) {
        this.pdffile = pdffile;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
