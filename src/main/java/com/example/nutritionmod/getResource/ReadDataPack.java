package com.example.nutritionmod.getResource;

import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.SimpleSynchronousResourceReloadListener;
import net.minecraft.util.Identifier;

public class ReadDataPack {

    ResourceManagerHelper resourceManagerHelper;
    // 读取数据包中的资源
    public void readDataPack(){
        resourceManagerHelper.registerReloadListener(new SimpleSynchronousResourceReloadListener(){
            @Override
            public Identifier getFabricId() {
                return Identifier.of("nutritionmod", "data_pack_listener");
            }

            @Override
            public void reload(net.minecraft.resource.ResourceManager resourceManager) {
                // 在这里处理数据包中的资源
                // 例如读取JSON文件，解析数据等
                System.out.println("Data pack resources have been reloaded.");
            }
        });
    }
    public static void initalize(){

    }
}
