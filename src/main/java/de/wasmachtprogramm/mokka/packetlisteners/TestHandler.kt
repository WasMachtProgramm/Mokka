package de.wasmachtprogramm.mokka.packetlisteners

import com.comphenix.protocol.PacketType
import com.comphenix.protocol.events.PacketEvent
import de.wasmachtprogramm.mokka.AbstractPacketListener

object TestHandler : AbstractPacketListener(PacketType.Play.Client.CHAT) {
    override fun handle(packet: PacketEvent) {
        println("TestHandler: ${packet.packetType}")
        println(packet.packet.strings.read(0))
    }
}
