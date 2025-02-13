open class Articulo(var nombre: String, var precio: Double) {

    private val id = generarId()

    fun generarId(){

        var totalArticulos = 0
        totalArticulos += 1

    }

    open fun promocionNavidad(rebaja: Int){
        val dineroRebaja = precio * rebaja / 100
        precio -=  dineroRebaja

    }

    override fun toString(): String {
        return "{$nombre} - ${"%.2f".format(precio)}€)"
    }
}