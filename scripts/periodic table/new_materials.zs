#loader gregtech
#priority 2000

import mods.gregtech.material.MaterialBuilder;
import mods.gregtech.material.Material;
import mods.gregtech.material.Elements;

//New Elements

var element_susanium = MaterialBuilder(15002, "susanium").element("Susanium-306")
    .fluid("fluid", false)
    .plasma()
    .ingot()
    .iconSet("metallic") // iconset 
    .color(0x60D82A)
    .build();

var element_dylantrum = MaterialBuilder(15003, "dylantrum").element("Dylantrum-309")
    .fluid("fluid", false)
    .plasma()
    .ingot()
    .iconSet("metallic") // iconset 
    .color(0xE54D4D)
    .cableProperties(1572864, 1, 16, false) // add cables
    .flags(["generate_plate", "generate_rod", "generate_frame", "disable_decomposition"])
    .build();

var element_agrastium = MaterialBuilder(15004, "agrastium").element("Agrastium-313")
    .fluid("fluid", false)
    .plasma()
    .ingot()
    .iconSet("metallic") // iconset 
    .color(0xCA2245)
    .flags(["generate_plate", "disable_decomposition"])
    .build();

var element_ruslyium = MaterialBuilder(15005, "ruslyium").element("Ruslyium-318")
    .fluid("fluid", false)
    .plasma()
    .ingot()
    .iconSet("metallic") // iconset 
    .color(0x407DB0)
    .flags(["generate_plate", "generate_frame", "generate_foil", "generate_fine_wire", "disable_decomposition"])
    .itemPipeProperties(1, 32)
    .build();

var element_schrabidium = MaterialBuilder(15007, "schrabidium").element("Schrabidium-326")
    .fluid("fluid", false)
    .plasma()
    .ingot()
    .iconSet("shiny") // iconset 
    .color(0x64C2B9)
    .toolStats(10, 3, 256, 21) // temporary stat
    .rotorStats(10, 2, 1000)
    .fluidTemp(50000)
    .blastTemp(30000, HIGHEST, 131072, 6000)
    .flags(["generate_plate", "generate_rod", "generate_frame", "generate_gear", "generate_long_rod", "generate_foil", "generate_fine_wire", "generate_round", "generate_dense", "generate_rotor", "generate_ring", "generate_small_gear", "generate_spring", "generate_spring_small", "disable_decomposition"])
    .cableProperties(2097152, 16, 0, true) // add cables
    .build();

var element_solinium = MaterialBuilder(15008, "solinium").element("Solinium-327")
    .ingot()
    .iconSet("dull") // iconset 
    .color(0x64C2B9)
    .flags(["generate_plate", "generate_rod", "generate_frame", "generate_gear", "generate_long_rod", "generate_foil", "generate_fine_wire"])
    .build();

var element_veridium = MaterialBuilder(15009, "veridium").element("Veridium-328")
    .ingot()
    .iconSet("quartz") // iconset 
    .color(0xB1F430)
    .fluidPipeProperties(20000, 200, true, true, true, true)
    .build();

var element_lunarium = MaterialBuilder(15010, "lunarium").element("Lunarium-331")
    .ingot()
    .iconSet("certus") // iconset 
    .color(0x3283A8)
    .build();

var element_etherium = MaterialBuilder(15011, "etherium").element("Etherium-335")
    .ingot()
    .iconSet("bright") // iconset 
    .color(0xA7453A)
    .build();

var element_xenynium = MaterialBuilder(15012, "xenynium").element("Xenynium-339")
    .ingot()
    .iconSet("bright") // iconset 
    .color(0xC7B142)
    .build();

var element_neptupitrium = MaterialBuilder(15013, "neptupitrium").element("Neptupitrium-342")
    .ingot()
    .iconSet("gem_horizontal") // iconset 
    .color(0x54BBC2)
    .build();

var element_solimonium = MaterialBuilder(15014, "solimonium").element("Solimonium-346")
    .ingot()
    .iconSet("rough") // iconset 
    .color(0x62697B)
    .build();

var element_aetherium = MaterialBuilder(15015, "aetherium").element("Aetherium-350")
    .ingot()
    .iconSet("opal") // iconset 
    .color(0xA18BC3)
    .build();

var element_quasarium = MaterialBuilder(15016, "quasarium").element("Quasarium-354")
    .ingot()
    .iconSet("netherstar") // iconset 
    .color(0xFFDD03)
    .build();

var element_laranium = MaterialBuilder(15017, "laranium").element("Laranium-358")
    .ingot()
    .iconSet("certus") // iconset 
    .color(0x9CB3A4)
    .build();

