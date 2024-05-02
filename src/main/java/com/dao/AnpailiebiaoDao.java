package com.dao;

import com.entity.AnpailiebiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.AnpailiebiaoView;

/**
 * 安排列表 Dao 接口
 *
 * @author 
 */
public interface AnpailiebiaoDao extends BaseMapper<AnpailiebiaoEntity> {

   List<AnpailiebiaoView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
