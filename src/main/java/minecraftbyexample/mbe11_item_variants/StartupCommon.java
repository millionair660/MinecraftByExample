package minecraftbyexample.mbe11_item_variants;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

/**
 * User: The Grey Ghost
 * Date: 24/12/2014
 *  See MinecraftByExample class for more information
 */
public class StartupCommon
{
  public static ItemVariants itemVariants;  // this holds the unique instance of the item

  @SubscribeEvent
  public static void onItemsRegistration(final RegistryEvent.Register<Item> itemRegisterEvent) {
    itemVariants = new ItemVariants();
    itemVariants.setRegistryName("mbe11_item_variants_registry_name");
    itemRegisterEvent.getRegistry().register(itemVariants);
  }

  @SubscribeEvent
  public static void onCommonSetupEvent(FMLCommonSetupEvent event) {
    // not actually required for this example....
  }
}
