package com.zhuifeng.shipping.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageInfo;
import com.zhuifeng.shipping.pojo.OrderDetailPojo;
import com.zhuifeng.shipping.pojo.UserPojo;
import com.zhuifeng.shipping.service.ICartService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class IOrderTailController {
    @Reference
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
        List<OrderDetailPojo> detailPojos = cartService.querydetail(user.getUid());
        model.addAttribute("details",detailPojos);
        return "querysub";
    }
    /***
     * @RequestParam(value="pageNo",defaultValue="1")int pageNo, @RequestParam(value="pageSize",defaultValue="10")int pageSize
     * 根据条件查询购物车详情
     */
    @RequestMapping("/toApplicationList.html")
    public String toApplicationList(OrderDetailPojo orderDetailPojo, Model model){
//        PageInfo<OrderDetailPojo> page = applicationsService.getApplicationList(pageNo,pageSize);
//        model.addAttribute("pageInfo", page);
        return "backend/applications/application_list";
    }
}
