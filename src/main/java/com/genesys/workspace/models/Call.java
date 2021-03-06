package com.genesys.workspace.models;

import java.util.Map;

public class Call {
    private String id;
    private String callUuid;
    private CallState state;
    private String parentConnId;
    private String previousConnId;
    private String callType;
    private String ani;
    private String dnis;
    private String recordingState;
    private String[] participants;
    private Map<String,Object> userData;
    private Capability[] capabilities;

    public Call() {}

    public String getId() {
        return this.id;
    }

    public String getCallUuid() {
        return this.callUuid;
    }

    public CallState getState() {
        return this.state;
    }

    public String getParentConnId() { return this.parentConnId; }

    public String getPreviousConnId() {
        return this.previousConnId;
    }

    public String getCallType() {
        return this.callType;
    }

    public String getANI() {
        return this.ani;
    }

    public String getDNIS() {
        return this.dnis;
    }

    public String getRecordingState() {
        return this.recordingState;
    }

    public String[] getParticipants() {
        return this.participants;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCallUuid(String callUuid) {
        this.callUuid = callUuid;
    }

    public void setState(CallState state) {
        this.state = state;
    }

    public void setParentConnId(String parentConnId) {
        this.parentConnId = parentConnId;
    }

    public void setPreviousConnId(String previousConnId) {
        this.previousConnId = previousConnId;
    }

    public void setCallType(String callType) {
        this.callType = callType;
    }

    public void setANI(String ani) {
        this.ani = ani;
    }

    public void setDNIS(String dnis) {
        this.dnis = dnis;
    }

    public void setRecordingState(String recordingState) {
        this.recordingState = recordingState;
    }

    public void setParticipants(String[] participants) {
        this.participants = participants;
    }

    public Capability[] getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(Capability[] capabilities) {
        this.capabilities = capabilities;
    }

    public Map<String,Object> getUserData() {
        return userData;
    }

    public void setUserData(Map<String,Object> userData) {
        this.userData = userData;
    }
}
