#loader gregtech
#priority 10000

import mods.gregtech.material.MaterialBuilder;
import mods.gregtech.material.Material;

var meth = MaterialBuilder(32000, "meth")
    .fluid()
    .color(0xE2E2E2)
    .components([<material:carbon>*10, <material:hydrogen>*15, <material:nitrogen>*1])
    .build();

var crystalMeth = MaterialBuilder(32001, "crystal_meth")
    .dust()
    .color(0x93FBFF)
    .components([<material:meth>*1, <material:hydrochloric_acid>*1])
    .build();

var hydrogenCyanide = MaterialBuilder(32002, "hydrogen_cyanide")
    .fluid("gas")
    .colorAverage()
    .components([<material:hydrogen>*1, <material:carbon>*1, <material:nitrogen>*1])
    .build();

var sodiumCyanide = MaterialBuilder(32003, "sodium_cyanide")
    .dust()
    .colorAverage()
    .components([<material:sodium>*1, <material:carbon>*1, <material:nitrogen>*1])
    .build();

var benzylChloride = MaterialBuilder(32004, "benzyl_chloride")
    .fluid()
    .color(0xE0DCA3)
    .components([<material:carbon>*7, <material:hydrogen>*7, <material:chlorine>*1])
    .build();

var benzylCyanide = MaterialBuilder(32005, "benzyl_cyanide")
    .fluid()
    .colorAverage()
    .components([<material:carbon>*8, <material:hydrogen>*7, <material:nitrogen>*1])
    .build();

var phenylaceticAcid = MaterialBuilder(32006, "phenylacetic_acid")
    .fluid()
    .colorAverage()
    .components([<material:carbon>*8, <material:hydrogen>*8, <material:oxygen>*2])
    .build();

var phenylacetone = MaterialBuilder(32007, "phenylacetone")
    .fluid()
    .colorAverage()
    .components([<material:carbon>*9, <material:hydrogen>*10, <material:oxygen>*1])
    .build();

var aceticAnhydride = MaterialBuilder(32008, "acetic_anhydride")
    .fluid()
    .colorAverage()
    .components([<material:carbon>*4, <material:hydrogen>*6, <material:oxygen>*3])
    .build();

var sodiumAcetate = MaterialBuilder(32009, "sodium_acetate")
    .dust()
    .color(0xEFEFEF)
    .components([<material:carbon>*2, <material:hydrogen>*3, <material:sodium>*1, <material:oxygen>*2])
    .build();

var methylamine = MaterialBuilder(32010, "methylamine")
    .fluid()
    .colorAverage()
    .components([<material:carbon>*1, <material:hydrogen>*5, <material:nitrogen>*1])
    .build();

var chloroacetone = MaterialBuilder(32011, "chloroacetone")
    .fluid()
    .colorAverage()
    .components([<material:carbon>*3, <material:hydrogen>*5, <material:chlorine>*1, <material:oxygen>*1])
    .build();

var sodiumMetasilicate = MaterialBuilder(32012, "sodium_metasilicate")
    .dust()
    .color(0xF2F2F2)
    .components([<material:sodium>*2,<material:silicon>*1,<material:oxygen>*3])
    .build();

var aluminiumChloride = MaterialBuilder(32013, "aluminium_chloride")
    .dust()
    .color(0xF2F252)
    .components([<material:aluminium>*1,<material:chlorine>*3])
    .build();

var aluminiumChlorideHydrate = MaterialBuilder(32014, "aluminium_chloride_hydrate")
    .dust()
    .color(0xF2F2DD)
    .components([<material:aluminium_chloride>*1, <material:water>*6])
    .build();

var sodiumBorohydride = MaterialBuilder(32015, "sodium_borohydride")
    .dust()
    .color(0xFFFFFF)
    .components([<material:sodium>*1,<material:boron>*1,<material:hydrogen>*4])
    .build();

