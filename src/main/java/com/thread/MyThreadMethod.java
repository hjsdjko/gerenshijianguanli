package com.thread;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.AnpailiebiaoEntity;
import com.entity.view.AnpailiebiaoView;
import com.service.AnpailiebiaoService;
import com.utils.PageUtils;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 线程执行方法（做一些项目启动后 一直要执行的操作，比如根据时间自动更改订单状态，比如订单签收30天自动收货功能，比如根据时间来更改状态）
 */
public class MyThreadMethod extends Thread  {

    private AnpailiebiaoService anpailiebiaoService;

    public void run() {
        while (!this.isInterrupted()) {// 线程未中断执行循环
            try {

                Map<String, Object> params = new HashMap<>();
                params.put("zhuangtaiTypes",1);
                params.put("wanchengTypes",1);
                params.put("orderBy","id");
                params.put("jieshuTimeEnd",new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
                PageUtils page = anpailiebiaoService.queryPage(params);
                List<AnpailiebiaoView> list =(List<AnpailiebiaoView>)page.getList();

                if(list != null && list.size()>0){
                    ArrayList<AnpailiebiaoEntity> anpailiebiaoEntityArrayList = new ArrayList<>();
                    for(AnpailiebiaoView a:list){
                        AnpailiebiaoEntity anpailiebiaoEntity = new AnpailiebiaoEntity();
                        anpailiebiaoEntity.setId(a.getId());
                        anpailiebiaoEntity.setZhuangtaiTypes(2);
                        anpailiebiaoEntityArrayList.add(anpailiebiaoEntity);
                    }
                    System.out.println("---------------------------------------执行自动更新状态为作废"+anpailiebiaoEntityArrayList.size()+"条---------------------------------------------");
                    anpailiebiaoService.updateBatchById(anpailiebiaoEntityArrayList);
                }

                Thread.sleep(5000); //每隔2000ms执行一次
                System.out.println("---------------------------------------执行自动更新状态为作废---------------------------------------------");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

//			 ------------------ 开始执行 ---------------------------
//            System.out.println("线程执行中:" + System.currentTimeMillis());
        }
    }

    public AnpailiebiaoService getAnpailiebiaoService() {
        return anpailiebiaoService;
    }

    public void setAnpailiebiaoService(AnpailiebiaoService anpailiebiaoService) {
        this.anpailiebiaoService = anpailiebiaoService;
    }
}
