window.addEventListener('load', inicio, true);

function inicio(){

	cambioId();
	oculta();

	document.getElementById("bars_menu").addEventListener('click', ir_menu, true);
	document.getElementById("cerrar_menu").addEventListener('click', salir_menu, true);

}

function ir_menu(){

	$(document).ready(function() {
		setTimeout(function() {
			$("#ver_menu").fadeIn(1000);
		},100);
	});

	$(document).ready(function() {
		setTimeout(function() {
			$("#contenedor").fadeOut(1000);
		},100);
	});

}

function salir_menu(){

	$(document).ready(function() {
		setTimeout(function() {
			$("#ver_menu").fadeOut(1000);
		},100);
	});

	$(document).ready(function() {
		setTimeout(function() {
			$("#contenedor").fadeIn(1000);
		},100);
	});

}


function oculta(){

	$(document).ready(function() {
		setTimeout(function() {
			$("#ver_menu").fadeOut(10);
		},1);
	});


}

function cambioId(){

	document.getElementById("menu_oculto").id = "ver_menu";

}
