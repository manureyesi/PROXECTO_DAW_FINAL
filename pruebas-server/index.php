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
		<title>Fiandeira</title>

		<!-- Icon -->
		<link rel="icon" type="image/png" href="img/favicon/favicon.png">

		<!-- CSS -->
		<link rel="stylesheet" type="text/css" href="css/index_style.css">
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

				<div id="slider">

					<div id="info_tenda">

						<h2>REBAIXAS</h2>
						<p>Descontos na nosa tenda física</p>
						<span><a href="catalogo.php" title="Ir a Catalogo">Ver Catálogo</a></span>

					</div>

				</div>

				<h1 class="feito">Feito por Nós</h1>

				<div id="muestra">

					<div class="flex">

						<div class="ejemplos">

							<img src="img/ejemplos/body_1.png" alt="Body" title="Body Animais">

							<div class="texto">
									<h1>Body Animais</h1>
							</div>

						</div>

						<div class="ejemplos">

							<img src="img/ejemplos/diadema_1.png" alt="Diadema Flores" title="Diadema Flores">

							<div class="texto">
									<h1>Diadema Fantasía</h1>
							</div>

						</div>

						<div class="ejemplos">

							<img src="img/ejemplos/patchwork_1.png" alt="Coxín PatchWork" title="Coxín PatchWork">

							<div class="texto">
									<h1>Coxín PatchWork</h1>
							</div>

						</div>

						<div class="ejemplos">

							<img src="img/ejemplos/baile_3.png" alt="Traxe Tradicional" title="Traxe Tradicional">

							<div class="texto">
									<h1>Traxe Tradicional</h1>
							</div>

						</div>

					</div>

					<div class="flex">

						<div class="ejemplos">

							<img src="img/ejemplos/baile_1.png" alt="Ejemplo prenda 4" title="Pano de flores">

							<div class="texto">
									<h1>Pano de flores</h1>
							</div>

						</div>

						<div class="ejemplos">

							<img src="img/ejemplos/baile_2.png" alt="Ejemplo prenda 5" title="Tella Gaiteiro">

							<div class="texto">
									<h1>Tella Gaiteiro</h1>
							</div>

						</div>

					</div>

					<div class="flex">

						<div class="ejemplos">

							<img src="img/ejemplos/diadema_2.png" alt="Diadema Noiva" title="Diadema Noiva">

							<div class="texto">
									<h1>Diadema Noiva</h1>
							</div>

						</div>

						<div class="ejemplos">

							<img src="img/ejemplos/patchwork_2.png" alt="Coxín PatchWork" title="Coxín PatchWork">

							<div class="texto">
									<h1>Coxín PatchWork</h1>
							</div>

						</div>

						<div class="ejemplos">

							<img src="img/ejemplos/body_2.png" alt="Body o Xefe" title="Body o Xefe">

							<div class="texto">
									<h1>Body o Xefe</h1>
							</div>

						</div>

					</div>

				</div>


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
