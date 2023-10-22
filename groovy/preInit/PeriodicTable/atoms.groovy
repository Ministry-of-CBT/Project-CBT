import gregtech.api.GTValues;
import gregtech.api.GregTechAPI;
import gregtech.api.items.metaitem.*;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.ore.OrePrefix;
import net.minecraft.util.text.TextFormatting;
import gregtech.common.items.behaviors.TooltipBehavior;

// Project CBT - MetaItems General

log.infoMC("Project CBT: Atomic Science Init")

log.infoMC("Project CBT: Atomic Science --- Loading Single Atoms")

StandardMetaItem atoms = new StandardMetaItem((short)2);
atoms.setRegistryName("atoms_single")

atoms.addItem(0, "error");
atoms.addItem(1, "hydrogen");
atoms.addItem(2, "helium");
atoms.addItem(3, "lithium");
atoms.addItem(4, "beryllium");
atoms.addItem(5, "boron");
atoms.addItem(6, "carbon");
atoms.addItem(7, "nitrogen");
atoms.addItem(8, "oxygen");
atoms.addItem(9, "fluorine");
atoms.addItem(10, "neon");
atoms.addItem(11, "sodium");
atoms.addItem(12, "magnesium");
atoms.addItem(13, "aluminium");
atoms.addItem(14, "silicon");
atoms.addItem(15, "phosphorus");
atoms.addItem(16, "sulfur");
atoms.addItem(17, "chlorine");
atoms.addItem(18, "argon");
atoms.addItem(19, "potassium");
atoms.addItem(20, "calcium");
atoms.addItem(21, "scandium");
atoms.addItem(22, "titanium");
atoms.addItem(23, "vanadium");
atoms.addItem(24, "chrome");
atoms.addItem(25, "manganese");
atoms.addItem(26, "iron");
atoms.addItem(27, "cobalt");
atoms.addItem(28, "nickel");
atoms.addItem(29, "copper");
atoms.addItem(30, "zinc");
atoms.addItem(31, "gallium");
atoms.addItem(32, "germanium");
atoms.addItem(33, "arsenic");
atoms.addItem(34, "selenium");
atoms.addItem(35, "bromine");
atoms.addItem(36, "krypton");
atoms.addItem(37, "rubidium");
atoms.addItem(38, "strontium");
atoms.addItem(39, "yttrium");
atoms.addItem(40, "zirconium");
atoms.addItem(41, "niobium");
atoms.addItem(42, "molybdenum");
atoms.addItem(43, "technetium");
atoms.addItem(44, "ruthenium");
atoms.addItem(45, "ruthenium");
atoms.addItem(46, "palladium");
atoms.addItem(47, "silver");
atoms.addItem(48, "cadmium");
atoms.addItem(49, "indium");
atoms.addItem(50, "tin");
atoms.addItem(51, "antimony");
atoms.addItem(52, "tellurium");
atoms.addItem(53, "iodine");
atoms.addItem(54, "xenon");
atoms.addItem(55, "caesium");
atoms.addItem(56, "barium");
atoms.addItem(57, "lanthanum");
atoms.addItem(58, "cerium");
atoms.addItem(59, "praseodymium");
atoms.addItem(60, "neodymium");
atoms.addItem(61, "promethium");
atoms.addItem(62, "samarium");
atoms.addItem(63, "europium");
atoms.addItem(64, "gadolinium");
atoms.addItem(65, "terbium");
atoms.addItem(66, "dysprosium");
atoms.addItem(67, "holmium");
atoms.addItem(68, "erbium");
atoms.addItem(69, "thulium");
atoms.addItem(70, "ytterbium");
atoms.addItem(71, "lutetium");
atoms.addItem(72, "hafnium");
atoms.addItem(73, "tantalum");
atoms.addItem(74, "tungsten");
atoms.addItem(75, "rhenium");
atoms.addItem(76, "osmium");
atoms.addItem(77, "iridium");
atoms.addItem(78, "platinum");
atoms.addItem(79, "gold");
atoms.addItem(80, "mercury");

log.infoMC("Project CBT: Atomic Science --- Loading Isotopes")

log.infoMC("Project CBT: Atomic Science --- Loading Elementary Particles")

StandardMetaItem elementary = new StandardMetaItem((short)2);
elementary.setRegistryName("elementary_particles")

elementary.addItem(1, "proton");
elementary.addItem(2, "neutron");
elementary.addItem(3, "gluon");
elementary.addItem(4, "antiproton");
elementary.addItem(5, "antineutron");
elementary.addItem(6, "antielectron");
elementary.addItem(7, "photons");
elementary.addItem(8, "higgs");
elementary.addItem(9, "up_quark");
elementary.addItem(10, "down_quark");
elementary.addItem(11, "charm_quark");
elementary.addItem(12, "strange_quark");
elementary.addItem(13, "top_quark");
elementary.addItem(14, "bottom_quark");
elementary.addItem(15, "electron");
elementary.addItem(16, "electron_neutrino");
elementary.addItem(17, "muon");
elementary.addItem(18, "muon_neutrino");
elementary.addItem(19, "tau");
elementary.addItem(20, "tau_neutrino");
elementary.addItem(21, "z_boson");
elementary.addItem(22, "w_boson");

log.infoMC("Project CBT: Finished Atomic Science")

