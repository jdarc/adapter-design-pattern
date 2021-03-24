package demo.common.system

interface Container {
    fun resolve(clazz: Class<*>, vararg args: Any): Any
    fun register(clazz: Class<*>, factory: (args: Array<*>) -> Any)
}


