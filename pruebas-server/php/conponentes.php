<?php

    require_once("crud.php");

    function crearMenu(){

        echo '  <img  id="cerrar_menu" src="img/ico/close.png" title="Cerrar Menu" alt="Cerrar">

                <h1><a href="index.html" title="Volver"><img src="img/logos/logo_fiandeira.png" title="Logo Fiandeira" alt="Fiandeira"></a></h1>

                <ul>
                    <li><a href="index.php" title="Páxina Principal da Web">Páxina Principal</a></li>
                    <li><a href="sobre_nos.php" title="Páxina Sobre Nós">Sobre Nós</a></li>
                    <li><a href="contacto.php" title="Páxina Contáctanos">Contáctanos</a></li>
                    <li><a href="catalogo.php" title="Catálogo da nosa Web">Catálogo</a></li>
                </ul>';

    }

    function crearMenuCatalogo(){

        $resultado = selectPreparado("categorias", "cod IN (SELECT DISTINCT codCategoria FROM productos WHERE stock != 0 and img1 IS NOT NULL) ORDER BY categorias.cod ASC");
        $crearmenu = "";
        foreach ($resultado as $row){

            $varDirWeb = str_replace(" ", "_", $row["nombre"]);

            $crearmenu .= '<li><a href="catalogo.php?categoria='.$varDirWeb.'" title="Categoria de '.$row["nombre"].'">'.$row["nombre"].'</a></li>';

        }

        echo '  <img  id="cerrar_menu" src="img/ico/close.png" title="Cerrar Menu" alt="Cerrar">

                <h1><a href="index.html" title="Volver"><img src="img/logos/logo_fiandeira.png" title="Logo Fiandeira" alt="Fiandeira"></a></h1>

                <ul>
                    <li><a href="index.php" title="Páxina Principal da Web">Páxina Principal</a></li>
                    <li><a href="sobre_nos.php" title="Páxina Sobre Nós">Sobre Nós</a></li>
                    <li><a href="contacto.php" title="Páxina Contáctanos">Contáctanos</a></li>
                    <li class="submenu"><p>Catálogo<span class="icon-down-open"></span></p>
                        <ul>
                            <li><a href="catalogo.php?categoria=principal" title="Categoria Principal">Principal</a></li>';
        echo $crearmenu;

        echo '          </ul>
                    </li>
                </ul>';

    }

    function buscador($cadena, $pagina){

        require_once("crud.php");

        $cadena = str_replace("+", " ", $cadena);

        $num_por_pagina = 12;
        $pagina = (int) $pagina;

        $conn = abrirConexion();

        $error = true;

        try{
            $resultado = selectPreparado("productos", "img1 is not null and stock != 0 and nombre LIKE '%".$cadena."%'");
        }
        catch(PDOException $e){
            $error = false;
        }

        if($error === true){

            $mostrar = "";
            $cont = -1;
            $cont2 = 0;
            //Comprobacion por pax
            $comprobacion1 = (int)(($num_por_pagina*$pagina)-$num_por_pagina);
            $comprobacion2 = (int)($num_por_pagina*$pagina);

        	foreach ($resultado as $row){
                $cont++;
                if( $comprobacion1 <= $cont && $comprobacion2 > $cont){

                    $cont2++;

                    $mostrar .= '<div class="productos">';
                        if($row["img2"] != null){
                            $mostrar .= '<img class="primeira_foto desaparece" src="img/catalogo/'.$row["img2"].'" alt="'.$row["nombre"].'"  title="'.$row["nombre"].'">';
                        }
                        $mostrar .= '<img class="segunda_foto" src="img/catalogo/'.$row["img1"].'" alt="'.$row["nombre"].'" title="'.$row["nombre"].'">';

                    $mostrar .= '<div class="texto">
                        <h1>'. $row["nombre"] .'</h1>
                        <p>Prezo: '. str_replace(".", ",", (round($row["precioSin"]*1.21, 2))) .' €</p>
                        </div>
                        </div>';

                }

            }

        }

        if($error == false){
            echo '<div id="nonProductos">
                    <h1 class="primeiroError">UPS!<h1>
                    <h1>Non podemos encontrar ningun producto!</h1>
                    <h2>Probe a recargar a Páxina</h2>
                </div>';
        }
        else if($cont2 == 0){
            echo '<div id="nonProductos">
                    <h1 class="primeiroError">UPS!<h1>
                    <h1>Non podemos encontrar Productos co termo buscado!</h1>
                </div>';
        }
        else{
            echo $mostrar;
        }


    }

    function crearPaginador($seccion, $pagina){

        require_once("crud.php");

        $seccion = str_replace("_", " ", $seccion);

        $num_por_pagina = 12;
        $pagina = (int) $pagina;
        $conn = abrirConexion();

        $error = true;

        if($seccion === "principal"){
            try{
                $resultado = selectPreparadoEspecial("productos","COUNT(cod)nombre", "img1 is not null and stock != 0");
            }
            catch(PDOException $e){
                $error = false;
            }
        }
        else{
            try{

                $resultado1 = selectPreparado("categorias", "nombre = '".$seccion."'");
                $numCat = -1;
                $error = false;
                foreach($resultado1 as $row){
                    $numCat = $row["cod"];
                    $error = true;
                }

                $resultado = selectPreparadoEspecial("productos","COUNT(cod)nombre", "codCategoria = ".$numCat." and img1 is not null and stock != 0");

            }
            catch(PDOException $e){
                $error = false;
            }
        }

        if($error === true){

            $mostrar = "";
            $cont = 0;

        	foreach ($resultado as $row){

                $numPax = ($row["nombre"])/$num_por_pagina;
                if($numPax > round(($row["nombre"])/$num_por_pagina)){
                    $numPax = (round(($row["nombre"])/$num_por_pagina))+1;
                }
                else{
                    $numPax = (round(($row["nombre"])/$num_por_pagina));
                }

            }

            if(($pagina-1) == 0){
                $mostrar = '<a href="#" title="Anterior"><span class="icon-angle-circled-left"></span></a>';
            }
            else{
                $mostrar = '<a href="catalogo.php?categoria='.str_replace(" ", "_", $seccion).'&pagina='.($pagina-1).'" title="Anterior"><span class="icon-angle-circled-left"></span></a>';
            }

            for($i = 1; $i <= $numPax; $i++){

                if($i == $pagina){
                    $mostrar .= '<a class="seleccionado" href="catalogo.php?categoria='.str_replace(" ", "_", $seccion).'&pagina='.$i.'" title="Página '.$i.'">'.$i.'</a>';
                }
                else{
                    $mostrar .= '<a href="catalogo.php?categoria='.str_replace(" ", "_", $seccion).'&pagina='.$i.'" title="Página '.$i.'">'.$i.'</a>';
                }

            }

            if(($pagina+1) > $numPax){
                $mostrar .= '<a href="#" title="Siguiente"><span class="icon-angle-circled-right"></span></a>';
            }
            else{
                $mostrar .= '<a href="catalogo.php?categoria='.str_replace(" ", "_", $seccion).'&pagina='.($pagina+1).'" title="Siguiente"><span class="icon-angle-circled-right"></span></a>';
            }

        }


        if($error == false || $numPax == 0){
            echo '  <a href="#" title="Anterior"><span class="icon-angle-circled-left"></span></a>
                    <a class="seleccionado" href="#" title="Página 1">1</a>
                    <a href="#" title="Siguiente"><span class="icon-angle-circled-right"></span></a>';
        }
        else{
            echo $mostrar;
        }

        cerrarConexion($conn);
    }

    function crearPaginadorEspecial($cadena, $pagina){

        require_once("crud.php");

        $seccion = str_replace("+", " ", $cadena);

        $num_por_pagina = 12;
        $pagina = (int) $pagina;
        $conn = abrirConexion();

        $error = true;

        try{
            $resultado = selectPreparadoEspecial("productos","COUNT(cod)nombre", "img1 is not null and stock != 0 and nombre LIKE '%".$cadena."%'");
        }
        catch(PDOException $e){
            $error = false;
        }

        if($error === true){

            $mostrar = "";
            $cont = 0;

        	foreach ($resultado as $row){

                $cont = (int)$row["nombre"];

                $numPax = ($row["nombre"])/$num_por_pagina;
                if($numPax > round(($row["nombre"])/$num_por_pagina)){
                    $numPax = (round(($row["nombre"])/$num_por_pagina))+1;
                }
                else{
                    $numPax = (round(($row["nombre"])/$num_por_pagina));
                }

            }

            if(($pagina-1) == 0){
                $mostrar = '<a href="#" title="Anterior"><span class="icon-angle-circled-left"></span></a>';
            }
            else{
                $mostrar = '<a href="catalogo.php?buscar='.str_replace(" ", "+", $cadena).'&pagina='.($pagina-1).'" title="Anterior"><span class="icon-angle-circled-left"></span></a>';
            }

            for($i = 1; $i <= $numPax; $i++){

                if($i == $pagina){
                    $mostrar .= '<a class="seleccionado" href="catalogo.php?buscar='.str_replace(" ", "+", $cadena).'&pagina='.$i.'" title="Página '.$i.'">'.$i.'</a>';
                }
                else{
                    $mostrar .= '<a href="catalogo.php?buscar='.str_replace(" ", "+", $cadena).'&pagina='.$i.'" title="Página '.$i.'">'.$i.'</a>';
                }

            }

            if(($pagina+1) > $numPax){
                $mostrar .= '<a href="#" title="Siguiente"><span class="icon-angle-circled-right"></span></a>';
            }
            else{
                $mostrar .= '<a href="catalogo.php?buscar='.str_replace(" ", "+", $cadena).'&pagina='.($pagina+1).'" title="Siguiente"><span class="icon-angle-circled-right"></span></a>';
            }

        }


        if($error == false || $cont === 0){
            echo '  <a href="#" title="Anterior"><span class="icon-angle-circled-left"></span></a>
                    <a class="seleccionado" href="#" title="Página 1">1</a>
                    <a href="#" title="Siguiente"><span class="icon-angle-circled-right"></span></a>';
        }
        else{
            echo $mostrar;
        }

        cerrarConexion($conn);
    }

    function productosCatalogo($seccion, $pagina){

        require_once("crud.php");

        $seccion = str_replace("_", " ", $seccion);

        $num_por_pagina = 12;
        $pagina = (int) $pagina;

        $conn = abrirConexion();

        $error = true;

        if($seccion === "principal"){
            try{
                $resultado = selectPreparado("productos", "img1 is not null and stock != 0");
            }
            catch(PDOException $e){
                $error = false;
            }
        }
        else{
            try{
                $resultado1 = selectPreparado("categorias", "nombre = '".$seccion."'");
                $numCat = -1;
                $error = false;
                foreach($resultado1 as $row){
                    $numCat = $row["cod"];
                    $error = true;
                }

                $resultado = selectPreparado("productos", "codCategoria = ".$numCat." and img1 is not null and stock != 0");
            }
            catch(PDOException $e){
                $error = false;
            }
        }

        if($error === true){

            $mostrar = "";
            $cont = 0;
            $cont2 = 0;
            //Comprobacion por pax
            $comprobacion1 = (int)(($num_por_pagina*$pagina)-$num_por_pagina);
            $comprobacion2 = (int)($num_por_pagina*$pagina);

        	foreach ($resultado as $row){

                if( $comprobacion1 <= $cont && $comprobacion2 > $cont){

                    $cont2++;

                    $mostrar .= '<div class="productos">';
                        if($row["img2"] != null){
                            $mostrar .= '<img class="primeira_foto desaparece" src="img/catalogo/'.$row["img2"].'" alt="'.$row["nombre"].'"  title="'.$row["nombre"].'">';
                        }
                        $mostrar .= '<img class="segunda_foto" src="img/catalogo/'.$row["img1"].'" alt="'.$row["nombre"].'" title="'.$row["nombre"].'">';

                    $mostrar .= '<div class="texto">
                        <h1>'. $row["nombre"] .'</h1>
                        <p>Prezo: '. str_replace(".", ",", (round($row["precioSin"]*1.21, 2))) .' €</p>
                        </div>
                        </div>';
                }
                $cont++;

            }

        }

        if($error == false){
            echo '<div id="nonProductos">
                    <h1 class="primeiroError">UPS!<h1>
                    <h1>Esta categoria non existe!</h1>
                    <h2>Probe a recargar a Páxina</h2>
                </div>';
        }
        else if($cont2 == 0){
            echo '<div id="nonProductos">
                    <h1 class="primeiroError">UPS!<h1>
                    <h1>Esta página non conten produtos!</h1>
                </div>';
        }
        else if($cont == 0){
            echo '<div id="nonProductos"><h1>Nestes intres non dispoñemos destes produtos!</h1></div>';
        }
        else{
            echo $mostrar;
        }

        cerrarConexion($conn);
    }

    function menuNovidades($nombre){

        require_once("crud.php");

        $num_por_pagina = 12;
        $error = true;

        if($nombre == "novidades"){

            try{
                $resultado = selectPreparado("productos", "img1 is not null and stock != 0 ORDER BY productos.fecha  DESC");
            }
            catch(PDOException $e){
                $error = false;
            }

            $cont = 0;
            $mostrar = "";
            foreach ($resultado as $row){
                $cont++;
                if($cont <= $num_por_pagina){

                    $mostrar .= '<div class="productos">';
                        if($row["img2"] != null){
                            $mostrar .= '<img class="primeira_foto desaparece" src="img/catalogo/'.$row["img2"].'" alt="'.$row["nombre"].'"  title="'.$row["nombre"].'">';
                        }
                        $mostrar .= '<img class="segunda_foto" src="img/catalogo/'.$row["img1"].'" alt="'.$row["nombre"].'" title="'.$row["nombre"].'">';
                    $mostrar .= '<div class="texto">
                        <h1>'. $row["nombre"] .'</h1>
                        <p>Prezo: '. str_replace(".", ",", (round($row["precioSin"]*1.21, 2))) .' €</p>
                        </div>
                        </div>';

                }
            }

            if($cont == 0){
                echo '<div id="nonProductos">
                        <h1 class="primeiroError">UPS!<h1>
                        <h1>Esta página non conten produtos!</h1>
                    </div>';
            }
            else{
                echo $mostrar;
            }

        }
        else if($nombre == "populares" || $nombre == "mais_vendidos"){

            try{
                $resultado = selectPreparado("productos", "img1 is not null and stock != 0 ORDER BY RAND() LIMIT 0, ".$num_por_pagina);
            }
            catch(PDOException $e){
                $error = false;
            }

            $cont = 0;
            $mostrar = "";
            foreach ($resultado as $row){
                $cont++;
                if($cont <= $num_por_pagina){

                    $mostrar .= '<div class="productos">';
                        if($row["img2"] != null){
                            $mostrar .= '<img class="primeira_foto desaparece" src="img/catalogo/'.$row["img2"].'" alt="'.$row["nombre"].'"  title="'.$row["nombre"].'">';
                        }
                        $mostrar .= '<img class="segunda_foto" src="img/catalogo/'.$row["img1"].'" alt="'.$row["nombre"].'" title="'.$row["nombre"].'">';
                    $mostrar .= '<div class="texto">
                        <h1>'. $row["nombre"] .'</h1>
                        <p>Prezo: '. str_replace(".", ",", (round($row["precioSin"]*1.21, 2))) .' €</p>
                        </div>
                        </div>';

                }
            }

            if($cont == 0){
                echo '<div id="nonProductos">
                        <h1 class="primeiroError">UPS!<h1>
                        <h1>Esta página non conten produtos!</h1>
                    </div>';
            }
            else{
                echo $mostrar;
            }

        }
        else{
            echo '<div id="nonProductos">
                    <h1 class="primeiroError">UPS!<h1>
                    <h1>Esta categoria non existe!</h1>
                    <h2>Probe a recargar a Páxina</h2>
                </div>';
        }

    }

    function crearFooter(){

        echo '<address id="informacion">

                <p class="negrita">FIANDEIRA</p>
                <p>Calvo Sotelo Nº29 Baixo</p>
                <p>36880 A Estrada</p>
                <p class="negrita">De Luns a Venres:</p>
                <p>Mañás de 10:30 a 13:30</p>
                <p>Tardes de 17:00 a 20:30</p>
                <p class="negrita">Sábados:</p>
                <p>Mañás de 10:30 a 14:00</p>
                <br>
                <span><img src="img/ico/001-phone-call.png" alt="Telefono" title="Icono Telefono"><a href="tel:986573571" title="Número de Telefono">986573571</a></span><br/>
                <span><img src="img/ico/gmail.png" alt="Gmail" title="Icono Gmail"><a class="email" href="mailto:fiandeira.aestrada@gmail.com" title="Correo Fiandeira">fiandeira.aestrada@gmail.com</a></span><br>
                <span><a class="facebook" href="https://www.facebook.com/fiandeira.aestrada" title="Fiandeira en Facebook" target="_blank"><img src="img/ico/facebook.png" alt="Facebook"></a></span>
                <span><a class="instagram" href="#" title="Fiandeira en Instagram" target="_blank"><img src="img/ico/instagram.png" alt="Instagram"></a></span>
                <span><a class="google" href="https://plus.google.com/101238279539845660240" title="Fiandeira en Google" target="_blank"><img src="img/ico/google.png" alt="Google"></a></span>

            </address>

            <div id="estamos">

                <h2>ONDE ATOPARNOS</h2>

                <nav>

                    <iframe title="Mapa FIANDEIRA" src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2932.651096567478!2d-8.490637384288991!3d42.689932522197545!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0xd2f081ea222084d%3A0xf1bd3b9552ac5d0f!2sFIANDEIRA!5e0!3m2!1sgl!2ses!4v1517560617683" style="border:0" allowfullscreen></iframe>

                </nav>

            </div>

            <div id="newsletter">

                <h2>SUBSCRÍBETE AO NOSO BOLETÍN INFORMATIVO</h2>

                <form method="POST">

                    <label for="email">Dirección de correo electrónico:</label><br>
                    <input type="text" name="email" id="email" placeholder="Introduce o teu correo electrónico"><br>

                    <span id="erroresnewsletter"></span>

                    <input type="button" name="enviar" id="enviarNewsletter" value="Enviar"/>

                </form>

            </div>

            <span id="copy">
                <img src="img/ico/copyright.png" alt="Copyright"><a href="http://pruebas.fiandeira.es">FIANDEIRA 2011 - '.date("Y").'</a><br />
                <img src="img/ico/idea.png" alt="Idea"><a>Deseñado por ManuReyesI</a>
            </span>';

    }

?>
