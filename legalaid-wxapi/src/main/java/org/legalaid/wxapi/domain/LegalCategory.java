package org.legalaid.wxapi.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.Date;

/**
 * @author xiong
 * @version 1.0
 * @description 业务实体
 * @date 2023/4/20 20:31:14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("legal_category")
public class LegalCategory implements Serializable {
    @TableId(value = "id",type =IdType.AUTO)
    private Integer id;//主键
    @TableField("name")
    private String name;//名字
    @TableField("keywords")
    private String keywords;//关键字
    @TableField("description")
    private String description;//广告语介绍
    @TableField("pid")
    private Integer pid;//父类目id
    @TableField("icon_url")
    private String iconUrl;//类目图标
    @TableField("pic_url")
    private String picUrl;//类目图片
    @TableField("level")
    private String level;//类目级别
    @TableField("sort_order")
    private Integer sortOrder;//排序
    @TableField("add_time")
    private Date addTime;//创建时间
    @TableField("update_time")
    private Date updateTime;//修改时间
    @TableField("deleted")
    private String deleted;//逻辑删除 N显示  Y删除
}
