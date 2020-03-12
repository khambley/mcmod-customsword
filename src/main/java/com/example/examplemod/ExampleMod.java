package com.example.examplemod;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ExampleMod.MODID, name = ExampleMod.NAME, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "sword";
    public static final String NAME = "Katherine's Super Awesome Sword";
    public static final String VERSION = "1.0";

    private static Logger logger;
    //New Variables
    public static ToolMaterial myToolMaterial;
    public static Item mySword;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        //name = string variable that is the material name
        //harvestlevel = int variable that indicates which minerals it can get resources from, a 4 indicates it mines whatever we want.
        //maxUses = int variable that indicates how many times we can use it before it breaks
        //efficiency = ?
        //damage = float variable that indicates how much damage it will do when you hit an entity with it
        //enchantability = how easy it is to enchant
        myToolMaterial = EnumHelper.addToolMaterial("Super Duper Material", 4, 10000, 20.0F, 100.0F, 30);
        
        mySword = new CustomSword();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
