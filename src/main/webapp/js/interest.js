/**
 * Created by luqingying on 2018/8/8.
 */

var stuId;
$(document).ready(function () {
    //主页验证，是否登录过，安全保障
    $.ajax({
        url: "/student/userInfo",
        type: "GET",
        success: function (result) {
            if (result.code == 0) {
                //未登录过，跳转到登录界面
                location.href = "index.html";
            } else {
                //成功登录
                //保存Id
                stuId=result.extend.student.stuId;
            }
        }
    });
});

$(".level-1").click(function () {
    $(this).parent().val("1");
});
$(".level-2").click(function () {
    $(this).parent().val("2");
});
$(".level-3").click(function () {
    $(this).parent().val("3");
});

var n = 0;
$(".level").click(function () {
    if ($(this).parent().hasClass("btn-primary")) {

        $(this).parent().removeClass("btn-primary");
        $(this).parent().val("0");
        $(this).css({"color": "#000"});
        $(this).siblings().css({"color": "#000"});
        n--;
        if (n <= 12) {
            $(".error_choose").hide();
        }
    }
    else {
        $(this).css({"color": "#FFD700"});
        $(this).prevAll(".level").css({"color": "#FFD700"});
        $(this).nextAll(".level").css({"color": "#fff"});
        var level1 = $(this).siblings(".level-1");
        level1.css({"color": "#FFD700"});
        if (n < 12) {
            $(this).parent().addClass("btn-primary");
            n++;
            $(".error_choose").hide();
        }
        else {
            $(".error_choose").show();
        }
    }
    var a = n < 10 ? "0" + n : n;
    $("#interests-num").html(a);
});


$("#submit").click(function () {
    var interestString = new Array(12);
    for (var i = 0; i < 12; i++) {
        interestString[i] = $(".interests").eq(i).val();
    }

    $.ajax({
        url:"/inter/add/"+stuId+"-"+interestString.join(''),
        type:"POST",
        success:function (result) {
            location.href="homepage.html";
        }
    });
});