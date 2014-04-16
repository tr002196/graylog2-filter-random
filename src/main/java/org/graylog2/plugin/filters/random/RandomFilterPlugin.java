package org.graylog2.plugin.filters.random;

import com.google.common.collect.Lists;
import org.graylog2.plugin.Plugin;
import org.graylog2.plugin.PluginModule;

import java.util.Collection;
import java.util.List;

/**
 * @author Dennis Oelkers <dennis@torch.sh>
 */
public class RandomFilterPlugin implements Plugin {
    @Override
    public Collection<PluginModule> modules() {
        List<PluginModule> result = Lists.newArrayList();
        result.add(new RandomFilterModule());
        return result;
    }
}
