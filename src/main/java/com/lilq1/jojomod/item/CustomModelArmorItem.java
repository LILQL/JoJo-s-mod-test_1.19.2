package com.lilq1.jojomod.item;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.state.property.Properties;

public class CustomModelArmorItem extends ArmorItem {

    protected String textureStr;

    public CustomModelArmorItem(ArmorMaterial material, EquipmentSlot slot, Properties builder) {
        super(material, slot, builder);
    }
}
