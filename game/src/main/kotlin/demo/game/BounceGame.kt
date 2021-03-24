package demo.game

import demo.physics.wireUp
import demo.common.physics.RigidBody
import demo.common.physics.Simulation

class BounceGame {

    fun play() {
        val container = wireUp(NanoContainer()) as NanoContainer
        val simulation = container.resolve<Simulation>()
        val body = container.resolve<RigidBody>()
        simulation.addBody(body)

        for (i in 0..9) {
            simulation.integrate(TIMESTEP_IN_SECONDS)
            log(i, body)
        }
    }

    private fun log(iteration: Int, body: RigidBody) {
        println("Iteration: $iteration, Duration: ${fix(iteration * TIMESTEP_IN_SECONDS)} seconds")
        println("Old position: ${body.oldPosition}")
        println("New position: ${body.newPosition}")
        println()
    }

    companion object {
        private const val TIMESTEP_IN_SECONDS = 0.016

        private fun fix(x: Double) = (x * 1000).toInt() / 1000.0
    }
}
