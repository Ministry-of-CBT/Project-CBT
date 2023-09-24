#loader gregtech
#priority 1000

import mods.gregtech.material.MaterialBuilder;
import mods.gregtech.material.Material;

var titin_ingot = MaterialBuilder(20000, "titin_ingot")
    .dust()
    .ingot()
    .color(0xE2E2E2)
    .components([<material:carbon>*169719, <material:hydrogen>*270466, <material:nitrogen>*45688, <material:oxygen>*52238, <material:sulfur>*911])
    .build();

var splytherrium = MaterialBuilder(20001, "splytherrium")
    .dust()
    .ingot()
    .color(0x244DCC)
    .components([<material:carbon>*169719, <material:hydrogen>*270466, <material:nitrogen>*45688, <material:oxygen>*52238, <material:sulfur>*911, <material:naquadria>*2363, <material:schrabidium>*1333, <material:gold>*241, <material:iron>*2333, <material:copper>*4551, <material:helium>*441, <material:lithium>*451, <material:mercury>*531, <material:zinc>*244, <material:argon>*743, <material:uranium>*532, <material:plutonium>*441])
    .build();