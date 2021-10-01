//Conversor de Celsius para Fahrenheit
function convertFahrenheit() {      
    var c = document.getElementById('data').value;
    var f = (c * 1.8) + 32;
    document.getElementById('res').innerText = `${c} C = ${f} F.` 
};

function convertCelsios() {      
    var f = document.getElementById('data01').value;
    var c = 5*(f - 32) / 9 ;;
    document.getElementById('res01').innerText = `${f} F = ${c} C.`;
};