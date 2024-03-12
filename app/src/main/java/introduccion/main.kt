package introduccion

class Calculadora{

    fun sumar(x: Int,y: Int): Int {
        return x + y

    }

    fun restar(x: Int,y: Int): Int {
        return x - y
    }

    fun multiplicacion(x: Int, y: Int): Int {
        return x*y
    }


}

fun main(){
    val calculadora = Calculadora()

    print("Ingresa dos números")
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()

v
    print("1) Sumar 2)Restar 3)Multiplicacion")
    val operacion = readLine()?.toInt()

    when(operacion){

        1 -> print(calculadora.sumar(a,b))

        2 -> print(calculadora.restar(a,b))

        3 -> print(calculadora.multiplicacion(a,b))

        else -> print("error")
    }


}