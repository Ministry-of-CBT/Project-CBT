import mods.gregtech.multiblock.Builder;
import mods.gregtech.multiblock.FactoryBlockPattern;
import mods.gregtech.multiblock.RelativeDirection;
import mods.gregtech.multiblock.functions.IPatternBuilderFunction;
import mods.gregtech.IControllerTile;
import mods.gregtech.multiblock.CTPredicate;
import mods.gregtech.multiblock.IBlockPattern;
import mods.gregtech.recipe.FactoryRecipeMap;
import mods.gregtech.recipe.RecipeMap;

import crafttweaker.data.IData;
import crafttweaker.world.IFacing;
import crafttweaker.item.IItemStack;
import crafttweaker.item.IItemCondition;

import scripts.common.makeShaped as makeShaped;

val lithography_apparatus = Builder.start("lithography_apparatus", id_here)
    .withPattern(function(controller as IControllerTile) as IBlockPattern {
        return FactoryBlockPattern.start()
            .aisle(
                "",
                "",
                "",
                "",
                ""
            )
            .aisle(
                "",
                "",
                "",
                "",
                ""
            ) // you have add as many aisles as you want

            .where('A', <metastate:block>) // block id here
            .where('B', <metastate:block>) // block id here
            // you can add as many different blocks as you want, just copy and paste the ".where()" and put different letters

            .where('-', CTPredicate.getAny()) // air

            .where('C', controller.self()) // controller

            //.where("I", MetaTileEntities.ITEM_IMPORT_BUS[0], IFacing.west())
            //.where("O", MetaTileEntities.ITEM_EXPORT_BUS[0], IFacing.west())
            //.where("E", MetaTileEntities.ENERGY_INPUT_HATCH[2], IFacing.west())
            // only hatches

            .where('Z', CTPredicate.states(<metastate:casing_block>) // casing id here
            | controller.autoAbilities(true, false, true, true, false, false, false)) // hatches or casing
            .build();

    } as IPatternBuilderFunction)
    .withRecipeMap(
        FactoryRecipeMap.start("lithography_apparatus") // change numbers around here
            .minInputs(1)
            .maxInputs(1)
            .minOutputs(1)
            .maxOutputs(1)
            .build())
    .withBaseTexture(<metastate:casing_block>) // base texture of hatches
    .buildAndRegister();

lithography_apparatus.hasMufflerMechanics = false;
lithography_apparatus.hasMaintenanceMechanics = false;
