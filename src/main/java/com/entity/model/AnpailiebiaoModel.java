package com.entity.model;

import com.entity.AnpailiebiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 安排列表
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class AnpailiebiaoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 安排名称
     */
    private String anpailiebiaoName;


    /**
     * 安排类型
     */
    private Integer anpailiebiaoTypes;


    /**
     * 安排详情
     */
    private String anpailiebiaoContent;


    /**
     * 开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date kaishiTime;


    /**
     * 结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date jieshuTime;


    /**
     * 分钟
     */
    private Integer fenzhong;


    /**
     * 是否完成
     */
    private Integer wanchengTypes;


    /**
     * 状态
     */
    private Integer zhuangtaiTypes;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：安排名称
	 */
    public String getAnpailiebiaoName() {
        return anpailiebiaoName;
    }


    /**
	 * 设置：安排名称
	 */
    public void setAnpailiebiaoName(String anpailiebiaoName) {
        this.anpailiebiaoName = anpailiebiaoName;
    }
    /**
	 * 获取：安排类型
	 */
    public Integer getAnpailiebiaoTypes() {
        return anpailiebiaoTypes;
    }


    /**
	 * 设置：安排类型
	 */
    public void setAnpailiebiaoTypes(Integer anpailiebiaoTypes) {
        this.anpailiebiaoTypes = anpailiebiaoTypes;
    }
    /**
	 * 获取：安排详情
	 */
    public String getAnpailiebiaoContent() {
        return anpailiebiaoContent;
    }


    /**
	 * 设置：安排详情
	 */
    public void setAnpailiebiaoContent(String anpailiebiaoContent) {
        this.anpailiebiaoContent = anpailiebiaoContent;
    }
    /**
	 * 获取：开始时间
	 */
    public Date getKaishiTime() {
        return kaishiTime;
    }


    /**
	 * 设置：开始时间
	 */
    public void setKaishiTime(Date kaishiTime) {
        this.kaishiTime = kaishiTime;
    }
    /**
	 * 获取：结束时间
	 */
    public Date getJieshuTime() {
        return jieshuTime;
    }


    /**
	 * 设置：结束时间
	 */
    public void setJieshuTime(Date jieshuTime) {
        this.jieshuTime = jieshuTime;
    }
    /**
	 * 获取：分钟
	 */
    public Integer getFenzhong() {
        return fenzhong;
    }


    /**
	 * 设置：分钟
	 */
    public void setFenzhong(Integer fenzhong) {
        this.fenzhong = fenzhong;
    }
    /**
	 * 获取：是否完成
	 */
    public Integer getWanchengTypes() {
        return wanchengTypes;
    }


    /**
	 * 设置：是否完成
	 */
    public void setWanchengTypes(Integer wanchengTypes) {
        this.wanchengTypes = wanchengTypes;
    }
    /**
	 * 获取：状态
	 */
    public Integer getZhuangtaiTypes() {
        return zhuangtaiTypes;
    }


    /**
	 * 设置：状态
	 */
    public void setZhuangtaiTypes(Integer zhuangtaiTypes) {
        this.zhuangtaiTypes = zhuangtaiTypes;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
