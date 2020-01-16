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
        var navID = "3";
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
                <li id="nav1"><a class="navA" href="index">首页</a></li>
                <li id="nav2"><a class="navA" href="itinerary">外贸航线</a></li>
                <li id="nav3"><a class="navA" href="querysub">信息查询与订阅 </a></li>
                <li id="nav4"><a class="navA" href="message">物流解决方案  </a></li>
                <li id="nav5"><a class="navA" href="helpin"> 帮助中心</a></li>
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
<section class="Contain Contain-column">
    <aside class="SildeBar">
        <nav class="MenuList">
            <span class="list1">信息查询与订阅</span>
            <ul>
                <li id="menu1"><a href="货物跟踪.html">货物跟踪</a></li>
                <li id="menu2"><a href="船期查询.html">船期查询</a></li>
                <li id="menu3"><a href="船舶动态.html">船舶动态</a></li>
                <li id="menu4"><a href="多式联运查询.html">多式联运查询</a></li>
                <li id="menu5"><a href="滞期费查询.html">滞期费查询</a></li>
                <li id="menu6"><a href="方箱查询.html">方箱查询</a></li>
                <li id="menu7"><a href="换单信息查询.html">换单信息查询</a></li>
                <li id="menu8"  class="last"><a href="">消息订阅</a></li>
            </ul>
        </nav>

    </aside>
    <script type="text/javascript">
        $("#menu1").addClass("on");
    </script>
    <div class="Content-column">
        <div class="Cargo">
            <div class="select">
                <div class="num">
                    <div class="tit">提单号  </div>
                    <input type="text" class="text" />
                </div>
                <div class="num">
                    <div class="tit">箱号  </div>
                    <input type="text" class="text" />
                </div>
                <div class="clear"></div>
                <div class="search">
                    <a href="" class="btn">查 询</a>
                    <a href="" class="btn reset-btn">重 置</a>
                </div>
            </div>
            <div class="clear"></div>
            <div class="result">
                <div class="tit">查询结果</div>
                <div class="table">
                    <table cellpadding="0" cellspacing="0">
                        <tr class="tr1">
                            <td class="td1">序号</td>
                            <td class="td2"> 船名 </td>
                            <td class="td3">航次</td>
                            <td class="td4"> 提单号  </td>
                            <td class="td5">装货港 </td>
                            <td class="td6"> 卸货港 </td>
                            <td class="td7">箱号</td>
                            <td class="td8">箱型</td>
                            <td class="td9">尺寸</td>
                            <td class="td10">空重 </td>
                            <td class="td11">箱动态</td>
                            <td class="td12">箱动态时间 </td>
                            <td class="td13"> 港口</td>
                            <td class="td14">动态发送地</td>
                            <td class="td15">备注</td>
                        </tr>
                        <#list details as detail>
                            <tr>
                                <td class="td1">${detail.odnumber}</td>
                                <td class="td2">${detail.flightPojo.fname}</td>
                                <td class="td3">${detail.flightPojo.fschedule}</td>
                                <td class="td4">${detail.oid}</td>
                                <td class="td5">${detail.flightPojo.forigin}</td>
                                <td class="td6">${detail.flightPojo.farrival}</td>
                                <td class="td7">${detail.odcanum}</td>
                                <td class="td8">${detail.odbox}</td>
                                <td class="td9">${detail.odsize}</td>
                                <td class="td10">${detail.odempty}</td>
                                <td class="td11">${detail.oddynamic}</td>
                                <td class="td12">${detail.oddytime?date}</td>
                                <td class="td13">${detail.flightPojo.forigin}</td>
                                <td class="td14">${detail.flightPojo.farrival}</td>
                                <td class="td15">${detail.odremark}</td>
                            </tr>
                        </#list>


                    </table>
                </div>
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