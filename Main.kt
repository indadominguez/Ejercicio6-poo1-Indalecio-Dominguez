fun main() {

    val domicilio1 = Domicilio("Calle Manuel Rances", 355)
    val domicilio2 = Domicilio("Calle Fermín Salvochea", 218)
    val domicilio3 = Domicilio("Calle Columela", 761)

    val cliente1 = Cliente("Inda Domínguez", domicilio1)
    val cliente2 = Cliente("Angel Rodriguez", domicilio2)
    val cliente3 = Cliente("Rocio Luque", domicilio3)

    val compra1 = Compra(cliente1, 5, 12780.78)
    val compra2 = Compra(cliente2, 7, 699.0)
    val compra3 = Compra(cliente1, 7, 532.90)
    val compra4 = Compra(cliente3, 12, 5715.99)
    val compra5 = Compra(cliente2, 15, 958.0)

    val repositorio = RepositorioCompras()
    repositorio.agregarCompra(compra1)
    repositorio.agregarCompra(compra2)
    repositorio.agregarCompra(compra3)
    repositorio.agregarCompra(compra4)
    repositorio.agregarCompra(compra5)

    val domicilios = repositorio.domicilios()
    println(domicilios)
}