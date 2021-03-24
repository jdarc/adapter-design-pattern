package com.loco.physics

internal class Body {
    var acceleration = Vec3.ZERO
    var velocity = Vec3.ZERO
    var position = Vec3.ZERO

    var mass = 1.0
    var force = 0.0

    fun moveTo(v: Vec3) {
        position = v
        velocity = Vec3.ZERO
    }
}
