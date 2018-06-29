/**
 * Created by luqingying on 2018/4/8.
 */
$(document).ready(function(){


  //床位选择后，确认点击事件
  $("#select-bed").click(function(){
    var roommessage = $("#room-num-red-next").text();
    if(roommessage == "还未选床位"){
      alert("您还未选床位");
    }
    else{
      $("#choosebed").removeClass("active").addClass("success").find("span").html("<img src='img/greenclick.png'>");
      $("#confirm").addClass("active");
      $(".choose_bed").hide();
      $(".choose_confirm").show();
    }
  });

  //信息确认页面确认按钮点击
  $(".affirm_news>button").click(function () {
    $("#confirm").removeClass("active").addClass("success").find("span").html("<img src='img/greenclick.png'>");
    $(".choose_confirm").hide();
    $(".jump-to-my").show();
    var timer=setInterval( function(){
    	location.href="mydo.html"
    },1000)
  });
});
