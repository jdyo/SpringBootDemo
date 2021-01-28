package com.example.demo.jdyo.dao.entity.master;

import java.util.Date;

public class WorkflowLog {
    private Integer id;

    private Date createTime;

    private String performUser;

    private String jobId;

    private String oozieId;

    private String nodeId;

    private String nodeName;

    private Integer performType;

    private Integer schedulingType;

    private Integer singleNodeExecution;

    private String nodeNumber;

    private String status;

    private Date exeTime;

    private Date endTime;

    private String file;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPerformUser() {
        return performUser;
    }

    public void setPerformUser(String performUser) {
        this.performUser = performUser == null ? null : performUser.trim();
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId == null ? null : jobId.trim();
    }

    public String getOozieId() {
        return oozieId;
    }

    public void setOozieId(String oozieId) {
        this.oozieId = oozieId == null ? null : oozieId.trim();
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId == null ? null : nodeId.trim();
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName == null ? null : nodeName.trim();
    }

    public Integer getPerformType() {
        return performType;
    }

    public void setPerformType(Integer performType) {
        this.performType = performType;
    }

    public Integer getSchedulingType() {
        return schedulingType;
    }

    public void setSchedulingType(Integer schedulingType) {
        this.schedulingType = schedulingType;
    }

    public Integer getSingleNodeExecution() {
        return singleNodeExecution;
    }

    public void setSingleNodeExecution(Integer singleNodeExecution) {
        this.singleNodeExecution = singleNodeExecution;
    }

    public String getNodeNumber() {
        return nodeNumber;
    }

    public void setNodeNumber(String nodeNumber) {
        this.nodeNumber = nodeNumber == null ? null : nodeNumber.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getExeTime() {
        return exeTime;
    }

    public void setExeTime(Date exeTime) {
        this.exeTime = exeTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file == null ? null : file.trim();
    }
}