package com.example.lumanations;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class LumaCreativeTab {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(
                    Registries.CREATIVE_MODE_TAB,
                    LumaNations.MOD_ID
            );

    public static final RegistryObject<CreativeModeTab> LUMANATIONS_TAB =
            CREATIVE_MODE_TABS.register("lumanations", () ->
                    CreativeModeTab.builder()
                            .title(Component.translatable("itemGroup.lumanations"))
                            .icon(() -> new ItemStack(Luma.LUMA_ORE_ITEM.get()))
                            .displayItems((parameters, output) -> {
                                output.accept(Luma.LUMA_ORE_ITEM.get());
                                output.accept(Luma.DEEPSLATE_LUMA_ORE_ITEM.get());
                            })
                            .build()
            );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
