package com.rafael.multitenancy.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

@ConfigurationProperties("spring.multitenancy")
public class MultitenancyProperties {
	@NestedConfigurationProperty
	private DataSourceProperties datasource1;

	@NestedConfigurationProperty
	private DataSourceProperties datasource2;

	@NestedConfigurationProperty
	private DataSourceProperties datasource3;

	public DataSourceProperties getDatasource1() {
		System.out.println(">>>> MultitenancyProperties: getDatasource1() - Inicio/FIM");
		return datasource1;
	}

	public void setDatasource1(DataSourceProperties datasource1) {
		System.out.println(">>>> MultitenancyProperties: setDatasource1() - Inicio/FIM");
		this.datasource1 = datasource1;
	}

	public DataSourceProperties getDatasource2() {
		System.out.println(">>>> MultitenancyProperties: getDatasource2() - Inicio/FIM");
		return datasource2;
	}

	public void setDatasource2(DataSourceProperties datasource2) {
		System.out.println(">>>> MultitenancyProperties: setDatasource2() - Inicio/FIM");
		this.datasource2 = datasource2;
	}

	public DataSourceProperties getDatasource3() {
		System.out.println(">>>> MultitenancyProperties: getDatasource3() - Inicio/FIM");
		return datasource3;
	}

	public void setDatasource3(DataSourceProperties datasource3) {
		System.out.println(">>>> MultitenancyProperties: setDatasource3() - Inicio/FIM");
		this.datasource3 = datasource3;
	}
}
