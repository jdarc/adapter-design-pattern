package demo.physics

import com.loco.physics.Body
import com.loco.physics.World
import com.loco.physics.Vec3
import demo.common.math.Vector3
import demo.common.physics.RigidBody

internal class RigidBodyAdapter(private val adaptee: Body) : RigidBody {
    override var oldPosition = Vector3(0f, 0f, 0f)

    override var newPosition: Vector3
        get() {
            val (x, y, z) = adaptee.position
            return Vector3(x.toFloat(), y.toFloat(), z.toFloat())
        }
        set(value) {
            adaptee.moveTo(Vec3(value.x.toDouble(), value.y.toDouble(), value.z.toDouble()))
        }

    internal fun addToSimulation(simulation: World) = simulation.addBody(adaptee)

    internal fun removeFromSimulation(simulation: World) = simulation.removeBody(adaptee)
}
