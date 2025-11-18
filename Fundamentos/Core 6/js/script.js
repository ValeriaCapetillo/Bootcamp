var sesionActiva = false;
//cerrar sesion falsa
function toggleSesion() {
  var boton = document.querySelector(".btn-login");

  if (sesionActiva) {
    boton.textContent = "Iniciar Sesión";
    sesionActiva = false;
  } else {
    boton.textContent = "Cerrar Sesión";
    sesionActiva = true;
  }
}

//Borrar botón
function ocultarDefinicion() {
  var boton = document.querySelector(".btn-add");
  boton.style.display = "none";
}
//suma de likes
function like(boton) {
  var tarjeta = boton.closest(".pet-card");

  var nombreMascota = tarjeta.querySelector("h2").textContent;

  alert("el sistema dice: \n\n" + nombreMascota + " megusteado");

  var textoBoton = boton.textContent;

  var textoLimpio = textoBoton.replace("+", "").replace(" me gusta", "");

  var numeroActual = Number(textoLimpio);

  var numeroNuevo = numeroActual + 1;

  var textoNuevo = "+" + numeroNuevo + " me gusta";

  boton.textContent = textoNuevo;
}
