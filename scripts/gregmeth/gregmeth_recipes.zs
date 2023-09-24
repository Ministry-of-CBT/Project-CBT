import mods.gregtech.recipe.RecipeMap;

val electrolyzer as RecipeMap = <recipemap:electrolyzer>;

electrolyzer.findRecipe(60, null, [<liquid:chloroacetone> * 1000]).remove();
electrolyzer.findRecipe(60, null, [<liquid:meth> * 1000]).remove();
electrolyzer.findRecipe(30, [<metaitem:dustCrystalMeth> * 2], null).remove();
electrolyzer.findRecipe(60, null, [<liquid:hydrogen_cyanide> * 1000]).remove();
electrolyzer.findRecipe(60, [<metaitem:dustSodiumCyanide> * 3], null).remove();
electrolyzer.findRecipe(60, null, [<liquid:benzyl_chloride> * 1000]).remove();
electrolyzer.findRecipe(60, null, [<liquid:benzyl_cyanide> * 1000]).remove();
electrolyzer.findRecipe(60, null, [<liquid:phenylacetic_acid> * 1000]).remove();
electrolyzer.findRecipe(60, null, [<liquid:phenylacetone> * 1000]).remove();
electrolyzer.findRecipe(60, null, [<liquid:acetic_anhydride> * 1000]).remove();
electrolyzer.findRecipe(60, [<metaitem:dustSodiumAcetate> * 8], null).remove();
electrolyzer.findRecipe(60, null, [<liquid:methylamine> * 1000]).remove();
electrolyzer.findRecipe(60, [<metaitem:dustSodiumMetasilicate> * 6], null).remove();
electrolyzer.findRecipe(30, [<metaitem:dustAluminiumChlorideHydrate> * 7], null).remove();
electrolyzer.findRecipe(30, [<metaitem:dustAluminiumChloride> * 4], null).remove();
electrolyzer.findRecipe(60, [<metaitem:dustSodiumBorohydride> * 6], null).remove();

val chemical_reactor as RecipeMap = <recipemap:chemical_reactor>;
val large_chemical_reactor as RecipeMap = <recipemap:large_chemical_reactor>;

// methane + ammonia + oxygen -> hydrogen cyanide + water
chemical_reactor.recipeBuilder()
    .inputs([<metaitem:wireFinePlatinum>])
    .fluidInputs([<liquid:methane>*2000, <liquid:ammonia>*2000, <liquid:oxygen>*3000])
    .chancedOutput(<metaitem:wireFinePlatinum>*1, 9000, 200)
    .fluidOutputs([<liquid:hydrogen_cyanide>*2000, <liquid:water>*2000])
    .EUt(480)
    .duration(200)
    .circuit(1)
    .buildAndRegister();

// hydrogen cyanide + sodium hydroxide -> sodium cyanide + water
chemical_reactor.recipeBuilder()
    .inputs([<metaitem:dustSodiumHydroxide>])
    .fluidInputs([<liquid:hydrogen_cyanide>*1000])
    .outputs([<metaitem:dustSodiumCyanide>])
    .fluidOutputs([<liquid:water>*1000])
    .EUt(30)
    .duration(40)
    .circuit(1)
    .buildAndRegister();

// chlorine + toluene -> benzyl chloride + hydrochloric acid
chemical_reactor.recipeBuilder()
    .fluidInputs([<liquid:chlorine>*1000,<liquid:toluene>*1000])
    .fluidOutputs([<liquid:benzyl_chloride>*1000,<liquid:hydrochloric_acid>*1000])
    .EUt(120)
    .duration(120)
    .circuit(1)
    .buildAndRegister();

// sodium cyanide + benzyl chloride -> benzyl cyanide + sodium chloride
chemical_reactor.recipeBuilder()
    .inputs([<metaitem:dustSodiumCyanide>])
    .fluidInputs([<liquid:benzyl_chloride>*1000])
    .outputs([<metaitem:dustSalt>])
    .fluidOutputs([<liquid:benzyl_cyanide>*1000])
    .EUt(30)
    .duration(80)
    .circuit(1)
    .buildAndRegister();

//benzyl cyanide + hydrochloric acid + water -> phenylacetic acid + ammonia
chemical_reactor.recipeBuilder()
    .fluidInputs([<liquid:benzyl_cyanide>*1000,<liquid:hydrochloric_acid>*2000,<liquid:water>*2000])
    .fluidOutputs([<liquid:phenylacetic_acid>*1000,<liquid:ammonia>*1000])
    .EUt(120)
    .duration(200)
    .circuit(1)
    .buildAndRegister();

//methyl acetate + carbon monoxide -> acetic anhydride
chemical_reactor.recipeBuilder()
    .fluidInputs([<liquid:methyl_acetate>*1000,<liquid:carbon_monoxide>*1500])
    .fluidOutputs([<liquid:acetic_anhydride>*1000])
    .EUt(120)
    .duration(160)
    .circuit(1)
    .buildAndRegister();

// acetic acid + sodium hydroxide -> sodium acetate
chemical_reactor.recipeBuilder()
    .inputs([<metaitem:dustSodiumHydroxide>])
    .fluidInputs([<liquid:acetic_acid>*1000])
    .outputs([<metaitem:dustSodiumAcetate>])
    .EUt(30)
    .duration(40)
    .circuit(1)
    .buildAndRegister();

