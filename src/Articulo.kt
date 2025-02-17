open class Articulo(var nombre: String, var precio: Double) {

    companion object{
        var totalArticulos = 0

        fun generarId(): Int{

            totalArticulos += 1
            return totalArticulos
        }
    }



    private val id = generarId()



    open fun promocionNavidad(rebaja: Int){
        println("Descuento aplicado con éxito")
        val dineroRebaja = precio * rebaja / 100
        precio -=  dineroRebaja

    }

    override fun toString(): String {
        return "{$nombre} - ${"%.2f".format(precio)}€ (ID: {$id})"
    }
}