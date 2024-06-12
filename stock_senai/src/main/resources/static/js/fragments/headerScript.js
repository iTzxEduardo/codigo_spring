// Método para esconder a sidebar ao clicar no botão
document.getElementById('toggle-button').addEventListener('click', function () {
    var sidebar = document.getElementById('sidebar');
    sidebar.classList.toggle('hidden-sidebar');

    // Alternar a direção do ícone da seta
    var icon = document.getElementById('arrow-icon');
    
    if (sidebar.classList.contains('hidden-sidebar')) {
        icon.classList.remove('arrow-animation-out');
        icon.classList.add('arrow-animation-in');
    } else {
        icon.classList.remove('arrow-animation-in');
        icon.classList.add('arrow-animation-out');
    }
});