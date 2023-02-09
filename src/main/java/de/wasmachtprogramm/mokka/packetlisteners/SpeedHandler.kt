package de.wasmachtprogramm.mokka.packetlisteners


import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerMoveEvent

//checks the speed of a player

object SpeedHandler : Listener {
    @EventHandler
    fun onMove(event: PlayerMoveEvent) {
        val v = event.to!!.toVector().subtract(event.from.toVector())
        println(v.length())
    }

    //println("x: $x, y: $y, z: $z, gesamte Distanz: ${read_position.toVector().length()} ")


}