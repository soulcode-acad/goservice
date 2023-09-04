var dataAtual = new Date().toISOString().split('T')[0];
document.getElementById("data").min = dataAtual;


function validarHorario() {
 var dataNova = document.getElementById("data").value;
 var horaSelecionada = document.getElementById("hora").value;
 var horaAtual = new Date().toLocaleTimeString('en-US', {hour12: false});

 if (horaSelecionada < horaAtual && dataNova <= dataAtual) {
  alert("Por favor, selecione um horário válido.");
  document.getElementById("hora").value = horaAtual;
 }
}

document.getElementById("hora").addEventListener("change", validarHorario);


