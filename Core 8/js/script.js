let count1 = 0;
let count2 = 0;
let count3 = 0;

function aumentarLike1() {
    count1++;
    let contador = document.querySelector('#likeCount1');
    contador.innerHTML = count1;
}

function aumentarLike2() {
    count2++;
    let contador = document.querySelector('#likeCount2');
    contador.innerHTML = count2;
}

function aumentarLike3() {
    count3++;
    let contador = document.querySelector('#likeCount3');
    contador.innerHTML = count3;
}
