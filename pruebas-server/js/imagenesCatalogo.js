$(document).ready(function() {
    $('.desaparece').hover(function(){
        $(this).animate({opacity:0});
    },function(){
        $(this).animate({opacity:1});
    });
});
