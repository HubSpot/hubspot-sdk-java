// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiDatasetFieldPropertyFilterDataSourceTest {

    @Test
    fun create() {
        val apiDatasetFieldPropertyFilterDataSource =
            ApiDatasetFieldPropertyFilterDataSource.builder()
                .datasetFieldName("datasetFieldName")
                .name("name")
                .propertyName("propertyName")
                .type(ApiDatasetFieldPropertyFilterDataSource.Type.DATASET_FIELD_PROPERTY_FILTER)
                .sortBy(
                    ApiSort.builder()
                        .order(ApiSort.Order.ASC)
                        .property("property")
                        .missing("missing")
                        .build()
                )
                .build()

        assertThat(apiDatasetFieldPropertyFilterDataSource.datasetFieldName())
            .isEqualTo("datasetFieldName")
        assertThat(apiDatasetFieldPropertyFilterDataSource.name()).isEqualTo("name")
        assertThat(apiDatasetFieldPropertyFilterDataSource.propertyName()).isEqualTo("propertyName")
        assertThat(apiDatasetFieldPropertyFilterDataSource.type())
            .isEqualTo(ApiDatasetFieldPropertyFilterDataSource.Type.DATASET_FIELD_PROPERTY_FILTER)
        assertThat(apiDatasetFieldPropertyFilterDataSource.sortBy())
            .contains(
                ApiSort.builder()
                    .order(ApiSort.Order.ASC)
                    .property("property")
                    .missing("missing")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiDatasetFieldPropertyFilterDataSource =
            ApiDatasetFieldPropertyFilterDataSource.builder()
                .datasetFieldName("datasetFieldName")
                .name("name")
                .propertyName("propertyName")
                .type(ApiDatasetFieldPropertyFilterDataSource.Type.DATASET_FIELD_PROPERTY_FILTER)
                .sortBy(
                    ApiSort.builder()
                        .order(ApiSort.Order.ASC)
                        .property("property")
                        .missing("missing")
                        .build()
                )
                .build()

        val roundtrippedApiDatasetFieldPropertyFilterDataSource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiDatasetFieldPropertyFilterDataSource),
                jacksonTypeRef<ApiDatasetFieldPropertyFilterDataSource>(),
            )

        assertThat(roundtrippedApiDatasetFieldPropertyFilterDataSource)
            .isEqualTo(apiDatasetFieldPropertyFilterDataSource)
    }
}
