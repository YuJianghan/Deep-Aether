package teamrazor.deepaether.init;

import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import teamrazor.deepaether.DeepAetherMod;
import teamrazor.deepaether.effects.MoaBonusJumpEffect;

public class DAMobEffects {
    public static final DeferredRegister<MobEffect> EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, DeepAetherMod.MODID);

    public static final RegistryObject<MobEffect> MOA_BONUS_JUMPS = EFFECTS.register("moa_bonus_jumps", MoaBonusJumpEffect::new);
}
