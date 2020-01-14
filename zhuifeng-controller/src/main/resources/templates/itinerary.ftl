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
        var navID = "2";
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
<section class="Contain">
    <!--航线产品-->
    <section class="Foreign-route">
        <!--筛选-->
        <div class="SelectBox">
            <ul>
                <li>
                    <span class="Condition">航线组：</span>
                    <a href="" class="all">全部</a>
                    <dl>
                        <dt><a href="">四季快航</a></dt>
                        <dt><a href=""> 阪神穿梭快航 </a></dt>
                        <dt><a href="">东海穿梭快航  </a></dt>
                        <dt><a href="">青岛日本快航  </a></dt>
                        <dt><a href="">上海台湾航线</a></dt>
                        <dt><a href="">华北台湾航线</a></dt>
                        <dt><a href="">沪泰越航线</a></dt>
                        <dt><a href="">多式联运业务</a></dt>

                    </dl>
                </li>
                <li>
                    <span class="Condition">起运港：</span>
                    <a href="" class="all">全部</a>
                    <dl>
                        <dt><a href="">上海</a></dt>
                        <dt><a href=""> 天津  </a></dt>
                        <dt><a href="">青岛   </a></dt>
                    </dl>
                </li>
                <li>
                    <span class="Condition">起始地：</span>
                    <a href="" class="all">全部</a>
                    <dl>
                        <dt><a href="">上海</a></dt>
                        <dt><a href=""> 天津  </a></dt>
                        <dt><a href="">青岛   </a></dt>
                    </dl>
                </li>
                <li>
                    <span class="Condition">目的地：</span>
                    <a href="" class="all">全部</a>
                    <dl>
                        <dt><a href="">东京</a></dt>
                        <dt><a href=""> 横滨  </a></dt>
                        <dt><a href="">大阪   </a></dt>
                        <dt><a href="">神户   </a></dt>
                        <dt><a href="">名古屋 </a></dt>
                        <dt><a href="">清水</a></dt>
                        <dt><a href="">基隆</a></dt>
                        <dt><a href="">台中</a></dt>
                        <dt><a href="">高雄  </a></dt>
                        <dt><a href="">林查班</a></dt>
                        <dt><a href="">曼谷</a></dt>
                        <dt><a href="">胡志明</a></dt>
                    </dl>
                </li>
                <li>
                    <span class="Condition">ETD：</span>
                    <a href="" class="all">全部</a>
                    <dl>
                        <dt><a href="">9:00</a></dt>
                        <dt><a href=""> 10:00</a></dt>
                        <dt><a href=""> 12：00</a></dt>
                        <dt><a href="">16:00</a></dt>
                        <dt><a href="">19:00</a></dt>
                        <dt><a href="">21:00</a></dt>
                    </dl>
                </li>
            </ul>
        </div>
        <!--筛选-->
        <div class="clear"></div>
        <section class="route">
            <div class="name">搜索结果</div>
            <div class="clear"></div>
            <div class="table1">
                <ul>
                    <li class="li1">班期</li>
                    <li class="li2">起始地点</li>
                    <li class="li3">到达地点</li>
                    <li class="li4">出发时间</li>
                    <li class="li5">航程</li>
                    <li class="li6">运价</li>
                    <li class="li7">操作</li>
                </ul>
            </div>
            <div class="table2">
                <table cellpadding="0" cellspacing="0">
                    <#list flights as flight>
                        <tr>
                            <td class="td1">${flight.fschedule}</td>
                            <td class="td2">${flight.forigin}</td>
                            <td class="td3">${flight.farrival}</td>
                            <td class="td4">${flight.fstime?date}</td>
                            <td class="td5">${flight.fvoyage}天</td>
                            <td class="td6">${flight.fprice}</td>
                            <td class="td7"><a href="">快速下单</a></td>
                        </tr>
                    </#list>

                </table>
            </div>
        </section>
    </section>
    <script type="text/javascript">
        $(".table2 tr:odd").addClass("odd");
    </script>
    <!--航线产品-->

</section>
<div class="clear"></div>
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