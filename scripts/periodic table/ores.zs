#loader gregtech
#priority 999

import mods.gregtech.material.MaterialBuilder;
import mods.gregtech.material.Material;
import mods.gregtech.material.Elements;

var voralite = MaterialBuilder(13000, "voralite")
    .ingot()
    .color(0x4ACB83)
    .blastTemp(40000)
    .cableProperties(8388608, 2, 4, false) // add cables
    .components([<material:susanium>*4, <material:trinium>*3, <material:naquadasson>*2, <material:jadynomium>*5, <material:supractinium>*1, ])
    .ore()
    .build();