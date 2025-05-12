package com.fiveup.core.performanceevaluation.bean;

import javax.persistence.Column;
import java.math.BigDecimal;

/**
 * 科目分数所占权重
 */
public class SubjectScoreWeight {
    // 主键ID
    private Integer id;
    // 德育权重
    private BigDecimal virtueWeight;
    // 智育权重
    private BigDecimal intelligenceWeight;
    // 体育权重
    private BigDecimal sportsWeight;
    // 美育分数
    private BigDecimal artWeight;
    // 劳育分数
    private BigDecimal laborWeight;
    // 教师ID
    private Integer tid;

    public SubjectScoreWeight() {
    }

    public SubjectScoreWeight(Integer id, BigDecimal virtueWeight, BigDecimal intelligenceWeight, BigDecimal sportsWeight, BigDecimal artWeight, BigDecimal laborWeight, Integer tid) {
        this.id = id;
        this.virtueWeight = virtueWeight;
        this.intelligenceWeight = intelligenceWeight;
        this.sportsWeight = sportsWeight;
        this.artWeight = artWeight;
        this.laborWeight = laborWeight;
        this.tid = tid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getVirtueWeight() {
        return virtueWeight;
    }

    public void setVirtueWeight(BigDecimal virtueWeight) {
        this.virtueWeight = virtueWeight;
    }

    public BigDecimal getIntelligenceWeight() {
        return intelligenceWeight;
    }

    public void setIntelligenceWeight(BigDecimal intelligenceWeight) {
        this.intelligenceWeight = intelligenceWeight;
    }

    public BigDecimal getSportsWeight() {
        return sportsWeight;
    }

    public void setSportsWeight(BigDecimal sportsWeight) {
        this.sportsWeight = sportsWeight;
    }

    public BigDecimal getArtWeight() {
        return artWeight;
    }

    public void setArtWeight(BigDecimal artWeight) {
        this.artWeight = artWeight;
    }

    public BigDecimal getLaborWeight() {
        return laborWeight;
    }

    public void setLaborWeight(BigDecimal laborWeight) {
        this.laborWeight = laborWeight;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }
}
