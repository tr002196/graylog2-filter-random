package org.graylog2.plugin.filters.random;

import org.graylog2.plugin.PluginModule;

/**
 * @author Dennis Oelkers <dennis@torch.sh>
 */
public class RandomFilterModule extends PluginModule {
    @Override
    protected void configure() {
        addMessageFilter(RandomFilter.class);
        addPeriodical(RandomPeriodical.class);
    }
}
