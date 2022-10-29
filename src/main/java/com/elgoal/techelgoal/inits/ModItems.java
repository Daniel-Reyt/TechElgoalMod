package com.elgoal.techelgoal.inits;

import com.elgoal.techelgoal.CreativeTabsMod.CreativeTabsMod;
import com.elgoal.techelgoal.ReferencesElgoal;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ReferencesElgoal.MODID);

    public static final RegistryObject<Item> remote = ITEMS.register("remote", () -> new Item(new Item.Properties().stacksTo(1).tab(CreativeTabsMod.MAIN)));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
