#loader gregtech
#priority 999

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

var fuck_you = MaterialBuilder(20002, "fuck_you")
    .dust()
    .ingot()
    .color(0xCABC11)
    .components([<material:hydrogen>*37276, <material:helium>*52238, <material:lithium>*53411, <material:beryllium>*54441, <material:boron>*52356, <material:carbon>*21443, <material:nitrogen>*45478, <material:oxygen>*75457, <material:fluorine>*43577, <material:neon>*56846, <material:sodium>*86556, <material:magnesium>*38585, <material:aluminium>*4868, <material:silicon>*46865, <material:phosphorus>*24774, <material:sulfur>*34664, <material:chlorine>*74327, <material:argon>*46436, <material:potassium>*84385, <material:calcium>*27545, <material:scandium>*62643, <material:titanium>*97511, <material:vanadium>*2646, <material:chrome>*34664, <material:manganese>*27466, <material:iron>*34646, <material:cobalt>*53215, <material:nickel>*47577, <material:copper>*37574, <material:zinc>*92535, <material:gallium>*34757, <material:germanium>*43754, <material:arsenic>*75777, <material:selenium>*32577, <material:bromine>*34577, <material:krypton>*3521, <material:rubidium>*95551, <material:strontium>*43578, <material:yttrium>*9466, <material:zirconium>*63411, <material:niobium>*96311, <material:molybdenum>*6511, <material:technetium>*96411, <material:ruthenium>*75761, <material:rhodium>*6341, <material:palladium>*96751, <material:silver>*52311, <material:cadmium>*96411, <material:indium>*96411, <material:tin>*96611, <material:antimony>*96411, <material:tellurium>*96411, <material:iodine>*91611, <material:xenon>*96411, <material:caesium>*96411, <material:barium>*56661, <material:lanthanum>*96411, <material:cerium>*96441, <material:praseodymium>*53211, <material:neodymium>*51251, <material:promethium>*35611, <material:samarium>*98561, <material:europium>*96411, <material:gadolinium>*52311, <material:dysprosium>*62311, <material:holmium>*53251, <material:thulium>*96411, <material:ytterbium>*96411, <material:lutetium>*96411, <material:hafnium>*96411, <material:tantalum>*96411, <material:tungsten>*96411, <material:rhenium>*96411, <material:osmium>*96411, <material:iridium>*96411, <material:platinum>*96411, <material:gold>*96411, <material:mercury>*96411, <material:thallium>*96411, <material:lead>*96411, <material:polonium>*96411, <material:astatine>*96411, <material:radon>*96411, <material:francium>*96411, <material:radium>*96411, <material:actinium>*96411, <material:protactinium>*96411, <material:uranium>*96411, <material:plutonium>*96411, <material:americium>*96411, <material:curium>*96411, <material:berkelium>*96411, <material:californium>*96411, <material:einsteinium>*96411, <material:fermium>*96411, <material:mendelevium>*96411, <material:nobelium>*96411, <material:lawrencium>*96411, <material:rutherfordium>*96411, <material:dubnium>*96411, <material:seaborgium>*96411, <material:bohrium>*96411, <material:hassium>*96411, <material:darmstadtium>*96411, <material:roentgenium>*96411, <material:copernicium>*96411, <material:nihonium>*96411, <material:flerovium>*96411, <material:moscovium>*96411, <material:livermorium>*96411, <material:tennessine>*96411, <material:oganesson>*96411, <material:tritanium>*96411, <material:duranium>*96411, <material:susanium>*56511, <material:dylantrum>*57711, <material:agrastium>*13211, <material:ruslyium>*99911, <material:trinium>*56511, <material:schrabidium>*56511, <material:solinium>*56511, <material:veridium>*56511, <material:schrabidium>*56511, <material:naquadah>*96411, <material:neutronium>*96411])
    .build();