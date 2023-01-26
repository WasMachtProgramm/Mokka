package de.wasmachtprogramm.mokka

import de.wasmachtprogramm.mokka.packetlisteners.SpeedHandler
import de.wasmachtprogramm.mokka.packetlisteners.TestHandler
import org.bukkit.plugin.java.JavaPlugin

class Mokka : JavaPlugin() {
    override fun onEnable() {
        plugin = this
        PacketHandler.setup(
                // here you can add your packet listeners
                TestHandler,
                SpeedHandler
        )
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }

    companion object {
        private var plugin: Mokka? = null
        val instance get() = plugin ?: error("Plugin has not been initialized yet")
    }
}
