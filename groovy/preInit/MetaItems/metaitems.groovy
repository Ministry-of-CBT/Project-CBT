import gregtech.api.GTValues;
import gregtech.api.GregTechAPI;
import gregtech.api.items.metaitem.*;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.ore.OrePrefix;
import net.minecraft.util.text.TextFormatting;
import gregtech.common.items.behaviors.TooltipBehavior;

// Project CBT - MetaItems General

log.infoMC("Project CBT: Adding Project CBT Related MetaItems")

StandardMetaItem projectcbt1 = new StandardMetaItem((short)2);
projectcbt1.setRegistryName("projectcbt_metaitem1")

projectcbt1.addItem(1, "gregtech.lean");

log.infoMC("Project CBT: Finished Task: Project CBT Related MetaItems")

