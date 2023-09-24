import net.minecraft.item.ItemFood
import net.minecraft.potion.PotionEffect
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.block.material.Material
import net.minecraft.block.state.BlockFaceShape
import net.minecraft.block.state.IBlockState
import net.minecraft.util.math.AxisAlignedBB
import net.minecraft.world.IBlockAccess

// You can register any item created, even items created via custom means.
content.registerItem('meth_bar_edible', (new ItemFood(20, 10, false) {
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        if (!worldIn.isRemote) {
            player.addPotionEffect(new PotionEffect(potion('regeneration'), 240000, 3, false, false))
            player.addPotionEffect(new PotionEffect(potion('resistance'), 240000, 3, false, false))
        }
    }
}).setAlwaysEdible())
