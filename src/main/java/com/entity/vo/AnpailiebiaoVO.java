package com.entity.vo;

import com.entity.AnpailiebiaoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 安排列表
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("anpailiebiao")
public class AnpailiebiaoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 安排名称
     */

    @TableField(value = "anpailiebiao_name")
    private String anpailiebiaoName;


    /**
     * 安排类型
     */

    @TableField(value = "anpailiebiao_types")
    private Integer anpailiebiaoTypes;


    /**
     * 安排详情
     */

    @TableField(value = "anpailiebiao_content")
    private String anpailiebiaoContent;


    /**
     * 开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "kaishi_time")
    private Date kaishiTime;


    /**
     * 结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "jieshu_time")
    private Date jieshuTime;


    /**
     * 分钟
     */

    @TableField(value = "fenzhong")
    private Integer fenzhong;


    /**
     * 是否完成
     */

    @TableField(value = "wancheng_types")
    private Integer wanchengTypes;


    /**
     * 状态
     */

    @TableField(value = "zhuangtai_types")
    private Integer zhuangtaiTypes;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：安排名称
	 */
    public String getAnpailiebiaoName() {
        return anpailiebiaoName;
    }


    /**
	 * 获取：安排名称
	 */

    public void setAnpailiebiaoName(String anpailiebiaoName) {
        this.anpailiebiaoName = anpailiebiaoName;
    }
    /**
	 * 设置：安排类型
	 */
    public Integer getAnpailiebiaoTypes() {
        return anpailiebiaoTypes;
    }


    /**
	 * 获取：安排类型
	 */

    public void setAnpailiebiaoTypes(Integer anpailiebiaoTypes) {
        this.anpailiebiaoTypes = anpailiebiaoTypes;
    }
    /**
	 * 设置：安排详情
	 */
    public String getAnpailiebiaoContent() {
        return anpailiebiaoContent;
    }


    /**
	 * 获取：安排详情
	 */

    public void setAnpailiebiaoContent(String anpailiebiaoContent) {
        this.anpailiebiaoContent = anpailiebiaoContent;
    }
    /**
	 * 设置：开始时间
	 */
    public Date getKaishiTime() {
        return kaishiTime;
    }


    /**
	 * 获取：开始时间
	 */

    public void setKaishiTime(Date kaishiTime) {
        this.kaishiTime = kaishiTime;
    }
    /**
	 * 设置：结束时间
	 */
    public Date getJieshuTime() {
        return jieshuTime;
    }


    /**
	 * 获取：结束时间
	 */

    public void setJieshuTime(Date jieshuTime) {
        this.jieshuTime = jieshuTime;
    }
    /**
	 * 设置：分钟
	 */
    public Integer getFenzhong() {
        return fenzhong;
    }


    /**
	 * 获取：分钟
	 */

    public void setFenzhong(Integer fenzhong) {
        this.fenzhong = fenzhong;
    }
    /**
	 * 设置：是否完成
	 */
    public Integer getWanchengTypes() {
        return wanchengTypes;
    }


    /**
	 * 获取：是否完成
	 */

    public void setWanchengTypes(Integer wanchengTypes) {
        this.wanchengTypes = wanchengTypes;
    }
    /**
	 * 设置：状态
	 */
    public Integer getZhuangtaiTypes() {
        return zhuangtaiTypes;
    }


    /**
	 * 获取：状态
	 */

    public void setZhuangtaiTypes(Integer zhuangtaiTypes) {
        this.zhuangtaiTypes = zhuangtaiTypes;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
