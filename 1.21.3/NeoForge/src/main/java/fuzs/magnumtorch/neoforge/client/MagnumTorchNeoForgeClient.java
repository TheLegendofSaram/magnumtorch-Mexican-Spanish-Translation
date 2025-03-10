package fuzs.magnumtorch.neoforge.client;

import fuzs.magnumtorch.MagnumTorch;
import fuzs.magnumtorch.client.MagnumTorchClient;
import fuzs.magnumtorch.data.client.ModLanguageProvider;
import fuzs.magnumtorch.data.client.ModModelProvider;
import fuzs.puzzleslib.api.client.core.v1.ClientModConstructor;
import fuzs.puzzleslib.neoforge.api.data.v2.core.DataProviderHelper;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod;

@Mod(value = MagnumTorch.MOD_ID, dist = Dist.CLIENT)
public class MagnumTorchNeoForgeClient {

    public MagnumTorchNeoForgeClient() {
        ClientModConstructor.construct(MagnumTorch.MOD_ID, MagnumTorchClient::new);
        DataProviderHelper.registerDataProviders(MagnumTorch.MOD_ID, ModLanguageProvider::new, ModModelProvider::new);
    }
}
