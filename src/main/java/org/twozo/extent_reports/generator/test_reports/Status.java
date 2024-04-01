package org.twozo.extent_reports.generator.test_reports;

public enum Status {

    INFO("info", 10),
    PASS("pass", 20),
    WARNING("warning", 30),
    SKIP("skip", 40),
    FAIL("fail", 50),;



    private final String name;
    private final int level;

    Status(final String name, final int level) {
        this.name = name;
        this.level = level;
    }

}
