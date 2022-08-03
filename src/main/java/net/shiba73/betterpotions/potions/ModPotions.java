package net.shiba73.betterpotions.potions;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shiba73.betterpotions.BetterPotions;

public class ModPotions {

    //Create Potions
    public static final DeferredRegister<Potion> POTIONS
            = DeferredRegister.create(ForgeRegistries.POTIONS, BetterPotions.MOD_ID);

    //Potions
    public static final RegistryObject<Potion> HASTE_POTION = POTIONS.register("haste_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.DIG_SPEED, 6000, 1)));
    public static final RegistryObject<Potion> ABSORPTION_POTION = POTIONS.register("absorption_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.ABSORPTION, 6000, 1)));
    public static final RegistryObject<Potion> WITHER_POTION = POTIONS.register("wither_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.WITHER, 6000, 1)));
    public static final RegistryObject<Potion> MINING_FATIGUE_POTION = POTIONS.register("mining_fatigue_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 6000, 1)));
    public static final RegistryObject<Potion> NAUSEA_POTION = POTIONS.register("nausea_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.CONFUSION, 6000, 1)));
    public static final RegistryObject<Potion> RESISTANCE_POTION = POTIONS.register("resistance_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 6000, 1)));
    public static final RegistryObject<Potion> BLINDNESS_POTION = POTIONS.register("blindness_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.BLINDNESS, 6000, 1)));
    public static final RegistryObject<Potion> HEALTH_BOOST_POTION = POTIONS.register("health_boost_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.HEALTH_BOOST, 6000, 1)));
    public static final RegistryObject<Potion> SATURATION_POTION = POTIONS.register("saturation_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.SATURATION, 6000, 1)));
    public static final RegistryObject<Potion> GLOWING_POTION = POTIONS.register("glowing_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.GLOWING, 6000, 1)));
    public static final RegistryObject<Potion> LEVITATION_POTION = POTIONS.register("levitation_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.LEVITATION, 6000, 1)));
    public static final RegistryObject<Potion> UNLUCK_POTION = POTIONS.register("unluck_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.UNLUCK, 6000, 1)));
    public static final RegistryObject<Potion> CONDUIT_POWER_POTION = POTIONS.register("conduit_power_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.CONDUIT_POWER, 6000, 1)));
    public static final RegistryObject<Potion> DOLPHINS_GRACE_POTION = POTIONS.register("dolphins_grace_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 6000, 1)));
    public static final RegistryObject<Potion> BAD_OMEN_POTION = POTIONS.register("bad_omen_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.BAD_OMEN, 6000, 1)));
    public static final RegistryObject<Potion> HERO_OF_THE_VILLAGE_POTION = POTIONS.register("hero_of_the_village_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 6000, 1)));
    public static final RegistryObject<Potion> DARKNESS_POTION = POTIONS.register("darkness_potion",
            () -> new Potion(new MobEffectInstance(MobEffects.DARKNESS, 6000, 1)));


    //Register Potions
    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}
