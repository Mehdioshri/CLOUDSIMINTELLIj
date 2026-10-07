package org.cloudsimplus.thesis;

import org.cloudsimplus.brokers.DatacenterBroker;
import org.cloudsimplus.brokers.DatacenterBrokerSimple;
import org.cloudsimplus.cloudlets.Cloudlet;
import org.cloudsimplus.core.CloudSimPlus;
import org.cloudsimplus.datacenters.Datacenter;
import org.cloudsimplus.vms.Vm;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        // ایجاد محیط شبیه‌سازی
        CloudSimPlus simulation = new CloudSimPlus();

        // ایجاد Datacenter و Host
        Datacenter datacenter =
                DatacenterCreator.create(simulation);

        // ایجاد VM

        List<Vm> vmList = VmCreator.createList();

        // ایجاد Broker
        DatacenterBroker broker =
                new DatacenterBrokerSimple(simulation);

        // ارسال VM به Broker
        broker.submitVmList(vmList);

        // ایجاد Task (Cloudlet)
        Cloudlet cloudlet =
                CloudletCreator.create();

        // ارسال Task به Broker
        broker.submitCloudletList(List.of(cloudlet));

        // شروع شبیه‌سازی
        simulation.start();

        // نمایش نتیجه
        System.out.println("Task finished!");
        System.out.println("Task ID: " + cloudlet.getId());
        System.out.println("VM ID: " + cloudlet.getVm().getId());
        System.out.println("Start Time: " + cloudlet.getStartTime());
        System.out.println("Finish Time: " + cloudlet.getFinishTime());
    }
}