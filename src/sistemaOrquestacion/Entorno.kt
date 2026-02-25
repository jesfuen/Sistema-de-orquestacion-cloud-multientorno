package sistemaOrquestacion

// Open class porque las clases hijas no necesitan definir el funcionamiento de desplegarArtefacto()
open class Entorno(val nombre: String, val region: String) {

    // Lista mutable para añadir artefactos para cada entorno
    val listaArtefactos: MutableList<Artefacto> = mutableListOf()

    // Funcion ya definida porque las tres clases únicamente se encargan de añadir a la lista los artefactos de la misma manera
    fun desplegarArtefacto(artefacto: Artefacto) {
        listaArtefactos.add(artefacto)
    }
}

class ClusterKubernetes(nombre: String, region: String, nodos: Int, version: String): Entorno(nombre, region)

class ServerlessLambda(nombre: String, region: String, memoria: Double, runtime: Double): Entorno(nombre, region)

class InstanciaVirtual(nombre: String, region: String, arquitectura: String, so: String): Entorno(nombre, region)