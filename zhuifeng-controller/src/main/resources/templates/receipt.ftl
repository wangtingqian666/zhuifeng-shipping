<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta name="Author" content="">
    <meta content=" shop116703760.taobao.com/index.htm" name="design">
    <title>我的虚拟世界店铺</title>
    <link rel="stylesheet" type="text/css" href="css/css_whir.css"/>
    <script type="text/javascript" src="scripts/jquery-1.9.1.min.js"></script>
    <script type="text/javascript" src="scripts/jquery.SuperSlide.2.1.1.js"></script>

    <!--[if lt IE 9]>
    <script type="text/javascript" src="scripts/html5shiv.v3.72.min.js"></script>
    <![endif]-->
    <script type="text/javascript">
        var navID = "0";
    </script>
</head>

<body>
<!--top-->
<header>
    <section class="Top">
        <section class="toper">
            <div class="language"><a href="" class="cn">中文版</a><em>|</em><a href="" class="en">ENGLISH</a></div>
            <div class="topright">
                <ul>
                    <li><a href="login.html">公共用户登录</a></li>
                    <em>|</em>
                    <li><a href="login.html">协议用户登录 </a></li>
                    <em>|</em>
                    <li><a href="Register.html"> 注册</a></li>
                </ul>
            </div>
        </section>
    </section>
    <section class="toper">
        <a href="index.html" class="logo"><img src="images/logo.jpg" /></a>
        <nav class="MainNav">
            <ul>
                <li id="nav1"><a class="navA" href="index.html">首页</a></li>
                <li id="nav2"><a class="navA" href="外贸航线.html">外贸航线</a></li>
                <li id="nav3"><a class="navA" href="货物跟踪.html">信息查询与订阅 </a></li>
                <li id="nav4"><a class="navA" href="物流解决方案.html">物流解决方案  </a></li>
                <li id="nav5"><a class="navA" href="走进锦江.html"> 帮助中心</a></li>
            </ul>
        </nav>
        <div class="center"><a href="" class="center1">结算中心</a><a href="membercenter.html" class="center2">会员中心</a> </div>
    </section>
</header>
<script type="text/javascript">
    //导航选中
    $("#nav" + navID).addClass("onnav");
</script>
<!--top End-->
<section class="Contain">
    <div class="Current">当前位置:<a href="index.html">首页</a> <em>|</em> <a href="#" class="column">会员中心</a> <span>常用收发货人</span></div>
    <aside class="SildeBar">
        <nav class="MenuList">
            <span class="list1">订单管理</span>
            <ul>
                <li id="menu1"><a href="Order.html">我的订单</a></li>
                <li id="menu2"><a href="Route.html">航线信息</a></li>
                <li id="menu3" class="last"><a href="#">快速下单</a></li>
            </ul>
            <span class="list2">资料管理</span>
            <ul>
                <li id="menu4"><a href="Receipt.html">常用收发货人</a></li>
                <li id="menu5"><a href="assess.html">评价管理</a></li>
                <li id="menu6"><a href="#">我的定制</a></li>
                <li id="menu7"><a href="membercenter.html">个人信息</a></li>
                <li id="menu8"><a href="BusinessInformation.html">企业信息</a></li>
                <li id="menu9"><a href="change.html">修改密码</a></li>
                <li id="menu10"><a href="Inform.html">客户告知书</a></li>
                <li id="menu11" class="last"><a href="Price.html">我的询价</a></li>
            </ul>
        </nav>

    </aside>
    <script type="text/javascript">
        $("#menu4").addClass("on");
    </script>
    <div class="Content Receipt">
        <div class="columnname">常用收发货人</div>
        <div class="content">
            <div class="title">收货人管理</div>
            <div class="membertable receipt">
                <table cellpadding="0" cellspacing="0" border="0">
                    <tr>
                        <td class="left"><span class="true">*</span>代码：</td>
                        <td><input type="text" class="text"></td>
                    </tr>
                    <tr>
                        <td class="left"><span class="true">*</span>发货人：</td>
                        <td><input type="text" class="text text2"></td>
                    </tr>
                    <tr>
                        <td class="left"><span class="true">*</span>发货人地址：</td>
                        <td><input type="text" class="text"></td>
                    </tr>
                    <tr>
                        <td class="left"><span class="true">*</span>收货人：</td>
                        <td><input type="text" class="text"></td>
                    </tr>
                    <tr>
                        <td class="left"><span class="true">*</span>收货人地址：</td>
                        <td><input type="text" class="text"></td>
                    </tr>
                    <tr>
                        <td class="left">通知人：</td>
                        <td><input type="text" class="text"></td>
                    </tr>
                    <tr>
                        <td class="left">通知人地址：</td>
                        <td><input type="text" class="text"></td>
                    </tr>
                    <tr>
                        <td class="left"></td>
                        <td><input type="button" class="btn" value="更 新">
                            <input type="button" class="btn btn2" value="取 消"></td>
                    </tr>
                    <tr>
                        <td class="left"></td>
                        <td><span class="true">*</span><span class="must">号内容为必填</span></td>
                    </tr>
                </table>
            </div>
        </div>
        <div class="content">
            <div class="title">收货人列表<a href="" class="delete">删除</a><a href="" class="add">增加</a></div>
            <div class="info">
                <p>代码：<span>fdse564564132165</span></p>
                <p>发货人：<span>彼得</span></p>
                <p>发货人地址：<span>广东广州市天河区</span></p>
                <p>收货人：<span>约翰</span></p>
            </div>
        </div>
    </div>
    <div class="clear"></div>
