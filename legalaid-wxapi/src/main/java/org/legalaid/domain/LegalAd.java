package org.legalaid.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 轮播图管理对象 legal_ad
 *
 * @author ruoyi
 * @date 2023-04-16
 */
@TableName("legal_ad")
public class LegalAd implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 序号
     */
    @TableField("id")
    private Long id;

    /**
     * 标题
     */
    @TableField("name")
    private String name;

    /**
     * 链接地址
     */
    @TableField("link")
    private String link;

    /**
     * 宣传图片
     */
    @TableField("url")
    private String url;

    /**
     * 位置
     */
    @TableField("position")
    private String position;

    /**
     * 活动内容
     */
    @TableField("content")
    private String content;

    /**
     * 开始时间
     */
    @TableField("start_time")
    private Date startTime;

    /**
     * 结束时间
     */
    @TableField("end_time")
    private Date endTime;

    /**
     * 是否启动
     */
    @TableField("enabled")
    private String enabled;

    /**
     * 创建时间
     */
    @TableField("add_time")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date addTime;

    /**
     * 逻辑删除
     */
    @TableField("deleted")
    private String deleted;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public String getDeleted() {
        return deleted;
    }


}
