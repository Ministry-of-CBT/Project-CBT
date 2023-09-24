import gregtech.api.GTValues;
import gregtech.api.GregTechAPI;
import gregtech.api.items.metaitem.*;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.ore.OrePrefix;
import net.minecraft.util.text.TextFormatting;
import gregtech.common.items.behaviors.TooltipBehavior;

// Each machine from GregTech has its own circuit assembly because having a general circuit that is used for each machine in each tier is unrealistic and besides, each machine has very different circuitry so it doesn't fucking making sense that GregTech has only a few circuits for each tier. That's bullgreg game design and not at all greggy. 
// Recipes of each tiered circuit for each specific machines will be different and modular-like, as the plan says.
// Priority of this moment is Function over Aesthetic, so there may be missing textures, but missing textures is low priority and anyway if you want to add texture you can go ahead just don't forget to add both the model and the texture for each missing specific item.

// ----------------- WELCOME TO THE CRAZY INSANITY ----------------- 
// "ACIDIC TERRITORY" ALERT!!!!!

// Project CBT - Circuits

log.infoMC("Project CBT: Adding Circuit Torture")

StandardMetaItem projectcbtcircuitslv = new StandardMetaItem((short)2);
projectcbtcircuitslv.setRegistryName("projectcbt_circuits_lv")

log.infoMC("Project CBT: Admit LV Circuits: Stage Machine-Specific Circuits")

projectcbtcircuitslv.addItem(0, "circuit.lv.motherboard_plating");
projectcbtcircuitslv.addItem(1, "circuit.lv.alloy_smelter");
projectcbtcircuitslv.addItem(2, "circuit.lv.arc_furnace");
projectcbtcircuitslv.addItem(3, "circuit.lv.assembly_machine");
projectcbtcircuitslv.addItem(4, "circuit.lv.assembly_line");
projectcbtcircuitslv.addItem(5, "circuit.lv.autoclave");
projectcbtcircuitslv.addItem(6, "circuit.lv.blender");
projectcbtcircuitslv.addItem(7, "circuit.lv.brewery");
projectcbtcircuitslv.addItem(8, "circuit.lv.canner");
projectcbtcircuitslv.addItem(9, "circuit.lv.centrifuge");
projectcbtcircuitslv.addItem(10, "circuit.lv.chemical_bath");
projectcbtcircuitslv.addItem(11, "circuit.lv.chemical_reactor");
projectcbtcircuitslv.addItem(12, "circuit.lv.circuit_assembler");
projectcbtcircuitslv.addItem(13, "circuit.lv.coke_oven");
projectcbtcircuitslv.addItem(14, "circuit.lv.compressor");
projectcbtcircuitslv.addItem(15, "circuit.lv.cracking_unit");
projectcbtcircuitslv.addItem(16, "circuit.lv.distillation_tower");
projectcbtcircuitslv.addItem(17, "circuit.lv.distillery");
projectcbtcircuitslv.addItem(18, "circuit.lv.electric_blast_furnace");
projectcbtcircuitslv.addItem(19, "circuit.lv.electric_Furnacer");
projectcbtcircuitslv.addItem(20, "circuit.lv.electrolyzer");
projectcbtcircuitslv.addItem(21, "circuit.lv.electromagnetic_separator");
projectcbtcircuitslv.addItem(22, "circuit.lv.extractor");
projectcbtcircuitslv.addItem(23, "circuit.lv.extruder");
projectcbtcircuitslv.addItem(24, "circuit.lv.fermenter");
projectcbtcircuitslv.addItem(25, "circuit.lv.fluid_heater");
projectcbtcircuitslv.addItem(26, "circuit.lv.fluid_solidifier");
projectcbtcircuitslv.addItem(27, "circuit.lv.forge_hammer");
projectcbtcircuitslv.addItem(28, "circuit.lv.forming_press");
projectcbtcircuitslv.addItem(29, "circuit.lv.fusion_reactor");
projectcbtcircuitslv.addItem(30, "circuit.lv.gas_collector");
projectcbtcircuitslv.addItem(31, "circuit.lv.implosion_compressor");
projectcbtcircuitslv.addItem(32, "circuit.lv.large_chemical_reactor");
projectcbtcircuitslv.addItem(33, "circuit.lv.laser_engraver");
projectcbtcircuitslv.addItem(34, "circuit.lv.lathe");
projectcbtcircuitslv.addItem(35, "circuit.lv.macerator");
projectcbtcircuitslv.addItem(36, "circuit.lv.mass_fabricator");
projectcbtcircuitslv.addItem(37, "circuit.lv.mixer");
projectcbtcircuitslv.addItem(38, "circuit.lv.ore_washing_plant");
projectcbtcircuitslv.addItem(39, "circuit.lv.package");
projectcbtcircuitslv.addItem(40, "circuit.lv.polarizer");
projectcbtcircuitslv.addItem(41, "circuit.lv.primitive_blast_furnace");
projectcbtcircuitslv.addItem(42, "circuit.lv.pyrolose_oven");
projectcbtcircuitslv.addItem(43, "circuit.lv.replicator");
projectcbtcircuitslv.addItem(44, "circuit.lv.rock_breaker");
projectcbtcircuitslv.addItem(45, "circuit.lv.scanner");
projectcbtcircuitslv.addItem(46, "circuit.lv.sifting_machine");
projectcbtcircuitslv.addItem(47, "circuit.lv.thermal_centrifuge");
projectcbtcircuitslv.addItem(48, "circuit.lv.vacuum_freezer");
projectcbtcircuitslv.addItem(49, "circuit.lv.wiremill");
projectcbtcircuitslv.addItem(50, "circuit.lv.eg_combustion_generator");
projectcbtcircuitslv.addItem(51, "circuit.lv.eg_gas_turbine");
projectcbtcircuitslv.addItem(52, "circuit.lv.eg_plasma_generator");
projectcbtcircuitslv.addItem(53, "circuit.lv.eg_semi_fluid_generator");
projectcbtcircuitslv.addItem(54, "circuit.lv.eg_steam_turbine");

log.infoMC("Project CBT: Admit LV Circuits: Stage Machine-Specific Circuits")

projectcbtcircuitslv.addItem(55, "circuit.lv.component.sus");
projectcbtcircuitslv.addItem(56, "circuit.lv.component.gyroscope");
projectcbtcircuitslv.addItem(57, "circuit.lv.component.led");
projectcbtcircuitslv.addItem(58, "circuit.lv.component.oscillator");
projectcbtcircuitslv.addItem(59, "circuit.lv.component.sound");
projectcbtcircuitslv.addItem(60, "circuit.lv.component.voltage_regulator");
projectcbtcircuitslv.addItem(61, "circuit.lv.component.diode");
projectcbtcircuitslv.addItem(62, "circuit.lv.component.capacitor");
projectcbtcircuitslv.addItem(63, "circuit.lv.component.resistor");
projectcbtcircuitslv.addItem(64, "circuit.lv.component.voltage_regulator");
projectcbtcircuitslv.addItem(65, "circuit.lv.component.configuration_chip");
projectcbtcircuitslv.addItem(66, "circuit.lv.component.sound_chip");
projectcbtcircuitslv.addItem(67, "circuit.lv.component.bus_chip");
projectcbtcircuitslv.addItem(68, "circuit.lv.component.memory");
projectcbtcircuitslv.addItem(69, "circuit.lv.component.motor");
projectcbtcircuitslv.addItem(70, "circuit.lv.component.bios");
projectcbtcircuitslv.addItem(71, "circuit.lv.component.piston");
projectcbtcircuitslv.addItem(72, "circuit.lv.component.heating_coil");
projectcbtcircuitslv.addItem(73, "circuit.lv.component.cooling_coil");
projectcbtcircuitslv.addItem(74, "circuit.lv.component.voltage_regulator");
projectcbtcircuitslv.addItem(75, "circuit.lv.component.configuration_chip");
projectcbtcircuitslv.addItem(76, "circuit.lv.component.backlight");
projectcbtcircuitslv.addItem(77, "circuit.lv.component.storage");
projectcbtcircuitslv.addItem(78, "circuit.lv.component.processor_socket");
projectcbtcircuitslv.addItem(79, "circuit.lv.component.interface");
projectcbtcircuitslv.addItem(80, "circuit.lv.component.filter_chip");

