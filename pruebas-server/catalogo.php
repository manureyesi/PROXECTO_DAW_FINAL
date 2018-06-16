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
		<title>Fiandeira - Catalogo</title>

		<!-- Icon -->
		<link rel="icon" type="image/png" href="img/favicon/favicon.png">

		<!-- CSS -->
		<link rel="stylesheet" type="text/css" href="css/fontello.css">
		<link rel="stylesheet" type="text/css" href="css/catalogo_style.css">
		<link rel="stylesheet" type="text/css" href="css/footer_style.css">

		<!-- JS -->
		<script src="js/jquery-3.3.1.min.js"></script>
		<script src="js/menuCatalogo.js"></script>
		<script src="js/menu.js"></script>
		<script src="js/imagenesCatalogo.js"></script>
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

			<form class="buscador">

				<input type="text" id="buscar" name="buscar" placeholder="Buscador">
				<label for="buscar" class="icon-search" title="Buscador"></label>

				<input type="submit" name="Enviar" value="Enviar">

			</form>

			<nav class="menu_novidades">
				<ul>
					<li><a href="catalogo.php?menu=novidades">Novidades</a></li>
					<li><a href="catalogo.php?menu=populares">Populares</a></li>
					<li><a href="catalogo.php?menu=mais_vendidos">Máis Vendidos</a></li>
				</ul>
			</nav>

			<main id="main">

				<?php

					require_once("php/conponentes.php");

					if(isset($_GET["categoria"])){
						if(isset($_GET["pagina"])){
							productosCatalogo($_GET["categoria"], $_GET["pagina"]);
						}
						else{
							productosCatalogo($_GET["categoria"], 1);
						}

					}
					else if(isset($_GET["menu"])){
						menuNovidades($_GET["menu"]);
					}
					else if(isset($_GET["buscar"])){
						if(isset($_GET["pagina"])){
							buscador($_GET["buscar"], $_GET["pagina"]);
						}
						else{
							buscador($_GET["buscar"], 1);
						}
					}
					else{

						productosCatalogo("principal", 1);

					}

				?>

			</main>

			<div class="paginador">

				<?php

					require_once("php/conponentes.php");

					if(isset($_GET["categoria"])){
						if(isset($_GET["pagina"])){
							crearPaginador($_GET["categoria"], $_GET["pagina"]);
						}
						else{
							crearPaginador($_GET["categoria"], 1);
						}
					}
					else if(isset($_GET["menu"])){
						crearPaginador($_GET["menu"], 1);
					}
					else if(isset($_GET["buscar"])){
						if(isset($_GET["pagina"])){
							crearPaginadorEspecial($_GET["buscar"], $_GET["pagina"]);
						}
						else{
							crearPaginadorEspecial($_GET["buscar"], 1);
						}
					}
					else{
						crearPaginador("principal", 1);
					}

				 ?>

			</div>

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

				crearMenuCatalogo();

			?>


		</div>


	</body>
</html>
