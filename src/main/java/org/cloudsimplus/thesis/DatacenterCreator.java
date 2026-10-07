package org.cloudsimplus.thesis;

import org.cloudsimplus.core.CloudSimPlus;
import org.cloudsimplus.datacenters.Datacenter;
import org.cloudsimplus.datacenters.DatacenterSimple;
import org.cloudsimplus.hosts.Host;
import org.cloudsimplus.hosts.HostSimple;
import org.cloudsimplus.resources.Pe;
import org.cloudsimplus.resources.PeSimple;

import java.util.List;

public class DatacenterCreator {

    public static Datacenter create(CloudSimPlus simulation) {

        // ایجاد دو هسته CPU
        List<Pe> peList = List.of(
                new PeSimple(2000),
                new PeSimple(2000)
        );

        // ایجاد Host
        Host host = new HostSimple(
                4096,       // RAM: 4096 MB
                10000,      // Bandwidth: 10000
                100000,     // Storage: 100000 MB
                peList      // دو هسته CPU
        );

        // ایجاد Datacenter
        return new DatacenterSimple(
                simulation,
                List.of(host)
        );
    }
}