package net.Victor.EpicFightAddon.item;

import net.Victor.EpicFightAddon.EpicFightAddon;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static  final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EpicFightAddon.MOD_ID);

    public static final RegistryObject<Item> JJK_CURSEDENERGY = ITEMS.register("jjk_cursedenergy",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
