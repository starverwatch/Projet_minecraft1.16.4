package Be.Tt.Novincraft.Init;


import Be.Tt.Novincraft.ModNv;
import Be.Tt.Novincraft.items.ItemNovincraft;
import Be.Tt.Novincraft.items.ToolAxe;
import Be.Tt.Novincraft.lists.ToolMaterialList;
import com.google.common.collect.Lists;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


import javax.tools.Tool;
import java.util.List;


@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = ModNv.MODID)
public class ModItems {

    public static final ModItems INSTANCE = new ModItems();
    public static List<Item> items;

    public static final ItemGroup modecreative = new ModeCreative();


    public static Item hache_fer;
    public static Item iron_ingot;

    private static void init() {
        items = Lists.newArrayList();


        hache_fer = new ToolAxe("hache_fer", ToolMaterialList.iron, 10, -2.7f, new Item.Properties().group(modecreative));

        



    }


    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> e) {
        init();

        for (Item item : items)
        {
            e.getRegistry().register(item);
        }


    }


}
