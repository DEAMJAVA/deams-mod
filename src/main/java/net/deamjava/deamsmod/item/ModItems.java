package net.deamjava.deamsmod.item;

import net.deamjava.deamsmod.DeamsMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item CHOCO = registerItem("choco", new Item(new Item.Settings()));
    public static final Item RAW_CHOCO = registerItem("raw_choco", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(DeamsMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        DeamsMod.LOGGER.info("Registering Mod Items For: " + DeamsMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(CHOCO);
            entries.add(RAW_CHOCO);
        });
    }
}
