/*
 * Copyright (c) 2015 perftest
 */
package com.company.perftest.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import java.util.Set;
import javax.persistence.OneToMany;

/**
 * @author degtyarjov
 */
@Table(name = "PERFTEST_REQUEST")
@Entity(name = "perftest$Request")
public class Request extends StandardEntity {
    private static final long serialVersionUID = 2392748181355446845L;

    @Column(name = "NUMBER_")
    protected String number;

    @Column(name = "TITLE")
    protected String title;

    @Column(name = "DESCRIPTION", length = 1000)
    protected String description;

    @Column(name = "STATUS")
    protected Integer status;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "request")
    protected Set<Comment> comments;

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    public Set<Comment> getComments() {
        return comments;
    }


    public void setStatus(RequestStatus status) {
        this.status = status == null ? null : status.getId();
    }

    public RequestStatus getStatus() {
        return status == null ? null : RequestStatus.fromId(status);
    }


    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


}