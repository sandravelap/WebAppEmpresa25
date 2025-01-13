function enviarFormulario(event) {
    event.preventDefault(); // Evita que el formulario se envíe de la manera tradicional

    var formData = new FormData(document.getElementById("miFormulario"));
    alert(formData.get("id"));

    fetch("EmpleadoInsertado", {
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