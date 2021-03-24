package demo.common.physics

import demo.common.math.Vector3

interface RigidBody {
    val oldPosition: Vector3
    var newPosition: Vector3
}
