
package stealth.modmacdo.item;

import stealth.modmacdo.ModmacdoModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

@ModmacdoModElements.ModElement.Tag
public class CheesehotItem extends ModmacdoModElements.ModElement {
	@ObjectHolder("modmacdo:cheesehot")
	public static final Item block = null;
	public CheesehotItem(ModmacdoModElements instance) {
		super(instance, 18);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(-1).saturation(1.2000000000000002f).build()));
			setRegistryName("cheesehot");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 41;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
