const formulario = document.querySelector("form");
const botao = document.querySelector("button");
const Inome = document.querySelector(".nome");
const Iemail = document.querySelector(".email");
const Iidade = document.querySelector(".idade");
const Icurso = document.querySelector(".curso");
const Icpf = document.querySelector(".cpf");
const Isenha = document.querySelector(".senha");

function cadastrar()
{
    fetch("http://localhost:8080/estudantes",
    {
        headers:
        {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        method: "POST",
        body: JSON.stringify({
            nome: Inome.value,
            email: Iemail.value,
            idade: Iidade.value,
            curso: Icurso.value,
            cpf: Icpf.value,
            senha: Isenha.value
        })
    })
    .then(function (res) {console.log(res)})
    .catch(function(res) {console.log(res)})
};

function limpar()
{       
    Inome.value = "",
    Iemail.value = "",
    Iidade.value = "",
    Icurso.value = "",
    Icpf.value = "",
    Isenha.value = ""
    
}


formulario.addEventListener("submit", function(event) {
    event.preventDefault();
    cadastrar();
    limpar();
});