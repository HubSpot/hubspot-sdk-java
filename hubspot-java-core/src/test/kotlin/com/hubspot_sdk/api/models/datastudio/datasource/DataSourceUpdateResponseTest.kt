// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.datastudio.datasource

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DataSourceUpdateResponseTest {

    @Test
    fun create() {
        val dataSourceUpdateResponse =
            DataSourceUpdateResponse.builder()
                .datasourceId(0L)
                .datasourceName("datasourceName")
                .previewLink("previewLink")
                .build()

        assertThat(dataSourceUpdateResponse.datasourceId()).isEqualTo(0L)
        assertThat(dataSourceUpdateResponse.datasourceName()).isEqualTo("datasourceName")
        assertThat(dataSourceUpdateResponse.previewLink()).isEqualTo("previewLink")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dataSourceUpdateResponse =
            DataSourceUpdateResponse.builder()
                .datasourceId(0L)
                .datasourceName("datasourceName")
                .previewLink("previewLink")
                .build()

        val roundtrippedDataSourceUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dataSourceUpdateResponse),
                jacksonTypeRef<DataSourceUpdateResponse>(),
            )

        assertThat(roundtrippedDataSourceUpdateResponse).isEqualTo(dataSourceUpdateResponse)
    }
}
