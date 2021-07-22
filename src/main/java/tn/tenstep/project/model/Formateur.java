package tn.tenstep.project.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity( name = "instructor_details")
public class Formateur
{
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer instructorid;
    private String fullname;
    private String username;
    private String password;
    private String email;
    private String mobile;
    private String courses;
    private String qualification;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy="formateur")
    private List<Course> formation;

    public Formateur() {
    }

    public Formateur(Integer instructorid, String fullname, String username, String password, String email, String mobile, String courses, String qualification) {
        this.instructorid = instructorid;
        this.fullname = fullname;
        this.username = username;
        this.password = password;
        this.email = email;
        this.mobile = mobile;
        this.courses = courses;
        this.qualification = qualification;
    }

    public Integer getInstructorid() {
        return instructorid;
    }

    public void setInstructorid(Integer instructorid) {
        this.instructorid = instructorid;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}