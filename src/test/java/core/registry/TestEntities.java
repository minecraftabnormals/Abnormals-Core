package core.registry;

import com.teamabnormals.abnormals_core.core.annotations.Test;
import com.teamabnormals.abnormals_core.core.util.RegistryHelper;
import common.entities.TestEndimatedEntity;
import core.ACTest;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.CowEntity;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

@Test
@Mod.EventBusSubscriber(modid = ACTest.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class TestEntities {
	private static final RegistryHelper HELPER = ACTest.REGISTRY_HELPER;

	public static final RegistryObject<EntityType<CowEntity>> COW = HELPER.createLivingEntity("example", CowEntity::new, EntityClassification.CREATURE, 1.0F, 1.0F);
	public static final RegistryObject<EntityType<TestEndimatedEntity>> ENDIMATED_TEST = HELPER.createLivingEntity("endimated_test", TestEndimatedEntity::new, EntityClassification.CREATURE, 1.0F, 1.0F);
}
