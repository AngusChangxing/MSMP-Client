package com.msmp.util.factory.net;

import com.msmp.util.factory.IFactory;
import com.msmp.util.specific.Sources;
import com.msmp.util.specific.net.NetSources;

public class NetFactory implements IFactory {
    @Override
    public Sources createSources() {
        return new NetSources();
    }
}
