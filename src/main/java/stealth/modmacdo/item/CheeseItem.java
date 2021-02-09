
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
public class CheeseItem extends ModmacdoModElements.ModElement {
	@ObjectHolder("modmacdo:cheese")
	public static final Item block = null;
	public CheeseItem(ModmacdoModElements instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(1).saturation(0.7999999999999999f).setAlwaysEdible().build()));
			setRegistryName("cheese");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
