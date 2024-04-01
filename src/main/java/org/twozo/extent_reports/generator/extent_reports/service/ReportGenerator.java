package org.twozo.extent_reports.generator.extent_reports.service;

import org.twozo.extent_reports.generator.extent_reports.impl.SparkReporter;

public interface ReportGenerator {

    SparkReporter reporter();
}
