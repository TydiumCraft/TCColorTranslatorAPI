package net.tydiumcraft.colortranslatorapi;

import com.google.inject.Inject;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.plugin.Plugin;
import org.slf4j.Logger;

@Plugin(
        id = "TCColorTranslatorAPI",
        name = "TCColorTranslatorAPIDev",
        version = "0.1",
        description = "TydiumCraft Color Translator API for Devs",
        url = "https://TydiumCraft.net",
        authors = {"BlitzTDM"}
)
public class TCColorTranslatorAPI {

    @Inject
    private Logger logger;

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {
    }
}
