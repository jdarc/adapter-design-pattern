package demo.common.physics

interface Simulation {
    fun addBody(body: RigidBody)
    fun removeBody(body: RigidBody)
    fun removeAllBodies()
    fun integrate(dt: Double)
}