var element_polinium = MaterialBuilder(15018, "pyranium").element("Pyranium-362")
    .ingot()
    .iconSet("rough") // iconset 
    .color(0xACBCDC)
    .build();

var element_silisimmunium = MaterialBuilder(15019, "silisimmunium").element("Silisimmunium-365")
    .ingot()
    .build();

var element_ryneurassium = MaterialBuilder(15020, "ryneurassium").element("Ryneurassium-369")
    .ingot()
    .build();

var element_supractinium = MaterialBuilder(15021, "supractinium").element("Supractinium-374")
    .ingot()
    .build();

var element_puthanium = MaterialBuilder(15022, "puthanium").element("Puthanium-378")
    .ingot()
    .build();

var element_coslynium = MaterialBuilder(15023, "coslynium").element("Coslynium-382")
    .ingot()
    .build();

var element_yrattasium = MaterialBuilder(15024, "yrattasium").element("Yrattasium-386")
    .ingot()
    .build();

var element_retherium = MaterialBuilder(15025, "runevaline").element("Runevaline-390")
    .ingot()
    .build();

var element_neovaline = MaterialBuilder(15026, "neovaline").element("Neovaline-394")
    .ingot()
    .build();

var element_caranium = MaterialBuilder(15027, "cesarium").element("Cesarium-399")
    .ingot()
    .build();

var element_quannasarium = MaterialBuilder(15028, "quannasarium").element("Quannasarium-403")
    .ingot()
    .build();

var element_jadynomium = MaterialBuilder(15029, "jadynomium").element("Jadynomium-407")
    .ingot()
    .build();

var element_jaumium = MaterialBuilder(15030, "jaumium").element("Jaumium-412")
    .ingot()
    .build();

var element_euronium = MaterialBuilder(15031, "euronium").element("Euronium-416")
    .ingot()
    .build();

var element_dimosonium = MaterialBuilder(15032, "dimosonium").element("Dimosonium-421")
    .ingot()
    .build();

var element_krassium = MaterialBuilder(15033, "krassium").element("krassium-425")
    .ingot()
    .build();

var element_dithermonium = MaterialBuilder(15034, "dithermonium").element("Dithermonium-430")
    .ingot()
    .build();

var element_prassoppurium = MaterialBuilder(15035, "prassoppurium").element("Prassoppurium-435")
    .ingot()
    .build();

var element_sunatrium = MaterialBuilder(15036, "sunatrium").element("Sunatrium-439")
    .ingot()
    .build();

var element_bralyium = MaterialBuilder(15037, "bralyium").element("Bralyium-444")
    .ingot()
    .build();

var element_quintessium = MaterialBuilder(15038, "quintessium").element("Quintessium-449")
    .ingot()
    .build();

var element_zephyrion = MaterialBuilder(15039, "zephyrion").element("Zephyrion-454")
    .ingot()
    .build();

var element_chronotite = MaterialBuilder(15040, "chronotite").element("Chronotite-459")
    .ingot()
    .build();

var element_luminarite = MaterialBuilder(15041, "luminarite").element("Luminarite-463")
    .ingot()
    .build();

var element_pyrocore = MaterialBuilder(15042, "pyrocore").element("Pyrocore-468")
    .ingot()
    .build();

var element_spectresium = MaterialBuilder(15043, "spectresium").element("Spectresium-474")
    .ingot()
    .build();

var element_aquamimite = MaterialBuilder(15044, "aquamimite").element("Aquamimite-479")
    .ingot()
    .build();

var element_terravium = MaterialBuilder(15045, "terravium").element("Terravium-484")
    .ingot()
    .build();

var element_psilunarite = MaterialBuilder(15046, "psilunarite").element("Psilunarite-489")
    .ingot()
    .build();

var element_nebulium = MaterialBuilder(15047, "nebulium").element("Nebulium-495")
    .ingot()
    .build();

var element_scytronium = MaterialBuilder(15048, "scytronium").element("Scytronium-500")
    .ingot()
    .build();

var element_modulatum = MaterialBuilder(15049, "modulatum").element("Modulatum-505")
    .ingot()
    .build();

var element_etharosium = MaterialBuilder(15050, "etharosium").element("Etharosium-510")
    .ingot()
    .build();

var element_echotium = MaterialBuilder(15051, "echotium").element("Echotium-516")
    .ingot()
    .build();

var element_naquadasson = MaterialBuilder(15052, "naquadasson").element("Naquadasson-520")
    .ingot()
    .build();


