package com.msmp.util.factory.disk;

import com.msmp.util.factory.IFactory;
import com.msmp.util.specific.Sources;
import com.msmp.util.specific.disk.DiskDynamicSources;

public class DiskDynamicFactory implements IFactory {
    @Override
    public Sources createSources() {
        return new DiskDynamicSources();
    }
}
