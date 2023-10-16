#loader gregtech
#priority 1000

import mods.gregtech.material.MaterialBuilder;
import mods.gregtech.material.Material;
import mods.gregtech.material.Elements;

var tetrisarium = MaterialBuilder(16000, "tetrisarium")
    .ingot()
    .color(0x4ACB83)
    .blastTemp(40000)
    .cableProperties(8388608, 2, 4, false) // add cables
    .components([<material:schrabidium>*4, <material:quasarium>*6, <material:technetium>*3, <material:trinium>*2])
    .build();

var schrabaquadium = MaterialBuilder(16001, "schrabaquadium")
    .ingot()
    .color(0x02CFA6)
    .blastTemp(30000)
    .flags(["generate_plate", "generate_rod", "generate_frame", "generate_gear", "generate_long_rod", "no_smelting", "generate_foil", "generate_fine_wire", "disable_decomposition"])
    .cableProperties(4194304, 4, 6, false) // add cables
    .components([<material:schrabidium>*4, <material:naquadah>*3])
    .build();

var scalloissine = MaterialBuilder(16002, "scalloissine")
    .ingot()
    .color(0x4AABCC)
    .blastTemp(40000)
    .components([<material:tetrisarium>*4, <material:schrabaquadium>*9, <material:crystal_meth>*5, <material:polytetrafluoroethylene>*3])
    .build();