</section>

<!--bottom-->
<footer>
    <section class="Bottom">
        <nav class="BotNav">
            <ul>
                <li>
                    <a href="" class="NavB">关于我们</a>
                    <dl>
                        <dt><a href="">走进锦江</a></dt>
                        <dt><a href="">联系我们</a></dt>
                    </dl>
                </li>
                <li>
                    <a href="" class="NavB">航线介绍</a>
                    <dl>
                        <dt><a href="">精品航线</a></dt>
                        <dt><a href="">航线地图</a></dt>
                    </dl>
                </li>
                <li>
                    <a href="" class="NavB">新手上路</a>
                    <dl>
                        <dt><a href="">操作流程</a></dt>
                        <dt><a href="">支付方式</a></dt>
                    </dl>
                </li>
                <li>
                    <a href="" class="NavB">帮助中心</a>
                    <dl>
                        <dt><a href="">保函下载</a></dt>
                        <dt><a href="">代理名录</a></dt>
                        <dt><a href="">集装箱规格</a></dt>
                        <dt><a href="">船舶资料</a></dt>
                        <dt><a href="">附加费明细</a></dt>
                    </dl>
                </li>
            </ul>
        </nav>
        <section class="Hotline"><span>客服热线：</span><em>400-800-8888</em></section>
        <section class="weixin"><div class="img"><img src="uploadfiles/image/weixin.jpg" /></div><span>关注我们</span></section>
        <div class="clear"></div>
        <div class="Bottom2">
            <div class="Copyright">Copyright © 2015 上海锦江航运有限公司 All Rights Reserved.  沪ICP备13075754号 Designed by <a href="http:www.我的虚拟世界店铺.com.cn">我的虚拟世界店铺.</a> </div>
            <nav class="BottomLinks"> <!--友情链接-->
                <a href="#" target="_blank">友情链接</a> <em>|</em><a href="#" target="_blank">网站地图</a> <em>|</em><a href="#" target="_blank">法律申明</a><em>|</em><a href="#" target="_blank">cnzz统计</a>
            </nav>
        </div>
    </section>
</footer>
<div class="fixed" id="floatdiv"><a href="" class="QQ"><img src="images/fixed_bg1.png" /></a></div>
<script type="text/javascript" src="scripts/qq.js"></script>
<script type="text/javascript">
    //整站无图处理
    jQuery.each(jQuery("img"), function (i, n) { jQuery(n).error(function () { n.src = 'uploadfiles/nopic.jpg'; }); n.src = n.src; });
</script>
<!--bottom End-->
</body>
</html>