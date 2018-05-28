<?php

    require_once("crud.php");

    $email = $_POST["email"];
    $enviar = $_POST["enviar"];

    if($enviar = "enviar"){

        if(insertPreparado("newsleter", "mail", "'".$email."'") == true){
            echo "Subscribeuse correctamente a nosa newsletter.";
        }
        else{
            echo "Error ao enviar.";
        }

    }

?>
