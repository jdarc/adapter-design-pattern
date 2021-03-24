package demo.game

import demo.common.system.Container

class NanoContainer : Container {
    private val providers = mutableMapOf<Class<*>, (args: Array<*>) -> Any>()

    inline fun <reified T> resolve(vararg initargs: Any) = resolve(T::class.java, initargs) as T

    override fun resolve(clazz: Class<*>, vararg args: Any) =
        providers.getOrElse(clazz, { throw RuntimeException("no provider registered for dependency $clazz") })(args)

    override fun register(clazz: Class<*>, factory: (args: Array<*>) -> Any) {
        providers[clazz] = factory
    }
}
