
package stealth.modmacdo.item;

import stealth.modmacdo.ModmacdoModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.client.util.ITooltipFlag;

import java.util.List;

@ModmacdoModElements.ModElement.Tag
public class TomatenonfraicheItem extends ModmacdoModElements.ModElement {
	@ObjectHolder("modmacdo:tomatenonfraiche")
	public static final Item block = null;
	public TomatenonfraicheItem(ModmacdoModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(-2).saturation(0.7f).build()));
			setRegistryName("tomatenonfraiche");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 41;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("A NE PAS MANGER !"));
		}
	}
}
