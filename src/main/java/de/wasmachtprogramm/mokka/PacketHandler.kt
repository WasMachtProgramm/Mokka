package de.wasmachtprogramm.mokka

import com.comphenix.protocol.PacketType
import com.comphenix.protocol.ProtocolLibrary
import com.comphenix.protocol.events.ListenerPriority
import com.comphenix.protocol.events.PacketAdapter
import com.comphenix.protocol.events.PacketEvent

object PacketHandler {

    private val handlers: MutableMap<PacketType, MutableSet<AbstractPacketListener>> = mutableMapOf()
    fun setup(vararg packetListeners: AbstractPacketListener) {
        packetListeners.forEach {
            it.packetTypes.forEach { type ->
                handlers.getOrPut(type) { mutableSetOf() }.add(it)
            }
        }
        ProtocolLibrary.getProtocolManager().addPacketListener(object : PacketAdapter(Mokka.instance, ListenerPriority.HIGH, handlers.keys) {
            override fun onPacketReceiving(event: PacketEvent) {
                handlers[event.packetType]?.forEach { it.handle(event) }
            }
        })
    }

}
