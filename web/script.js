function mostrarTabla(tipo) {
    var tablaCliente = document.getElementById("tablaCliente");
    var tablaProveedor = document.getElementById("tablaProveedor");

    if (tipo === 'cliente') {
        tablaCliente.style.display = 'block';
        tablaProveedor.style.display = 'none';
    } else if (tipo === 'proveedor') {
        tablaCliente.style.display = 'none';
        tablaProveedor.style.display = 'block';
    }
}