

function enviarFormulario(event) {
    event.preventDefault(); // Evita que el formulario se envíe de la manera tradicional

    var formData = new FormData(document.getElementById("miFormulario"));
    alert(formData.get("idEmp"));

    fetch("insertarEmpBD", {
        method: "POST",
        body: formData
    })
        .then(response => response.text())
        .then(data => {
            alert(data); // Muestra la respuesta en un alert
        })
        .catch(error => {
            console.error("Error:", error);
        });
}

const form = document.getElementById("miFormulario")
form.addEventListener("submit", enviarFormulario)