package stealth.modmacdo.procedures;

import stealth.modmacdo.ModmacdoModElements;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.common.MinecraftForge;

import java.util.Map;
import java.util.HashMap;

@ModmacdoModElements.ModElement.Tag
public class TomateplanteMiseAJourDuTickProcedure extends ModmacdoModElements.ModElement {
	public TomateplanteMiseAJourDuTickProcedure(ModmacdoModElements instance) {
		super(instance, 14);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
	}

	@SubscribeEvent
	public void onCropGrowPre(BlockEvent.CropGrowEvent.Pre event) {
		Map<String, Object> dependencies = new HashMap<>();
		dependencies.put("x", event.getPos().getX());
		dependencies.put("y", event.getPos().getY());
		dependencies.put("z", event.getPos().getZ());
		dependencies.put("world", event.getWorld().getWorld());
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}
}
