/*
 * Created by zeeroiq on 10/26/20, 8:28 PM
 */

package com.zeeroiq.inventoryfailover.config;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("local-discovery")
@EnableDiscoveryClient
@Configuration
public class LocalDiscovery {
}
