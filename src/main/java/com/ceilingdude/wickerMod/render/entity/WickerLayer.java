package com.ceilingdude.wickerMod.render.entity;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.ceilingdude.wickerMod.wickerMod;
import com.ceilingdude.wickerMod.core.init.ItemInit;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class WickerLayer<T extends LivingEntity, M extends EntityModel<T>> extends LayerRenderer<T, M> {
    private static final ResourceLocation TEXTURE_ELYTRA = new ResourceLocation(wickerMod.MOD_ID, "textures/entities/wicker_wings.png");
    private final WickerModel<T> modelElytra = new WickerModel<>();

    public WickerLayer(IEntityRenderer<T, M> entityRendererIn) {
        super(entityRendererIn);
    }

    @Override
    public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, T entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        ItemStack itemstack = entitylivingbaseIn.getItemBySlot(EquipmentSlotType.CHEST);
        if (itemstack.getItem() == ItemInit.WICKER_WINGS.get()) {
            ResourceLocation resourcelocation;
            resourcelocation = TEXTURE_ELYTRA;

            matrixStackIn.pushPose();
            matrixStackIn.translate(0.0D, 0.0D, 0.125D);
            this.getParentModel().copyPropertiesTo(this.modelElytra);
            this.modelElytra.setRotationAngles(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			IVertexBuilder ivertexbuilder = ItemRenderer.getArmorFoilBuffer(bufferIn, this.modelElytra.renderType(resourcelocation), false, itemstack.hasFoil());
            this.modelElytra.renderToBuffer(matrixStackIn, ivertexbuilder, packedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
            matrixStackIn.popPose();
        }
   }

}