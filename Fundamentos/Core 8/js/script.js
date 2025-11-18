document.addEventListener("DOMContentLoaded", function() {
    
    // Variables para contar los likes de cada publicación
    let count1 = 0;
    let count2 = 0;
    let count3 = 0;

    // Obtener los botones de like por su id
    var botonLike1 = document.getElementById("likeButton1");
    var botonLike2 = document.getElementById("likeButton2");
    var botonLike3 = document.getElementById("likeButton3");

    // Evento para el botón de la publicación 1
    botonLike1.addEventListener("click", function() {
        count1++; 
        var contador = document.getElementById("likeCount1");
        contador.innerText = count1; 
    });

    // Evento para el botón de la publicación 2
    botonLike2.addEventListener("click", function() {
        count2++; 
        var contador = document.getElementById("likeCount2");
        contador.innerText = count2; 
    });

    // Evento para el botón de la publicación 3
    botonLike3.addEventListener("click", function() {
        count3++; 
        var contador = document.getElementById("likeCount3");
        contador.innerText = count3; 
    });
});
