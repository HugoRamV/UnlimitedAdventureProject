package com.HugoRam.unlimitedadv.init;

import com.HugoRam.unlimitedadv.item.ItemCloth;
import com.HugoRam.unlimitedadv.item.ItemIngotCopper;
import com.HugoRam.unlimitedadv.item.ItemIngotSilver;
import com.HugoRam.unlimitedadv.item.ItemPocket;
import com.HugoRam.unlimitedadv.item.ItemRing;
import com.HugoRam.unlimitedadv.item.ItemUnAdv;
import com.HugoRam.unlimitedadv.item.ItemWhiteDiamond;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static final ItemUnAdv cloth = new ItemCloth();
	public static final ItemUnAdv pocket = new ItemPocket();
	public static final ItemUnAdv whiteDiamond = new ItemWhiteDiamond();
	public static final ItemUnAdv ring = new ItemRing();
	public static final ItemUnAdv copperIngot = new ItemIngotCopper();
	public static final ItemUnAdv silverIngot = new ItemIngotSilver();
	
	public static void init()
	{
		GameRegistry.registerItem(cloth,"cloth");
		GameRegistry.registerItem(pocket,"pocket");
		GameRegistry.registerItem(whiteDiamond, "whiteDiamond");
		GameRegistry.registerItem(ring,"ring");
		GameRegistry.registerItem(copperIngot, "copperIngot");
		GameRegistry.registerItem(silverIngot, "silverIngot");
	}
	
}