log.infoMC("Project CBT: Admit LV Circuits - Done")

StandardMetaItem projectcbtcircuitsmv = new StandardMetaItem((short)2);
projectcbtcircuitsmv.setRegistryName("projectcbt_circuits_mv")

log.infoMC("Project CBT: Admit MV Circuits: Stage Machine-Specific Components")

projectcbtcircuitsmv.addItem(0, "circuit.mv.motherboard_plating");
projectcbtcircuitsmv.addItem(1, "circuit.mv.alloy_smelter");
projectcbtcircuitsmv.addItem(2, "circuit.mv.arc_furnace");
projectcbtcircuitsmv.addItem(3, "circuit.mv.assembly_machine");
projectcbtcircuitsmv.addItem(4, "circuit.mv.assembly_line");
projectcbtcircuitsmv.addItem(5, "circuit.mv.autoclave");
projectcbtcircuitsmv.addItem(6, "circuit.mv.blender");
projectcbtcircuitsmv.addItem(7, "circuit.mv.brewery");
projectcbtcircuitsmv.addItem(8, "circuit.mv.canner");
projectcbtcircuitsmv.addItem(9, "circuit.mv.centrifuge");
projectcbtcircuitsmv.addItem(10, "circuit.mv.chemical_bath");
projectcbtcircuitsmv.addItem(11, "circuit.mv.chemical_reactor");
projectcbtcircuitsmv.addItem(12, "circuit.mv.circuit_assembler");
projectcbtcircuitsmv.addItem(13, "circuit.mv.coke_oven");
projectcbtcircuitsmv.addItem(14, "circuit.mv.compressor");
projectcbtcircuitsmv.addItem(15, "circuit.mv.cracking_unit");
projectcbtcircuitsmv.addItem(16, "circuit.mv.distillation_tower");
projectcbtcircuitsmv.addItem(17, "circuit.mv.distillery");
projectcbtcircuitsmv.addItem(18, "circuit.mv.electric_blast_furnace");
projectcbtcircuitsmv.addItem(19, "circuit.mv.electric_Furnacer");
projectcbtcircuitsmv.addItem(20, "circuit.mv.electrolyzer");
projectcbtcircuitsmv.addItem(21, "circuit.mv.electromagnetic_separator");
projectcbtcircuitsmv.addItem(22, "circuit.mv.extractor");
projectcbtcircuitsmv.addItem(23, "circuit.mv.extruder");
projectcbtcircuitsmv.addItem(24, "circuit.mv.fermenter");
projectcbtcircuitsmv.addItem(25, "circuit.mv.fluid_heater");
projectcbtcircuitsmv.addItem(26, "circuit.mv.fluid_solidifier");
projectcbtcircuitsmv.addItem(27, "circuit.mv.forge_hammer");
projectcbtcircuitsmv.addItem(28, "circuit.mv.forming_press");
projectcbtcircuitsmv.addItem(29, "circuit.mv.fusion_reactor");
projectcbtcircuitsmv.addItem(30, "circuit.mv.gas_collector");
projectcbtcircuitsmv.addItem(31, "circuit.mv.implosion_compressor");
projectcbtcircuitsmv.addItem(32, "circuit.mv.large_chemical_reactor");
projectcbtcircuitsmv.addItem(33, "circuit.mv.laser_engraver");
projectcbtcircuitsmv.addItem(34, "circuit.mv.lathe");
projectcbtcircuitsmv.addItem(35, "circuit.mv.macerator");
projectcbtcircuitsmv.addItem(36, "circuit.mv.mass_fabricator");
projectcbtcircuitsmv.addItem(37, "circuit.mv.mixer");
projectcbtcircuitsmv.addItem(38, "circuit.mv.ore_washing_plant");
projectcbtcircuitsmv.addItem(39, "circuit.mv.package");
projectcbtcircuitsmv.addItem(40, "circuit.mv.polarizer");
projectcbtcircuitsmv.addItem(41, "circuit.mv.primitive_blast_furnace");
projectcbtcircuitsmv.addItem(42, "circuit.mv.pyrolose_oven");
projectcbtcircuitsmv.addItem(43, "circuit.mv.replicator");
projectcbtcircuitsmv.addItem(44, "circuit.mv.rock_breaker");
projectcbtcircuitsmv.addItem(45, "circuit.mv.scanner");
projectcbtcircuitsmv.addItem(46, "circuit.mv.sifting_machine");
projectcbtcircuitsmv.addItem(47, "circuit.mv.thermal_centrifuge");
projectcbtcircuitsmv.addItem(48, "circuit.mv.vacuum_freezer");
projectcbtcircuitsmv.addItem(49, "circuit.mv.wiremill");
projectcbtcircuitsmv.addItem(50, "circuit.mv.eg_combustion_generator");
projectcbtcircuitsmv.addItem(51, "circuit.mv.eg_gas_turbine");
projectcbtcircuitsmv.addItem(52, "circuit.mv.eg_plasma_generator");
projectcbtcircuitsmv.addItem(53, "circuit.mv.eg_semi_fluid_generator");
projectcbtcircuitsmv.addItem(54, "circuit.mv.eg_steam_turbine");

log.infoMC("Project CBT: Admit MV Circuits: Stage Components")

projectcbtcircuitsmv.addItem(55, "circuit.mv.component.sus");
projectcbtcircuitsmv.addItem(56, "circuit.mv.component.gyroscope");
projectcbtcircuitsmv.addItem(57, "circuit.mv.component.led");
projectcbtcircuitsmv.addItem(58, "circuit.mv.component.oscillator");
projectcbtcircuitsmv.addItem(59, "circuit.mv.component.sound");
projectcbtcircuitsmv.addItem(60, "circuit.mv.component.voltage_regulator");
projectcbtcircuitsmv.addItem(61, "circuit.mv.component.diode");
projectcbtcircuitsmv.addItem(62, "circuit.mv.component.capacitor");
projectcbtcircuitsmv.addItem(63, "circuit.mv.component.resistor");
projectcbtcircuitsmv.addItem(64, "circuit.mv.component.voltage_regulator");
projectcbtcircuitsmv.addItem(65, "circuit.mv.component.configuration_chip");
projectcbtcircuitsmv.addItem(66, "circuit.mv.component.sound_chip");
projectcbtcircuitsmv.addItem(67, "circuit.mv.component.bus_chip");
projectcbtcircuitsmv.addItem(68, "circuit.mv.component.memory");
projectcbtcircuitsmv.addItem(69, "circuit.mv.component.motor");
projectcbtcircuitsmv.addItem(70, "circuit.mv.component.bios");
projectcbtcircuitsmv.addItem(71, "circuit.mv.component.piston");
projectcbtcircuitsmv.addItem(72, "circuit.mv.component.heating_coil");
projectcbtcircuitsmv.addItem(73, "circuit.mv.component.cooling_coil");
projectcbtcircuitsmv.addItem(74, "circuit.mv.component.voltage_regulator");
projectcbtcircuitsmv.addItem(75, "circuit.mv.component.configuration_chip");
projectcbtcircuitsmv.addItem(76, "circuit.mv.component.backlight");
projectcbtcircuitsmv.addItem(77, "circuit.mv.component.storage");
projectcbtcircuitsmv.addItem(78, "circuit.mv.component.processor_socket");
projectcbtcircuitsmv.addItem(79, "circuit.mv.component.interface");
projectcbtcircuitsmv.addItem(80, "circuit.mv.component.filter_chip");

