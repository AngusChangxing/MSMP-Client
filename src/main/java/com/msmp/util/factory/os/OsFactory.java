package com.msmp.util.factory.os;

import com.msmp.util.factory.IFactory;
import com.msmp.util.specific.Sources;
import com.msmp.util.specific.os.OsSources;

public class OsFactory implements IFactory {
    @Override
    public Sources createSources() {
        return new OsSources();
    }
}
