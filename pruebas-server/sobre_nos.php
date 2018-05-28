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
		<title>Fiandeira - Sobre Nos</title>

		<!-- Icon -->
		<link rel="icon" type="image/png" href="img/favicon/favicon.png">

		<!-- CSS -->
		<link rel="stylesheet" type="text/css" href="css/sobre_style.css">
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

				<section class="testo_descripcion">

					<img src="img/logos/fiandeira_puntilla.png" id="foto_sobrenos" title="Foto Tenda" alt="Foto Tenda">

					<p>FIANDEIRA é unha iniciativa familiar que nace no ano 2014.</p>
					<p>Comezamos impartindo cursos formativos entre os que incluímos dende o Patchwork ata a patronaxe.</p>
					<p>Cada unha das nosas creacións ven acompañada de todo o noso cariño e dedicación, sempre mantendo presente a nosa orixe e motivación principal, a unión de dúas paixóns: a moda e a tradición galega.</p>

				</section>

				<hr/>

				<h1>As Nosas Marcas</h1>

				<section class="marcas">

					<div class="marcas">

						<a href="http://www.fildor.com/" title="Web Fildor" target="_blank"><img src="img/marcas/fildor.png" title="Fildor" alt="Marca Fildor"></a>

						<h2>Fildor</h2>

					</div>

					<div class="marcas">

						<a href="https://josbeltex.es/" title="Web Josbeltex" target="_blank"><img src="img/marcas/josbeltex.png" title="Josbeltex" alt="Marca Josbeltex"></a>

						<h2>Josbeltex</h2>

					</div>

					<div class="marcas">

						<a href="http://www.patchfildor.com/es/" title="Web PatchFildor" target="_blank"><img src="img/marcas/patchFildor.png" title="patch Fildor" alt="Marca Patch Fildor"></a>

						<h2>Patch Fildor</h2>

					</div>

					<div class="marcas">

						<a href="https://www.dmc.com/es/" title="Web DMC" target="_blank"><img src="img/marcas/dmc.png"  title="DMC" alt="Marca DMC"></a>

						<h2>DMC</h2>

					</div>

				</section>

				<hr/>

				<h1>A Nosa Historia:</h1>

				<section id="audio-video">

					<div class="audio">
						<h2>A canción que marcou o noso comezo:</h2>
						<audio controls preload="auto" title="Cancion do poema No niño novo do vento">
							<source src="source/Quen_puidera_namorala.ogg" type="audio/ogg">
							<source src="source/Quen_puidera_namorala.mp3" type="audio/mpeg">
							O teu navegador non soporta Audio.
						</audio>
					</div>

					<div class="video">
						<h2>Lucindo os nosos traxes:</h2>
						<video controls preload="auto" title="Video o Son do Sabugueiro" poster="img/poster/poster_video.png">
							<source src="source/O_son_do_sabugueiro.mp4" type="audio/mpeg">
							<source src="source/O_son_do_sabugueiro.ogv" type="audio/ogv">
							O teu navegador non soporta Video.
						</video>
					</div>

				</section>

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