log.infoMC("Project CBT: Admit MV Circuits - Done")

StandardMetaItem projectcbtcircuitshv = new StandardMetaItem((short)2);
projectcbtcircuitshv.setRegistryName("projectcbt_circuits_hv")

log.infoMC("Project CBT: Admit HV Circuits")

projectcbtcircuitshv.addItem(0, "circuit.hv.motherboard_plating");
projectcbtcircuitshv.addItem(1, "circuit.hv.alloy_smelter");
projectcbtcircuitshv.addItem(2, "circuit.hv.arc_furnace");
projectcbtcircuitshv.addItem(3, "circuit.hv.assembly_machine");
projectcbtcircuitshv.addItem(4, "circuit.hv.assembly_line");
projectcbtcircuitshv.addItem(5, "circuit.hv.autoclave");
projectcbtcircuitshv.addItem(6, "circuit.hv.blender");
projectcbtcircuitshv.addItem(7, "circuit.hv.brewery");
projectcbtcircuitshv.addItem(8, "circuit.hv.canner");
projectcbtcircuitshv.addItem(9, "circuit.hv.centrifuge");
projectcbtcircuitshv.addItem(10, "circuit.hv.chemical_bath");
projectcbtcircuitshv.addItem(11, "circuit.hv.chemical_reactor");
projectcbtcircuitshv.addItem(12, "circuit.hv.circuit_assembler");
projectcbtcircuitshv.addItem(13, "circuit.hv.coke_oven");
projectcbtcircuitshv.addItem(14, "circuit.hv.compressor");
projectcbtcircuitshv.addItem(15, "circuit.hv.cracking_unit");
projectcbtcircuitshv.addItem(16, "circuit.hv.distillation_tower");
projectcbtcircuitshv.addItem(17, "circuit.hv.distillery");
projectcbtcircuitshv.addItem(18, "circuit.hv.electric_blast_furnace");
projectcbtcircuitshv.addItem(19, "circuit.hv.electric_Furnacer");
projectcbtcircuitshv.addItem(20, "circuit.hv.electrolyzer");
projectcbtcircuitshv.addItem(21, "circuit.hv.electromagnetic_separator");
projectcbtcircuitshv.addItem(22, "circuit.hv.extractor");
projectcbtcircuitshv.addItem(23, "circuit.hv.extruder");
projectcbtcircuitshv.addItem(24, "circuit.hv.fermenter");
projectcbtcircuitshv.addItem(25, "circuit.hv.fluid_heater");
projectcbtcircuitshv.addItem(26, "circuit.hv.fluid_solidifier");
projectcbtcircuitshv.addItem(27, "circuit.hv.forge_hammer");
projectcbtcircuitshv.addItem(28, "circuit.hv.forming_press");
projectcbtcircuitshv.addItem(29, "circuit.hv.fusion_reactor");
projectcbtcircuitshv.addItem(30, "circuit.hv.gas_collector");
projectcbtcircuitshv.addItem(31, "circuit.hv.implosion_compressor");
projectcbtcircuitshv.addItem(32, "circuit.hv.large_chemical_reactor");
projectcbtcircuitshv.addItem(33, "circuit.hv.laser_engraver");
projectcbtcircuitshv.addItem(34, "circuit.hv.lathe");
projectcbtcircuitshv.addItem(35, "circuit.hv.macerator");
projectcbtcircuitshv.addItem(36, "circuit.hv.mass_fabricator");
projectcbtcircuitshv.addItem(37, "circuit.hv.mixer");
projectcbtcircuitshv.addItem(38, "circuit.hv.ore_washing_plant");
projectcbtcircuitshv.addItem(39, "circuit.hv.package");
projectcbtcircuitshv.addItem(40, "circuit.hv.polarizer");
projectcbtcircuitshv.addItem(41, "circuit.hv.primitive_blast_furnace");
projectcbtcircuitshv.addItem(42, "circuit.hv.pyrolose_oven");
projectcbtcircuitshv.addItem(43, "circuit.hv.replicator");
projectcbtcircuitshv.addItem(44, "circuit.hv.rock_breaker");
projectcbtcircuitshv.addItem(45, "circuit.hv.scanner");
projectcbtcircuitshv.addItem(46, "circuit.hv.sifting_machine");
projectcbtcircuitshv.addItem(47, "circuit.hv.thermal_centrifuge");
projectcbtcircuitshv.addItem(48, "circuit.hv.vacuum_freezer");
projectcbtcircuitshv.addItem(49, "circuit.hv.wiremill");
projectcbtcircuitshv.addItem(50, "circuit.hv.eg_combustion_generator");
projectcbtcircuitshv.addItem(51, "circuit.hv.eg_gas_turbine");
projectcbtcircuitshv.addItem(52, "circuit.hv.eg_plasma_generator");
projectcbtcircuitshv.addItem(53, "circuit.hv.eg_semi_fluid_generator");
projectcbtcircuitshv.addItem(54, "circuit.hv.eg_steam_turbine");

log.infoMC("Project CBT: Admit HV Circuits - Done")

StandardMetaItem projectcbtcircuitsev = new StandardMetaItem((short)2);
projectcbtcircuitsev.setRegistryName("projectcbt_circuits_ev")

log.infoMC("Project CBT: Admit EV Circuits")

