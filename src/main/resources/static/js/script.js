const agendamentosPendentes = document.getElementById('agendamentosPendentesBadge');
document.addEventListener("DOMContentLoaded", function atualizarBadge() {
   axios.get('/cliente/agendamentos-pedentes')
        .then(function(response) {
            agendamentosPendentes.textContent = response.data;
        })
        .catch(function(error) {
            console.error(error);
        });
});
