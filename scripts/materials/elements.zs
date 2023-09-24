#loader gregtech
#priority 10000

import mods.gregtech.material.MaterialBuilder;
import mods.gregtech.material.Material;
import mods.gregtech.material.Elements;

var Schrabidium_326 = Elements.add(126, 200, -1, null, "Schrabidium", "Sa", true); // create a new element.

var Schrabidium_327 = Elements.add(126, 201, -1, null, "Solinium", "Sa-327", true); // create a new element.

var schrabidium = MaterialBuilder(23000, "schrabidium").element("Schrabidium")
    .ingot()
    .build();

var solinium = MaterialBuilder(23001, "solinium").element("Solinium")
    .ingot()
    .build();