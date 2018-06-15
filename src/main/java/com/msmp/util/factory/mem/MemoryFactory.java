package com.msmp.util.factory.mem;

import com.msmp.util.factory.IFactory;
import com.msmp.util.specific.Sources;
import com.msmp.util.specific.mem.MemorySources;

public class MemoryFactory implements IFactory {
    @Override
    public Sources createSources() {
        return new MemorySources();
    }
}
