package com.zhuifeng.shipping.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhuifeng.shipping.pojo.OrderDetailPojo;
import com.zhuifeng.shipping.pojo.OrderPojo;
import com.zhuifeng.shipping.pojo.UserPojo;
import com.zhuifeng.shipping.service.ICartService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class IOrdertailController {
    @Reference(check = false)
    ICartService cartService;

    /**
     * 查询购物车详情
     * @return
     */
    @RequestMapping("querysub")
    public String querysub(OrderDetailPojo detailPojo, HttpSession session, Model model){
        UserPojo user = (UserPojo) session.getAttribute("user");
        if (null==user){//若用户没有登陆 跳转到登陆页
            return "login";
        }
        OrderPojo orderPojo =new OrderPojo();
        orderPojo.setUser_id(user.getUid());
        detailPojo.setOrderPojo(orderPojo);
        //获取到信息
        PageInfo<OrderDetailPojo> pageInfo= cartService.querydetail(detailPojo);
        model.addAttribute("detailPojo",detailPojo);
        model.addAttribute("pageInfo",pageInfo);
        return "querysub";
    }
    /*
     * @RequestParam(value="pageNo",defaultValue="1")int pageNo, @RequestParam(value="pageSize",defaultValue="10")int pageSize
     * 根据条件查询购物车详情
     */
    public String toApplicationList(OrderDetailPojo orderDetailPojo, Model model){
//        PageInfo<OrderDetailPojo> page = applicationsService.getApplicationList(pageNo,pageSize);
//        model.addAttribute("pageInfo", page);
        return "backend/applications/application_list";
    }
}
