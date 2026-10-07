package org.cloudsimplus.thesis;

import org.cloudsimplus.vms.Vm;
import org.cloudsimplus.vms.VmSimple;

import java.util.List;

public class VmCreator {

    public static List<Vm> createList() {

        Vm vm1 = new VmSimple(1000, 1)
                .setRam(1024)
                .setBw(1000)
                .setSize(10000);

        Vm vm2 = new VmSimple(2000, 1)
                .setRam(1024)
                .setBw(1000)
                .setSize(10000);

        return List.of(vm1, vm2);
    }
}