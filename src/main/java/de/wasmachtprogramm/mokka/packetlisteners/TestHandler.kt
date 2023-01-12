package de.wasmachtprogramm.mokka.packetlisteners

import com.comphenix.protocol.PacketType
import com.comphenix.protocol.events.PacketEvent
import de.wasmachtprogramm.mokka.AbstractPacketListener

object TestHandler : AbstractPacketListener(PacketType.Play.Client.BLOCK_PLACE) {
    override fun handle(packet: PacketEvent) {
        println("TestHandler: ${packet.packetType}")
    }
}
