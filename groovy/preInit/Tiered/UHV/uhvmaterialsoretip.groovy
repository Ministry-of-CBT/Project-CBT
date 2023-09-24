import net.minecraftforge.event.entity.player.ItemTooltipEvent

event_manager.listen { ItemTooltipEvent event ->
    if (ItemStack.areItemsEqual(event.getItemStack(), item('cbt:tetraschrabadic_trinaquadium'))) {
        event.getToolTip().add('UHV tier alloy, now go fuck yourselves in the toilet.')
        event.getToolTip().add('Contains 4-Schrabidium, 3-Naquandah')
    }
}

event_manager.listen { ItemTooltipEvent event ->
    if (ItemStack.areItemsEqual(event.getItemStack(), item('cbt:urephittium'))) {
        event.getToolTip().add('Euphemium-Unobtanium Alloy, because fuck you.')
    }
}
