// Variáveis
var div_dlt_pop_up = document.getElementById("dlt-pop-up-id");
var delete_btn_true = document.getElementById("delete-btn-true-id");
var cancel_btn = document.getElementById("cancel-btn-id");
var pop_up_text = document.getElementById("pop-up-text-id");
var pop_up_loading = document.getElementById("pop-up-loading-id");

// Botão que gera o Pop-Up na tela
document.getElementById('delete-btn-id').addEventListener('click', function () {
    div_dlt_pop_up.style.display = "flex";
});

// Botão que fecha o Pop-Up
cancel_btn.addEventListener('click', function () {
    div_dlt_pop_up.style.display = "none";
});

// Botão que deleta o usuário e direciona-o para página internal do adm
delete_btn_true.addEventListener('click', function () {
    pop_up_text.style.display = "none";
    pop_up_loading.style.display = "flex";
    setTimeout(function () {
        window.location.href = 'internal-adm-page.html'; // Substitua pela URL desejada
    }, 2000);
});