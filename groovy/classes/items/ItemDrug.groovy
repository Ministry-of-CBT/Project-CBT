import net.minecraft.entity.player.InventoryPlayer
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.item.ItemFood
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.potion.Potion
import net.minecraft.potion.PotionEffect
import net.minecraft.world.World
import net.minecraftforge.common.IRarity

public class ItemDrug extends ItemFood {
    List<PotionEffect> potionEffects
    private IRarity rarity = null
    private boolean syringe

    public ItemDrug (int healAmount, float saturation, CreativeTabs creativeTab) {
        super(healAmount, saturation, true)
        setAlwaysEdible()
        setCreativeTab(creativeTab)
        potionEffects = new ArrayList<>()
    }

    public ItemDrug addPotionEffect(Potion potion, int potionDuration, int amplifier) {
        if (potion == null)
            return this

        potionEffects.add(new PotionEffect(potion, potionDuration, amplifier))
        return this
    }

    public ItemDrug setRarity(IRarity rarity) {
        this.rarity = rarity
        return this
    }

    public ItemDrug setSyringe(boolean isSyringe) {
        this.syringe = isSyringe
        return this
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {
        if (!worldIn.isRemote && this.potionEffects != null)
        {
            for (PotionEffect potionAdd : potionEffects) {
                if (potionAdd != null)
                    player.addPotionEffect(new PotionEffect(potionAdd))
            }

            if (this.syringe) {
                player.inventory.addItemStackToInventory(item('nomifactory:emptysyringe'))
            }
        }
    }

    @Override
    public IRarity getForgeRarity(ItemStack stack) {
        return this.rarity == null ? super.getForgeRarity(stack) : this.rarity;
    }
}