projectcbtcircuitsev.addItem(0, "circuit.ev.motherboard_plating");
projectcbtcircuitsev.addItem(1, "circuit.ev.alloy_smelter");
projectcbtcircuitsev.addItem(2, "circuit.ev.arc_furnace");
projectcbtcircuitsev.addItem(3, "circuit.ev.assembly_machine");
projectcbtcircuitsev.addItem(4, "circuit.ev.assembly_line");
projectcbtcircuitsev.addItem(5, "circuit.ev.autoclave");
projectcbtcircuitsev.addItem(6, "circuit.ev.blender");
projectcbtcircuitsev.addItem(7, "circuit.ev.brewery");
projectcbtcircuitsev.addItem(8, "circuit.ev.canner");
projectcbtcircuitsev.addItem(9, "circuit.ev.centrifuge");
projectcbtcircuitsev.addItem(10, "circuit.ev.chemical_bath");
projectcbtcircuitsev.addItem(11, "circuit.ev.chemical_reactor");
projectcbtcircuitsev.addItem(12, "circuit.ev.circuit_assembler");
projectcbtcircuitsev.addItem(13, "circuit.ev.coke_oven");
projectcbtcircuitsev.addItem(14, "circuit.ev.compressor");
projectcbtcircuitsev.addItem(15, "circuit.ev.cracking_unit");
projectcbtcircuitsev.addItem(16, "circuit.ev.distillation_tower");
projectcbtcircuitsev.addItem(17, "circuit.ev.distillery");
projectcbtcircuitsev.addItem(18, "circuit.ev.electric_blast_furnace");
projectcbtcircuitsev.addItem(19, "circuit.ev.electric_Furnacer");
projectcbtcircuitsev.addItem(20, "circuit.ev.electrolyzer");
projectcbtcircuitsev.addItem(21, "circuit.ev.electromagnetic_separator");
projectcbtcircuitsev.addItem(22, "circuit.ev.extractor");
projectcbtcircuitsev.addItem(23, "circuit.ev.extruder");
projectcbtcircuitsev.addItem(24, "circuit.ev.fermenter");
projectcbtcircuitsev.addItem(25, "circuit.ev.fluid_heater");
projectcbtcircuitsev.addItem(26, "circuit.ev.fluid_solidifier");
projectcbtcircuitsev.addItem(27, "circuit.ev.forge_hammer");
projectcbtcircuitsev.addItem(28, "circuit.ev.forming_press");
projectcbtcircuitsev.addItem(29, "circuit.ev.fusion_reactor");
projectcbtcircuitsev.addItem(30, "circuit.ev.gas_collector");
projectcbtcircuitsev.addItem(31, "circuit.ev.implosion_compressor");
projectcbtcircuitsev.addItem(32, "circuit.ev.large_chemical_reactor");
projectcbtcircuitsev.addItem(33, "circuit.ev.laser_engraver");
projectcbtcircuitsev.addItem(34, "circuit.ev.lathe");
projectcbtcircuitsev.addItem(35, "circuit.ev.macerator");
projectcbtcircuitsev.addItem(36, "circuit.ev.mass_fabricator");
projectcbtcircuitsev.addItem(37, "circuit.ev.mixer");
projectcbtcircuitsev.addItem(38, "circuit.ev.ore_washing_plant");
projectcbtcircuitsev.addItem(39, "circuit.ev.package");
projectcbtcircuitsev.addItem(40, "circuit.ev.polarizer");
projectcbtcircuitsev.addItem(41, "circuit.ev.primitive_blast_furnace");
projectcbtcircuitsev.addItem(42, "circuit.ev.pyrolose_oven");
projectcbtcircuitsev.addItem(43, "circuit.ev.replicator");
projectcbtcircuitsev.addItem(44, "circuit.ev.rock_breaker");
projectcbtcircuitsev.addItem(45, "circuit.ev.scanner");
projectcbtcircuitsev.addItem(46, "circuit.ev.sifting_machine");
projectcbtcircuitsev.addItem(47, "circuit.ev.thermal_centrifuge");
projectcbtcircuitsev.addItem(48, "circuit.ev.vacuum_freezer");
projectcbtcircuitsev.addItem(49, "circuit.ev.wiremill");
projectcbtcircuitsev.addItem(50, "circuit.ev.eg_combustion_generator");
projectcbtcircuitsev.addItem(51, "circuit.ev.eg_gas_turbine");
projectcbtcircuitsev.addItem(52, "circuit.ev.eg_plasma_generator");
projectcbtcircuitsev.addItem(53, "circuit.ev.eg_semi_fluid_generator");
projectcbtcircuitsev.addItem(54, "circuit.ev.eg_steam_turbine");

log.infoMC("Project CBT: Admit EV Circuits - Done")

StandardMetaItem projectcbtcircuitsiv = new StandardMetaItem((short)2);
projectcbtcircuitsiv.setRegistryName("projectcbt_circuits_iv")

log.infoMC("Project CBT: Admit IV Circuits")

projectcbtcircuitsiv.addItem(0, "circuit.iv.motherboard_plating");
projectcbtcircuitsiv.addItem(1, "circuit.iv.alloy_smelter");
projectcbtcircuitsiv.addItem(2, "circuit.iv.arc_furnace");
projectcbtcircuitsiv.addItem(3, "circuit.iv.assembly_machine");
projectcbtcircuitsiv.addItem(4, "circuit.iv.assembly_line");
projectcbtcircuitsiv.addItem(5, "circuit.iv.autoclave");
projectcbtcircuitsiv.addItem(6, "circuit.iv.blender");
projectcbtcircuitsiv.addItem(7, "circuit.iv.brewery");
projectcbtcircuitsiv.addItem(8, "circuit.iv.canner");
projectcbtcircuitsiv.addItem(9, "circuit.iv.centrifuge");
projectcbtcircuitsiv.addItem(10, "circuit.iv.chemical_bath");
projectcbtcircuitsiv.addItem(11, "circuit.iv.chemical_reactor");
projectcbtcircuitsiv.addItem(12, "circuit.iv.circuit_assembler");
projectcbtcircuitsiv.addItem(13, "circuit.iv.coke_oven");
projectcbtcircuitsiv.addItem(14, "circuit.iv.compressor");
projectcbtcircuitsiv.addItem(15, "circuit.iv.cracking_unit");
projectcbtcircuitsiv.addItem(16, "circuit.iv.distillation_tower");
projectcbtcircuitsiv.addItem(17, "circuit.iv.distillery");
projectcbtcircuitsiv.addItem(18, "circuit.iv.electric_blast_furnace");
projectcbtcircuitsiv.addItem(19, "circuit.iv.electric_Furnacer");
projectcbtcircuitsiv.addItem(20, "circuit.iv.electrolyzer");
projectcbtcircuitsiv.addItem(21, "circuit.iv.electromagnetic_separator");
projectcbtcircuitsiv.addItem(22, "circuit.iv.extractor");
projectcbtcircuitsiv.addItem(23, "circuit.iv.extruder");
projectcbtcircuitsiv.addItem(24, "circuit.iv.fermenter");
projectcbtcircuitsiv.addItem(25, "circuit.iv.fluid_heater");
projectcbtcircuitsiv.addItem(26, "circuit.iv.fluid_solidifier");
projectcbtcircuitsiv.addItem(27, "circuit.iv.forge_hammer");
projectcbtcircuitsiv.addItem(28, "circuit.iv.forming_press");
projectcbtcircuitsiv.addItem(29, "circuit.iv.fusion_reactor");
projectcbtcircuitsiv.addItem(30, "circuit.iv.gas_collector");
projectcbtcircuitsiv.addItem(31, "circuit.iv.implosion_compressor");
projectcbtcircuitsiv.addItem(32, "circuit.iv.large_chemical_reactor");
projectcbtcircuitsiv.addItem(33, "circuit.iv.laser_engraver");
projectcbtcircuitsiv.addItem(34, "circuit.iv.lathe");
projectcbtcircuitsiv.addItem(35, "circuit.iv.macerator");
projectcbtcircuitsiv.addItem(36, "circuit.iv.mass_fabricator");
projectcbtcircuitsiv.addItem(37, "circuit.iv.mixer");
projectcbtcircuitsiv.addItem(38, "circuit.iv.ore_washing_plant");
projectcbtcircuitsiv.addItem(39, "circuit.iv.package");
projectcbtcircuitsiv.addItem(40, "circuit.iv.polarizer");
projectcbtcircuitsiv.addItem(41, "circuit.iv.primitive_blast_furnace");
projectcbtcircuitsiv.addItem(42, "circuit.iv.pyrolose_oven");
projectcbtcircuitsiv.addItem(43, "circuit.iv.replicator");
projectcbtcircuitsiv.addItem(44, "circuit.iv.rock_breaker");
projectcbtcircuitsiv.addItem(45, "circuit.iv.scanner");
projectcbtcircuitsiv.addItem(46, "circuit.iv.sifting_machine");
projectcbtcircuitsiv.addItem(47, "circuit.iv.thermal_centrifuge");
projectcbtcircuitsiv.addItem(48, "circuit.iv.vacuum_freezer");
projectcbtcircuitsiv.addItem(49, "circuit.iv.wiremill");
projectcbtcircuitsiv.addItem(50, "circuit.iv.eg_combustion_generator");
projectcbtcircuitsiv.addItem(51, "circuit.iv.eg_gas_turbine");
projectcbtcircuitsiv.addItem(52, "circuit.iv.eg_plasma_generator");
projectcbtcircuitsiv.addItem(53, "circuit.iv.eg_semi_fluid_generator");
projectcbtcircuitsiv.addItem(54, "circuit.iv.eg_steam_turbine");

log.infoMC("Project CBT: Admit IV Circuits - Done")

StandardMetaItem projectcbtcircuitsluv = new StandardMetaItem((short)2);
projectcbtcircuitsluv.setRegistryName("projectcbt_circuits_luv")

log.infoMC("Project CBT: Admit LUV Circuits")

