package com.msmp.util.factory.net;

import com.msmp.util.factory.IFactory;
import com.msmp.util.specific.Sources;
import com.msmp.util.specific.net.NetDynamicSources;

public class NetDynamicFactory implements IFactory {
    @Override
    public Sources createSources() {
        return new NetDynamicSources();
    }
}
