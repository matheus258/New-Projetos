// Api ChuskNorris

fetch('https://api.chucknorris.io/jokes/random')
    .then((res) => {
        return res.json();
    })
    .then((data) => {
        console.log(data.value)
        setInterval(() => {
            // Mudando a frase
            document.getElementById('text').textContent=`${data.value}`
        }, 1000)
    })