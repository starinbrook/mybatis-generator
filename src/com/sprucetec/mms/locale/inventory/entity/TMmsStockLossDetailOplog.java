package com.sprucetec.mms.locale.inventory.entity;

public class TMmsStockLossDetailOplog {
    private Long id;

    private Long cityId;

    private Long warehouseId;

    private String stockCode;

    private Long skuId;

    private String lossPayCode;

    private Byte opType;

    private Long cT;

    private Long createrId;

    private String createrName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public Long getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode == null ? null : stockCode.trim();
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public String getLossPayCode() {
        return lossPayCode;
    }

    public void setLossPayCode(String lossPayCode) {
        this.lossPayCode = lossPayCode == null ? null : lossPayCode.trim();
    }

    public Byte getOpType() {
        return opType;
    }

    public void setOpType(Byte opType) {
        this.opType = opType;
    }

    public Long getcT() {
        return cT;
    }

    public void setcT(Long cT) {
        this.cT = cT;
    }

    public Long getCreaterId() {
        return createrId;
    }

    public void setCreaterId(Long createrId) {
        this.createrId = createrId;
    }

    public String getCreaterName() {
        return createrName;
    }

    public void setCreaterName(String createrName) {
        this.createrName = createrName == null ? null : createrName.trim();
    }
}