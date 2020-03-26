package com.sprucetec.mms.center.master.entity;

import java.math.BigDecimal;

public class TMmsDeviceFixApplySpareParts {
    private Long id;

    private Long fixApplyId;

    private Long sparePartsStockId;

    private Integer sparePartsCount;

    private BigDecimal sparePartsAmount;

    private Long cT;

    private Long creator;

    private String creatorName;

    private Long uT;

    private Long updater;

    private String updaterName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFixApplyId() {
        return fixApplyId;
    }

    public void setFixApplyId(Long fixApplyId) {
        this.fixApplyId = fixApplyId;
    }

    public Long getSparePartsStockId() {
        return sparePartsStockId;
    }

    public void setSparePartsStockId(Long sparePartsStockId) {
        this.sparePartsStockId = sparePartsStockId;
    }

    public Integer getSparePartsCount() {
        return sparePartsCount;
    }

    public void setSparePartsCount(Integer sparePartsCount) {
        this.sparePartsCount = sparePartsCount;
    }

    public BigDecimal getSparePartsAmount() {
        return sparePartsAmount;
    }

    public void setSparePartsAmount(BigDecimal sparePartsAmount) {
        this.sparePartsAmount = sparePartsAmount;
    }

    public Long getcT() {
        return cT;
    }

    public void setcT(Long cT) {
        this.cT = cT;
    }

    public Long getCreator() {
        return creator;
    }

    public void setCreator(Long creator) {
        this.creator = creator;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
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