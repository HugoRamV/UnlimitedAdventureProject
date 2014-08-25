package com.HugoRam.unlimitedadv;

import com.HugoRam.unlimitedadv.handler.ConfigurationHandler;
import com.HugoRam.unlimitedadv.init.ModItems;
import com.HugoRam.unlimitedadv.proxy.IProxy;
import com.HugoRam.unlimitedadv.reference.Reference;

import cpw.mods.fml.common.API;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid= Reference.MOD_ID ,name= Reference.MOD_NAME,version= Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class UnlimitedAdventure {

@Instance(Reference.MOD_ID)
	public static UnlimitedAdventure instance;

@SidedProxy(clientSide = "com.HugoRam.unlimitedadv.proxy.ClientProxy", serverSide = "com.HugoRam.unlimitedadv.proxy.ServerProxy")
	public static IProxy proxy;

private static int modGuiIndex = 0;
public static final int GUI_ITEM_INV = modGuiIndex++;
	
@EventHandler
public void preInit(FMLPreInitializationEvent event)
	{
	ConfigurationHandler.init(event.getSuggestedConfigurationFile());
	ModItems.init();
	}
@EventHandler
public void Init(FMLInitializationEvent event)
	{
	}

@EventHandler
public void postInit(FMLPostInitializationEvent event)
	{
	}

}