// PAA + acetic anhydride + sodium acetate -> P2P + water + CO2
large_chemical_reactor.recipeBuilder()
    .inputs([<metaItem:dustSodiumAcetate>])
    .fluidInputs([<liquid:phenylacetic_acid>*1000, <liquid:acetic_anhydride>*1000])
    .fluidOutputs([<liquid:phenylacetone>*1000, <liquid:water>*1000, <liquid:carbon_dioxide>*1000])
    .EUt(120)
    .duration(120)
    .circuit(1)
    .buildAndRegister();

//chlorine + acetone -> chloroacetone + HCl
chemical_reactor.recipeBuilder()
    .fluidInputs([<liquid:acetone>*1000, <liquid:chlorine>*1000])
    .fluidOutputs([<liquid:chloroacetone>*1000, <liquid:hydrochloric_acid>*1000])
    .EUt(120)
    .duration(120)
    .circuit(1)
    .buildAndRegister();

//aluminium + HCl -> aluminium hydrochloride hexahydrate
chemical_reactor.recipeBuilder()
    .inputs([<metaitem:dustAluminium>])
    .fluidInputs([<liquid:diluted_hydrochloric_acid>*3000])
    .outputs([<metaitem:dustAluminiumChlorideHydrate>])
    .fluidOutputs([<liquid:hydrogen>*1500])
    .EUt(30)
    .duration(20)
    .circuit(1)
    .buildAndRegister();

//aluminium + chlorine -> anhydrous aluminium chloride
chemical_reactor.recipeBuilder()
    .inputs([<metaitem:dustAluminium>*2])
    .fluidInputs([<liquid:chlorine>*3])
    .outputs([<metaitem:dustAluminiumChloride>*2])
    .EUt(120)
    .duration(120)
    .circuit(1)
    .buildAndRegister();

//aluminium chloride hexahydrate -> anhydrous aluminium chloride
furnace.addRecipe(
    <metaitem:dustAluminiumChloride>,
    <metaitem:dustAluminiumChlorideHydrate>
);

//anhydrous aluminium chloride + benzene + chloroacetone -> phenylacetone
chemical_reactor.recipeBuilder()
    .inputs([<metaitem:dustAluminiumChloride>])
    .fluidInputs([<liquid:chloroacetone>*1000, <liquid:benzene>*1000])
    .fluidOutputs([<liquid:phenylacetone>*1000, <liquid:hydrochloric_acid>*1000])
    .EUt(120)
    .duration(100)
    .circuit(1)
    .buildAndRegister();

//ammonia and methanol to methylamine: zeolite catalyst
chemical_reactor.recipeBuilder()
    .inputs([<metaitem:dustSmallZeolite>])
    .fluidInputs([<liquid:methane>*1000,<liquid:ammonia>*1000])
    .fluidOutputs([<liquid:methylamine>*1000])
    .EUt(120)
    .duration(160)
    .circuit(1)
    .buildAndRegister();

//ammonia and methanol to methylamine: alumina catalyst
chemical_reactor.recipeBuilder()
    .inputs([<metaitem:dustSmallBauxite>])
    .fluidInputs([<liquid:methane>*1000,<liquid:ammonia>*1000])
    .fluidOutputs([<liquid:methylamine>*750])
    .EUt(120)
    .duration(200)
    .circuit(1)
    .buildAndRegister();

//ammonia and methanol to methylamine: clay catalyst
chemical_reactor.recipeBuilder()
    .inputs([<metaitem:dustSmallClay>])
    .fluidInputs([<liquid:methane>*1000,<liquid:ammonia>*1000])
    .fluidOutputs([<liquid:methylamine>*250])
    .EUt(120)
    .duration(300)
    .circuit(1)
    .buildAndRegister();

//sodium + borax + H2 + SiO2 --> sodium borohydride
large_chemical_reactor.recipeBuilder()
    .inputs([<metaitem:dustSodium>*16,<metaitem:dustBorax>,<metaitem:dustSiliconDioxide>*7])
    .fluidInputs([<liquid:hydrogen>*8])
    .outputs([<metaitem:dustSodiumBorohydride>*4,<metaitem:dustSodiumMetasilicate>*7])
    .EUt(480)
    .duration(240)
    .buildAndRegister();

//p2p + NaBH4 + methylamine -> meth
chemical_reactor.recipeBuilder()
    .inputs([<metaitem:dustTinySodiumBorohydride>])
    .fluidInputs([<liquid:methylamine>*1000,<liquid:phenylacetone>*1000])
    .fluidOutputs([<liquid:meth>*1000, <liquid:water>*1000])
    .EUt(120)
    .duration(200)
    .circuit(1)
    .buildAndRegister();

// liquid meth to crystal meth
chemical_reactor.recipeBuilder()
    .fluidInputs([<liquid:meth>*1000,<liquid:hydrochloric_acid>*1000])
    .outputs([<metaitem:dustCrystalMeth>])
    .EUt(60)
    .duration(30)
    .circuit(1)
    .buildAndRegister();