package com.pojo.ch;

public class Science {
    private Integer id;

    private String science;

    private String principal;

    private String phone;

    private String introducte;

    private String sex;

    private String ispass;

    private Integer codeid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getScience() {
        return science;
    }

    public void setScience(String science) {
        this.science = science == null ? null : science.trim();
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal == null ? null : principal.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getIntroducte() {
        return introducte;
    }

    public void setIntroducte(String introducte) {
        this.introducte = introducte == null ? null : introducte.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getIspass() {
        return ispass;
    }

    public void setIspass(String ispass) {
        this.ispass = ispass == null ? null : ispass.trim();
    }

    public Integer getCodeid() {
        return codeid;
    }

    public void setCodeid(Integer codeid) {
        this.codeid = codeid;
    }
}