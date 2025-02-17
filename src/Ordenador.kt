class Ordenador(val tipo: TipoOrdenador = TipoOrdenador.BASICO, nombre: String, precio: Double):Articulo(nombre, precio){


    override fun promocionNavidad(rebaja: Int) {
       if (precio > 500){
           println("Descuento aplicado con éxito")
           val dineroRebaja = precio * rebaja / 100
           precio -=  dineroRebaja
       }
    }

    override fun toString(): String {
        return "{$nombre} - ${"%.2f".format(precio)}€)"
    }
}