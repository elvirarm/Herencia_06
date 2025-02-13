fun main() {

    val art1 = Articulo("art1", 25.0)

    val art2 = Articulo("art2", 45.0)

    val ordenador1 = Ordenador(TipoOrdenador.GAMING, "Ordenador 1", 1299.99)
    val ordenador2 = Ordenador(TipoOrdenador.BASICO, "Ordenador 2", 399.99)

    val totalArticulo = mutableListOf<Articulo>(art1, art2)

    for (elemento in totalArticulo){
        elemento.promocionNavidad(10)
        println(elemento)

    }

}
