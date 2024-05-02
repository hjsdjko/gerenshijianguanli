package com.entity.view;

import com.entity.AnpailiebiaoEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 安排列表
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("anpailiebiao")
public class AnpailiebiaoView extends AnpailiebiaoEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 安排类型的值
		*/
		private String anpailiebiaoValue;
		/**
		* 是否完成的值
		*/
		private String wanchengValue;
		/**
		* 状态的值
		*/
		private String zhuangtaiValue;



		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;

	public AnpailiebiaoView() {

	}

	public AnpailiebiaoView(AnpailiebiaoEntity anpailiebiaoEntity) {
		try {
			BeanUtils.copyProperties(this, anpailiebiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 安排类型的值
			*/
			public String getAnpailiebiaoValue() {
				return anpailiebiaoValue;
			}
			/**
			* 设置： 安排类型的值
			*/
			public void setAnpailiebiaoValue(String anpailiebiaoValue) {
				this.anpailiebiaoValue = anpailiebiaoValue;
			}
			/**
			* 获取： 是否完成的值
			*/
			public String getWanchengValue() {
				return wanchengValue;
			}
			/**
			* 设置： 是否完成的值
			*/
			public void setWanchengValue(String wanchengValue) {
				this.wanchengValue = wanchengValue;
			}
			/**
			* 获取： 状态的值
			*/
			public String getZhuangtaiValue() {
				return zhuangtaiValue;
			}
			/**
			* 设置： 状态的值
			*/
			public void setZhuangtaiValue(String zhuangtaiValue) {
				this.zhuangtaiValue = zhuangtaiValue;
			}












				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}


}
