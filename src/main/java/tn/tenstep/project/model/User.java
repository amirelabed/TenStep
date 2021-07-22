package tn.tenstep.project.model;

import java.util.List;

import javax.persistence.*;



@Entity ( name = "user_details")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer userid;
    private String fullname;
    private String username;
    private String password;
    private String email;
    private String mobile;
    private String enrolled_courses;
    private String payment_details;


    public User(){}

    public User(int userid, String fullname, String username, String password, String email, String mobile,  String enrolled_courses, String payment_details) {
        this.userid = userid;
        this.fullname = fullname;
        this.username = username;
        this.password = password;
        this.email = email;
        this.mobile = mobile;
        this.enrolled_courses = enrolled_courses;
        this.payment_details = payment_details;

    }
    
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Course> formation;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
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

   
    public String getEnrolled_courses() {
        return enrolled_courses;
    }

    public void setEnrolled_courses(String enrolled_courses) {
        this.enrolled_courses = enrolled_courses;
    }

    public String getPayment_details() {
        return payment_details;
    }

    public void setPayment_details(String payment_details) {
        this.payment_details = payment_details;
    }

    
    
}