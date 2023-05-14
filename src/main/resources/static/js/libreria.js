function enviarDatos(){
    var nombre= document.getElementById("txtNombre").value;
    var cantidad = document.getElementById("txtCantidad").value;
    var precio = document.getElementById("txtPrecio").value;
    var patron=document.getElementById("txtCupon");
    var factura=document.getElementById("txtFactura");
    window.location.href="http://localhost:8080/detalle"+nombre+"/"+cantidad+"/"+precio;
}