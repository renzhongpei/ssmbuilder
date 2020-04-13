package com.rzp.pojo;

public class SysInfo {
    private String infoStr1;
    private String infoStr2;
    private String infoStr3;
    private Double infoDou1;
    private Double infoDou2;
    private Double infoDou3;
    public SysInfo() {
        this.infoDou1 = 0d;
        this.infoDou2 = 0d;
        this.infoDou3 = 0d;
    }

    @Override
    public String toString() {
        return "SysInfo{" +
                "infoStr1='" + infoStr1 + '\'' +
                ", infoStr2='" + infoStr2 + '\'' +
                ", infoStr3='" + infoStr3 + '\'' +
                ", infoDou1=" + infoDou1 +
                ", infoDou2=" + infoDou2 +
                ", infoDou3=" + infoDou3 +
                '}';
    }

    public String getInfoStr1() {
        return infoStr1;
    }

    public void setInfoStr1(String infoStr1) {
        this.infoStr1 = infoStr1;
    }

    public String getInfoStr2() {
        return infoStr2;
    }

    public void setInfoStr2(String infoStr2) {
        this.infoStr2 = infoStr2;
    }

    public String getInfoStr3() {
        return infoStr3;
    }

    public void setInfoStr3(String infoStr3) {
        this.infoStr3 = infoStr3;
    }

    public Double getInfoDou1() {
        return infoDou1;
    }

    public void setInfoDou1(Double infoDou1) {
        this.infoDou1 = infoDou1;
    }

    public Double getInfoDou2() {
        return infoDou2;
    }

    public void setInfoDou2(Double infoDou2) {
        this.infoDou2 = infoDou2;
    }

    public Double getInfoDou3() {
        return infoDou3;
    }

    public void setInfoDou3(Double infoDou3) {
        this.infoDou3 = infoDou3;
    }


}
