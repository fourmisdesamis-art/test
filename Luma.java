package com.example.lumanations;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Luma {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(
                    ForgeRegistries.BLOCKS,
                    LumaNations.MOD_ID
            );

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(
                    ForgeRegistries.ITEMS,
                    LumaNations.MOD_ID
            );

    public static final RegistryObject<Block> LUMA_ORE =
            BLOCKS.register("luma_ore", () ->
                    new Block(
                            BlockBehaviour.Properties.of()
                                    .strength(3.0F, 3.0F)
                                    .sound(SoundType.STONE)
                                    .requiresCorrectToolForDrops()
                    )
            );

    public static final RegistryObject<Item> LUMA_ORE_ITEM =
            ITEMS.register("luma_ore", () ->
                    new BlockItem(
                            LUMA_ORE.get(),
                            new Item.Properties()
                    )
            );

    public static final RegistryObject<Block> DEEPSLATE_LUMA_ORE =
            BLOCKS.register("deepslate_luma_ore", () ->
                    new Block(
                            BlockBehaviour.Properties.of()
                                    .strength(4.5F, 4.5F)
                                    .sound(SoundType.DEEPSLATE)
                                    .requiresCorrectToolForDrops()
                    )
            );

    public static final RegistryObject<Item> DEEPSLATE_LUMA_ORE_ITEM =
            ITEMS.register("deepslate_luma_ore", () ->
                    new BlockItem(
                            DEEPSLATE_LUMA_ORE.get(),
                            new Item.Properties()
                    )
            );

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
}
