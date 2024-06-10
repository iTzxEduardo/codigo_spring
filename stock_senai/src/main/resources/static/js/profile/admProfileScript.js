// Método que altera a tabela conforme for clicado
document.getElementById('act-table-user-btn').addEventListener('click', function () {
    var tableUsers = document.getElementById('div-users-list-id');
    var tableRooms = document.getElementById('div-rooms-list-id');

    tableUsers.style.display = "flex";
    tableUsers.classList.add('animation-fade-in');
    tableRooms.style.display = "none";
    tableRooms.classList.remove('animation-fade-in');
});

// Método que altera a tabela conforme for clicado
document.getElementById('act-table-rooms-btn').addEventListener('click', function () {
    var tableUsers = document.getElementById('div-users-list-id');
    var tableRooms = document.getElementById('div-rooms-list-id');

    tableUsers.style.display = "none";
    tableUsers.classList.remove('animation-fade-in');
    tableRooms.style.display = "flex";
    tableRooms.classList.add('animation-fade-in');
});
