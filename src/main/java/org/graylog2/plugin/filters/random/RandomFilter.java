package org.graylog2.plugin.filters.random;

import org.graylog2.plugin.Message;
import org.graylog2.plugin.filters.MessageFilter;
import org.slf4j.LoggerFactory;

import java.util.Random;

/**
 * @author Dennis Oelkers <dennis@torch.sh>
 */
public class RandomFilter implements MessageFilter {
    private final org.slf4j.Logger LOG = LoggerFactory.getLogger(RandomFilter.class);
    private final Random random;
    public RandomFilter() {
        random = new Random();
    }

    @Override
    public boolean filter(Message message) {
        boolean result = random.nextBoolean();
        if (result)
            LOG.info("Message <{}> will not be dropped", message.getId());
        else
            LOG.info("Message <{}> will be dropped", message.getId());
        return result;
    }

    @Override
    public String getName() {
        return "Random Message Filter";
    }
}
