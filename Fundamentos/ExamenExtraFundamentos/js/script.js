document.addEventListener("DOMContentLoaded", function () {
  // Banner de cookies y cerrar al hacer click en Aceptar
  var botonAceptar = document.getElementById("aceptar-cookies");
  botonAceptar.addEventListener("click", function () {
    var banner = document.getElementById("banner-cookies");
    banner.remove();
  });

  // Cambiar imágenes al hacer click en Reduce, Reusa, Recicla
  var imagenesAcciones = document.querySelectorAll(".item-accion img");
  imagenesAcciones.forEach(function (imagen) {
    imagen.addEventListener("click", function () {
      var rutaActual = this.src;

      //  Cambia imagenreduce.png → reduce-2.png
      if (rutaActual.includes("reduce.png")) {
        this.src = "/Fundamentos/ExamenExtraFundamentos/img/reduce-2.png";
      } else if (rutaActual.includes("reduce-2.png")) {
        this.src = "/Fundamentos/ExamenExtraFundamentos/img/reduce.png";
      }

      //  Cambia imagenreusa.png → reusa-2.png
      if (rutaActual.includes("reusa.png")) {
        this.src = "/Fundamentos/ExamenExtraFundamentos/img/reusa-2.png";
      } else if (rutaActual.includes("reusa-2.png")) {
        this.src = "/Fundamentos/ExamenExtraFundamentos/img/reusa.png";
      }

      // Cambia imagen recicla.png → recicla-2.png
      if (rutaActual.includes("recicla.png")) {
        this.src = "/Fundamentos/ExamenExtraFundamentos/img/recicla-2.png";
      } else if (rutaActual.includes("recicla-2.png")) {
        this.src = "/Fundamentos/ExamenExtraFundamentos/img/recicla.png";
      }
    });
  });
  // Mostrar mensaje al hacer click en "¿Qué puedo reciclar?"
  var enlaceReciclar = document.getElementById("enlace-reciclar");
  enlaceReciclar.addEventListener("click", function (evento) {
    evento.preventDefault(); // Evita que el enlace navegue
    alert("Puedes reciclar: papel, cartón, vidrio, plástico, textiles.");
  });
});
