import gregtech.api.metatileentity.multiblock.CleanroomType
import net.minecraft.item.ItemStack
import net.minecraft.item.Item

lcr = recipemap('large_chemical_reactor')
ebf = recipemap('electric_blast_furnace')
chemical_reactor = recipemap('chemical_reactor')
fluid_solidifier = recipemap('fluid_solidifier')
forge_hammer = recipemap('forge_hammer')
canner = recipemap('canner')
compressor = recipemap('compressor')
assembler = recipemap('assembler')

   lcr.recipeBuilder() // Chloroacetone
            .inputs(metaitem('dustAluminiumTrichloride') * 15)
            .fluidInputs(fluid('chlorine') * 10000, fluid('acetone') * 10000)
            .fluidOutputs(fluid('chloroacetone') * 10000)
            .duration(200) // 10 seconds
            .EUt(2048) // EV recipe
            .buildAndRegister()

   lcr.recipeBuilder() // phenylacetone
            .inputs(metaitem('dustAluminiumTrichloride') * 2)
            .fluidInputs(fluid('benzene') * 44000, fluid('chloroacetone') * 7000)
            .fluidOutputs(fluid('phenylacetone') * 6000)
            .duration(200)
            .EUt(1048)
            .buildAndRegister()

    chemical_reactor.recipeBuilder() // lithium hydride
            .inputs(ore('dustLithium'))
            .fluidInputs(fluid('hydrogen') * 1000)
            .outputs(metaitem('dustLithiumHydride'))
            .duration(200)
            .EUt(120)
            .buildAndRegister()

    ebf.recipeBuilder() //ALuminium Trichloride
            .inputs(ore('dustAluminium') * 2)
            .fluidInputs(fluid('hydrochloric_acid') * 6000)
            .outputs(metaitem('dustAluminiumTrichloride') * 2)
            .duration(200)
            .EUt(120)
            .buildAndRegister()

    chemical_reactor.recipeBuilder() //Lithium Aluminium Hydride
            .inputs(metaitem('dustLithiumHydride') * 4)
            .fluidInputs(fluid('aluminium_trichloride') * 1000)
            .outputs(metaitem('dustLithiumAluminiumHydride'), metaitem('dustLithiumChloride') * 3)
            .duration(200)
            .EUt(120)
            .buildAndRegister()

    chemical_reactor.recipeBuilder() // methylamine
            .fluidInputs(fluid('methanol') * 2000, fluid('ammonia') * 2000)
            .fluidOutputs(fluid('water') * 2000, fluid('methylamine') * 2000)
            .circuitMeta(4)
            .duration(200)
            .EUt(120)
            .buildAndRegister()

    chemical_reactor.recipeBuilder()
            .inputs(metaitem('dustLithiumAluminiumHydride') * 2)
            .fluidInputs(fluid('methylamine') * 2000, fluid('phenylacetone') * 1000)
            .fluidOutputs(fluid('methamphetamine') * 2000)
            .cleanroom(CleanroomType.CLEANROOM)
            .duration(200)
            .EUt(8192)
            .buildAndRegister()

    fluid_solidifier.recipeBuilder()
            .fluidInputs(fluid('methamphetamine') * 144)
            .notConsumable(item('gregtech:meta_item_1', 12))
            .outputs(item('gregtech:meta_plate', 20001))
            .duration(10)
            .EUt(120)
            .buildAndRegister()

    fluid_solidifier.recipeBuilder()
            .fluidInputs(fluid('polyvinyl_chloride') * 144)
            .notConsumable(item('cbt:shapeglove'))
            .outputs(item('cbt:pvcglove'))
            .duration(10)
            .EUt(120)
            .buildAndRegister()

    forge_hammer.recipeBuilder()
            .inputs(item('gregtech:meta_plate', 20001))
            .outputs(item('cbt:crystalmeth'))
            .duration(10)
            .EUt(120)
            .buildAndRegister()

    canner.recipeBuilder()
            .inputs(item('cbt:emptysyringe'))
            .fluidInputs(fluid('methamphetamine') * 1000)
            .outputs(item('cbt:methsyringe'))
            .duration(10)
            .EUt(120)
            .buildAndRegister()

    compressor.recipeBuilder()
            .inputs(item('cbt:crystalmeth') * 9)
            .outputs(item('cbt:methblock'))
            .duration(10)
            .EUt(120)
            .buildAndRegister()

    compressor.recipeBuilder()
            .inputs(item('cbt:methblock') * 9)
            .outputs(item('cbt:compressedmethblock'))
            .duration(10)
            .EUt(120)
            .buildAndRegister()

    assembler.recipeBuilder()
            .inputs(metaitem('plateBismuthBronze') * 6, metaitem('frameBismuthBronze'))
            .outputs(item('cbt:bronzebismuthcasing'))
            .circuitMeta(6)
            .duration(10)
            .EUt(120)
            .buildAndRegister()

    crafting.shapedBuilder()
        .name('syringe')
        .output(item('cbt:emptysyringe'))
        .matrix('  C',
                ' B ',
                'A  ')
        .key('A', item('cbt:plunger'))
        .key('B', metaitem('component.glass.tube'))
        .key('C', item('cbt:needle'))
        .register()

    crafting.shapedBuilder()
        .name('bismuthcasing')
        .output(item('cbt:bronzebismuthcasing'))
        .matrix('PHP',
                'PFP',
                'PWP')
        .key('P', metaitem('plateBismuthBronze'))
        .key('H', ore('toolHammer'))
        .key('F', metaitem('frameBismuthBronze'))
        .key('W', ore('toolWrench'))
        .register()
