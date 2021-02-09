
package stealth.modmacdo.painting;

import stealth.modmacdo.ModmacdoModElements;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.entity.item.PaintingType;

@ModmacdoModElements.ModElement.Tag
public class HappymealPainting extends ModmacdoModElements.ModElement {
	public HappymealPainting(ModmacdoModElements instance) {
		super(instance, 12);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerPaintingType(RegistryEvent.Register<PaintingType> event) {
		event.getRegistry().register(new PaintingType(16, 16).setRegistryName("happymeal"));
	}
}