projectcbtcircuitsluv.addItem(0, "circuit.luv.motherboard_plating");
projectcbtcircuitsluv.addItem(1, "circuit.luv.alloy_smelter");
projectcbtcircuitsluv.addItem(2, "circuit.luv.arc_furnace");
projectcbtcircuitsluv.addItem(3, "circuit.luv.assembly_machine");
projectcbtcircuitsluv.addItem(4, "circuit.luv.assembly_line");
projectcbtcircuitsluv.addItem(5, "circuit.luv.autoclave");
projectcbtcircuitsluv.addItem(6, "circuit.luv.blender");
projectcbtcircuitsluv.addItem(7, "circuit.luv.brewery");
projectcbtcircuitsluv.addItem(8, "circuit.luv.canner");
projectcbtcircuitsluv.addItem(9, "circuit.luv.centrifuge");
projectcbtcircuitsluv.addItem(10, "circuit.luv.chemical_bath");
projectcbtcircuitsluv.addItem(11, "circuit.luv.chemical_reactor");
projectcbtcircuitsluv.addItem(12, "circuit.luv.circuit_assembler");
projectcbtcircuitsluv.addItem(13, "circuit.luv.coke_oven");
projectcbtcircuitsluv.addItem(14, "circuit.luv.compressor");
projectcbtcircuitsluv.addItem(15, "circuit.luv.cracking_unit");
projectcbtcircuitsluv.addItem(16, "circuit.luv.distillation_tower");
projectcbtcircuitsluv.addItem(17, "circuit.luv.distillery");
projectcbtcircuitsluv.addItem(18, "circuit.luv.electric_blast_furnace");
projectcbtcircuitsluv.addItem(19, "circuit.luv.electric_Furnacer");
projectcbtcircuitsluv.addItem(20, "circuit.luv.electrolyzer");
projectcbtcircuitsluv.addItem(21, "circuit.luv.electromagnetic_separator");
projectcbtcircuitsluv.addItem(22, "circuit.luv.extractor");
projectcbtcircuitsluv.addItem(23, "circuit.luv.extruder");
projectcbtcircuitsluv.addItem(24, "circuit.luv.fermenter");
projectcbtcircuitsluv.addItem(25, "circuit.luv.fluid_heater");
projectcbtcircuitsluv.addItem(26, "circuit.luv.fluid_solidifier");
projectcbtcircuitsluv.addItem(27, "circuit.luv.forge_hammer");
projectcbtcircuitsluv.addItem(28, "circuit.luv.forming_press");
projectcbtcircuitsluv.addItem(29, "circuit.luv.fusion_reactor");
projectcbtcircuitsluv.addItem(30, "circuit.luv.gas_collector");
projectcbtcircuitsluv.addItem(31, "circuit.luv.implosion_compressor");
projectcbtcircuitsluv.addItem(32, "circuit.luv.large_chemical_reactor");
projectcbtcircuitsluv.addItem(33, "circuit.luv.laser_engraver");
projectcbtcircuitsluv.addItem(34, "circuit.luv.lathe");
projectcbtcircuitsluv.addItem(35, "circuit.luv.macerator");
projectcbtcircuitsluv.addItem(36, "circuit.luv.mass_fabricator");
projectcbtcircuitsluv.addItem(37, "circuit.luv.mixer");
projectcbtcircuitsluv.addItem(38, "circuit.luv.ore_washing_plant");
projectcbtcircuitsluv.addItem(39, "circuit.luv.package");
projectcbtcircuitsluv.addItem(40, "circuit.luv.polarizer");
projectcbtcircuitsluv.addItem(41, "circuit.luv.primitive_blast_furnace");
projectcbtcircuitsluv.addItem(42, "circuit.luv.pyrolose_oven");
projectcbtcircuitsluv.addItem(43, "circuit.luv.replicator");
projectcbtcircuitsluv.addItem(44, "circuit.luv.rock_breaker");
projectcbtcircuitsluv.addItem(45, "circuit.luv.scanner");
projectcbtcircuitsluv.addItem(46, "circuit.luv.sifting_machine");
projectcbtcircuitsluv.addItem(47, "circuit.luv.thermal_centrifuge");
projectcbtcircuitsluv.addItem(48, "circuit.luv.vacuum_freezer");
projectcbtcircuitsluv.addItem(49, "circuit.luv.wiremill");
projectcbtcircuitsluv.addItem(50, "circuit.luv.eg_combustion_generator");
projectcbtcircuitsluv.addItem(51, "circuit.luv.eg_gas_turbine");
projectcbtcircuitsluv.addItem(52, "circuit.luv.eg_plasma_generator");
projectcbtcircuitsluv.addItem(53, "circuit.luv.eg_semi_fluid_generator");
projectcbtcircuitsluv.addItem(54, "circuit.luv.eg_steam_turbine");

log.infoMC("Project CBT: Admit LUV Circuits - Done")

StandardMetaItem projectcbtcircuitszpm = new StandardMetaItem((short)2);
projectcbtcircuitszpm.setRegistryName("projectcbt_circuits_zpm")

log.infoMC("Project CBT: Admit ZPM Circuits")

projectcbtcircuitszpm.addItem(0, "circuit.zpm.motherboard_plating");
projectcbtcircuitszpm.addItem(1, "circuit.zpm.alloy_smelter");
projectcbtcircuitszpm.addItem(2, "circuit.zpm.arc_furnace");
projectcbtcircuitszpm.addItem(3, "circuit.zpm.assembly_machine");
projectcbtcircuitszpm.addItem(4, "circuit.zpm.assembly_line");
projectcbtcircuitszpm.addItem(5, "circuit.zpm.autoclave");
projectcbtcircuitszpm.addItem(6, "circuit.zpm.blender");
projectcbtcircuitszpm.addItem(7, "circuit.zpm.brewery");
projectcbtcircuitszpm.addItem(8, "circuit.zpm.canner");
projectcbtcircuitszpm.addItem(9, "circuit.zpm.centrifuge");
projectcbtcircuitszpm.addItem(10, "circuit.zpm.chemical_bath");
projectcbtcircuitszpm.addItem(11, "circuit.zpm.chemical_reactor");
projectcbtcircuitszpm.addItem(12, "circuit.zpm.circuit_assembler");
projectcbtcircuitszpm.addItem(13, "circuit.zpm.coke_oven");
projectcbtcircuitszpm.addItem(14, "circuit.zpm.compressor");
projectcbtcircuitszpm.addItem(15, "circuit.zpm.cracking_unit");
projectcbtcircuitszpm.addItem(16, "circuit.zpm.distillation_tower");
projectcbtcircuitszpm.addItem(17, "circuit.zpm.distillery");
projectcbtcircuitszpm.addItem(18, "circuit.zpm.electric_blast_furnace");
projectcbtcircuitszpm.addItem(19, "circuit.zpm.electric_Furnacer");
projectcbtcircuitszpm.addItem(20, "circuit.zpm.electrolyzer");
projectcbtcircuitszpm.addItem(21, "circuit.zpm.electromagnetic_separator");
projectcbtcircuitszpm.addItem(22, "circuit.zpm.extractor");
projectcbtcircuitszpm.addItem(23, "circuit.zpm.extruder");
projectcbtcircuitszpm.addItem(24, "circuit.zpm.fermenter");
projectcbtcircuitszpm.addItem(25, "circuit.zpm.fluid_heater");
projectcbtcircuitszpm.addItem(26, "circuit.zpm.fluid_solidifier");
projectcbtcircuitszpm.addItem(27, "circuit.zpm.forge_hammer");
projectcbtcircuitszpm.addItem(28, "circuit.zpm.forming_press");
projectcbtcircuitszpm.addItem(29, "circuit.zpm.fusion_reactor");
projectcbtcircuitszpm.addItem(30, "circuit.zpm.gas_collector");
projectcbtcircuitszpm.addItem(31, "circuit.zpm.implosion_compressor");
projectcbtcircuitszpm.addItem(32, "circuit.zpm.large_chemical_reactor");
projectcbtcircuitszpm.addItem(33, "circuit.zpm.laser_engraver");
projectcbtcircuitszpm.addItem(34, "circuit.zpm.lathe");
projectcbtcircuitszpm.addItem(35, "circuit.zpm.macerator");
projectcbtcircuitszpm.addItem(36, "circuit.zpm.mass_fabricator");
projectcbtcircuitszpm.addItem(37, "circuit.zpm.mixer");
projectcbtcircuitszpm.addItem(38, "circuit.zpm.ore_washing_plant");
projectcbtcircuitszpm.addItem(39, "circuit.zpm.package");
projectcbtcircuitszpm.addItem(40, "circuit.zpm.polarizer");
projectcbtcircuitszpm.addItem(41, "circuit.zpm.primitive_blast_furnace");
projectcbtcircuitszpm.addItem(42, "circuit.zpm.pyrolose_oven");
projectcbtcircuitszpm.addItem(43, "circuit.zpm.replicator");
projectcbtcircuitszpm.addItem(44, "circuit.zpm.rock_breaker");
projectcbtcircuitszpm.addItem(45, "circuit.zpm.scanner");
projectcbtcircuitszpm.addItem(46, "circuit.zpm.sifting_machine");
projectcbtcircuitszpm.addItem(47, "circuit.zpm.thermal_centrifuge");
projectcbtcircuitszpm.addItem(48, "circuit.zpm.vacuum_freezer");
projectcbtcircuitszpm.addItem(49, "circuit.zpm.wiremill");
projectcbtcircuitszpm.addItem(50, "circuit.zpm.eg_combustion_generator");
projectcbtcircuitszpm.addItem(51, "circuit.zpm.eg_gas_turbine");
projectcbtcircuitszpm.addItem(52, "circuit.zpm.eg_plasma_generator");
projectcbtcircuitszpm.addItem(53, "circuit.zpm.eg_semi_fluid_generator");
projectcbtcircuitszpm.addItem(54, "circuit.zpm.eg_steam_turbine");

