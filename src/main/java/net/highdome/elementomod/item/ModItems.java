package net.highdome.elementomod.item;

import net.highdome.elementomod.ElementoMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ElementoMod.MOD_ID);

    public static final DeferredItem<Item> RAW_FIRE_JEWEL = ITEMS.register("raw_fire_jewel",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> FIRE_JEWEL = ITEMS.register("fire_jewel",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_WATER_JEWEL = ITEMS.register("raw_water_jewel",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WATER_JEWEL = ITEMS.register("water_jewel",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_AIR_JEWEL = ITEMS.register("raw_air_jewel",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AIR_JEWEL = ITEMS.register("air_jewel",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_EARTH_JEWEL = ITEMS.register("raw_earth_jewel",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> EARTH_JEWEL = ITEMS.register("earth_jewel",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

}
