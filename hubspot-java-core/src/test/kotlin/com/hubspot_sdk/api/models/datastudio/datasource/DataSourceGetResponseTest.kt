// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.datastudio.datasource

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataSourceGetResponseTest {

    @Test
    fun create() {
        val dataSourceGetResponse =
            DataSourceGetResponse.builder()
                .addColumn(FileColumn.builder().name("name").type("type").build())
                .createdAt("createdAt")
                .datasourceId(0L)
                .datasourceName("datasourceName")
                .datasourceType(DataSourceGetResponse.DatasourceType.FILE)
                .lastIngestionStatus(DataSourceGetResponse.LastIngestionStatus.FAILED)
                .build()

        assertThat(dataSourceGetResponse.columns())
            .containsExactly(FileColumn.builder().name("name").type("type").build())
        assertThat(dataSourceGetResponse.createdAt()).isEqualTo("createdAt")
        assertThat(dataSourceGetResponse.datasourceId()).isEqualTo(0L)
        assertThat(dataSourceGetResponse.datasourceName()).isEqualTo("datasourceName")
        assertThat(dataSourceGetResponse.datasourceType())
            .isEqualTo(DataSourceGetResponse.DatasourceType.FILE)
        assertThat(dataSourceGetResponse.lastIngestionStatus())
            .isEqualTo(DataSourceGetResponse.LastIngestionStatus.FAILED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dataSourceGetResponse =
            DataSourceGetResponse.builder()
                .addColumn(FileColumn.builder().name("name").type("type").build())
                .createdAt("createdAt")
                .datasourceId(0L)
                .datasourceName("datasourceName")
                .datasourceType(DataSourceGetResponse.DatasourceType.FILE)
                .lastIngestionStatus(DataSourceGetResponse.LastIngestionStatus.FAILED)
                .build()

        val roundtrippedDataSourceGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataSourceGetResponse),
                jacksonTypeRef<DataSourceGetResponse>(),
            )

        assertThat(roundtrippedDataSourceGetResponse).isEqualTo(dataSourceGetResponse)
    }
}
