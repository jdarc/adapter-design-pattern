package com.loco.physics

internal class World {
    private val bodies = mutableSetOf<Body>()

    fun addBody(body: Body) {
        bodies.add(body)
    }

    fun removeBody(body: Body) {
        bodies.remove(body)
    }

    fun integrate(dt: Double) {
        applyGravity()
        integrateMotion(dt)
        clearForces()
    }

    private fun clearForces() = bodies.forEach { it.acceleration = Vec3.ZERO }

    private fun integrateMotion(dt: Double) = bodies.forEach {
        it.force = (it.acceleration * it.mass).length()
        it.velocity += it.acceleration * dt
        it.position += it.velocity * dt
    }

    private fun applyGravity() = bodies.forEach { it.acceleration += GRAVITY }

    companion object {
        val GRAVITY = Vec3(0.0, -9.8, 0.0)
    }
}
