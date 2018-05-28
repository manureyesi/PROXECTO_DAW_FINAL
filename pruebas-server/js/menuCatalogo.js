window.addEventListener('load', menu, true);

function menu(){

    $(".submenu").click(function(){
        $(this).children("ul").slideToggle();
    })

    $("ul").click(function(p){
        p.stopPropagation();
    })

}
