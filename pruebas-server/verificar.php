<!DOCTYPE html>
<html lang="es">

	<head>

	 	<!-- Meta -->
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
		<meta name="Distribution" content="global">
		<meta name="Keywords" content="fiandeira, a estrada, fiandeira a estrada, tenda, merceria, venta, merceria a estrada">
		<meta name="Author" content="mri, manureyesi">
		<meta name="Robots" content="index">

		<!-- Title -->
		<title>VTenda - Verificar Email</title>

		<!-- Icon -->
		<link rel="icon" type="image/png" href="img/favicon/favicon.png">

		<!-- CSS -->
		<link rel="stylesheet" type="text/css" href="css/verificar_style.css">
		<link rel="stylesheet" type="text/css" href="css/fontello.css">
		<link rel="stylesheet" type="text/css" href="css/menu_style.css">
		<link rel="stylesheet" type="text/css" href="css/footer_style.css">

		<!-- JS -->
		<script src="js/jquery-3.3.1.min.js"></script>
		<script src="js/menu.js"></script>
		<script src="js/envioFormulario.js"></script>


	</head>
	<body>

		<div id="contenedor">

			<header>

				<div id="menu">

					<a href="#main" title="Página Principal"><img src="img/logos/logo_fiandeira.png" class="logo"  title="Logo Fiandeira" alt="Fiandeira"></a>

					<span class="icon-menu" id="bars_menu"></span>

				</div>

			</header>
			<main id="main">

                <?php

                    require_once("php/crud.php");

                    $mail = $_GET["mail"];
                    $cod = (int) $_GET["cod"];
                    $user = $_GET["user"];
                    $nombre = "";

                    $error = true;
                    $verificado = true;

                    if($mail == ""||$cod == ""||$user == ""){
                        $error = false;
                    }
                    else {

                        try{
                            $resultado = selectPreparado("usuarios","cod = ".$cod." and usuario = '".$user."'");
                        }
                        catch(PDOException $e){
                            $error = false;
                        }

                        foreach ($resultado as $row) {

                            if($row["mail"] == $mail && $row["verificado"] == 0 ){

                                $verificado = false;

                                $nombre = $row["nombre"];

                                $error = updatePreparado("usuarios", "verificado = 1", "cod = ".$row["cod"]);
                            }

                        }


                    }

                    if($error == false){

                        echo '<div id="mensaxe">
                                <h1>VTENDA</h1>
                                <br>
                                <h1 class="primeiroError">UPS!<h1>
                                <h1>Non podemos verificar o seu correo!</h1>
                                <h2>Probe a recargar a Páxina</h2>
                            </div>';

                    }
                    else if($verificado == true){

                        echo '<div id="mensaxe">
                                <h1>VTENDA</h1>
                                <br>
                                <h1>O CORREO XA SE ENCONTRA VERIFICADO!<h1>
                            </div>';

                    }
                    else{

                        echo '<div id="mensaxe">
                                <h1>VTENDA</h1>
                                <br>
                                <h1>CORREO VERIFICADO CON EXITO!</h1>
                                <h2>Grazas <span class="user">'.$nombre.'</span> por rexistrarse en VTenda - Fiandeira</h2>
                            </div>';

                    }

                ?>


            </main>

            <footer>

                <?php

                    require_once("php/conponentes.php");

                    crearFooter();

                ?>

            </footer>

        </div>

        <div id="menu_oculto">

            <?php

                require_once("php/conponentes.php");

                crearMenu();

            ?>

        </div>

    </body>
</html>
