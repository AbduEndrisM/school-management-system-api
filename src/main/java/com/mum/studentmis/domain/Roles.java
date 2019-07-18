package com.mum.studentmis.domain;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "roles")
public class Roles {
    @Id
    @NotNull
    @GeneratedValue
    private Long id;

//    @NaturalId
//    @Column(length = 60)
    private String roleName;

    private String description;

    public Roles(String roleName, String description) {
        this.roleName = roleName;
        this.description = description;
    }

    public Roles() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}