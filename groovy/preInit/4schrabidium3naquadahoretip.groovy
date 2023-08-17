import net.minecraftforge.event.entity.player.ItemTooltipEvent

event_manager.listen { ItemTooltipEvent event ->
    if (ItemStack.areItemsEqual(event.getItemStack(), item('cbt:tetraschrabadic_trinaquadium'))) {
        event.getToolTip().add('UHV tier alloy, now go fuck yourselves in the toilet.')
    }
}
