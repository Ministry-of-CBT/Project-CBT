// add shaped recipe with key based input
mods.avaritia.ExtremeCrafting.shapedBuilder()
        .output(item('minecraft:redstone_block') * 64)
        .matrix(
                'DDLLDDDNN',
                '  DNIGIND',
                'DDDNIGIND',
                '  DLLLLLD')
        .key('D', item('minecraft:diamond'))
        .key('L', item('minecraft:redstone'))
        .key('N', item('minecraft:stone').reuse()) // stone will not be consumed in the recipe
        .key('I', item('minecraft:iron_ingot'))
        .key('G', item('minecraft:gold_ingot'))
        .register()