log.infoMC("Project CBT: Admit ZPM Circuits - Done")

StandardMetaItem projectcbtcircuitsuv = new StandardMetaItem((short)2);
projectcbtcircuitsuv.setRegistryName("projectcbt_circuits_uv")

log.infoMC("Project CBT: Admit UV Circuits")

projectcbtcircuitsuv.addItem(0, "circuit.uv.motherboard_plating");
projectcbtcircuitsuv.addItem(1, "circuit.uv.alloy_smelter");
projectcbtcircuitsuv.addItem(2, "circuit.uv.arc_furnace");
projectcbtcircuitsuv.addItem(3, "circuit.uv.assembly_machine");
projectcbtcircuitsuv.addItem(4, "circuit.uv.assembly_line");
projectcbtcircuitsuv.addItem(5, "circuit.uv.autoclave");
projectcbtcircuitsuv.addItem(6, "circuit.uv.blender");
projectcbtcircuitsuv.addItem(7, "circuit.uv.brewery");
projectcbtcircuitsuv.addItem(8, "circuit.uv.canner");
projectcbtcircuitsuv.addItem(9, "circuit.uv.centrifuge");
projectcbtcircuitsuv.addItem(10, "circuit.uv.chemical_bath");
projectcbtcircuitsuv.addItem(11, "circuit.uv.chemical_reactor");
projectcbtcircuitsuv.addItem(12, "circuit.uv.circuit_assembler");
projectcbtcircuitsuv.addItem(13, "circuit.uv.coke_oven");
projectcbtcircuitsuv.addItem(14, "circuit.uv.compressor");
projectcbtcircuitsuv.addItem(15, "circuit.uv.cracking_unit");
projectcbtcircuitsuv.addItem(16, "circuit.uv.distillation_tower");
projectcbtcircuitsuv.addItem(17, "circuit.uv.distillery");
projectcbtcircuitsuv.addItem(18, "circuit.uv.electric_blast_furnace");
projectcbtcircuitsuv.addItem(19, "circuit.uv.electric_Furnacer");
projectcbtcircuitsuv.addItem(20, "circuit.uv.electrolyzer");
projectcbtcircuitsuv.addItem(21, "circuit.uv.electromagnetic_separator");
projectcbtcircuitsuv.addItem(22, "circuit.uv.extractor");
projectcbtcircuitsuv.addItem(23, "circuit.uv.extruder");
projectcbtcircuitsuv.addItem(24, "circuit.uv.fermenter");
projectcbtcircuitsuv.addItem(25, "circuit.uv.fluid_heater");
projectcbtcircuitsuv.addItem(26, "circuit.uv.fluid_solidifier");
projectcbtcircuitsuv.addItem(27, "circuit.uv.forge_hammer");
projectcbtcircuitsuv.addItem(28, "circuit.uv.forming_press");
projectcbtcircuitsuv.addItem(29, "circuit.uv.fusion_reactor");
projectcbtcircuitsuv.addItem(30, "circuit.uv.gas_collector");
projectcbtcircuitsuv.addItem(31, "circuit.uv.implosion_compressor");
projectcbtcircuitsuv.addItem(32, "circuit.uv.large_chemical_reactor");
projectcbtcircuitsuv.addItem(33, "circuit.uv.laser_engraver");
projectcbtcircuitsuv.addItem(34, "circuit.uv.lathe");
projectcbtcircuitsuv.addItem(35, "circuit.uv.macerator");
projectcbtcircuitsuv.addItem(36, "circuit.uv.mass_fabricator");
projectcbtcircuitsuv.addItem(37, "circuit.uv.mixer");
projectcbtcircuitsuv.addItem(38, "circuit.uv.ore_washing_plant");
projectcbtcircuitsuv.addItem(39, "circuit.uv.package");
projectcbtcircuitsuv.addItem(40, "circuit.uv.polarizer");
projectcbtcircuitsuv.addItem(41, "circuit.uv.primitive_blast_furnace");
projectcbtcircuitsuv.addItem(42, "circuit.uv.pyrolose_oven");
projectcbtcircuitsuv.addItem(43, "circuit.uv.replicator");
projectcbtcircuitsuv.addItem(44, "circuit.uv.rock_breaker");
projectcbtcircuitsuv.addItem(45, "circuit.uv.scanner");
projectcbtcircuitsuv.addItem(46, "circuit.uv.sifting_machine");
projectcbtcircuitsuv.addItem(47, "circuit.uv.thermal_centrifuge");
projectcbtcircuitsuv.addItem(48, "circuit.uv.vacuum_freezer");
projectcbtcircuitsuv.addItem(49, "circuit.uv.wiremill");
projectcbtcircuitsuv.addItem(50, "circuit.uv.eg_combustion_generator");
projectcbtcircuitsuv.addItem(51, "circuit.uv.eg_gas_turbine");
projectcbtcircuitsuv.addItem(52, "circuit.uv.eg_plasma_generator");
projectcbtcircuitsuv.addItem(53, "circuit.uv.eg_semi_fluid_generator");
projectcbtcircuitsuv.addItem(54, "circuit.uv.eg_steam_turbine");

log.infoMC("Project CBT: Admit UV Circuits - Done")

StandardMetaItem projectcbtcircuitsuhv = new StandardMetaItem((short)2);
projectcbtcircuitsuhv.setRegistryName("projectcbt_circuits_uhv")

log.infoMC("Project CBT: Admit UHV Circuits")

