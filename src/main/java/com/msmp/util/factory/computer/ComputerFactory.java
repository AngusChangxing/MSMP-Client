package com.msmp.util.factory.computer;

import com.msmp.util.factory.IFactory;
import com.msmp.util.specific.Sources;
import com.msmp.util.specific.computer.ComputerSources;

public class ComputerFactory implements IFactory {
    @Override
    public Sources createSources() {
        return new ComputerSources();
    }
}
