// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiEnrolledRecordPropertyFilterDataSourceTest {

    @Test
    fun create() {
        val apiEnrolledRecordPropertyFilterDataSource =
            ApiEnrolledRecordPropertyFilterDataSource.builder()
                .name("name")
                .propertyName("propertyName")
                .recordFieldName("recordFieldName")
                .type(
                    ApiEnrolledRecordPropertyFilterDataSource.Type.ENROLLED_RECORD_PROPERTY_FILTER
                )
                .sortBy(
                    ApiSort.builder()
                        .order(ApiSort.Order.ASC)
                        .property("property")
                        .missing("missing")
                        .build()
                )
                .build()

        assertThat(apiEnrolledRecordPropertyFilterDataSource.name()).isEqualTo("name")
        assertThat(apiEnrolledRecordPropertyFilterDataSource.propertyName())
            .isEqualTo("propertyName")
        assertThat(apiEnrolledRecordPropertyFilterDataSource.recordFieldName())
            .isEqualTo("recordFieldName")
        assertThat(apiEnrolledRecordPropertyFilterDataSource.type())
            .isEqualTo(
                ApiEnrolledRecordPropertyFilterDataSource.Type.ENROLLED_RECORD_PROPERTY_FILTER
            )
        assertThat(apiEnrolledRecordPropertyFilterDataSource.sortBy())
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
        val apiEnrolledRecordPropertyFilterDataSource =
            ApiEnrolledRecordPropertyFilterDataSource.builder()
                .name("name")
                .propertyName("propertyName")
                .recordFieldName("recordFieldName")
                .type(
                    ApiEnrolledRecordPropertyFilterDataSource.Type.ENROLLED_RECORD_PROPERTY_FILTER
                )
                .sortBy(
                    ApiSort.builder()
                        .order(ApiSort.Order.ASC)
                        .property("property")
                        .missing("missing")
                        .build()
                )
                .build()

        val roundtrippedApiEnrolledRecordPropertyFilterDataSource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiEnrolledRecordPropertyFilterDataSource),
                jacksonTypeRef<ApiEnrolledRecordPropertyFilterDataSource>(),
            )

        assertThat(roundtrippedApiEnrolledRecordPropertyFilterDataSource)
            .isEqualTo(apiEnrolledRecordPropertyFilterDataSource)
    }
}
