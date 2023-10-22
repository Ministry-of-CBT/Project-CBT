#priority 990

import mods.gregtech.blocks.HeatingCoils;

// register a heating coil made from Minecraft's Dirt
// 1400K temperature
// Level 2 (32 * 2 multismelter parallel)
// Discount 4 (16 / 4 EU/t in multismelter per item)
// Tier 3 (used for discount in the cracker and pyrolyse oven)
// Material null (uses the Dirt block for JEI name)
HeatingCoils.add(blockstate:gregtech:meta_block_compressed_937:variant=gregtech__schrabidium, "schrabidium", 24000, 2, 4, 3, material:schrabidium);