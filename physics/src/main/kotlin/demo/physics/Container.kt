package demo.physics

import com.loco.physics.Body
import com.loco.physics.World
import demo.common.system.Container
import demo.common.physics.RigidBody
import demo.common.physics.Simulation

fun wireUp(container: Container): Container {
    container.register(Simulation::class.java) { SimulationAdapter(World()) }
    container.register(RigidBody::class.java) { RigidBodyAdapter(Body()) }
    return container
}
