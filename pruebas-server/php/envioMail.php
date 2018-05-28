<?php

    require_once("crud.php");

    $name = $_POST["nombre"];
    $mail = $_POST["mail"];
    $telefono = $_POST["telefono"];
    $pregunta = $_POST["pregunta"];

    $enviar = $_POST["enviar"];

    if($enviar = "enviar"){
        
        if(insertPreparado("formularioContacto", "nombre, mail, telefono, pregunta", "'".$name."', '".$mail."', '".$telefono."', '".$pregunta."'") == true){
            echo "Enviado correctamente. En breves recibira a resposta ao seu correo.";
        }
        else{
            echo "Error ao enviar.";
        }

    }

?>
