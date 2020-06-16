/**
 * @author chenzy
 * @since 2020-06-15
 */
module car {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.media;
    requires javafx.fxml;
    requires com.czy.core;
    requires com.czy.util;
    requires java.desktop;
    requires javafx.swing;
    requires javafx.web;
    requires com.czy.fx;
    requires cglib;
    requires com.fasterxml.jackson.databind;
    exports com.czy.car.view;
    exports com.czy.car.view.user;
    exports com.czy.car.controller;
    exports com.czy.car.service.impl;
    exports com.czy.car.model;
    opens com.czy.car.service.impl;
    opens com.czy.car.controller;
    opens com.czy.car.view.user;
}