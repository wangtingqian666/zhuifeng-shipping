﻿<!DOCTYPE html>
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
    <script type="text/javascript" src="js/register.js"></script>
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
                    <li><a href=""> 注册</a></li>
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
<section class="Contain Register">
    <div class="Current">当前位置:<a href="index.html">首页</a> <em>|</em> <span class="column">注册</span></div>
    <div class="Registerbox">
        <div class="columnname">会员注册</div>
        <div class="content">
            <form action="register" method="post" id="form">
                <table cellpadding="0" cellspacing="0" border="0">
                    <tr>
                        <td class="left"><span class="true">*</span>用户名称：</td>
                        <td><input type="text" class="text" name="uname" id="uname"><span class="num">请输入1-20个字符</span></td>

                    </tr>
                    <tr>
                        <td class="left"><span class="true">*</span>用户密码：</td>
                        <td><input type="password" class="text" name="upass" id="upass"><span class="num">请输入6-16个字符</span></td>
                    </tr>
                    <tr>
                        <td class="left"><span class="true">*</span>验证密码：</td>
                        <td><input type="password" class="text" name="repass" id="repass"></td>
                    </tr>
                    <tr>
                        <td class="left"><span class="true">*</span>电子邮箱：</td>
                        <td><input type="text" class="text" name="uemail" id="uemail"></td>
                    </tr>
                    <tr>
                        <td class="left"><span class="true"></span>姓名/公司名：</td>
                        <td><input type="text" class="text" name="ucompany" id="ucompany"></td>
                    </tr>
                    <tr>
                        <td class="left"><span class="true"></span>详细地址：</td>
                        <td><input type="text" class="text" name="uaddress" ></td>
                    </tr>
                    <tr>
                        <td class="left"><span class="true"></span>邮政编码：</td>
                        <td><input type="text" class="text" name="upostalcode" id="upostalcode"><span class="num">例：200000</span></td>
                    </tr>
                    <tr>
                        <td class="left"><span class="true"></span>固定电话：</td>
                        <td><input type="text" class="text" name="utelephone" id="utelephone"><span class="num">例：02112345678(上海电话)</span></td>
                    </tr>
                    <tr>
                        <td class="left"><span class="true"></span>手机：</td>
                        <td><input type="text" class="text" name="uphone" id="uphone"><span class="num">例：13800000000</span></td>
                    </tr>
                    <tr>
                        <td class="left"></td>
                        <td><input type="checkbox" class="checkbox" id="checkbox"	><em class="radio">我已阅读相关退款声明，并愿意遵守该声明中的有关事项</em><a href="" class="edit">查看条款</a>  </td>
                    </tr>
                    <tr>
                        <td class="left"></td>
                        <td><button class="btn" id="register" type="button">注册</button><input type="button" class="btn btn2" value="取 消"></td>
                    </tr>
                    <tr>
                        <td class="left"></td>
                        <td><span class="true">*</span><span class="must">号内容为必填</span></td>
                    </tr>
                </table>
            </form>
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