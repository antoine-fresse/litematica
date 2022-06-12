package fi.dy.masa.litematica;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fi.dy.masa.malilib.event.InitializationHandler;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.dimension.DimensionTypeRegistrar;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.Identifier;
import fi.dy.masa.litematica.world.SchematicWorldHandler;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

public class Litematica implements ModInitializer
{
    public static final Logger logger = LogManager.getLogger(Reference.MOD_ID);

    @Override
    public void onInitialize()
    {
        InitializationHandler.getInstance().registerInitializationHandler(new InitHandler());

        
        var key = RegistryKey.of(Registry.DIMENSION_TYPE_KEY, new Identifier(Reference.MOD_ID, "schematic_world_type"));
        RegistryKey<DimensionType> test = RegistryKey.of(Registry.DIMENSION_TYPE_KEY, new Identifier(Reference.MOD_ID, "schematic_world"));

        SchematicWorldHandler.getSchematicWorld();

        //Identifier id = new Identifier(Reference.MOD_ID, "schematic_world_type");
        //Registry.register(BuiltinRegistries.DIMENSION_TYPE, key, SchematicWorldHandler.DIMENSIONTYPE);
       //System.out.println("register : " + SchematicWorldHandler.DIMENSIONTYPE.toString());
    }
}
