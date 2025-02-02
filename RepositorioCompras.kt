class RepositorioCompras {
    private val compras = mutableListOf<Compra>()

    // Método para agregar una compra
    fun agregarCompra(compra: Compra) {
        compras.add(compra)
    }

    // Método para obtener los domicilios de los clientes
    fun domicilios(): List<String> {
        val domiciliosUnicos = compras
            .map { it.cliente.domicilio } // Extraemos los domicilios
            .distinct() // Eliminamos duplicados
            .map { it.dirCompleta() } // Convertimos a la dirección completa como String
        return domiciliosUnicos
    }
}
