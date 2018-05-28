window.addEventListener('load', inicio, true);

function inicio(){

    if(document.getElementById("enviar") != null){
        document.getElementById("enviar").addEventListener('click', comprobar_formulario, true);
    }

    document.getElementById("enviarNewsletter").addEventListener('click', comprobar_newsletter, true);

}

function comprobar_newsletter(){

    var email = document.getElementById("email");
    var error = document.getElementById("erroresnewsletter");

    patternMail = new RegExp(/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,4})+$/);

    error.innerHTML = "";

    if(email.value == ""){
        email.style.border = "1px solid red";
        error.innerHTML = "Para rexistarse na nosa newsletter escriba un correo.";
    }
    else if(!email.value.match(patternMail)){
        email.style.border = "1px solid red";
        error.innerHTML = "Axustese ao formato de correo.";
    }
    else{

        email.style.border = "";

        realizaProceso(email.value);

        email.value = "";

        function realizaProceso(email){
            var parametros = {
                    "email"    : email,
                    "enviar"    :  "enviar"
            };
            $.ajax({
                    data:  parametros,
                    url:   'php/newsleter.php',
                    type:  'post',
                    beforeSend: function () {
                            $("#erroresnewsletter").html("Procesando a sua solicitude...");
                    },
                    success:  function (response) {
                            $("#erroresnewsletter").html(response);
                    }
            });
        }


    }

}

function comprobar_formulario(){

    var nombre = document.getElementById("name");
    var mail = document.getElementById("mail");
    var telefono = document.getElementById("telefono");
    var pregunta = document.getElementById("pregunta");

    var errores = document.getElementsByClassName("errores")[0];

    errores.innerHTML = "";

    patternMail = new RegExp(/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,4})+$/);
    patternTell = new RegExp(/^[9|6|7][0-9]{8}$/);

    var comprobar = true;

    if(nombre.value == ""){
        comprobar = false
        nombre.style.border = "1px solid red";
    }
    else{
        nombre.style.border = "";
    }
    if(mail.value == ""){
        comprobar = false
        mail.style.border = "1px solid red";
    }
    else if(!mail.value.match(patternMail)){
        comprobar = false
        mail.style.border = "1px solid red";
    }
    else{
        mail.style.border = "";
    }
    if(pregunta.value == ""){
        comprobar = false
        pregunta.style.border = "1px solid red";
    }
    else{
        pregunta.style.border = "";
    }
    if(!telefono.value.match(patternTell) && telefono.value != ""){
        comprobar = false
        telefono.style.border = "1px solid red";
    }
    else{
        telefono.style.border = "";
    }

    if(comprobar==true){

        realizaProceso(nombre.value, mail.value, pregunta.value, telefono.value);

        nombre.value = "";
        mail.value = "";
        pregunta.value = "";
        telefono.value = "";


        function realizaProceso(nombre, mail, pregunta, telefono){
            var parametros = {
                    "nombre"    : nombre,
                    "mail"      : mail,
                    "pregunta"  : pregunta,
                    "telefono"  : telefono,
                    "enviar"    :  "enviar"
            };
            $.ajax({
                    data:  parametros,
                    url:   'php/envioMail.php',
                    type:  'post',
                    beforeSend: function () {
                            $("#error").html("Procesando a sua solicitude...");
                    },
                    success:  function (response) {
                            $("#error").html(response);
                    }
            });
        }



    }
    else{
        errores.innerHTML = "Conprobe os datos introducidos, non se axustan ao formato.";
    }
}
