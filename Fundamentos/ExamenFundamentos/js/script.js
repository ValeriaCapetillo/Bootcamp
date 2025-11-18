document.addEventListener("DOMContentLoaded", function () {
  const likeButton = document.querySelector(".like-btn");
  const likeCountSpan = document.querySelector(".like-count");

  likeButton.addEventListener("click", function () {
    let currentLikes = parseInt(likeCountSpan.textContent);
    likeCountSpan.textContent = currentLikes + 1;
  });

  const heartButton = document.getElementById("heartBtn");
  const heartCountSpan = document.getElementById("heartCount");

  heartButton.addEventListener("click", function () {
    let currentHearts = parseInt(heartCountSpan.textContent);
    heartCountSpan.textContent = currentHearts + 1;
  });

  const searchButton = document.getElementById("searchButton");
  const searchInput = document.getElementById("searchInput");

  searchButton.addEventListener("click", function () {
    const searchTerm = searchInput.value;
    if (searchTerm) {
      alert("Estás buscando: " + searchTerm);
    } else {
      alert("Por favor, ingresa un término de búsqueda.");
    }
  });

  const followButtons = document.querySelectorAll(".follow-btn");
  followButtons.forEach((button) => {
    button.addEventListener("click", function (event) {
      const adCard = event.target.closest(".ad-card");
      if (adCard) {
        adCard.style.display = "none";
      }
    });
  });
});
