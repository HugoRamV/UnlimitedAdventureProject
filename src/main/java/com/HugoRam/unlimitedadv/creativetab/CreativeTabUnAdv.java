package com.HugoRam.unlimitedadv.creativetab;

import com.HugoRam.unlimitedadv.init.ModItems;
import com.HugoRam.unlimitedadv.reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabUnAdv 
{
	public static final CreativeTabs UnlimitedAdventure_TAB = new CreativeTabs(Reference.MOD_ID)
	{
		@Override
		public Item getTabIconItem()
		{
			return ModItems.pocket;
		}
	
	};
}
