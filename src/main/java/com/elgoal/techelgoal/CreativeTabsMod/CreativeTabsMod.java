package com.elgoal.techelgoal.CreativeTabsMod;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class CreativeTabsMod {
    public static final CreativeModeTab MAIN = new CreativeModeTab("main") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.LAPIS_BLOCK);
        }
    };
}
