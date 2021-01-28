package com.example.demo.jdyo.dao.entity.second;

import java.util.Arrays;

public class CoordActionsWithBLOBs extends CoordActions {
    private byte[] actionXml;

    private byte[] createdConf;

    private byte[] missingDependencies;

    private byte[] pushMissingDependencies;

    private byte[] runConf;

    private byte[] slaXml;

    public byte[] getActionXml() {
        return actionXml;
    }

    public void setActionXml(byte[] actionXml) {
        this.actionXml = actionXml;
    }

    public byte[] getCreatedConf() {
        return createdConf;
    }

    public void setCreatedConf(byte[] createdConf) {
        this.createdConf = createdConf;
    }

    public byte[] getMissingDependencies() {
        return missingDependencies;
    }

    public void setMissingDependencies(byte[] missingDependencies) {
        this.missingDependencies = missingDependencies;
    }

    public byte[] getPushMissingDependencies() {
        return pushMissingDependencies;
    }

    public void setPushMissingDependencies(byte[] pushMissingDependencies) {
        this.pushMissingDependencies = pushMissingDependencies;
    }

    public byte[] getRunConf() {
        return runConf;
    }

    public void setRunConf(byte[] runConf) {
        this.runConf = runConf;
    }

    public byte[] getSlaXml() {
        return slaXml;
    }

    public void setSlaXml(byte[] slaXml) {
        this.slaXml = slaXml;
    }

    @Override
    public String toString() {
        return "CoordActionsWithBLOBs{" +
                "actionXml=" + Arrays.toString(actionXml) +
                ", createdConf=" + Arrays.toString(createdConf) +
                ", missingDependencies=" + Arrays.toString(missingDependencies) +
                ", pushMissingDependencies=" + Arrays.toString(pushMissingDependencies) +
                ", runConf=" + Arrays.toString(runConf) +
                ", slaXml=" + Arrays.toString(slaXml) +
                '}';
    }
}