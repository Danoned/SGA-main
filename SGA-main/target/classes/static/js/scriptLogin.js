const formulario = document.querySelector("form");
const botao = document.querySelector("button");
const Iemail = document.querySelector(".email");
const Isenha = document.querySelector(".senha");

function logar()
{
    fetch("http://localhost:8080/estudantes",
    {
        headers:
        {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        method: "GET",
        body: JSON.stringify({
            email: Iemail.value,
            senha: Isenha.value
        })
    })
    .then(function (res) {console.log(res)})
    .catch(function(res) {console.log(res)})

    formulario.addEventListener("submit", function(event) {
        event.preventDefault();
        logar();
    });
}