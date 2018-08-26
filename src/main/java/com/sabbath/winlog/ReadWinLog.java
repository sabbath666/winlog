package com.sabbath.winlog;

import com.sun.jna.platform.win32.Advapi32Util;

public class ReadWinLog {
    public static void main(String[] args) {
        Advapi32Util.EventLogIterator iter = new Advapi32Util.EventLogIterator("Application");
        while(iter.hasNext()) {
            Advapi32Util.EventLogRecord record = iter.next();
            System.out.println(record.getRecordNumber()
                    + ": Event ID: " + record.getEventId()
                    + ", Event Type: " + record.getType()
                    + ", Event Source: " + record.getSource());
        }
    }

}
