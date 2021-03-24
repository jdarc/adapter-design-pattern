package demo.physics

import com.loco.physics.World
import demo.common.physics.RigidBody
import demo.common.physics.Simulation

internal class SimulationAdapter(private val adaptee: World) : Simulation {
    private val bodies = mutableSetOf<RigidBodyAdapter>()

    override fun addBody(body: RigidBody) {
        if (body !is RigidBodyAdapter) return
        bodies.add(body)
        body.addToSimulation(adaptee)
    }

    override fun removeBody(body: RigidBody) {
        if (body !is RigidBodyAdapter) return
        bodies.remove(body)
        body.removeFromSimulation(adaptee)
    }

    override fun removeAllBodies() {
        bodies.iterator().forEach { removeBody(it) }
    }

    override fun integrate(dt: Double) {
        bodies.forEach { it.oldPosition = it.newPosition }
        adaptee.integrate(dt)
    }
}
