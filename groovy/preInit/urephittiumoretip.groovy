import net.minecraftforge.event.entity.player.ItemTooltipEvent

event_manager.listen { ItemTooltipEvent event ->
    if (ItemStack.areItemsEqual(event.getItemStack(), item('cbt:urephittium'))) {
        event.getToolTip().add('Euphemium-Unobtanium Alloy, because fuck you.')
    }
}
