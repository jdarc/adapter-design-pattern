package com.loco.physics

import kotlin.math.sqrt

internal data class Vec3(val x: Double, val y: Double, val z: Double) {

    fun length() = sqrt(x * x + y * y + z * z)

    operator fun plus(v: Vec3) = Vec3(x + v.x, y + v.y, z + v.z)
    operator fun times(s: Double) = Vec3(x * s, y * s, z * s)

    companion object {
        val ZERO = Vec3(0.0, 0.0, 0.0)
    }
}
