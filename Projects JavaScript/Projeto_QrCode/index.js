const container = document.querySelector('.container');
qrInput = container.querySelector('.form input');
generateBtn = container.querySelector('.form button');
qrImg = container.querySelector('.qrcode .img');

generateBtn.addEventListener('click', () => {
    let qrValue = qrInput.value;
    if(!qrValue){
        alert('Insira uma url valida!')
        return;
    }
    generateBtn.innerText = "Gerando Qr-code...";
    qrImg.src = `https://api.qrserver.com/v1/create-qr-code/?size=170x170&data=${qrValue}`

    qrImg.addEventListener('load', () => {
        generateBtn.innerText = 'Gerar Qr Code';
        container.classList.add('ativado');
        container.classList.remove('desativado')
    })

});

qrInput.addEventListener('keyup', () => {
    if(!qrInput.value){
        container.classList.remove('ativado');
        container.classList.add('desativado');
    }
})