projectcbtcircuitsuhv.addItem(0, "circuit.uhv.motherboard_plating");
projectcbtcircuitsuhv.addItem(1, "circuit.uhv.alloy_smelter");
projectcbtcircuitsuhv.addItem(2, "circuit.uhv.arc_furnace");
projectcbtcircuitsuhv.addItem(3, "circuit.uhv.assembly_machine");
projectcbtcircuitsuhv.addItem(4, "circuit.uhv.assembly_line");
projectcbtcircuitsuhv.addItem(5, "circuit.uhv.autoclave");
projectcbtcircuitsuhv.addItem(6, "circuit.uhv.blender");
projectcbtcircuitsuhv.addItem(7, "circuit.uhv.brewery");
projectcbtcircuitsuhv.addItem(8, "circuit.uhv.canner");
projectcbtcircuitsuhv.addItem(9, "circuit.uhv.centrifuge");
projectcbtcircuitsuhv.addItem(10, "circuit.uhv.chemical_bath");
projectcbtcircuitsuhv.addItem(11, "circuit.uhv.chemical_reactor");
projectcbtcircuitsuhv.addItem(12, "circuit.uhv.circuit_assembler");
projectcbtcircuitsuhv.addItem(13, "circuit.uhv.coke_oven");
projectcbtcircuitsuhv.addItem(14, "circuit.uhv.compressor");
projectcbtcircuitsuhv.addItem(15, "circuit.uhv.cracking_unit");
projectcbtcircuitsuhv.addItem(16, "circuit.uhv.distillation_tower");
projectcbtcircuitsuhv.addItem(17, "circuit.uhv.distillery");
projectcbtcircuitsuhv.addItem(18, "circuit.uhv.electric_blast_furnace");
projectcbtcircuitsuhv.addItem(19, "circuit.uhv.electric_Furnacer");
projectcbtcircuitsuhv.addItem(20, "circuit.uhv.electrolyzer");
projectcbtcircuitsuhv.addItem(21, "circuit.uhv.electromagnetic_separator");
projectcbtcircuitsuhv.addItem(22, "circuit.uhv.extractor");
projectcbtcircuitsuhv.addItem(23, "circuit.uhv.extruder");
projectcbtcircuitsuhv.addItem(24, "circuit.uhv.fermenter");
projectcbtcircuitsuhv.addItem(25, "circuit.uhv.fluid_heater");
projectcbtcircuitsuhv.addItem(26, "circuit.uhv.fluid_solidifier");
projectcbtcircuitsuhv.addItem(27, "circuit.uhv.forge_hammer");
projectcbtcircuitsuhv.addItem(28, "circuit.uhv.forming_press");
projectcbtcircuitsuhv.addItem(29, "circuit.uhv.fusion_reactor");
projectcbtcircuitsuhv.addItem(30, "circuit.uhv.gas_collector");
projectcbtcircuitsuhv.addItem(31, "circuit.uhv.implosion_compressor");
projectcbtcircuitsuhv.addItem(32, "circuit.uhv.large_chemical_reactor");
projectcbtcircuitsuhv.addItem(33, "circuit.uhv.laser_engraver");
projectcbtcircuitsuhv.addItem(34, "circuit.uhv.lathe");
projectcbtcircuitsuhv.addItem(35, "circuit.uhv.macerator");
projectcbtcircuitsuhv.addItem(36, "circuit.uhv.mass_fabricator");
projectcbtcircuitsuhv.addItem(37, "circuit.uhv.mixer");
projectcbtcircuitsuhv.addItem(38, "circuit.uhv.ore_washing_plant");
projectcbtcircuitsuhv.addItem(39, "circuit.uhv.package");
projectcbtcircuitsuhv.addItem(40, "circuit.uhv.polarizer");
projectcbtcircuitsuhv.addItem(41, "circuit.uhv.primitive_blast_furnace");
projectcbtcircuitsuhv.addItem(42, "circuit.uhv.pyrolose_oven");
projectcbtcircuitsuhv.addItem(43, "circuit.uhv.replicator");
projectcbtcircuitsuhv.addItem(44, "circuit.uhv.rock_breaker");
projectcbtcircuitsuhv.addItem(45, "circuit.uhv.scanner");
projectcbtcircuitsuhv.addItem(46, "circuit.uhv.sifting_machine");
projectcbtcircuitsuhv.addItem(47, "circuit.uhv.thermal_centrifuge");
projectcbtcircuitsuhv.addItem(48, "circuit.uhv.vacuum_freezer");
projectcbtcircuitsuhv.addItem(49, "circuit.uhv.wiremill");
projectcbtcircuitsuhv.addItem(50, "circuit.uhv.eg_combustion_generator");
projectcbtcircuitsuhv.addItem(51, "circuit.uhv.eg_gas_turbine");
projectcbtcircuitsuhv.addItem(52, "circuit.uhv.eg_plasma_generator");
projectcbtcircuitsuhv.addItem(53, "circuit.uhv.eg_semi_fluid_generator");
projectcbtcircuitsuhv.addItem(54, "circuit.uhv.eg_steam_turbine");

log.infoMC("Project CBT: Admit UHV Circuits - Dne")

StandardMetaItem projectcbtcircuitsuev = new StandardMetaItem((short)2);
projectcbtcircuitsuev.setRegistryName("projectcbt_circuits_uev")

log.infoMC("Project CBT: Admit UEV Circuits")

projectcbtcircuitsuev.addItem(0, "circuit.uev.motherboard_plating");
projectcbtcircuitsuev.addItem(1, "circuit.uev.alloy_smelter");
projectcbtcircuitsuev.addItem(2, "circuit.uev.arc_furnace");
projectcbtcircuitsuev.addItem(3, "circuit.uev.assembly_machine");
projectcbtcircuitsuev.addItem(4, "circuit.uev.assembly_line");
projectcbtcircuitsuev.addItem(5, "circuit.uev.autoclave");
projectcbtcircuitsuev.addItem(6, "circuit.uev.blender");
projectcbtcircuitsuev.addItem(7, "circuit.uev.brewery");
projectcbtcircuitsuev.addItem(8, "circuit.uev.canner");
projectcbtcircuitsuev.addItem(9, "circuit.uev.centrifuge");
projectcbtcircuitsuev.addItem(10, "circuit.uev.chemical_bath");
projectcbtcircuitsuev.addItem(11, "circuit.uev.chemical_reactor");
projectcbtcircuitsuev.addItem(12, "circuit.uev.circuit_assembler");
projectcbtcircuitsuev.addItem(13, "circuit.uev.coke_oven");
projectcbtcircuitsuev.addItem(14, "circuit.uev.compressor");
projectcbtcircuitsuev.addItem(15, "circuit.uev.cracking_unit");
projectcbtcircuitsuev.addItem(16, "circuit.uev.distillation_tower");
projectcbtcircuitsuev.addItem(17, "circuit.uev.distillery");
projectcbtcircuitsuev.addItem(18, "circuit.uev.electric_blast_furnace");
projectcbtcircuitsuev.addItem(19, "circuit.uev.electric_Furnacer");
projectcbtcircuitsuev.addItem(20, "circuit.uev.electrolyzer");
projectcbtcircuitsuev.addItem(21, "circuit.uev.electromagnetic_separator");
projectcbtcircuitsuev.addItem(22, "circuit.uev.extractor");
projectcbtcircuitsuev.addItem(23, "circuit.uev.extruder");
projectcbtcircuitsuev.addItem(24, "circuit.uev.fermenter");
projectcbtcircuitsuev.addItem(25, "circuit.uev.fluid_heater");
projectcbtcircuitsuev.addItem(26, "circuit.uev.fluid_solidifier");
projectcbtcircuitsuev.addItem(27, "circuit.uev.forge_hammer");
projectcbtcircuitsuev.addItem(28, "circuit.uev.forming_press");
projectcbtcircuitsuev.addItem(29, "circuit.uev.fusion_reactor");
projectcbtcircuitsuev.addItem(30, "circuit.uev.gas_collector");
projectcbtcircuitsuev.addItem(31, "circuit.uev.implosion_compressor");
projectcbtcircuitsuev.addItem(32, "circuit.uev.large_chemical_reactor");
projectcbtcircuitsuev.addItem(33, "circuit.uev.laser_engraver");
projectcbtcircuitsuev.addItem(34, "circuit.uev.lathe");
projectcbtcircuitsuev.addItem(35, "circuit.uev.macerator");
projectcbtcircuitsuev.addItem(36, "circuit.uev.mass_fabricator");
projectcbtcircuitsuev.addItem(37, "circuit.uev.mixer");
projectcbtcircuitsuev.addItem(38, "circuit.uev.ore_washing_plant");
projectcbtcircuitsuev.addItem(39, "circuit.uev.package");
projectcbtcircuitsuev.addItem(40, "circuit.uev.polarizer");
projectcbtcircuitsuev.addItem(41, "circuit.uev.primitive_blast_furnace");
projectcbtcircuitsuev.addItem(42, "circuit.uev.pyrolose_oven");
projectcbtcircuitsuev.addItem(43, "circuit.uev.replicator");
projectcbtcircuitsuev.addItem(44, "circuit.uev.rock_breaker");
projectcbtcircuitsuev.addItem(45, "circuit.uev.scanner");
projectcbtcircuitsuev.addItem(46, "circuit.uev.sifting_machine");
projectcbtcircuitsuev.addItem(47, "circuit.uev.thermal_centrifuge");
projectcbtcircuitsuev.addItem(48, "circuit.uev.vacuum_freezer");
projectcbtcircuitsuev.addItem(49, "circuit.uev.wiremill");
projectcbtcircuitsuev.addItem(50, "circuit.uev.eg_combustion_generator");
projectcbtcircuitsuev.addItem(51, "circuit.uev.eg_gas_turbine");
projectcbtcircuitsuev.addItem(52, "circuit.uev.eg_plasma_generator");
projectcbtcircuitsuev.addItem(53, "circuit.uev.eg_semi_fluid_generator");
projectcbtcircuitsuev.addItem(54, "circuit.uev.eg_steam_turbine");

