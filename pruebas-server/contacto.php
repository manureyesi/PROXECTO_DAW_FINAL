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
		<title>Fiandeira - Contacto</title>

		<!-- Icon -->
		<link rel="icon" type="image/png" href="img/favicon/favicon.png">

		<!-- CSS -->
		<link rel="stylesheet" type="text/css" href="css/contacto_style.css">
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

				<div id="info">
					<h1>Horario de atención:</h1>
					<p class="negrita">De Luns a Venres:</p>
					<p>Mañás de 10:30 a 13:30</p>
					<p>Tardes de 17:00 a 20:30</p>
					<p class="negrita">Sábados:</p>
					<p>Mañás de 10:30 a 14:00</p>

					<h1><a href="tel:986573571" title="Telefono de Consulta" id="tel">Tlf: 986573571</a></h1>

				</div>


				<form action="" method="post" id="formularioContacto">

					<div id="coloca">

						<div id="coloca1">

							<label for="name">Nome (Obrigatorio):</label>
							<input type="text" name="name" id="name" placeholder="Nome">

							<label for="mail">Correo (Obrigatorio):</label>
							<input type="text" name="mail" id="mail" placeholder="Correo">

							<label for="telefono">Teléfono:</label>
							<input type="text" name="telefono" id="telefono" placeholder="Teléfono">

						</div>

						<div id="coloca2">

							<label for="pregunta">Consulta (Obrigatorio):</label>
							<textarea id="pregunta" maxlength="250" placeholder="Consulta"></textarea>

						</div>

					</div>

					<span class="errores" id="error"></span>

					<input type="button" name="enviar" id="enviar" value="Enviar">

				</form>

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
