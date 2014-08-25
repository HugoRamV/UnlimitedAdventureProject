package com.HugoRam.unlimitedadv.handler;

import java.io.File;

import com.HugoRam.unlimitedadv.reference.Reference;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler 
{
	public static Configuration configuration;
	public static boolean testValue = false;
	
	public static void init(File configFile)
	{
	if(configuration == null)
		{	
		configuration = new Configuration(configFile);
		}
	}
	
	@SubscribeEvent
	public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
	{
		if (event.modID.equalsIgnoreCase(Reference.MOD_ID));
	}

	public void loadConfiguration()
	{
		testValue = configuration.getBoolean(Configuration.CATEGORY_GENERAL, "configValue", true, "This will disable the requirement of Baubles API");
		
		if (configuration.hasChanged())
		{
			configuration.save();
		}
	}
}
