package io.codefault.githubsummer.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by yashladha on 7/12/17.
 */

public class PullRequestEventModel {

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("number")
    @Expose
    private int number;

    @SerializedName("state")
    @Expose
    private String State;

    @SerializedName("body")
    @Expose
    private String body;

    @SerializedName("created_at")
    @Expose
    private String createdAt;

    @SerializedName("updated_at")
    @Expose
    private String updatedAt;

    @SerializedName("closed_at")
    @Expose
    private String closedAt;

    @SerializedName("merged_at")
    @Expose
    private String mergedAt;

    @SerializedName("assignees")
    @Expose
    private String assignees;

    @SerializedName("user")
    @Expose
    private String user;

    @SerializedName("head")
    @Expose
    private String head;

    @SerializedName("base")
    @Expose
    private String base;

    @SerializedName("requested_reviewers")
    @Expose
    private String requestedReviewers;

    @SerializedName("milestone")
    @Expose
    private String milestone;

    @SerializedName("links")
    @Expose
    private String links;

    @SerializedName("author_association")
    @Expose
    private String authorAssociation;

    public String getLinks() {
        return links;
    }

    public void setLinks(String links) {
        this.links = links;
    }

    public String getAuthorAssociation() {
        return authorAssociation;
    }

    public void setAuthorAssociation(String authorAssociation) {
        this.authorAssociation = authorAssociation;
    }

    public String getAssignees() {
        return assignees;
    }

    public void setAssignees(String assignees) {
        this.assignees = assignees;
    }

    public String getRequestedReviewers() {
        return requestedReviewers;
    }

    public void setRequestedReviewers(String requestedReviewers) {
        this.requestedReviewers = requestedReviewers;
    }

    public String getMilestone() {
        return milestone;
    }

    public void setMilestone(String milestone) {
        this.milestone = milestone;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(String closedAt) {
        this.closedAt = closedAt;
    }

    public String getMergedAt() {
        return mergedAt;
    }

    public void setMergedAt(String mergedAt) {
        this.mergedAt = mergedAt;
    }


}
