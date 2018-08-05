/**
 * Created by luqingying on 2018/4/14.
 */
$(document).ready(function () {
    var n = 0;
    $(".interests").click(function () {
            if($(this).hasClass("btn-primary")){
                $(this).removeClass("btn-primary").val('0');
                $(this).children(".level").css({"color":''});
                n--;
                if(n<=10)
                {
                  $(".error_choose").hide();
                }
            }
            else{
                var level1 = $(this).children(".level-1");
                level1.css({"color":"#FFD700"});
                if(n<10){
                    $(this).addClass("btn-primary");
                    n++;
                  $(".error_choose").hide();
                }
                else{
                    $(".error_choose").show();
                }
            }
            var a=n<10?"0"+n:n;
            $("#interests-num").html(a);
    });

    $(".level").click(function () {
        $(this).css({"color":"#FFD700"});
        $(this).prevAll(".level").css({"color":"#FFD700"});
        $(this).nextAll(".level").css({"color":"#fff"});
    })
    $(".level-1").click(function () {
        $(this).parent().val('1');
    })
});/*
存在一个bug十个以上仍然可以评星*/