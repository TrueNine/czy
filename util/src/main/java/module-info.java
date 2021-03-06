/**
 * @author chenzy
 * @description
 * @since 2020-05-11
 */open module com.czy.util {
    requires slf4j.api;
    requires com.fasterxml.jackson.annotation;
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;
    requires org.apache.commons.lang3;
    requires cglib;
    requires java.xml;
    requires org.yaml.snakeyaml;
    requires jyaml;
    exports com.czy.util;
    exports com.czy.util.model;
    exports com.czy.util.enums;
    exports com.czy.util.json;
    exports com.czy.util.tcp;
    exports com.czy.util.io;
}