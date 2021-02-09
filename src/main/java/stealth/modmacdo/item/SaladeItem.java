
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
public class SaladeItem extends ModmacdoModElements.ModElement {
	@ObjectHolder("modmacdo:salade")
	public static final Item block = null;
	public SaladeItem(ModmacdoModElements instance) {
		super(instance, 23);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(5).saturation(0.3f).build()));
			setRegistryName("salade");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 55;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
