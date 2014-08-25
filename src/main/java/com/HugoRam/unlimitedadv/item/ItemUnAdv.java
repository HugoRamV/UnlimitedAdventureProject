package com.HugoRam.unlimitedadv.item;

import com.HugoRam.unlimitedadv.creativetab.CreativeTabUnAdv;
import com.HugoRam.unlimitedadv.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemUnAdv extends Item {
	
	public ItemUnAdv()
	{
		super();
		this.setCreativeTab(CreativeTabUnAdv.UnlimitedAdventure_TAB);
	}


    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

	@Override
    @SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister)
	    {
	        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
	    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
	
}
