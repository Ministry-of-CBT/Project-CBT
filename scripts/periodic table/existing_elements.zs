#loader gregtech
#priority 10000

import mods.gregtech.material.MaterialBuilder;
import mods.gregtech.material.Material;
import mods.gregtech.material.Elements;

// Elements in Periodic Table, include isotopes

var quatrium = Elements.add(1, 3, -1, null, "Quatrium", "Q", true); 
var helium2 = Elements.add(2, 0, -1, null, "Helium-2", "He-2", true);
var lithium6 = Elements.add(3, 3, -1, null, "Lithium-6", "Li-6", true);
var beryllium8 = Elements.add(4, 5, -1, null, "Beryllium-8", "Be-8", true);
var carbon13 = Elements.add(6, 7, -1, null, "Carbon-13", "C-13", true);
var carbon14 = Elements.add(6, 8, -1, null, "Carbon-14", "C-14", true);
var technetium99 = Elements.add(43, 46, -1, null, "Technetium-99", "Tc-99", true);
var halfnium177 = Elements.add(72, 105, -1, null, "Halfnium-177", "Hf-177", true);

// New Element Materials

var hydrogen = MaterialBuilder(23002, "hydrogen_gas").element("Hydrogen")
    .fluid()
    .build();

// Deuterium present in base GT already

var helium = MaterialBuilder(23003, "helium_gas").element("Helium")
    .fluid()
    .build();

