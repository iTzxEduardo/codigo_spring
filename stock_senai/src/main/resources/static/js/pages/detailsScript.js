// Método que altera a imagem conforme for clicado
document.addEventListener('DOMContentLoaded', function () {
    // Seleciona todas as miniaturas
    const miniaturas = document.querySelectorAll('.div-img-room-mini');

    // Adiciona um event listener para cada miniatura
    miniaturas.forEach(miniatura => {
        miniatura.addEventListener('click', function () {
            // Remove a classe 'selected-img' de todas as miniaturas
            miniaturas.forEach(item => item.classList.remove('selected-img'));

            // Adiciona a classe 'selected-img' à miniatura clicada
            this.classList.add('selected-img');

            // Obtém a imagem e o alt da miniatura clicada
            const img = this.querySelector('img');
            const newSrc = img.getAttribute('src');
            const newAlt = img.getAttribute('alt');

            // Atualiza a imagem principal
            const mainImg = document.getElementById('main-img');
            mainImg.setAttribute('src', newSrc);
            mainImg.setAttribute('alt', newAlt);
        });
    });
});

// Método que altera a tabela conforme for clicado
document.getElementById('act-table-maint-btn').addEventListener('click', function () {
    var tableMaint = document.getElementById('table-maintenance-id');
    var tableTransf = document.getElementById('table-transfer-id');

    tableMaint.style.display = "flex";
    tableMaint.classList.add('animation-fade-in');
    tableTransf.style.display = "none";
    tableTransf.classList.remove('animation-fade-in');
});

// Método que altera a tabela conforme for clicado
document.getElementById('act-table-transf-btn').addEventListener('click', function () {
    var tableMaint = document.getElementById('table-maintenance-id');
    var tableTransf = document.getElementById('table-transfer-id');

    tableMaint.style.display = "none";
    tableMaint.classList.remove('animation-fade-in');
    tableTransf.style.display = "flex";
    tableTransf.classList.add('animation-fade-in');

});
