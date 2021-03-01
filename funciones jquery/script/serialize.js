$(document).ready(function() {
    $('#create-account-button').on('click', function(e) {
        e.preventDefault();
        let dataString = $('#create-account-form').serialize();
        alert('Datos serializados: '+dataString);
        console.log(dataString);
    }); 
});