package me.zaksen.plugin

import org.bukkit.plugin.java.JavaPlugin

class Plugin: JavaPlugin() {

    override fun onEnable() {
        println("Hello from Plugin!")
    }

    override fun onDisable() {

    }
}