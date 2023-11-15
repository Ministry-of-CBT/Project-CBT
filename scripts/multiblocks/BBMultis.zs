/*import mods.gregtech.multiblock.Builder;
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

val dealer = Builder.start("dealer", 28100)
    .withPattern(function(controller as IControllerTile) as IBlockPattern {
        return FactoryBlockPattern.start()
            .aisle(
                "AFFFA",
                "CDDDC",
                "CDDDC",
                "CDDDC",
                "ABBBA"
            )
            .aisle(
                "FDDDF",
                "D---D",
                "D---D",
                "D---D",
                "BDDDB"
            )
            .aisle(
                "FDDDF",
                "D---D",
                "G-H-G",
                "D---D",
                "BDDDB"
            )
            .aisle(
                "FDDDF",
                "D---D",
                "G-H-G",
                "D---D",
                "BDDDB"
            )
            .aisle(
                "FDDDF",
                "D---D",
                "D---D",
                "D---D",
                "BDDDB"
            )
            .aisle(
                "AFFFA",
                "CDDDC",
                "CDSDC",
                "CDDDC",
                "ABBBA"
            )
            .where('S', controller.self())
            .where('A', <metastate:gregtech:meta_block_compressed_188:14>) // incoloy block
            .where('B', <metastate:gregtech:meta_block_frame_18:15>) // bismuth bronze frame
            .where('C', <metastate:actuallyadditions:block_misc:9>) // aluminium casing
            .where('-', CTPredicate.getAny())
            .where('F', <metastate:gregtech:meta_block_frame_188:14>) // incoloy frame
            .where('G', <metastate:appliedenergistics2:quartz_vibrant_glass>) // vibrant quartz glass
            .where('H', <metastate:cbt:compressedmethblock>) // double compressed meth
            .where('D', CTPredicate.states(<metastate:cbt:bronzebismuthcasing>)
            | controller.autoAbilities(true, false, true, true, false, false, false))
           .build();
    } as IPatternBuilderFunction)
    .withRecipeMap(
        FactoryRecipeMap.start("dealer")
            .minInputs(1)
            .maxInputs(1)
            .minOutputs(1)
            .maxOutputs(1)
            .build())
    .withBaseTexture(<metastate:cbt:bronzebismuthcasing>)
    .buildAndRegister();

dealer.hasMufflerMechanics = false;
dealer.hasMaintenanceMechanics = false;

makeShaped("dealer", <metaitem:multiblocktweaker:dealer>,
    ["ABA",
     "CDC",
     "EFE"],
    { A : <cbt:bronzebismuthcasing>,
      B : <cbt:pvcglove>,
      C : <ore:circuitIv>,
      D : <cbt:emptysyringe>,
      E : <gregtech:meta_item_1:191>,
      F : <cbt:compressedmethblock>
    });

dealer.recipeMap.recipeBuilder()
    .duration(2)
    .EUt(32768)
    .inputs(<cbt:crystalmeth> * 64)
    .outputs(<minecraft:diamond> * 8)
    .buildAndRegister();

dealer.recipeMap.recipeBuilder()
    .duration(2)
    .EUt(32768)
    .inputs(<cbt:methsyringe> * 16)
    .outputs(<minecraft:diamond> * 4)
    .buildAndRegister();*/
