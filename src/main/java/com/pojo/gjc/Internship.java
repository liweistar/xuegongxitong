package com.pojo.gjc;

public class Internship {
    private Integer id;

    private Integer studentid;

    private String studentname;

    private String sex;

    private Integer age;

    private String behave;

    private String local;

    private Integer phone;

    public Internship(Integer id, Integer studentid, String studentname, String sex, Integer age, String behave, String local, Integer phone) {
        this.id = id;
        this.studentid = studentid;
        this.studentname = studentname;
        this.sex = sex;
        this.age = age;
        this.behave = behave;
        this.local = local;
        this.phone = phone;
    }

    public Internship() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname == null ? null : studentname.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBehave() {
        return behave;
    }

    public void setBehave(String behave) {
        this.behave = behave == null ? null : behave.trim();
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local == null ? null : local.trim();
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }
}