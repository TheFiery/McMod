
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
public class Salade1Item extends ModmacdoModElements.ModElement {
	@ObjectHolder("modmacdo:salade_1")
	public static final Item block = null;
	public Salade1Item(ModmacdoModElements instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(0).saturation(1f).setAlwaysEdible().build()));
			setRegistryName("salade_1");
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
