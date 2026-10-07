package org.cloudsimplus.thesis;

import org.cloudsimplus.cloudlets.Cloudlet;
import org.cloudsimplus.cloudlets.CloudletSimple;

public class CloudletCreator {

    public static Cloudlet
    create() {
        return new CloudletSimple(
                10000,
                1
        );
    }
}
