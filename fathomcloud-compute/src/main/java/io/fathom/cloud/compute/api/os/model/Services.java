package io.fathom.cloud.compute.api.os.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Services {
    public List<Service> services;
}
