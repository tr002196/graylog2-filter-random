package org.graylog2.plugin.filters.random;

import org.graylog2.plugin.periodical.Periodical;

/**
 * @author Dennis Oelkers <dennis@torch.sh>
 */
public class RandomPeriodical extends Periodical {
    @Override
    public boolean runsForever() {
        return false;
    }

    @Override
    public boolean stopOnGracefulShutdown() {
        return true;
    }

    @Override
    public boolean masterOnly() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean startOnThisNode() {
        return true;
    }

    @Override
    public boolean isDaemon() {
        return false;
    }

    @Override
    public int getInitialDelaySeconds() {
        return 0;
    }

    @Override
    public int getPeriodSeconds() {
        return 1;
    }

    @Override
    public void run() {
        System.out.println("Hello!");
    }
}
