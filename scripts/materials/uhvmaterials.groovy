#loader gregtech
#priority 10000

import mods.gregtech.material.MaterialBuilder;
import mods.gregtech.material.Material;
import mods.gregtech.material.Elements;

var tetraschrabadic_trinaquadium = MaterialBuilder(23500, "tetraschrabadic_trinaquadium")
    .ingot()
    .color(0x02CFA6)
    .flags(["generate_plate", "generate_rod", "generate_frame", "generate_gear", "generate_long_rod", "no_smelting", "generate_foil", "generate_fine_wire", "disable_decomposition"])
    .components([<material:schrabidium>*4, <material:naquadah>*3])
    .build();