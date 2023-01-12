package de.wasmachtprogramm.mokka

import com.comphenix.protocol.PacketType
import com.comphenix.protocol.events.PacketEvent

abstract class AbstractPacketListener(val packetTypes: List<PacketType>) {
    constructor(vararg packetTypes: PacketType) : this(packetTypes.toList())

    abstract fun handle(packet: PacketEvent)
}
