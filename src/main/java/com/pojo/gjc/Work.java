package com.pojo.gjc;

public class Work {
    private Integer id;

    private Integer studentid;

    private String studentname;

    private String sex;

    private Integer age;

    private String state;

    private String local;

    private Integer phone;

    public Work(Integer id, Integer studentid, String studentname, String sex, Integer age, String state, String local, Integer phone) {
        this.id = id;
        this.studentid = studentid;
        this.studentname = studentname;
        this.sex = sex;
        this.age = age;
        this.state = state;
        this.local = local;
        this.phone = phone;
    }

    public Work() {
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
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