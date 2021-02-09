package com.skynet;

import java.time.Duration;
import java.time.Instant;
import java.util.Optional;

// To check and manage operating system process
public class SystemProcess {

    public static void retrieveProcessInfo(){
        ProcessHandle self = ProcessHandle.current();
        long PID = self.pid();
        System.out.println("PID: " + PID);
        ProcessHandle.Info procInfo = self.info();

        Optional<String[]> args = procInfo.arguments();
        Optional<String> cmd = procInfo.commandLine();
        Optional<Instant> startTime = procInfo.startInstant();
        Optional<Duration> cpuUsage = procInfo.totalCpuDuration();

        System.out.println("Args: " + args.get());
        System.out.println("Cmd: " + cmd.get());
        System.out.println("Start time: " + startTime.get());
        System.out.println("CPU Usage: " + cpuUsage.get());
    }

}
