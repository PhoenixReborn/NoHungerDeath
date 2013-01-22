package com.github.PhoenixReborn.nohungerdeath;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.plugin.java.JavaPlugin;

public class NoHungerDeath extends JavaPlugin implements Listener
{
	public void onEnable()
	{
		getServer().getPluginManager().registerEvents(this, this);
	}
	
	@EventHandler
	public void onHungerDamage(EntityDamageEvent e)
	{
		if(e.getCause().equals(DamageCause.STARVATION))
		{
			e.setCancelled(true);
		}
	}
}
