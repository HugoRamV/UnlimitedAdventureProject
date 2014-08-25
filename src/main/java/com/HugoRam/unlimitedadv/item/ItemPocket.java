package com.HugoRam.unlimitedadv.item;

import com.HugoRam.unlimitedadv.creativetab.CreativeTabUnAdv;
import com.HugoRam.unlimitedadv.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class ItemPocket extends ItemUnAdv{
	
	public ItemPocket()
	{
		super();
		maxStackSize = 1;
		this.setUnlocalizedName("pocket");
	}

}
