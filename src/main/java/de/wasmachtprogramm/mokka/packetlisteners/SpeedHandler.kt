package de.wasmachtprogramm.mokka.packetlisteners

import com.comphenix.protocol.PacketType
import com.comphenix.protocol.events.PacketEvent
import de.wasmachtprogramm.mokka.AbstractPacketListener

//checks the speed of a player

object SpeedHandler : AbstractPacketListener(PacketType.Play.Client.POSITION) {
    override fun handle(packet: PacketEvent) {
        val p = packet.packet
        val read_position = p.positionModifier.read(0)
        val x = read_position.x
        val y = read_position.y
        val z = read_position.z
        println("x: $x, y: $y, z: $z, gesamte Distanz: ${read_position.toVector().length()} ")
    }

}