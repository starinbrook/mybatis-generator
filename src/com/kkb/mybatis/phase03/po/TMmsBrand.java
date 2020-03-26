package com.kkb.mybatis.phase03.po;

public class TMmsBrand {
    private Long id;

    private String brandName;

    private Byte isDeleted;

    private Long cT;

    private Long creater;

    private Long uT;

    private Long updater;

    private String updaterName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Long getcT() {
        return cT;
    }

    public void setcT(Long cT) {
        this.cT = cT;
    }

    public Long getCreater() {
        return creater;
    }

    public void setCreater(Long creater) {
        this.creater = creater;
    }

    public Long getuT() {
        return uT;
    }

    public void setuT(Long uT) {
        this.uT = uT;
    }

    public Long getUpdater() {
        return updater;
    }

    public void setUpdater(Long updater) {
        this.updater = updater;
    }

    public String getUpdaterName() {
        return updaterName;
    }

    public void setUpdaterName(String updaterName) {
        this.updaterName = updaterName == null ? null : updaterName.trim();
    }
}