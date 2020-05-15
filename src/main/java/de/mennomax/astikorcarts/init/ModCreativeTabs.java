package de.mennomax.astikorcarts.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModCreativeTabs
{
    public static CreativeTabs astikor = new CreativeTabs("astikorcarts")
    {
        @SideOnly(Side.CLIENT)
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ModItems.WHEEL);
        }

    };
}
