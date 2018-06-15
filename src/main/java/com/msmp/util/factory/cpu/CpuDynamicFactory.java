package com.msmp.util.factory.cpu;

import com.msmp.util.factory.IFactory;
import com.msmp.util.specific.Sources;
import com.msmp.util.specific.cpu.CpuDynamicSources;

public class CpuDynamicFactory implements IFactory {
    @Override
    public Sources createSources() {
        return new CpuDynamicSources();
    }
}
