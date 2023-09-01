const dataAtual = new Date().toISOString().split('T')[0];
document.getElementById('data').min = dataAtual;

var dataHoraAtual = new Date().toISOString().slice(0, 16);
document.getElementById("data-hora").min = dataHoraAtual;
function atualizarDataHoraAtual() {
var campoDataHora = document.getElementById("data-hora");
 campoDataHora.value = dataHoraAtual;
 }
 window.addEventListener("load", atualizarDataHoraAtual);

