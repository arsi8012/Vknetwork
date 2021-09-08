package ru.netology.domain;

public class CommentsInfo {
    private int count;
    private boolean canPost;
    private boolean groupsCanPost;
    private boolean canClose;
    private boolean canOpen;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean canPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public boolean groupsCanPost() {
        return groupsCanPost;
    }

    public void setGroupsCanPost(boolean groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }

    public boolean canClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public boolean canOpen() {
        return canOpen;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }
}