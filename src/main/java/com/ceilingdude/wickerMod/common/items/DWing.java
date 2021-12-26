package com.ceilingdude.wickerMod.common.items;

import java.util.List;

import com.ceilingdude.wickerMod.common.material.DragonMaterial;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class DWing extends ArmorItem{
	
	public DWing(DragonMaterial scale, EquipmentSlotType chest, Properties properties) {
		super(DragonMaterial.SCALE, EquipmentSlotType.CHEST, properties);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, World worldIn, List<ITextComponent> tooltip,
			ITooltipFlag flagIn) {
		super.appendHoverText(stack, worldIn, tooltip, flagIn);
	}
	
}
