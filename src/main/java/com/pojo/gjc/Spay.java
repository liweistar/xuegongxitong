package com.pojo.gjc;

public class Spay {
    private Integer id;

    private Integer studentid;

    private String studentname;

    private Integer tution;

    private String tstate;

    private Integer accex;

    private String astate;

    public Spay(Integer id, Integer studentid, String studentname, Integer tution, String tstate, Integer accex, String astate) {
        this.id = id;
        this.studentid = studentid;
        this.studentname = studentname;
        this.tution = tution;
        this.tstate = tstate;
        this.accex = accex;
        this.astate = astate;
    }

    public Spay() {
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

    public Integer getTution() {
        return tution;
    }

    public void setTution(Integer tution) {
        this.tution = tution;
    }

    public String getTstate() {
        return tstate;
    }

    public void setTstate(String tstate) {
        this.tstate = tstate == null ? null : tstate.trim();
    }

    public Integer getAccex() {
        return accex;
    }

    public void setAccex(Integer accex) {
        this.accex = accex;
    }

    public String getAstate() {
        return astate;
    }

    public void setAstate(String astate) {
        this.astate = astate == null ? null : astate.trim();
    }
}