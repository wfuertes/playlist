package com.wfuertes.playlistedge.config;

import com.netflix.governator.guice.BootstrapBinder;
import com.netflix.karyon.server.ServerBootstrap;
import com.wfuertes.playlist.config.PlaylistClientModule;
import com.wfuertes.playlistcore.config.PlaylistJacksonModule;

public class Bootstrap extends ServerBootstrap {

    @Override
    protected void configureBootstrapBinder(BootstrapBinder binder) {

        binder.install(new RestModule());
        binder.install(new PlaylistJacksonModule());
        binder.install(new PlaylistClientModule());
    }
}
