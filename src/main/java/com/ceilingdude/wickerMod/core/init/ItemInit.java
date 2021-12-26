package com.ceilingdude.wickerMod.core.init;

import com.ceilingdude.wickerMod.wickerMod;
import com.ceilingdude.wickerMod.common.items.WWing;
import com.ceilingdude.wickerMod.common.items.DWing;
import com.ceilingdude.wickerMod.common.material.DragonMaterial;
import com.ceilingdude.wickerMod.common.material.WickerMaterial;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			wickerMod.MOD_ID);
	
	public static final RegistryObject<Item> WICKER = ITEMS.register("wicker", () -> new Item(new Item.Properties()));
	
	public static final RegistryObject<WWing> WICKER_WINGS = ITEMS.register("wicker_wings",
			() -> new WWing(WickerMaterial.WICKER, EquipmentSlotType.CHEST, new Item.Properties()
					.tab(ItemGroup.TAB_TRANSPORTATION).stacksTo(1).durability(200)));
	
	public static final RegistryObject<Item> SCALE_FLAKE = ITEMS.register("scale_flake",
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)
					.food(new Food.Builder().effect(() -> new EffectInstance(Effects.FIRE_RESISTANCE, 200), 0.1f)
					.alwaysEat().build()).stacksTo(69)));
	
	public static final RegistryObject<Item> SCALE_FABRIC = ITEMS.register("scale_fabric",
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
	
	public static final RegistryObject<Item> DRAGON_WING = ITEMS.register("dragon_wing",
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
	
	public static final RegistryObject<DWing> DRAGON_WINGS = ITEMS.register("dragon_wings",
			() -> new DWing(DragonMaterial.SCALE, EquipmentSlotType.CHEST, new Item.Properties()
					.tab(ItemGroup.TAB_TRANSPORTATION).stacksTo(1).durability(1500)));
	
}
