
package com.example.importdemo.utils;

import java.io.Serializable;

public class ResultMsg<T extends Serializable> implements Serializable {
    private static final long serialVersionUID = 6784351629933960469L;
    private String messages;
    private boolean success;
    private String flag;
    private T elementthing;

    public ResultMsg() {
    }

    public ResultMsg(boolean success) {
        this(success, (String) null, (String) null);
    }

    public ResultMsg(boolean success, String messages) {
        this(success, messages, (String) null);
    }

    public ResultMsg(boolean success, String messages, String flag) {
        this.messages = messages;
        this.success = success;
        this.flag = flag;
    }

    public ResultMsg(boolean success, String messages, String flag, T elementthing) {
        this.messages = messages;
        this.success = success;
        this.flag = flag;
        this.elementthing = elementthing;
    }

    public String getMessages() {
        return this.messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getFlag() {
        return this.flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public T getElementthing() {
        return this.elementthing;
    }

    public void setElementthing(T elementthing) {
        this.elementthing = elementthing;
    }
}