log.infoMC("Project CBT: Admit UEV Circuits - Done")

StandardMetaItem projectcbtcircuitsuiv = new StandardMetaItem((short)2);
projectcbtcircuitsuiv.setRegistryName("projectcbt_circuits_uiv")

log.infoMC("Project CBT: Admit UIV Circuits")

projectcbtcircuitsuiv.addItem(0, "circuit.uiv.motherboard_plating");
projectcbtcircuitsuiv.addItem(1, "circuit.uiv.alloy_smelter");
projectcbtcircuitsuiv.addItem(2, "circuit.uiv.arc_furnace");
projectcbtcircuitsuiv.addItem(3, "circuit.uiv.assembly_machine");
projectcbtcircuitsuiv.addItem(4, "circuit.uiv.assembly_line");
projectcbtcircuitsuiv.addItem(5, "circuit.uiv.autoclave");
projectcbtcircuitsuiv.addItem(6, "circuit.uiv.blender");
projectcbtcircuitsuiv.addItem(7, "circuit.uiv.brewery");
projectcbtcircuitsuiv.addItem(8, "circuit.uiv.canner");
projectcbtcircuitsuiv.addItem(9, "circuit.uiv.centrifuge");
projectcbtcircuitsuiv.addItem(10, "circuit.uiv.chemical_bath");
projectcbtcircuitsuiv.addItem(11, "circuit.uiv.chemical_reactor");
projectcbtcircuitsuiv.addItem(12, "circuit.uiv.circuit_assembler");
projectcbtcircuitsuiv.addItem(13, "circuit.uiv.coke_oven");
projectcbtcircuitsuiv.addItem(14, "circuit.uiv.compressor");
projectcbtcircuitsuiv.addItem(15, "circuit.uiv.cracking_unit");
projectcbtcircuitsuiv.addItem(16, "circuit.uiv.distillation_tower");
projectcbtcircuitsuiv.addItem(17, "circuit.uiv.distillery");
projectcbtcircuitsuiv.addItem(18, "circuit.uiv.electric_blast_furnace");
projectcbtcircuitsuiv.addItem(19, "circuit.uiv.electric_Furnacer");
projectcbtcircuitsuiv.addItem(20, "circuit.uiv.electrolyzer");
projectcbtcircuitsuiv.addItem(21, "circuit.uiv.electromagnetic_separator");
projectcbtcircuitsuiv.addItem(22, "circuit.uiv.extractor");
projectcbtcircuitsuiv.addItem(23, "circuit.uiv.extruder");
projectcbtcircuitsuiv.addItem(24, "circuit.uiv.fermenter");
projectcbtcircuitsuiv.addItem(25, "circuit.uiv.fluid_heater");
projectcbtcircuitsuiv.addItem(26, "circuit.uiv.fluid_solidifier");
projectcbtcircuitsuiv.addItem(27, "circuit.uiv.forge_hammer");
projectcbtcircuitsuiv.addItem(28, "circuit.uiv.forming_press");
projectcbtcircuitsuiv.addItem(29, "circuit.uiv.fusion_reactor");
projectcbtcircuitsuiv.addItem(30, "circuit.uiv.gas_collector");
projectcbtcircuitsuiv.addItem(31, "circuit.uiv.implosion_compressor");
projectcbtcircuitsuiv.addItem(32, "circuit.uiv.large_chemical_reactor");
projectcbtcircuitsuiv.addItem(33, "circuit.uiv.laser_engraver");
projectcbtcircuitsuiv.addItem(34, "circuit.uiv.lathe");
projectcbtcircuitsuiv.addItem(35, "circuit.uiv.macerator");
projectcbtcircuitsuiv.addItem(36, "circuit.uiv.mass_fabricator");
projectcbtcircuitsuiv.addItem(37, "circuit.uiv.mixer");
projectcbtcircuitsuiv.addItem(38, "circuit.uiv.ore_washing_plant");
projectcbtcircuitsuiv.addItem(39, "circuit.uiv.package");
projectcbtcircuitsuiv.addItem(40, "circuit.uiv.polarizer");
projectcbtcircuitsuiv.addItem(41, "circuit.uiv.primitive_blast_furnace");
projectcbtcircuitsuiv.addItem(42, "circuit.uiv.pyrolose_oven");
projectcbtcircuitsuiv.addItem(43, "circuit.uiv.replicator");
projectcbtcircuitsuiv.addItem(44, "circuit.uiv.rock_breaker");
projectcbtcircuitsuiv.addItem(45, "circuit.uiv.scanner");
projectcbtcircuitsuiv.addItem(46, "circuit.uiv.sifting_machine");
projectcbtcircuitsuiv.addItem(47, "circuit.uiv.thermal_centrifuge");
projectcbtcircuitsuiv.addItem(48, "circuit.uiv.vacuum_freezer");
projectcbtcircuitsuiv.addItem(49, "circuit.uiv.wiremill");
projectcbtcircuitsuiv.addItem(50, "circuit.uiv.eg_combustion_generator");
projectcbtcircuitsuiv.addItem(51, "circuit.uiv.eg_gas_turbine");
projectcbtcircuitsuiv.addItem(52, "circuit.uiv.eg_plasma_generator");
projectcbtcircuitsuiv.addItem(53, "circuit.uiv.eg_semi_fluid_generator");
projectcbtcircuitsuiv.addItem(54, "circuit.uiv.eg_steam_turbine");

log.infoMC("Project CBT: Admit UIV Circuits - Done")

log.infoMC("Project CBT: Circuit Board Torture Complete.")