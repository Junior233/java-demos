package com.itranswarp.learnjava;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import com.itranswarp.learnjava.config.MasterDataSourceConfiguration;
import com.itranswarp.learnjava.config.RoutingDataSourceConfiguration;
import com.itranswarp.learnjava.config.SlaveDataSourceConfiguration;
@Configuration
@Import({ MasterDataSourceConfiguration.class, SlaveDataSourceConfiguration.class,
        RoutingDataSourceConfiguration.class })
public class Config {
}
