/**
 * Created by luqingying on 2018/8/8.
 */
$(document).ready(function () {

/*    $(".level").click(function () {
        $(this).css({"color":"#FFD700"});
        $(this).prevAll(".level").css({"color":"#FFD700"});
        $(this).nextAll(".level").css({"color":"#fff"});

    });*/
    $(".level-1").click(function () {
        $(this).parent().val("1");
        alert("1"+""+$(this).parent().val());
    });
    $(".level-2").click(function () {
        $(this).parent().val("2");
        alert("2"+""+$(this).parent().val());
    });
    $(".level-3").click(function () {
        $(this).parent().val("3");
        alert("3"+""+$(this).parent().val());
    });


    var n = 0;
    $(".level").click(function () {
        $(this).css({"color":"#FFD700"});
        $(this).prevAll(".level").css({"color":"#FFD700"});
        $(this).nextAll(".level").css({"color":"#fff"});
        if($(this).hasClass("btn-primary")){
            $(this).removeClass("btn-primary");
            $(this).val("0");
            $(this).children(".level").css({"color":''});
            n--;
            if(n<=12)
            {
                $(".error_choose").hide();
            }
        }
        else{
            var level1 = $(this).children(".level-1");
            if($(this).val( )==='0')
            {
                $(this).val("0");
            }
            /*$(".level-1").click(function () {
                $(this).parent().val("1");
                alert("1"+""+$(this).parent().val());
            });
            $(".level-2").click(function () {
                $(this).parent().val("2");
                alert("2"+""+$(this).parent().val());
            });
            $(".level-3").click(function () {
                $(this).parent().val("3");
                alert("3"+""+$(this).parent().val());
            });*/
            level1.css({"color":"#FFD700"});
            if(n<12){
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




    $("#submit").click(function () {
        var interestString = new Array(12);
        for (var i=0;i<12;i++)
        {
           /* interestString[i] = $(".level").eq(i).parent().val();
            alert(interestString[i]);*/
           alert($(".intersts-name").eq(i).html() +"是"+$(".interests").eq(i).val()+"星" )
        }
       /* alert(interestString.join(''));*/
    })
});