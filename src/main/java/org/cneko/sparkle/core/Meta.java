package org.cneko.sparkle.core;

import java.util.logging.Logger;

public class Meta {
    public static Meta INSTANCE;
    private final String id = "sparkle";
    private final Logger logger = Logger.getLogger(id);
    public String getId(){
        return id;
    }
    public Logger getLogger(){
        return logger;
    }
}
