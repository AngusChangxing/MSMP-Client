package com.msmp.util.factory.java;

import com.msmp.util.factory.IFactory;
import com.msmp.util.specific.Sources;
import com.msmp.util.specific.java.JavaSources;

public class JavaFactory implements IFactory {
    @Override
    public Sources createSources() {
        return new JavaSources();
    }
}
