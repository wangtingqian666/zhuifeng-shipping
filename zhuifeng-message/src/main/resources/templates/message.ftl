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
        var navID = "4";
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
    <section class="Solution">
        <div class="title">
            <p>锦江航运依靠完善的物流体系，为客户提供国际集装箱运输、国际货运代理、船舶代理、集装箱堆场、保税仓储等全方位的物流综合服务，根据客户特殊要求独身定做专业物流解决方案。欢迎您随时垂询获取属于您的专享物流服务。</p>
        </div>
        <form action="savemessage" method="post">
            <div class="message">
            <div class="tit1">我要留言</div>
            <div class="tit2"><span>*</span>号内容为必填</div>
            <table cellpadding="0" cellspacing="0" border="0">
                <tr>
                    <td class="left"><span>*</span>留言人：</td>
                    <td><input type="text" class="text" name="mname" /></td>
                    <td class="left"><span></span>标题：</td>
                    <td><input type="text" class="text text2" name="mtitle" /><em>25个字以内</em></td>
                </tr>
                <tr>
                    <td class="left"><span>*</span>问题类型：</td>
                    <td>
                        <input type="radio" value="1" class="radio" name="mtype" checked /><label>咨询 </label>
                        <input type="radio" value="2" class="radio" name="mtype" /><label>建议 </label>
                        <input type="radio" value="3" class="radio" name="mtype" /><label>投诉 </label>
                    </td>
                </tr>
                <tr>
                    <td class="left"><span>*</span>内容：</td>
                    <td colspan="3"><textarea class="text text3" name="mbody"></textarea></td>
                </tr>
                <tr>
                    <td class="left"><span>*</span>电话号码：</td>
                    <td colspan="3"><input type="text" class="text" name="mphone" /><em>请务必填写，我们可能会电话与您联系</em></td>
                </tr>
                <tr>
                    <td class="left"><span></span>电子邮件：</td>
                    <td><input type="text" class="text" name="memail" /></td>
                </tr>
                <tr>
                    <td colspan="4"><input type="submit" class="btn btn2" value="查 询" /><input type="button" class="btn reset-btn" value="重 置" /></td>
                </tr>
            </table>
        </div>
        </form>
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