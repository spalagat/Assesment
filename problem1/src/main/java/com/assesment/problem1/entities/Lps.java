package com.assesment.problem1.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="substrings")
public class Lps {

    @Id
    @Column(name="mainstring")
    private String mainString;

    @Column(name="palindromicsubstring")
    private String palindromicSubString;

    public Lps() {
    }

    public Lps(String mainString, String palindromicSubString) {
        this.mainString = mainString;
        this.palindromicSubString = palindromicSubString;
    }

    public String getMainString() {
        return mainString;
    }

    public void setMainString(String mainString) {
        this.mainString = mainString;
    }

    public String getPalindromicSubString() {
        return palindromicSubString;
    }

    public void setPalindromicSubString(String palindromicSubString) {
        this.palindromicSubString = palindromicSubString;
    }
}
